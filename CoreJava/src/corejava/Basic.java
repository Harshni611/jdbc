package corejava;
import java.util.Scanner;
public class Basic {

    private int[][] array;
    public void getArray(int size) {
        Scanner scanner = new Scanner(System.in);
        array = new int[size][size];

        System.out.println("Enter the array values:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }
    public void displayArray() {
        System.out.println("Array elements are:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        Basic obj = new Basic();
        obj.getArray(size);
        obj.displayArray();
    }
}
