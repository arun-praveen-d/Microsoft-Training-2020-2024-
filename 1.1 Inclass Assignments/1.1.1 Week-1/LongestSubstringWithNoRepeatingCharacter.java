class Solution {
    public int lengthOfLongestSubstring(String s) {
     int r=0,l=0,max=0;
     HashSet<Character> set = new HashSet<>();
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                max = Math.max(max,set.size());
            }
            else{ // the character is already present in set, remove an element from the set
                set.remove(s.charAt(l));
                l++;
                
            }
        }
            
        
    return max;
    }
}
