import java.io.File;
import java.util.Scanner;

public class Maze {
    private int rows, cols;
    private int startRow, startCol;
    private int exitRow, exitCol;

    public Maze(File filename){
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        cols = scan.nextInt();
        scan.nextLine();
        startRow = scan.nextInt();
        startCol = scan.nextInt();
        scan.nextLine();
        exitRow = scan.nextInt();
        exitCol = scan.nextInt();

        //Read the file and put it into a 2D array
        String[][] currentMaze = new String[rows][cols];
        for(int leftToRight=0; leftToRight<rows; leftToRight++){
            for(int upToDown=0; upToDown<cols; upToDown++){
                currentMaze[rows][cols] = currentMaze[leftToRight][upToDown];
            }
        }

    }

    /**
     * Get the rows of the maze
     * @return number of rows in the maze
     */
    public int getRows(){
        return rows;
    }

    /**
     * Get the cols in the maze
     * @return number of cols in the maze
     */
    public int getCols(){
        return cols;
    }

    /**
     * Get the start cell's row
     * @return the start cell's row
     */
    public int getStartRow(){
        return startRow;
    }

    /**
     * Get the start cell's cols
     * @return the start cell's cols
     */
    public int getStartCol(){
        return startCol;
    }

    /**
     * Get the exit cell's row
     * @return the exit cell's row
     */
    public int getExitRow(){
        return exitRow;
    }

    /**
     * Get the exit cell's col
     * @return the exit cell's col
     */
    public int getExitCol(){
        return exitCol;
    }

    /**
     * Get the char at a coordinate
     * @param row position for row
     * @param col position for col
     * @return the character stored at this cell
     */
    public char getCell(int row, int col){
        return currentMaze[row][col];
    }

    public boolean openCell(int row, int col){
        if(currenMaze[row][col] == " "){
            return true;
        }else{
            return false;
        }
    }


}
