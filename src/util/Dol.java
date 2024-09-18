package util;

public class Dol {
    public static final double dollar = 3.10;

    public static double calDol(double dollars){
        double calculo = 200 * dollar;
        return calculo + ((calculo * 6) / 100);
    }
    public static double calTax(double dollars){
        return 200 * dollar * 6 /100;
    }

}
