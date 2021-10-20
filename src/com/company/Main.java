package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many chickens?");
        int chickens = input.nextInt();
        int eggs = random.nextInt(4)+26;
        int yearTotal = chickens * eggs * 12;
        System.out.println(yearTotal);

        /*int[] favouriteNumbers = new int[10];
        for(int i =0; i < favouriteNumbers.length; i++){
            favouriteNumbers[i] = random.nextInt(500);
            System.out.println(favouriteNumbers[i]);*/
        }
    }
}
