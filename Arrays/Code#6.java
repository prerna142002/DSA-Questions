class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        // GFG SOLTUION OF INTERSECTION    
        HashSet<Integer> set1 = new HashSet<>();
        int count=0;
        
        for(int i: a){
            set1.add(i);
        }
        
        for(int i: b){
            if(!set1.contains(i)) set1.add(i);
        }
        
        return (set1.size());
        
    }
	
  // Actual solution of intersection and union.
	static void Solution(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        
        for(int i: a){
            set1.add(i);
            union.add(i);
        }
        
        for(int i: b){
            if(!set1.contains(i)) {
                set1.add(i);
                union.add(i);
            }
            else if(intersection.indexOf(i) < 0) intersection.add(i);
        }
        System.out.println("Union: "+union);
        System.out.println("Intersection: "+intersection);
        
    }
  
  
}
