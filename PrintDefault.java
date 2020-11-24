package kpi;

public class PrintDefault implements Printer{
    @Override
    public void print(short[] list) {
        for (int el: list) {
            System.out.print(el +" ");
        }
        System.out.println();
    }
}
