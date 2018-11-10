while (<>) {
    print if /(\W|\b)\d+(\W|\b)/;
}
