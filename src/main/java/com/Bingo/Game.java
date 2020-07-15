package com.Bingo;

import java.util.Arrays;

public class Game {

    private String name = "BINGO";
    private int[][] BingoTable = new int[5][5];
    private boolean[][] select = new boolean[5][5];

    public Game(int[][] BingoTable) {
        this.BingoTable = BingoTable;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                select[i][j] = false;
            }
        }
    }

    public int[][] getBingoTable() {
        return BingoTable;
    }

    public void printBingoTable() {

        // System.out.println(Arrays.deepToString(BingoTable));
        for (int i[] : BingoTable) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public int cut(int x, int y) {
        if (select[x - 1][y - 1] == false)
            select[x - 1][y - 1] = true;
        else{
            throw new AlreadyChosenException("The value has already been choosen");
        }
        return Bingo();
    }
    public int cut(int number) {

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(BingoTable[i][j]==number && select[i][j]==false){
                    select[i][j]=true;
                }
                else{
                    throw new AlreadyChosenException("The value has already been choosen");
                }
            }
        }
        return Bingo();
    }

    public int Bingo() {
        int count = 0;
        for (boolean[] i : select) {
            int truecount = 0;
            for (boolean j : i) {
                if (j == true) {
                    truecount++;
                }
            }
            if (truecount == 5) {
                count++;
            }
        }
        for (int i = 0; i < 5; i++) {
            int truecount = 0;
            for (int j = 0; j < 5; j++) {
                if (select[j][i] == true) {
                    truecount++;
                }
            }
            if (truecount == 5) {
                count++;
            }
        }
        for(int i=0;i<5;i++){
            int truecount = 0;
            if(select[i][i]==true){
                truecount++;
            }
            if (truecount == 5) {
                count++;
            }
        }
        for(int i=0;i<5;i++){
            int truecount = 0;
            if(select[i][4-i]==true){
                truecount++;
            }
            if (truecount == 5) {
                count++;
            }
        }
        return count;
    }

}