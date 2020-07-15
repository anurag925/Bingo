package com.Bingo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Players:");
        int players=sc.nextInt();
        Player[] player=new Player[players];
        System.out.print("Would You like to start the game(y/n):");
        String temp=sc.next();
        if(temp=="n" || temp=="N" || temp=="no"){
            System.exit(0);
        }
        int playerNumber=1;
        for(int i=0;i<5;i++){
            player[i]=new Player(playerNumber);
            player[i].start();
            playerNumber++;
        }
        int rank=1;
        while(true){
            if(rank==5){
                for(Player p:player){
                    System.out.println(p.name+"has a rank of"+p.rank);
                }
                break;
            }
            for(Player p:player){
                if(p.rank==0){
                    System.out.print("Enter a Number to CUT:");
                    int number=sc.nextInt();
                    int check;
                    try{
                        check=p.Bingo.cut(number);
                    }
                    catch(AlreadyChosenException e){
                        System.out.print("Enter a different number:");
                        check=p.Bingo.cut(number);
                    }
                    if(check>=5){
                        p.rank=rank;
                        rank++;
                    }
                }
            }
        }
        sc.close();

        System.out.println( "Hello World!" );
    }
}
