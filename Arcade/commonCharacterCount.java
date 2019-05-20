int commonCharacterCount(String s1, String s2) {
    int check = 0;
    for (int i = 0; i < s1.length(); i++) {
        if (s2.contains(String.valueOf(s1.charAt(i)))) {
            check++;
        }
        s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
    }
    return check;
}