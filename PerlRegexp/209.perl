while (<>) {
    s/\([^\)]*\)/()/g;
    print;
}
