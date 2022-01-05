package Lottery;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int luckyNumber = (int)(Math.random() * 99 + 1);
        System.out.println("Lütfen tahminizi giriniz: ");
        int predictedNumber = scan.nextInt();

        // üretilen sayı
        int luckyNumberFirst = luckyNumber / 10;
        int luckyNumberSecond = luckyNumber % 10;

        // kullanıcıdan gelen sayı
        int predictedNumberFirst = predictedNumber / 10;
        int predictedNumberSecond = predictedNumber % 10;


        if(luckyNumber == predictedNumber ){
            System.out.println("Tebrikler 10 000 TL kazandınız, şanslı sayı: " + luckyNumber + ", sizin tahmininiz: " + predictedNumber);
        } else if (luckyNumberSecond == predictedNumberFirst && luckyNumberFirst == predictedNumberSecond) {
            System.out.println("Tebrikler 5 000 TL kazandınız, şanslı sayı: " + luckyNumber + ", sizin tahmininiz: " + predictedNumber);
        } else if (luckyNumberFirst == predictedNumberFirst || luckyNumberFirst == predictedNumberSecond ||
        luckyNumberSecond == predictedNumberFirst || luckyNumberSecond == predictedNumberSecond ) {
            System.out.println("Tebrikler 1 000 TL kazandınız, şanslı sayı: " + luckyNumber + ", sizin tahmininiz: " + predictedNumber);
        } else {
            System.out.println("Malesef ödül kazanamadınız, şanslı sayı: " + luckyNumber + ", sizin tahmininiz: " + predictedNumber);
        }
    }
}
