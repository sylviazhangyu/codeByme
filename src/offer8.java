/**
 * Created by marvel-JY on 2018/8/5.
 */
/*数组旋转，找到最小值*/
import java.util.ArrayList;
public class offer8 {
    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0)
            return 0;
        int left = 0;
        int right = array.length - 1;
        int middle = -1;
        //知道找到前一个数比后一个数大或是等的情况
        while (array[left] >= array[right]) {
            //只有一个数的情况
            if(right - left==1){
                middle = right;
                break;
            }
            middle = left + (right - left) / 2;
            //如果中间的数大于左边的，那么中间之后的数中有最小的
            if (array[middle] >= array[left]) {
                left = middle;
            }
            //如果中间的数小于右边的，那么中间之前的数中有最小的
            if (array[middle] <= array[right]) {
                right = middle;
            }
        }
        return array[middle];
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));
    }
}