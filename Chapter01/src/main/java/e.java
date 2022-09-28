import java.util.Arrays;

/**
 * @author ZuYingFang
 * @time 2021-10-23 15:52
 */
public class e {


    public static void main(String[] args) {
        int a = 5 % (-2);
        int b = -5 % (-2);
        int c = -5 % 2;
        int[] d = new int[]{5, 8, 6, 9, 2};
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        System.out.println(a + "  " + b + "   " + c);
    }

}
