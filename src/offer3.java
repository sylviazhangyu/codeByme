import java.util.Scanner;

/**
 * Created by marvel-JY on 2018/8/3.
 */
public class offer3 {
    public static boolean find(int[][] array, int target){
        if (array == null){
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0){
            if (array[row][col] == target){
                return true;
            }
            if (array[row][col] < target){
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int m = 3;
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[m][m];
        int target = 5;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        boolean result = find(a,target);
        System.out.println(result);
    }
}
