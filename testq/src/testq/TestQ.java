package testq;

import java.util.Scanner;

public class TestQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] ch = new char[7];
		
		for(int i=0; i<ch.length; i++) {
			 ch[i] = str.charAt(i);
			 
			 if(ch[i]>=65 && ch[i]<=90) {
				 ch[i]+=32;
				 System.out.println(ch[i]);
			 } else if(ch[i]>=97 && ch[i] <=122) {
				 ch[i]-=32;
				 System.out.println(ch[i]);
			 } else {
				 i = 0;
				 str = sc.next();
				 continue;
			 }
		}
	}
}

//대문자 : 65 ~ 90
//소문자 : 97 ~ 122

