/* Given five positive integers, find the minimum and maximum 
values that can be calculated by summing exactly four of the five integers */

public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
    long sum=0;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)<min){
            min=arr.get(i);
        }
        if(arr.get(i)>max){
            max=arr.get(i);
        }
        sum+=arr.get(i);
    }
        System.out.print(sum-max+ " " );
        System.out.print(sum-min);
    }
