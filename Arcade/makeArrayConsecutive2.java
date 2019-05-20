int makeArrayConsecutive2(int[] statues) {
int max = statues[0];
int min = statues[0];
int elems = (statues.length - 1);
    for (int i = 0; i < statues.length; i++) {
        if (statues[i] > max) {
            max = statues[i];
        }
        if (statues[i] < min) {
            min = statues[i];
        }
    }
return (max - min) - elems;
}

