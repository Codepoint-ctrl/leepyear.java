package pratic;

import java.util.Scanner;

public class leepyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter your year");
        int year = sc.nextInt();
        sc.close();
        if((year % 4) == 0){
            System.out.println(year + "= is a leap year");


        } else{
            System.out.println(year + "= is nat a leap year");
        }
    }
}
