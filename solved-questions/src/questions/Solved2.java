package questions;

import java.util.Scanner;

public class Solved2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci kenar giriniz");
        int firstAngle = scan.nextInt();

        System.out.println("İkinci kenar giriniz");
        int secondAngle = scan.nextInt();

        System.out.println("Üçüncü kenar giriniz");
        int thirdAngle = scan.nextInt();

        if((firstAngle == secondAngle) && (firstAngle == thirdAngle)){
            System.out.println("Eşkenar üçgen");
        } else if((firstAngle != secondAngle) && (firstAngle != thirdAngle) && (secondAngle != thirdAngle)){
            System.out.println("Çeşit kenar üçgen");
        } else {
            System.out.println("ikizkenar üçgen");
        }
    }
}
