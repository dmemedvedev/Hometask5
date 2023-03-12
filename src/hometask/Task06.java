package hometask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(new File("matrix.txt"));

                int n = scanner.nextInt();
                int m = scanner.nextInt();

             
                int[][] matrix1 = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matrix1[i][j] = scanner.nextInt();
                    }
                }
                scanner.nextLine();
                int[][] matrix2 = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matrix2[i][j] = scanner.nextInt();
                    }
                }
                int[][] sumMatrix = new int[n][m];
                int[][] diffMatrix = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                        diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                    }
                }
                System.out.println("Sum of matrices:");
                printMatrix(sumMatrix);

                System.out.println("Difference of matrices:");
                printMatrix(diffMatrix);

                scanner.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }
        }

        public static void printMatrix(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
