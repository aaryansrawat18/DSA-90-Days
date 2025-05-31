class Solution {
    public double myPow(double a, int b) {
        long exp = b; // Use long to avoid overflow when b = Integer.MIN_VALUE

        if (exp < 0) {
            a = 1 / a;
            exp = -exp;
        }

        return fastPower(a, exp);
    }

    private double fastPower(double a, long b) {
        if (b == 0) return 1;

        double ans = fastPower(a, b / 2);

        if (b % 2 == 0)
            return ans * ans;
        else
            return ans * ans * a;
    }
}
