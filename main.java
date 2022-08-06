import java.util.*;
import static java.lang.System.out;


class Solution {


  private HashSet<Character> hs = new HashSet<Character>();

  public void vertical(char[][] board, int column) {

    for (int i = 0; i < 9; i++) {

      if (board[i][column] != '.') {

        hs.add(board[i][column]);
      }

      // System.out.println(board[i][column]);

    }
  }

  public void horizontal(char[][] board, int row) {

    for (int i = 0; i < 9; i++) {

      if (board[row][i] != '.') {
        hs.add(board[row][i]);
      }

      // System.out.println(board[row][i]);

    }
  }

  public int innerBox(char[][] board, int blockX, int blockY) {

    int r = 0;

    for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 3; j++) {

        // System.out.println(board[blockX*3+i][blockY*3+j]);

        if (board[blockX * 3 + i][blockY * 3 + j] != '.') {

          hs.add(board[blockX * 3 + i][blockY * 3 + j]);

        } else {

          r++;
        }
      }
    }

    return r;
  }


  public static void main(String[] args){
	
	//char testCase =[["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]];
	String t1 = "skskekk3023938382iejdje3299";
	char[] arr = t1.toCharArray();
        out.print(arr);    	
  }

  public void solveSudoku(char[][] board) {

    // find easy entry first

    // and inner box first

    for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 3; j++) {

        int emptyCount = innerBox(board, i, j);

        System.out.println(emptyCount);
      }
    }

    // horizontal(board,1);

    // for(int i=0;i<9;i++){

    // vertical(board,0);

    //  horizontal(board,0);

    // System.out.println(hs.size());

    // hs.clear();

    // System.out.println("horizontal");

    // horizontal(board,i);

    // System.out.println(hs.size());

    // hs.clear();

    // horizontal(board,i);

    // }

    // System.out.println(hs);

    //  for(int i=0;i<9;i++){

    //     horizontal(board,i);
    //     System.out.println(hs.size());

    //     hs.clear();

    //     //horizontal(board,i);

    // }

    /*

        1. do what position first

        2. it is a number or guess ?

        3. guess need back store

    */

  }
}

    //char[][] testCase =[["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]];
