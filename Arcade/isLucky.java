boolean isLucky(int n) {
    ArrayList<Integer> numbers = new ArrayList<>();
    int sumOfAllDigits = 0;
    while (n > 0) {
        numbers.add(n % 10);
        n /= 10;
    }
    for (int i = 0; i < numbers.size(); i++) {
        if (i < numbers.size() / 2) {
            sumOfAllDigits += numbers.get(i);
        } else {
            sumOfAllDigits -= numbers.get(i);
        }
    }
    if (sumOfAllDigits != 0) {
        return false;
    } else
        return true;
}