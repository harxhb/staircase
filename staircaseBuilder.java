/*
 * Write your program inside the main method to build
 * a staicase in a 2D array of characters according
 * to the assignment description
 *
 * To compile:
 *        javac StaircaseBuilder.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class staircaseBuilder {
    
    public static void main(String[] args) {

        // WRITE YOUR CODE HERE
        int d = Integer.parseInt(args[0]);
        int totalBricks = Integer.parseInt(args[1]);

        char[][] array = new char[d][d];

        for(int column = 0; column < d; column++)
        {
            for(int row = d - 1; row > (d - 1) - (column + 1); row--)
            {
                if(totalBricks > 0)
                {
                    array[row][column] = 'X';
                    totalBricks--;
                }
                else
                {
                    array[row][column] = ' ';
                }
            }
            for(int row = (d - 1) - (column + 1); row >= 0; row--)
            {
                array[row][column] = ' ';
            }
        }
        for (int row = 0; row < d; row++)
        {
            for(int column = 0; column < d; column++)
            {
                System.out.print(array[row][column]);
            }
            System.out.println();
        }
        System.out.println("Bricks remaining: " + totalBricks);
    }
}
