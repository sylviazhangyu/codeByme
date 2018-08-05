/**
 * Created by marvel-JY on 2018/8/5.
 */

/*打印1到最大的n位数*/
//表示不懂是个什么逻辑？？？
public class offer12 {
    public static void printToMaxOfNDigits(int n) {
        int[] array=new int[n];
        if(n <= 0)
            return;
        printArray(array, 0);
    }
    private static void printArray(int[] array,int n) {
        for(int i = 0; i < 10; i++) {
            if(n != array.length) {
                array[n] = i;
                printArray(array, n+1);
            } else {
                boolean isFirstNo0 = false;
                for(int j = 0; j < array.length; j++) {
                    if(array[j] != 0) {
                        System.out.print(array[j]);
                        if(!isFirstNo0)
                            isFirstNo0 = true;
                    } else {
                        if(isFirstNo0)
                            System.out.print(array[j]);
                    }
                }
                System.out.println();
                return ;
            }
        }
    }

    public static void main(String[] args) {
        printToMaxOfNDigits(3);
    }
}
