package kpi;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        short[] test = {46, 4, 62, 11, 34, 58, 39, 49, 6, 81, 36, 4, 37, 98, 76};

        //Просортируем с помощью бабл сорта
        DataProcess dp = new DataProcess(new PrintDefault(), new BubbleSort());
        System.out.println("Initial array:");
        dp.print(test);
        dp.combine(test.clone());
        DataProcess anotherDP = new DataProcess(new PrintDefault(), new InsertionSort());
        anotherDP.combine(test.clone());
        // Перевызначаем сортировщик на КвикСорт
        anotherDP = new DataProcess(new PrintDefault(),new QuickSort());
        anotherDP.combine(test.clone());

    }
}
