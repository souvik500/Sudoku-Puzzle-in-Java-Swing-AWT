package Swing_AWT;

import java.util.*;

public class Sudoku_Board
{
    ArrayList<int[]> first3Row = new ArrayList<>();
    ArrayList<int[]> second3Row = new ArrayList<>();
    ArrayList<int[]> third3Row = new ArrayList<>();

    int[] Row1 = {2, 9, 6, 3, 1, 8, 5, 7, 4}; //That value's is goes to first3Row
    int[] Row2 = {5, 8, 4, 9, 7, 2, 6, 1, 3};
    int[] Row3 = {7, 1, 3, 6, 4, 5, 2, 8, 9};
    int[] Row4 = {6, 2, 5, 8, 9, 7, 3, 4, 1}; //That value's is goes to second3Row
    int[] Row5 = {9, 3, 1, 4, 2, 6, 8, 5, 7};
    int[] Row6 = {4, 7, 8, 5, 3, 1, 9, 2, 6};
    int[] Row7 = {1, 6, 7, 2, 5, 3, 4, 9, 8}; //That value's is goes to third3Row
    int[] Row8 = {8, 5, 9, 7, 6, 4, 1, 3, 2};
    int[] Row9 = {3, 4, 2, 1, 8, 9, 7, 6, 5};

    int[][] FinalBoard = new int[9][9]; //declartion Part of final board

    //This is our final Board Creation
    public int[][] getFinalBoard() { return FinalBoard;}

    //Sudoku_Board Constructor====================
    Sudoku_Board(){
        initializeRow_1_9(Row1, Row2, Row3, Row4, Row5, Row6, Row7, Row8, Row9);
        createBoard();
        HideRandomKey();
    }

    //create board means--> value insert to the board / Here in List Initialization
    private void initializeRow_1_9(int[] row1, int[] row2, int[] row3, int[] row4, int[] row5, int[] row6,
                                  int[] row7, int[] row8, int[] row9)
    {
        first3Row.add(row1);
        first3Row.add(row2);
        first3Row.add(row3);

        second3Row.add(row4);
        second3Row.add(row5);
        second3Row.add(row6);

        third3Row.add(row7);
        third3Row.add(row8);
        third3Row.add(row9);
    }

    private void createBoard()
    {
        consructLinesFromAL(first3Row, 0);
        consructLinesFromAL(second3Row, 3);
        consructLinesFromAL(third3Row, 6);
    }

    private void consructLinesFromAL(ArrayList<int[]> RowArrayList, int rowStart)
    {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 9; j++){
                //Now entering number to final board
                //when it takes firstarraylist value --> rowstart=0
                //when it takes secondtarraylist value --> rowstart=3
                //when it takes thirdarraylist value --> rowstart=6
                FinalBoard[rowStart + i][j] = RowArrayList.get(i)[j];
            }
        }
    }

    private void HideRandomKey()
    {
        Random key = new Random();
        int randomRow, randomCol;
        for(int i=0;i<60;i++){
            randomRow = key.nextInt(9); // random value generated based on [0,9) for row
            randomCol = key.nextInt(9);  // random value generated based on [0,9) for cols
            FinalBoard[randomRow][randomCol] = 0;
        }
    }
}
