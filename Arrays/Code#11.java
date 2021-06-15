class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int j=-1;
        for(int i: nums)
        {
            j=i;
            if(set.contains(i)) break;
            set.add(i);
        }
        return j;
    }
}
