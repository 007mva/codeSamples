/* Given an array of integers, calculate the ratios of its elements that are positive, 
negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal. */




public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double pos=0, neg=0, zero=0;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)==0){
            zero++;
        }
        else if(arr.get(i)<0){
            neg++;
        }
        else {
            pos++;
        }
        
    }
    System.out.println(String.format("%.6f", pos/arr.size()));
     System.out.println(String.format("%.6f", neg/arr.size()));
      System.out.println(String.format("%.6f", zero/arr.size()));

    }
