package com.softserveinc;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has:\n" + ">>> ");
            int CupsFromWater = scanner.nextInt() / 200; //
        System.out.print("Write how many ml of milk the coffee machine has:\n" + ">>> ");
            int CupsFromMilk = scanner.nextInt() / 50;
        System.out.print("Write how many grams of coffee beans the coffee machine has:\n" + ">>> ");
            int CupsFromBeans = scanner.nextInt() / 15;
        System.out.print("Write how many cups of coffee you will need:\n" + ">>> ");
            int CupNeed = scanner.nextInt();

            int Cups = Math.min(CupsFromWater, Math.min(CupsFromMilk,CupsFromBeans ));

            if (Cups == CupNeed) {
                System.out.println("Yes, I can make that amount of coffee");
            }
                else
                    if (Cups > CupNeed) {
                    System.out.println("Yes, I can make that amount of coffee (and even " + (Cups - CupNeed) + " more than that)");
                }
                    else {
                    System.out.println("No, I can make only " + Cups + " cup(s) of coffee");

                }

    }
}
