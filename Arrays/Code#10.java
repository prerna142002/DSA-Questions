	
	static int minJumps(int[] arr){
        if(arr[0] == 0) return -1;
        int jump=1,current_end = arr[0],current_ans = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if( i== arr.length-1 && current_end >= arr.length-1) return jump;
            if(i<=current_end){
                current_ans = Math.max(current_ans,arr[i]+i);    
            }
            if(i == current_end){
                jump++;
                current_end = current_ans;
                current_ans = -1;
            }
        }
        
        return -1;
    }
