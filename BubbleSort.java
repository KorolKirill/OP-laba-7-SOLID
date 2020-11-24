package kpi;

import java.util.Arrays;

public class BubbleSort implements SortsAlgorithm{
    @Override
    public String toString() {
        return "BubbleSort";
    }

    @Override
    public void sort(short[] initialArray) {
        int len = initialArray.length;
        for (int i = 0; i < len ; i++ ) {
            for (int k = 0; k < len-1; k++ ) {
                if ( initialArray[k] < initialArray[k+1] ) {
                    short saveElement = initialArray[k];
                    initialArray[k] = initialArray[k+1];
                    initialArray[k+1] = saveElement;
                }
            }
        }
    }
}
