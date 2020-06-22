package homework;

public class SquareMatrix {
    private int[][] dataArray;


    public SquareMatrix(int[][] dataArray) {
        setDataArray(dataArray);
    }

    public SquareMatrix() {
        this(new int[][]{{0}});
    }

    public SquareMatrix(SquareMatrix sqM) {
        this(sqM.getDataArray());
    }

    public int[][] getDataArray() {
        int[][] copy = new int[dataArray.length][dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray.length; j++) {
                copy[i][j] = dataArray[i][j];
            }
        }
        return copy;
    }

    public void setDataArray(int[][] dataArray) {
        if (dataArray != null) {
            this.dataArray = new int[dataArray.length][dataArray.length];
            for (int i = 0; i < dataArray.length; i++) {
                for (int j = 0; j < dataArray.length; j++) {
                    this.dataArray[i][j] = dataArray[i][j];
                }
            }
        } else {
            this.dataArray = new int[][]{{0}};
        }
    }
    int indexOfMaxRow = 0;
    int indexOfMaxCol = 0;

    public int findMaxSum() {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;


        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray.length; j++) {
                //e.g if the length of the array is 4 the last possible submatrix's first element could be dataArray[2][2]
                //therefore the conditional statement is used to point that out and to ensure
                // there won't be an ArrayIndexOutOfBoundsException
                if (i <= dataArray.length - 2 && j <= dataArray.length - 2) {

                    //the 4 elements of the submatrix
                    int firstEl = dataArray[i][j];
                    int secondEl = dataArray[i][j + 1];
                    int thirdEl = dataArray[i + 1][j];
                    int fourthEl = dataArray[i + 1][j + 1];

                    //the sum of the submatrix is calculated
                    sum = firstEl + secondEl + thirdEl + fourthEl;
                    //comparing sums in order to find the largest one
                    if (max_sum < sum) {
                        max_sum = sum;
                        indexOfMaxRow = i;
                        indexOfMaxCol = j;
                    }
                    if (sum < 0) {
                        sum = 0;
                    }
                }
            }
        }
        return max_sum;
    }//end method findMaxSum

    //printing the maximum submatrix sum in the matrix and the top left element of the mentioned submatrix
    public void printAll(){
        System.out.printf("Maximum sum: %d\n", findMaxSum());
        System.out.printf("Submatrices with Maximum sum: \n[%d, %d]\n", indexOfMaxRow, indexOfMaxCol);
    }


    //convert the matrix to String divided accordingly in rows and columns
    @Override
    public String toString() {
        String result = "";
        int count = 0;
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray.length; j++) {
                result += String.valueOf(dataArray[i][j]);
                count++;
                if (count % dataArray.length == 0) {
                    result += "\n";
                }

            }
        }
        return result;
    }//end method toString
}//end class SquareMatrix
