package ru.abenefic.acmp.solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String input = in.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        out.println(a + b);
        out.flush();
    }
}