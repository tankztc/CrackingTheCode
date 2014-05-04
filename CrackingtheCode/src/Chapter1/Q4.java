package Chapter1;

import java.util.Arrays;

public class Q4 {

	public String replace(String str, int length){
		int num=0;
		char[] input = str.toCharArray();
		for(int i=0;i<length;i++){
			if(input[i]==' ')
				num++;
		}
		
		int newLen = length+2*num;
		char[] output = new char[newLen];
		newLen -= 1;
		for(int i=length-1;i>=0;i--){
			if(input[i] != ' '){
				output[newLen]=input[i];
				newLen--;
			}
			else{
				output[newLen]='0';
				output[newLen-1]='2';
				output[newLen-2]='%';
				newLen -= 3;
			}
				
		}
		return Arrays.toString(output);
	}
	
	public static void main(String[] args) {
		Q4 q4 = new Q4();
		System.out.println(q4.replace("a b c", 5));

	}

}
