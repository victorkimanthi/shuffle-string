package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter some text");
            String text = scanner.nextLine();
            System.out.println("Enter a list of index values that matches the length of the text entered e.g [1,2,3]' for text 'car'");
            String str = scanner.nextLine();
            String[] string = str.replaceAll("\\{", "")
                    .replaceAll("}", "").replaceAll(" ","")
                    .split(",");

            int[] arr = new int[string.length];

            for (int i = 0; i < string.length; i++) {
                arr[i] = Integer.parseInt(string[i]);
            }

            ShufflingString shufflingString = new ShufflingString();
            String shuffledString = shufflingString.shuffleString(text, arr);
            System.out.println(shuffledString);
        }
    }
}