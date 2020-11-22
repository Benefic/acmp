package ru.abenefic.acmp.solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        out.print(--b);
        out.print(" ");
        out.print(--a);
        out.flush();
    }
}
