
public class Main2 {
	public static void main(String[] args) {
		String s = null;
		try {
			String local = "지역변수";
			
			int[] arr = new int [0];
			arr[1] = 10;
			
			int div = 10 / 0;
			
			s.equals("asdf");
			
			System.out.println("여기문장은 실행 안되지롱");
			
		} catch (NullPointerException e){
//			System.out.println(local);
			
			System.out.println("널 포인트 익셉션 처리");
//			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("수 익셉션 처리");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리");
		} catch (Exception e) {
			System.out.println("모든 예외는 여기서 잡힙니다.");
		} 
		
		System.out.println("정상 종료");
	}
}
