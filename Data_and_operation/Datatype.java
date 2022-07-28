public class Datatype {
	public static void main(String[] args) {
		System.out.println(6);	// Number 숫자
		System.out.println("six");	// String 문자(열)
		
		System.out.println("6");	// String 6,	문자(열) 6
		
		System.out.println(6 + 6);	// 12, 숫자끼리 더해주는 덧셈 연산자
		System.out.println("6" + "6");	// 66, 문자(열)끼리 결합시켜주는 결합 연산자
		
		System.out.println(6*6);	// 36
//		System.out.println("6" * "6");	// 문자(열)의 데이터 타입은 곱하기라는 연산을 할 수가 없어 에러가 발생한다.
		
		System.out.println("1111".length());	// 문자열의 길이를 알려주는 일종의 연산
//		System.out.println(1111.length());	// 숫자의 길이를 알려주는 연산은 없기 때문에 에러가 발생한다.
	}
}

// 프로그래밍에서는 데이터 타입이 있다. 데이터 타입을 구분하는 이유는 데이터 타입별로 그 타입에 어울리는 연산 방법이 있기 때문에 엄격하게 구분을 한다.