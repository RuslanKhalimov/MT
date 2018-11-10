while (<>) {
    print if /(\s|\b)(\w+)\g2(\s|\b)/;
}
