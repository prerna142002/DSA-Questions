class Solution {
    public int[][] merge(int[][] intervals) {
      ArrayList<int[] > ans = new ArrayList<>();
		Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
		if(intervals!=null || intervals.length!=0)
		{
			int start = intervals[0][0];
			int end = intervals[0][1];
			for(int i=1;i<=(intervals.length -1);i++)
			{
				if(intervals[i][0] >= start && intervals[i][0] <= end )
				{
					end  = end>intervals[i][1] ? end:intervals[i][1];
				}
				else if(intervals[i][0] > end)
				{
					ans.add(new int[] {start,end});
					start = intervals[i][0];
					end = intervals[i][1]; 
				}
				//System.out.println("start "+start+" end "+end );
			}
			ans.add(new int[] {start,end});
			//System.out.println(ans);
		}	
		return ans.toArray(new int[0][]);
		
        
        
        
    }
}
