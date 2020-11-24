package kpi;

public class QuickSort implements SortsAlgorithm{
    @Override
    public void sort(short[] list) {
        quickSort(list,0,list.length-1);
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }

    public void quickSort(short[] list, int start, int end) {
        if (start < end) {
         int pivotIndex = pivot(list,start,end);
         quickSort(list,start,pivotIndex-1);
         quickSort(list,pivotIndex+1,end);
        }
    }

    public int pivot(short[] list, int left, int right) {
        int pivot = list[right];
        int pivotIndex = left;

        for (int i =left; i <right;i++) {
            if (list[i] >= pivot) {
                swap(list,i,pivotIndex);
                pivotIndex++;
            }
        }
        swap(list,pivotIndex,right);
        return pivotIndex;
    }

    public void swap(short[] list,int index1,int index2) {
        short temp = list[index1];
        list[index1]= list[index2];
        list[index2] = temp;
    }
}
