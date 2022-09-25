class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;
        
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(i));
                count++;
            }
            else
            {
                set.add(s.charAt(i));
            }
        }
        
        if(!set.isEmpty())
            return count*2+1;
        else return count*2;
    }
}
