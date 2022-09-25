class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] files = path.split("/");
        
        for(int i=0;i<files.length;i++){
            if(!stack.isEmpty() && files[i].equals(".."))
            {
                stack.pop();
            }
            //Dont need to push '.' or '..'
            else if(!files[i].equals("") && !files[i].equals(".") &&!files[i].equals("..")){
                stack.push(files[i]);
            }
        }
           if(stack.isEmpty())
               return "/";
            String ans="";
            while(!stack.isEmpty()){
                ans="/"+stack.pop()+ans; //abc def -> def abc
                
            }
        
            
        
        return ans;
        
    }
}
