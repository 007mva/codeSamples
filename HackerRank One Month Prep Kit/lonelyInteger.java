    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    Set<Integer> s=new HashSet();
    int sum=0, sum2=0;
    for(int i=0;i<a.size();i++){
        int x=a.get(i);
        if(s.contains(x)){
            sum=sum+(2*x);
        }
       s.add(x);
       sum2=sum2+x;
    }
        return sum2-sum;
    }