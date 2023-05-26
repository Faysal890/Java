import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     // One dimentional array
        int i, size;
        System.out.println("Enter size of the array : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" element in the array");
        for(i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("One dimentional array :");
        for(i=0; i<size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Length of the array
        System.out.println("Array length is : "+arr.length);

        // Two dimentional array
        int  j, n, m;
        System.out.println("Enter n and m of two dimention array");
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter element of the 2D array");
        for(i=0; i<n; i++) {
            for(j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Two dimentional array :");
        for(i=0; i<n; i++) {
            for(j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
