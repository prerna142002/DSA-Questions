class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
		PriorityQueue<Integer> a
        = new PriorityQueue<Integer>(
            Collections.reverseOrder());
    for(int i: arr)
    {
        if(a.size() < k){
            a.add(i);
        }
        else{
            if(a.peek() > i ) {
                a.remove(a.peek());
                a.add(i);
        }
    }
    

	}
    int z = a.peek();
    return z;
    } 
}
