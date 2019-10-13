package makenegative;

public class ReturnNegative {

    public int makeNegative(int x) {


        if (x < 0 | x == 0) {
            return x;
        } else return 0 - x;
    }
    //Or use -abs(x) convert x to -x and -x will be -x and 0 will remain the same
}
