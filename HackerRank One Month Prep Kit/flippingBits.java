/*
You will be given a list of 32 bit unsigned integers. Flip all the bits (1->0 and 0->1 ) and return the result as an unsigned integer. 

*/

public static long flippingBits(long n) {
    // Write your code here
        
        return (long)(Math.pow(2,32)) + ~n;
    }
