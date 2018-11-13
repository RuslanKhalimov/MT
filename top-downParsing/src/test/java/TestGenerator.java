import java.util.Random;

public class TestGenerator {
    private Random random;

    TestGenerator(int seed) {
        random = new Random(seed);
    }

    private int getProbability() {
        return random.nextInt(100);
    }

    String getExpression() {
        return getX() + getEPrime();
    }

    private String getX() {
        return getC() + getXPrime();
    }

    private String getC() {
        return getT() + getCPrime();
    }

    private String getT() {
        int pr = getProbability();
        if (pr < 15) {
            return "(" + getExpression() + ")";
        } else if (pr < 50) {
            return "!" + getT();
        } else {
            return getLetter();
        }
    }

    private String getEPrime() {
        if (getProbability() < 35) {
            return "|" + getX() + getEPrime();
        }
        return "";
    }

    private String getXPrime() {
        if (getProbability() < 35) {
            return "^" + getC() + getXPrime();
        }
        return "";
    }

    private String getCPrime() {
        if (getProbability() < 35) {
            return "&" + getT() + getXPrime();
        }
        return "";
    }

    private String getLetter() {
        return Character.toString((char)('a' + random.nextInt(26)));
    }
}
