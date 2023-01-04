/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it

*/

 public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ll= new ArrayList();
        if(rowIndex==0){
            List<Integer>l =new ArrayList();
            l.add(1);
            return l;
        }

       

    for(int i=0;i<=rowIndex;i++){
        List<Integer> l=new ArrayList<Integer>();
        for(int j=0;j<=i;j++){
            if(j==0 || j==i){
                l.add(1);
            }
            else{ l.add(ll.get(i-1).get(j)+ll.get(i-1).get(j-1));

            }
        }
        ll.add(l);
    }




            return ll.get(ll.size()-1);
    }
