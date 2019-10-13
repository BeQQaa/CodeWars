package sum.array.odd.or.even;

import static java.util.Arrays.stream;

public class Solution {
    public static String oddOrEven(int[] array){
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
