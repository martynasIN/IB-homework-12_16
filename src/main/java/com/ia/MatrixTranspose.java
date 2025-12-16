package com.ia;// Java Program to find
// transpose of a matrix

class MatrixTranspose
{
    static final int M = 3;
    static final int N = 3;

    // This function stores transpose
    // of A[][] in B[][]
    static void transpose(int A[][], int B[][])
    {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < M; j++)
                B[i][j] = A[j][i];
    }

    // Driver code
    public static void main(String[] args)
    {
        int A[][] = {
                { 1, 2, 3},
                {4, 5, 6 },
                { 7, 8, 9}
               };

        int B[][] = new int[N][M], i, j;

        transpose(A, B);

        System.out.print("Result matrix is \n");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }
    }
}