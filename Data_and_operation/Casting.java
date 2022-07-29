
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;	// 손실이 없기 때문에 자동으로 캐스팅을 해준다.
		double b2 = (double) 1;	// 위의 캐스팅을 명시적으로 나타내면 이와 같다.
		System.out.println(b);
		
//		int c = 1.1;	// 손실이 일어나기 때문에 캐스팅을 명시해주지 않으면 에러가 발생한다.
		double d = 1.1;
		int e = (int) 1.1;	// 손실이 일어나기 때문에 캐스팅을 하려면 명시해주어야 한다.
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);	// int형 숫자 1을 String형으로 형변환 해준다.
		System.out.println(f.getClass());	// getClass() 메소드로 f의 데이터 타입 확인
		
	}

}
