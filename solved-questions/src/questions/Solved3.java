package questions;

import java.util.Scanner;

public class Solved3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double visa = 0, finalNote = 0;
        double mean = 0;

        System.out.println("Vize notunuzu giriniz :");
        visa = scan.nextDouble();

        System.out.println("Final notunuzu giriniz :");
        finalNote = scan.nextDouble();

        mean = visa * 0.4 + finalNote * 0.6;

        if(mean > 50){
            System.out.println("Dersi geçtiniz, ortalamanız :" + mean);
        } else {
            System.out.println("Dersi geçemediniz, ortalamanız :" + mean);
        }

    }
}
