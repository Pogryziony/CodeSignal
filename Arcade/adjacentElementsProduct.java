int adjacentElementsProduct(int[] inputArray) {
     int[] temp = new int[inputArray.length - 1];
     for (int i = 0; i < temp.length; i++) {
         temp[i] = inputArray[i] * inputArray[i + 1];
     }
     int x = temp[0];
     for (int i = 1; i < temp.length; i++) {
         if (temp[i] > x) {
             x = temp[i];
         }
     }
     return x;
}