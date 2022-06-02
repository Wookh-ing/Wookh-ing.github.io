// 사용자가 입력한 영단어(latin 문자열)에서 모음 (a e i o u)이 몇개인지 출력하세요.

import java.util.Scanner;

public class AEIOU {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		int length = line.length();
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			char c = line.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println("모음 개수: " + count);
	}
}