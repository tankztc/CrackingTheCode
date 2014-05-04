package Chapter1;

public class Q5 {
	
	public String compress(String str){
		if(str==null || str.length()==1) return str;
		
		StringBuilder newstr = new StringBuilder();;
		char check=str.charAt(0);
		int counter=0;
		
		for(int i=0;i<str.length();i++){
			if(check!=str.charAt(i)){
			newstr.append(check).append(counter);
			check = str.charAt(i);
			counter=0;
			}
			counter++;
		}
		newstr.append(check).append(counter);
		if(str.length()<=newstr.length()) return str;
		else return newstr.toString();
	}
	
	public static void main(String[] args){
		Q5 q5 = new Q5();
		System.out.println(q5.compress("abc"));
	}
}
