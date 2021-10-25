package com.blp.tictactoe;
import java.util.Scanner;
public class TicTacToeGame {
    public static char[] board = new char[10];
    public static char playerchoice;
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
    public static void showBoard()
    {
        System.out.println("|-----------|");
        System.out.println("| "+board[1]+ " | " +board[2]+ " | " +board[3]+ " |");
        System.out.println("|-------|");
        System.out.println("| "+board[4]+ " | " +board[5]+ " | " +board[6]+ " |");
        System.out.println("|-----------|");
        System.out.println("| "+board[7]+ " | " +board[8]+ " | " +board[9]+ " |");
        System.out.println("|--------|");
    }
    public static void playMove()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select position in Index to move in Board(1 to 9)");
        int indexnumber = scanner.nextInt();
        if(indexnumber < 1 || indexnumber > 9)
        {
            System.out.println("You entered Invalid position");
            playMove();
        }else
        {
            board[indexnumber] = playerchoice;
            showBoard();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
        assignInputs();
        showBoard();
        playMove();
    }
}
