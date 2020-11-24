package kpi;


public class InsertionSort implements SortsAlgorithm {
    @Override
    public String toString() {
        return "InsertionSort";
    }

    @Override
    public void sort(short[] initialArray) {
        int len = initialArray.length;
        for (int i = 0; i < len; i++) {
            for (int k = i; k > 0; k--) {
                if (initialArray[k] > initialArray[k - 1]) {
                    short saveElement = initialArray[k];
                    initialArray[k] = initialArray[k - 1];
                    initialArray[k - 1] = saveElement;
                } else {
                    break;
                }
            }
        }
    }
}
