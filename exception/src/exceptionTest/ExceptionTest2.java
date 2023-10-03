package exceptionTest;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		String msg = "번째 정수 : " , temp = "";
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(++index + msg);
			temp = sc.next();
			if(temp.equals("q")) {break;}
			
			try {
				arr[index-1] = Integer.parseInt(temp);
				
			} catch (NumberFormatException e) {
				System.out.println("잘못된 값입니다.");
				index--;
				
			} catch(ArrayIndexOutOfBoundsException e) {
			// 배열의 방 개수 이상으로 값을 입력받은 경우 : ArrayIndexOutOfBoundsException
				System.out.println("5개만 입력 가능합니다.");
				for(int i=0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			} catch(Exception e ) {
				System.out.println("알수없는 오류 발생");
				break;
			}
		}
	
	}

}
