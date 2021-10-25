package com.blp.tictactoe;
import java.util.Scanner;
public class TicTacToeGame {
    public static char[] board = new char[10];
    public static void createBoard()
    {
        for(int i = 1; i <board.length; i++)
        {
            board[i] = ' ';
        }
    }
    public static void assignInputs()
    {
        System.out.println("Choose your choice between X or O");
        Scanner scanner = new Scanner(System.in);
        char playerchoice = scanner.next().charAt(0);
        if(playerchoice == 'O')
        {
            System.out.println("Player choice is: " +playerchoice);
            System.out.println("Computer choice is X");
        }else if (playerchoice == 'X')
        {
            System.out.println("Player choice is: " +playerchoice);
            System.out.println("Computer choice is O");
        }
        else
        {
            System.out.println("Enter choice is not correct then enter correct choice");
            assignInputs();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
        assignInputs();
    }
}
