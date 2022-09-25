class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length+1];
        String fin = "";
        for(int i=0;i<arr.length;i++){
            int ind = Character.getNumericValue(arr[i].charAt(arr[i].length()-1));
            res[ind] = arr[i].substring(0,arr[i].length()-1);
        }
        
        for(int i=1;i<res.length;i++){
           // System.out.println(res[i]);
        fin+=(i==res.length-1)?res[i]:res[i]+" ";
        }
        return fin;
    }
}
