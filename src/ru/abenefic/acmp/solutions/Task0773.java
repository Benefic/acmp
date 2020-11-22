package ru.abenefic.acmp.solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0773 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int m = in.nextInt();
        out.println(k * k * m);
        out.flush();
    }
}
