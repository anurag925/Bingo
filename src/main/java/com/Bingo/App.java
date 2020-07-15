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
        int number=sc.nextInt();
        Player[] player=new Player[number];
        System.out.print("Would You like to start the game(y/n):");
        String temp=sc.next();
        if(temp=="n" || temp=="N" || temp=="no"){
            System.exit(0);
        }
        while(1){

        }
        sc.close();

        System.out.println( "Hello World!" );
    }
}
