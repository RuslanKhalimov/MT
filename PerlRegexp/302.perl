$f = 0;
$start = 1;
while (<>) {
    s/<[^<>]*>//g;
    if (/^\s*$/) {
        if (!$start) {
            $f = 1;
        }
    } else {
        if ($f) {
            print "\n";    
        }
        $f = 0;
        $start = 0;
        s/(^ +)|( +$)//g;
        s/(\s)+/\1/g;
        print;
    }
}
