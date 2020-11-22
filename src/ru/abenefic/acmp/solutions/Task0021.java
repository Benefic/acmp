package ru.abenefic.acmp.solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        out.print(max - min);
        out.flush();
    }
}
