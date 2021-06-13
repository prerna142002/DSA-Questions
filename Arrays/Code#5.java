public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int write = a.length-1,read=0;
		
		
		while(read<write) {
			//System.out.println(a[write]+" "+a[read]);
			if(a[write] < 0) {
				if(a[read]>0) {
					int temp = a[write];
					a[write] = a[read];
					a[read] = temp;
					//System.out.println(a[read]+" "+a[write]);
					read++; write--;
				}
				else read++;
			}
			else write--;
			
		}
		for(int i: a) System.out.print(i+" ");

	}
