public static long flippingBits(long n) {
    // Write your code here
        
        return (long)(Math.pow(2,32)) + ~n;
    }