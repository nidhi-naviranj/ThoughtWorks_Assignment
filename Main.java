package Triangles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void sa() {
        System.out.println("*");
    }

    public static void singleline() {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        for(int j = 0;j < i; j++){
            System.out.print("*");
        }
        System.out.println();

    }

    public static void vertical() {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        for(int j = 0;j < i; j++){
            System.out.println("*");
        }

    }
    public static void right() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0;i < n; i++){
            for (int j = 0;j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public  static void iso() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1;i <= n; i++){
            for (int j = 1;j <= n-i; j++ ){
                System.out.print(" ");
            }
            for (int j = 1;j <= (2*i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void diamond() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1;i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1;j <= (2*i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

    }

    public static void diamondwithname() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1;i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Nidhi Mann");
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1;j <= (2*i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

    }

      public static void fizz() {
            Scanner s = new Scanner(System.in);
            for (int i = 1; i < 101; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }


            }

        }

    public static void prime() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        if(n>1) {
            for (int i = 2; i <= n; i++) {

                while (n % i == 0) {
                    if(!(l.contains(i))){
                        System.out.print(i + " ");
                        l.add(i);
                    }

                    n = n / i;
                }
            }
        }
        else if (n==1){
            System.out.println(1);
        }
        System.out.println();

    }

        public static void main(String[] args) {
        System.out.println("Triangle Exercises");
        System.out.println();

        System.out.println("No-1. Print one asterisk");
        sa();
        System.out.println();

        System.out.println("No-2. Print Horizontal line of asterisk");
        System.out.print("Print n:");
        singleline();
        System.out.println();

        System.out.println("No-3. Print vertical line of asterisk");
        System.out.print("Print n:");
        vertical();
        System.out.println();

        System.out.println("No-4. Print right triangle of asterisk");
        System.out.print("Print n:");
        right();
        System.out.println();

        System.out.println();


        System.out.println("Diamond Exercises");System.out.println();

        System.out.println("No-1. Isosceles Triangle");
        System.out.print("Print n:");
        iso();
        System.out.println();

        System.out.println("No-2. Diamond");
        diamond();
        System.out.println();

        System.out.println("No-3. Diamond with Name");
        System.out.print("Print n:");
        diamondwithname();
        System.out.println();

        System.out.println();


        System.out.println("FizzBuzz Exercises");
        fizz();
        System.out.println();

        System.out.println();



        System.out.println("Prime Factor Exercises");
        prime();
    }
}
