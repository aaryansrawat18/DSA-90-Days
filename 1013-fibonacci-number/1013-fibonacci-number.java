class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int a=0; int b=1; int fico=0;
        for(int i=2;i<=n;i++){
            fico =a+b;
            a=b;
            b=fico;
        }
        return fico;
    }
}