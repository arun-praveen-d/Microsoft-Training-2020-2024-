class Solution {
    public int myAtoi(String str) {
        
        int index=0, k=1, sum=0;
        String s = str;
        s = s.replaceAll("\\s", "");
        if(s.length() == 0) {
          return 0;
        }
        while(str.charAt(index) == ' ' && index < str.length()) {
          index++;
        }
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            k = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;
            if(Integer.MAX_VALUE/10 < sum || Integer.MAX_VALUE/10 == sum && Integer.MAX_VALUE %10 < digit){
                return (k==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            sum =sum*10+digit;
            index++;
        }
        
        return sum*k;
    }
}
