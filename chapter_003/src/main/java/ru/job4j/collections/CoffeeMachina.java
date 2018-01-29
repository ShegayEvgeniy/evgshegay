package ru.job4j.collections;

public class CoffeeMachina {

    private final int ten = 10;
    private final int five = 5;
    private final int two = 2;
    private final int one = 1;
    private int count = 0;
    private double a1 = 0.0;
    private double d1 = 0.0;
    private double g1 = 0.0;
    private double j1 = 0.0;
    private int c = 0;
    private int f = 0;
    private int i = 0;
    private int b = 0;
    private int e = 0;
    private int h = 0;
    private int k = 0;


    public static void main(String[] args) {

        CoffeeMachina coffe = new CoffeeMachina();
        int [] result2 = coffe.changes(50,35);
        for(int tmp : result2) {
            System.out.println(" Сдача  равна = " + tmp );
        }

    }

    public int[] changes(int value, int price) {

        int cash = value - price;
        if(cash >= 10) {
            a1 = cash / ten;
             b = (int) a1;
             c = cash - (b * ten);
        }

        if(c >= 5){
            d1 = c/five;
            f = (int)d1;
            i = c - (f * five);
        }

        if(c >= 2 && c < 5) {
            g1 = c/two;
            e = (int)g1;
            h = c - (e * two);
        }

        if(i >= 2){
          g1 = i/two;
          e = (int)g1;
          h = i - (e * two);
        }

        if(h == 1) {
            k = h;
        }

        int summ = b + f + e + k;

        int [] result = new int [summ];
        for(int aa = 0; aa < b; aa++){
            result[count ] = 10;
            count++;
        }

        for(int bb = 0; bb < f; bb++) {
            result[count] = 5;
            count++;
        }

        for(int bb = 0; bb < e; bb++) {
            result[count] = 2;
            count++;
        }

        for(int bb = 0; bb < k; bb++) {
            result[count] = 1;
            count++;
        }
        return result
    }
}
