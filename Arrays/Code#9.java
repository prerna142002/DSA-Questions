class Solution {
    int getMinDiff(int[] a, int n, int k) {
        Arrays.sort(a);
        int result = a[a.length-1] - a[0];
        int min,max;
        
        for(int i=1;i<n;i++){
            if(a[i]>=k){
                max = Math.max(a[i-1]+k,a[n-1]-k);
                min = Math.min(a[0]+k , a[i]-k);
                
                result = result>(max-min) ? max-min : result;
            }
        }
        return result;
    }
    
}
