my @arr;
$s = "";
while ($t = <>) {
    $s .= $t;    
}
$f = 1;
$s =~ s/\s*//g;
while ($f) {
    if ($s =~ s/<a[^<>]*?href\s*=\s*"([^"<>]*?)"([^<>]*)>//) {
        $help = $1;
        $help =~ s/(\w+?:\/\/|\/\/)?//; #scheme
        $help =~ s/(.*?)\/.*/\1/; #authority
        if ($help =~ s/^([^<>]+@)*\s*(\w[^:\#]*)[:\#]?.*/\2/) {
            push @arr, $help;
        }
    } 
    else {
        $f = 0;
    }
}
$last = "";
foreach $s (sort @arr) {
    if (!($last =~ $s)) { 
        print $s;
        print "\n";
        $last = $s;
    }
}
