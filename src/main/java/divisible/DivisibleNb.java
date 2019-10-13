package divisible;

class DivisibleNb {

    boolean isDivisible(long n, long x, long y){
        if (n > 0 && x > 0 && y > 0){
            return n % x == 0 && n % y == 0;
        }
        return false;
    }
}
