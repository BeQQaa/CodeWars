package fill.array.and.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Reverser {
    public static int[] reverse(int n) {

        int[] array = IntStream
                .iterate(1, i -> i +1)
                .limit(n)
                .toArray()
                ;
        return Arrays
                .stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(integer -> integer)
                .toArray()
                ;
    }
}
