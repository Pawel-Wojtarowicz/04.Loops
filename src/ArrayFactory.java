import java.util.Arrays;
import java.util.Scanner;

public class ArrayFactory {

    private int x;

    public ArrayFactory() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int[] oneDimension(int x) {
        return new int[x];
    }
    public int[][] twoDimension(int x) {
        return new int[x][x];
    }
    public void matrix(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    void printArray(int[] integerArray) {
        System.out.print("[");
        for (int i = 0; i < integerArray.length; i++) {
            boolean isLast = i == integerArray.length - 1;
            if (isLast) {
                System.out.print(integerArray[i] + "]");
            }
            else {
                System.out.print(integerArray[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayFactory arrayFactory = new ArrayFactory();
        System.out.print("Podaj liczbę: ");
        arrayFactory.setX(scanner.nextInt());
        System.out.println("Tablica jednowymiarowa: " + Arrays.toString(arrayFactory.oneDimension(arrayFactory.getX())));
        System.out.println("Tablica wielowymiarowa: " + Arrays.deepToString(arrayFactory.twoDimension(arrayFactory.getX())));
        System.out.println("Macież jednostkowa:");
        arrayFactory.matrix(arrayFactory.getX());
        System.out.println("Wyświetlanie tablicy [1,2,3,4,56,57,58,98,99]: ");
        int[] integerArrays = new int[] {1,2,3,4,56,57,58,98,99};
        arrayFactory.printArray(integerArrays);
    }
}
