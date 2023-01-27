/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueens;

/**
 *
 * @author User
 */
public class EightQueens {

    /**
     * @param args the command line arguments
     */
    static int[] queens = new int[8];
    static int solutions = 0;

    public static void main(String[] args) {
        placeQueens(0);
        System.out.println("Number of solutions: " + solutions);
    }

    public static void placeQueens(int row) {
        if (row == 8) {
            printBoard();
            solutions++;
            return;
        }
        for (int col = 0; col < 8; col++) {
            if (isSafe(row, col)) {
                queens[row] = col;
                placeQueens(row + 1);
            }
        }
    }

    public static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            int j = queens[i];
            if (col == j) {
                return false;
            }
            int colDistance = Math.abs(col - j);
            int rowDistance = row - i;
            if (colDistance == rowDistance) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    
}
