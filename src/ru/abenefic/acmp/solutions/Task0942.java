package ru.abenefic.acmp.solutions;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task0942 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int tasksCount = in.nextInt();
        int[] tasks = new int[tasksCount];

        for (int i = 0; i < tasksCount; i++) {
            tasks[i] = in.nextInt();
        }

        int five = 0;
        int time = 0;
        for (int task : tasks) {
            time += task;
            five += time;
        }

        int third = 0;
        time = 0;
        for (int i = tasksCount - 1; i >= 0; i--) {
            time += tasks[i];
            third += time;
        }

        int first = 0;
        time = 0;
        Arrays.sort(tasks);
        for (int task : tasks) {
            time += task;
            first += time;
        }

        int winner;

        if (five < third && five < first) {
            winner = 5;
        } else if (third < five && third < first) {
            winner = 3;
        } else {
            winner = 1;
        }
        out.println(winner);

        out.flush();
    }
}
