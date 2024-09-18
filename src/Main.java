import util.Dol;

import java.util.Scanner;
/*Faça um programa para ler a cotação do dólar. e depois um valor em dólares a ser comprado
por um pessoa em reais, informar quantos reais a pessoa vai pagar pelos dólares, considerando
ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price: %.2f%n" , Dol.dollar);

        System.out.print("How many dollars will be bought: ");
        double dollars = sc.nextDouble();

        double total = Dol.calDol(dollars);

        double totalTax = Dol.calTax(dollars);

        System.out.printf("Amout to be paid in reais = %.2f%n", total);
        System.out.printf("Amout to be paid in reais tax = %.2f%n", totalTax);


    }
}
