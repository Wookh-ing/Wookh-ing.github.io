import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		// 파일생성 (직접 손으로)
		// persons.txt
		// 파일 정보를 한 줄씩 읽어서
		// 1. 콘솔출력
		File file = new File("d:\\WookEc\\filetest\\persons.txt");
		
		Scanner scanner = null;
		
		
		try {
			scanner = new Scanner(file);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			
		}
		int sum = 0;
		int count = 0;
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
				int index = line.indexOf(',');
				String strAge = line.substring(index + 1);
				Integer age = Integer.valueOf(strAge);
				
				System.out.println("숫자 반환 결과: " + age);
				sum += age;
				count++;
			}
			System.out.println("평균나이: " + sum / count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		// 2. 사람 평균 나이 구해서 출력
		
		// 
	}
}
