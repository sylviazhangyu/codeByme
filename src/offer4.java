/**
 * Created by marvel-JY on 2018/8/3.
 */
public class offer4 {
    public static String replaceSpace(StringBuilder str){
        if (str == null){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (String.valueOf(str.charAt(i)).equals(" ")){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("We Are Happy");
        System.out.println(replaceSpace(stringBuilder));
    }
}
