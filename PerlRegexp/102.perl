while (<>) {
    print if /^.*(\b|\s)cat(\b|\s).*$/;
}
