/**
 * Created by marvel-JY on 2018/8/5.
 */

/*输出某整数二进制表示中1的个数*/
public class offer10 {
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(88));
    }
}
