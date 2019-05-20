int centuryFromYear(int year) {
    int tmp = year % 100;
    if (tmp == 0) {
       return year / 100;
    } else {
       return (year / 100) + 1;
    }
}
