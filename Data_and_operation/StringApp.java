
public class StringApp {

	public static void main(String[] args) {
		
		System.out.println("Hello World");	// String 문자열, 자바에서 큰 따옴표는 문자열을 표현한다.
		// String은 Character들이 모인 데이터 타입이다.
		System.out.println('H');	// Character 문자, 자바에서 작은 따옴표는 문자를 표현한다.
		// Character은 한 글자만 표현하는 데이터 타입이다.
		System.out.println("H");	// 한 글자지만 String 데이터가 된다.
		
		System.out.println("Hello "
				+ "World");	// 자바에서 엔터를 친다고 줄바꿈이 되는 것이 아니다.
		
		// \n은 new line이라는 뜻이고, 줄바꿈을 하라는 특수한 기호이다.
		System.out.println("Hello \nWorld");
		
		// escape
		// Hello "World" 이러한 Text를 출력하고 싶을 때
//		System.out.println("Hello "World"");	// 자바에서 큰따옴표는 문자의 시작과 끝을 알리는 기호인데, 이렇게 사용하게 되면 에러가 발생한다.
		System.out.println("Hello \"World\"");	// 문자의 시작과 끝을 알리는 기호로 사용하는게 아니라 큰따옴표를 출력하고 싶다면 큰따옴표 앞에 역슬래시를 붙이면 자바는 문자로 인식한다.
		
		// 큰 따옴표와 같이 본래의 기능이 있는 기호를 문자로써 사용하고 싶을 때에는 그 기호 앞에 역슬래시를 붙여주면 된다. 이러한 방법을 escape라고 한다.
	}

}
