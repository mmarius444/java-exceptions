package Coef;

import java.util.Scanner;

public class CoeficientCuMetoda {
    public static int coeficient(int number1, int number2) {

        if (number2 == 0){
            System.out.println("Impartitorul/divizorul nu poate sa fie zero.");
            System.exit(1);
        }

        return number1 / number2;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Solicitam user-ului sa introduca 2 integeri
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int rezultat = coeficient(number1, number2);
        System.out.println(number1 + " / " + number2 + " este " + rezultat);
    }

}
