package kpi;

import org.w3c.dom.ls.LSOutput;

public class DataProcess {
    private Printer printer;
    private SortsAlgorithm  algorithm;

    public DataProcess(Printer printer, SortsAlgorithm algorithm) {
        this.printer = printer;
        this.algorithm = algorithm;
    }
    void print(short[] list) {
        printer.print(list);
    }
    void sort(short[] list) {
        algorithm.sort(list);
    }
    // Сортирует и печатает
    void combine(short[] list) {
        System.out.println("\n Let`s sort our array with "+algorithm.toString());
        sort(list);
        print(list);
    }

}
