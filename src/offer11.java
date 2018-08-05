/**
 * Created by marvel-JY on 2018/8/5.
 */

/*浮点数base的整数exponent次方*/
//不能直接比较两个浮点数相等
public class offer11 {
    public static double Power(double base, int exponent) {
        double result = 0;
        if (equal(base,0)){
            return 0;
        }
        if (exponent == 0){
            return 1.0;
        }
        if (exponent > 0){
            result = cul(base, exponent);
        }else {
            result = cul(1/base, -exponent);
        }
        return result;
    }

    public static boolean equal(double a, double b){
        if (a - b < 0.000001 && a - b > -0.000001){
            return true;
        }
        return false;
    }

    public static double cul(double base, int e){
        double result = 1;
        for (int i = 0; i < e; i++){
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Power(3.1415926, 6));
    }
}
