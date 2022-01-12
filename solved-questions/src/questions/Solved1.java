package questions;

import java.util.Scanner;

public class Solved1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        int firstNumber = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        int secondNumber = scan.nextInt();

        System.out.println("Üçüncü sayıyı giriniz");
        int thirdNumber = scan.nextInt();

        double mean = (double) (firstNumber + secondNumber + thirdNumber) / 3.0;

        System.out.println("Girdiğiniz sayıların ortalaması : " + mean);
        System.out.printf("%.4f", mean);

    }
}
