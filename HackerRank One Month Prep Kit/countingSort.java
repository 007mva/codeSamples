/*
Another sorting method, the counting sort, does not require comparison. 
Instead, you create an integer array whose index range covers the entire 
range of values in your array to sort. Each time a value occurs in the 
original array, you increment the counter at that index. At the end, run through your counting array, 
printing the value of each non-zero valued index that number of times.

*/


   public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        List<Integer> l=new ArrayList();
        for(int i=0;i<100;i++){
            l.add(0);
        }
        
       for(int a:arr){
           l.set(a, l.get(a)+1);
       }
       return l;
    }