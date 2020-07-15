package com.Bingo;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    String name;
    private int number;
    int rank=0;
    Game Bingo;

    public Player(int number) {
        this.number=number;
    }

    public void start() {
        int[][] BingoTable = new int[5][5];
        boolean[] check = new boolean[25];
        Arrays.fill(check, false);

        System.out.print("Enter Name of Player:");
        name = sc.next();

        System.out.println("Lets Enter the Bingo Table \n");
    
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter the number at " + (i + 1) + " " + (j + 1) + ":");
                int value = sc.nextInt();

                while (value > 25 || check[value - 1] != false) {
                    System.out.print("Enter a different value:");
                    value = sc.nextInt();
                }

                BingoTable[i][j] = value;
                check[BingoTable[i][j] - 1] = true;
            }
        }
        Bingo=new Game(BingoTable);
    }
}