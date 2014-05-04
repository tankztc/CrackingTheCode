package Chapter1;

public class Q3 {

	public boolean checkPermutation(String a, String b){
		
		int[] checker = new int[256];
		
		if(a.length()!=b.length())
			return false;
		
		for(char c : a.toCharArray()){
			checker[c]++;
		}
		
		for(char c : b.toCharArray()){
			checker[c]--;
		}
		
		for(int i=0;i<checker.length;i++){
			if(checker[i]!=0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		Q3 q3 = new Q3();
		System.out.println(q3.checkPermutation("asdf", "atds"));
	}
}


