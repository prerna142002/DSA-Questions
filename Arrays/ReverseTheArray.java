public class reverseTheArray {

	public static String reverseWord(String str)
    {
        String s = "";
        // Reverse the string str
        for(int i=str.length()-1 ; i>=0; i--){
            s += str.substring(i,i+1);
            //System.out.println(s);
        }
        
        return s;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWord("Prerna"));
	}

}
