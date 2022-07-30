import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		// PrintWirter 클래스를 인스턴스화하여 p1 변수에 할당
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");	// result1.txt에 Hello 1 쓰기
		p1.close();	// 쓰기 종료
		
		// PrintWirter 클래스를 인스턴스화하여 p2 변수에 할당
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");	// result2.txt에 Hello 2 쓰기
		p2.close();	// 쓰기 종료
		
		// 일회성이 아닌 하나의 클래스를 이용해 다수의 다양한 작업이 필요할 때 그 하나의 클래스를 복제하여
		// 각각의 상황에 따라 해당 클래스들을 각각 작업할 수 있게 각각의 다른 상태를 가지는 클래스를 복제하는 것이 인스턴스이다.
		
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
		
	}

}
