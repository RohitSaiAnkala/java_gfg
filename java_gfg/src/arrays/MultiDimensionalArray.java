package arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int a[][] = new int[][]{{1, 2, 3, 4, 5}, {6, 7}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        int arr[][]=new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        // Jagged array-->all rows are of not same size
        int arr2[][]=new int[3][];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=new int[i+1];
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j]=i;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
