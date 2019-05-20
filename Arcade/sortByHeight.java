int[] sortByHeight(int[] a) {
boolean swap = true;
int j = 0;
int temp = 0;
    while (swap) {
        swap = false;
        j++;
        for (int i = 0, k = 0; i < a.length - j; i++) {
            if (a[i] == -1) {
                k = 0;
                continue;
            }
            while (i + 1 + k < a.length && a[i + 1 + k] == -1) {
                k++;
            }
            if (i + 1 + k < a.length && a[i] > a[i + 1 + k]) {
                temp = a[i];
                a[i] = a[i + 1 + k];
                a[i + 1 + k] = temp;
                k = 0;
                swap = true;
            }
        }
    }
    return a;
}

