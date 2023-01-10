/*
Given two non-negative integers num1 and num2 represented as strings, 
return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/
 public String multiply(String num1, String num2) {
        int n1=num1.length(), n2=num2.length();
        int products[]= new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1; j>=0;j--){
                int numb1=num1.charAt(i)-'0';
                int numb2=num2.charAt(j)-'0';
                products[i+j+1]+=numb1*numb2;
            }
        }
        int carry=0;
        for(int i=products.length-1;i>=0;i--){
           int temp=(carry+products[i])%10;
           carry=(carry+products[i])/10;
           products[i]=temp;
        }
        StringBuilder  sb= new StringBuilder();
        for(int i=0;i<products.length;i++){
            sb.append(products[i]);
        }
        while(sb.length()!=0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
       return sb.length()==0 ? "0": sb.toString();
    }