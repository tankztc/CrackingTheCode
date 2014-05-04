package Chapter1;

public class Q1 {

	public boolean checkUnique(String str){
	
		boolean[] checker = new boolean[256];
		int index;
		for(char c: str.toCharArray()){
			index = (int)c;
			if(checker[index])
				return false;
			checker[index] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Q1 q1 = new Q1();
		System.out.println(q1.checkUnique("qwe"));

	}

}
