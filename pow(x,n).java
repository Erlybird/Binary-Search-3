//Time Complexity = O(logN)
//space Complexity = O(1)
class Solution {
    public double myPow(double x, long n) {
        if(n==0) return 1;
        // if(n==Integer.MIN_VALUE) return 0;
        if(n<0){
            x = 1/x;
            n *= -1;
        }

//        System.out.println(x +" " + n);
        double result = 1.0;
        while(n>1){
            if(n%2!=0){
                result = result * x;
                // n=n-1;
            }
            n = n/2;
            x = x * x;

//            System.out.println(x +" " + n);
        }
        result = x*result;
        return result;
    }
}