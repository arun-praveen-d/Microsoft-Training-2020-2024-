class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
     Queue<Integer> q = new LinkedList<Integer>();
        for(int i : students)
        {
            q.add(i);
        }
        int j=0;
        while(j<sandwiches.length && q.contains(sandwiches[j]))
        {
            if(q.peek() == sandwiches[j]){
                q.poll();
                j++;
            }
            else
            {
                q.add(q.poll());
            }
        }
        
        return q.size();
    }
}
