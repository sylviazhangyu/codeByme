/**
 * Created by marvel-JY on 2018/8/5.
 */

/*斐波那契数列第n项*/
public class offer9 {
    public static int fibonacci(int n){
        int result = 0;
        int one = 0;
        int two = 1;
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        for (int i = 2; i <= n; i++){
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
