package testq;

import java.util.Scanner;

public class TestQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] sarr = str.split("");
		String hap = "";
		
		for(int i=0; i<7; i++) {
			
		for(char j='a'; j<='z'; j++) {
			  if (sarr[i].equals(Character.toString(j)) ) {
				  System.out.print((char)(j -32));
			  }
		  }
		
	   for(char k='A'; k<='Z'; k++) {
			 if (sarr[i].equals(Character.toString(k)) ) {
				 System.out.print((char)(k +32));
			}
		} 
	   
	}
	}
}

//대문자 : 65 ~ 90
//소문자 : 97 ~ 122

