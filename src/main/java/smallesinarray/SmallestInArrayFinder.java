package smallesinarray;

import java.util.Arrays;

public class SmallestInArrayFinder {

    int findSmallestInt(int[] args){
       return Arrays.stream(args).min().getAsInt();
    }
}
