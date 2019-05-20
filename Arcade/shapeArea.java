int shapeArea(int n) {
    int polygon = 0;
    if (n == 1) {
        polygon = 1;
    } else {
        polygon = (n * n) * 2 - n - (n - 1);
    }
    return polygon;
}