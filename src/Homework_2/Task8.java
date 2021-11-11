package Homework_2;

public class Task8 {
    public static void main(String[] args) {
        int [][] matrix = {{2, 3, 4},{4,5,66,-70},{3,45,99,-4}};

        for (int i = 0; i < matrix.length; i++) {
            int summ = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                summ += matrix[i][j];
            }
            System.out.println(summ);
        }
    }
}
