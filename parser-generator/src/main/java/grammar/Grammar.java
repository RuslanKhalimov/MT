package grammar;

import java.util.*;

public class Grammar {
    private final String EPS = "";
    private final String END = "END";

    private String startNonTerm;
    private List<NonTermRule> nonTermRules = new ArrayList<>();
    private List<TermRule> termRules = new ArrayList<>();
    private Map<String, Set<String>> firstSet = new HashMap<>();
    private Map<String, Set<String>> followSet = new HashMap<>();

    public Grammar(String startNonTerm) {
        this.startNonTerm = startNonTerm;
    }

    public List<NonTermRule> getNonTermRules() {
        return nonTermRules;
    }

    public List<TermRule> getTermRules() {
        return termRules;
    }

    public String getStartNonTerm() {
        return startNonTerm;
    }

    public Set<String> getFollowSet(String nonTermName) {
        return followSet.get(nonTermName);
    }

    public void addNonTermRule(NonTermRule nonTermRule) {
        nonTermRules.add(nonTermRule);
    }

    public void addTermRule(TermRule termRule) {
        termRules.add(termRule);
    }

    private void initSet(Map<String, Set<String>> set) {
        if (set.size() > 0) return;
        for (NonTermRule nonTermRule : nonTermRules) {
            set.put(nonTermRule.getName(), new HashSet<>());
        }
    }

    public void buildFirstAndFollowSets() {
        buildFirstSet();
        buildFollowSet();
    }

    public Set<String> getFirstSetByRightPart(List<RuleToken> rightPart) {
        Set<String> result = new HashSet<>();

        boolean isEps = true;
        for (RuleToken ruleToken : rightPart) {
            if (ruleToken instanceof Code) continue;
            if (ruleToken instanceof Term) {
                result.add(ruleToken.getName());
            } else {
                result.addAll(firstSet.get(ruleToken.getName()));
            }
            isEps = false;
            break;
        }
        if (isEps) {
            result.add(EPS);
        }

        return result;
    }

    private void buildFirstSet() {
        initSet(firstSet);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (NonTermRule nonTermRule : nonTermRules) {
                int oldSize = firstSet.get(nonTermRule.getName()).size();
                for (List<RuleToken> rightPart : nonTermRule.getRightParts()) {
                    firstSet.get(nonTermRule.getName()).addAll(getFirstSetByRightPart(rightPart));
                }
                if (oldSize < firstSet.get(nonTermRule.getName()).size()) {
                    changed = true;
                }
            }
        }
    }

    private void buildFollowSet() {
        initSet(followSet);
        followSet.get(startNonTerm).add(END);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (NonTermRule nonTermRule : nonTermRules) {
                for (List<RuleToken> rightPart : nonTermRule.getRightParts()) {
                    for (int i = 0; i < rightPart.size(); i++) {
                        RuleToken A = rightPart.get(i);
                        if (A instanceof Term || A instanceof Code) {
                            continue;
                        }
                        int oldSize = followSet.get(A.getName()).size();

                        int j = i + 1;
                        for (; j < rightPart.size(); j++) {
                            RuleToken B = rightPart.get(j);
                            if (B instanceof Code) continue;

                            if (B instanceof Term) {
                                followSet.get(A.getName()).add(B.getName());
                            } else {
                                followSet.get(A.getName()).addAll(firstSet.get(B.getName()));
                                if (firstSet.get(B.getName()).contains(EPS)) {
                                    followSet.get(A.getName()).remove(EPS);
                                    continue;
                                }
                            }
                            break;
                        }
                        if (j == rightPart.size()) {
                            followSet.get(A.getName()).addAll(followSet.get(nonTermRule.getName()));
                        }
                        if (followSet.get(A.getName()).size() > oldSize) {
                            changed = true;
                        }
                    }
                }
            }
        }
    }

    public boolean isLL1() {
        return !hasLeftRecursion() && !hasRight();
    }

    private boolean hasLeftRecursion() {
        for (NonTermRule nonTermRule : nonTermRules) {
            for (List<RuleToken> rightPart : nonTermRule.getRightParts()) {
                for (RuleToken token : rightPart) {
                    if (token instanceof Term) break;
                    if (token instanceof NonTerm) {
                        if (token.getName().equals(nonTermRule.getName())) return true;
                        break;
                    }
                }
            }
        }
        return false;
    }

    private boolean hasRight() {
        for (NonTermRule nonTermRule : nonTermRules) {
            Set<String> firstTokens = new HashSet<>();
            for (List<RuleToken> rightPart : nonTermRule.getRightParts()) {
                for (RuleToken token : rightPart) {
                    if (token instanceof Code) continue;

                    if (firstTokens.contains(token.getName())) {
                        return true;
                    }
                    firstTokens.add(token.getName());
                    break;
                }
            }
        }
        return false;
    }
}
