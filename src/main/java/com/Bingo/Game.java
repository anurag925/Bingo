package com.Bingo;

import java.util.Arrays;

public class Game {

    private int[][] BingoTable=new int[5][5];
    private boolean[][] select=new boolean[5][5];
    private int x;
    private int y;

    public Game(int[][] BingoTable){
        this.BingoTable=BingoTable;
    }

    public int[][] getBingoTable() {
        return BingoTable;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printBingoTable(){

        // System.out.println(Arrays.deepToString(BingoTable));
        for(int i[] : BingoTable){
            for(int j: i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }




    
}