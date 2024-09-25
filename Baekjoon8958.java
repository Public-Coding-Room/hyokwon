package Study;

import java.util.Scanner;

public class Baekjoon8958 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 스캐너 생성
		String arr[] = new String[in.nextInt()]; // 배열 생성
	
	for(int i=0; i< arr.length; i++){ 
		arr[i] = in.next(); // 테스트 케이스 개수 (배열의 크기) 
	}
	
	for(int i=0; i<arr.length; i++) {
		int count = 0; // 더하는 점수  
		int sum = 0; // 합계 점수
		
		for(int j=0; j<arr[i].length(); j++) {
			if(arr[i].charAt(j) == 'O') { //arr String을 char로 하나하나 쪼개서 'O' 일 경우 
				count++; //  더하는 점수  +1

			} else {
				count=0; // 그 외의 경우 점수 0으로 초기화 
		}
		sum+=count;
		}
		System.out.println(sum);
	   }
	}
}
