String[] allLongestStrings(String[] inputArray) {
    int maxLength = 0;
    for (int i = 0; i < inputArray.length; i++) {
        if (maxLength < inputArray[i].length())
            maxLength = inputArray[i].length();
    }
    int longest = maxLength;
    ArrayList<String> newArr = new ArrayList<String>();
    for (int j = 0; j < inputArray.length; j++) {
        if (maxLength == inputArray[j].length()) {
            newArr.add(inputArray[j]);
        }
    }
    return newArr.toArray(new String[0]);
}