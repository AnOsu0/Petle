package for_foreach.lesson;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int number = 12167;
        int userInput;
//        System.out.println("Zgadnij liczbę");
//
//        while ((userInput = sc.nextInt()) != number){
//            if (userInput>number){
//                System.out.println("Podana liczba jest zbyt duża");
//            } else {
//                System.out.println("Podana liczba jest zbyt mała");
//            }
//        }
//        System.out.println("Brawo zgadłeś liczbę");

        do {
            System.out.println("Zgadnij liczbę");
            userInput = sc.nextInt();
            if (userInput>number){
                System.out.println("Podana liczba jest zbyt duża");
            } else if (userInput<number){
                System.out.println("Podana liczba jest zbyt mała");
            }
        } while (userInput!=number);

        System.out.println("Brawo zgadłeś");
        sc.close();
    }
}
