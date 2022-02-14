import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        int col;
        int[][] array;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row of matrix: ");
        row = scanner.nextInt();
        System.out.print("Enter the col of matrix: ");
        col = scanner.nextInt();
        array = new int[row][col];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất của matrix là " + max + " tại phần tử có tọa độ là [" + indexRow + "] ["+ indexCol + "]");
    }
}
