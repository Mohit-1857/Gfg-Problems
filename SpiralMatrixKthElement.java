public class SpiralMatrixKthElement {

    // Problem Statment -- > Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer k. The function will return the kth element obtained while traversing the matrix spirally.
  
  public static int findKthElement(int[][] matrix , int n,int m ,  int k) {
    int value = 1;
    int minRow = 0, maxRow = n - 1;
    int minCol = 0, maxCol = m - 1;

    while (value <= n * m) {
        // Traverse right
        for (int i = minCol; i <= maxCol; i++) {
            if (value == k) {
                return matrix[minRow][i];
            }
            value++;
        }
        minRow++;

        // Traverse down
        for (int i = minRow; i <= maxRow; i++) {
            if (value == k) {
                return matrix[i][maxCol];
            }
            value++;
        }
        maxCol--;

        // Traverse left
        for (int i = maxCol; i >= minCol; i--) {
            if (value == k) {
                return matrix[maxRow][i];
            }
            value++;
        }
        maxRow--;

        // Traverse up
        for (int i = maxRow; i >= minRow; i--) {
            if (value == k) {
                return matrix[i][minCol];
            }
            value++;
        }
        minCol++;
    }

    return -1; // kth element not found
}

  public static void main(String[] args) {
    int n = 4, m = 4, k = 10;
    int[][] A = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };

    int ans = findKthElement(A , n, m ,  k);
    System.out.println(ans);
  }
}
