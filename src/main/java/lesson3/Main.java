package lesson3;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 8, 9, 10};

        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//            int index = array.length - 1;
//        while (index >= 0) {
//            System.out.println(array[index]);
//            index--;
//        }

//        for (int index = array.length-1; index >=0; index --) {
//            System.out.println(array[index]);
//        }

    }
}
