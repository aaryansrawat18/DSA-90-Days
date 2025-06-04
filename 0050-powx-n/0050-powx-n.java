class Solution {
    public double myPow(double a, int b) {
        long exp = b; // convert int to long to avoid overflow

        if (exp < 0) {
            a = 1 / a;
            exp = -exp;
        }

        if (exp == 0) return 1;

        double half = myPow(a, (int)(exp / 2)); // recursive call

        if (exp % 2 == 0) {
            return half * half;
        } else {
            return half * half * a;
        }
    }
}
