package Homework_2;

public class Task7 {
    public static void main(String[] args) {

        int [][] matrix = {{2, 3, 4},{4,5,66,-70},{3,45,99,-4}};

        int minimalElementArrays = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < minimalElementArrays)
                {
                    minimalElementArrays = matrix[i][j];
                }

            }
        }
        System.out.println(minimalElementArrays);
    }
}
