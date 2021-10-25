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

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
    }
}
