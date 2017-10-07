package task4_scannnerIntoStream;
import java.util.Scanner;
import java.util.stream.*;

public class ScannerIntoStream {
	public static IntStream intoIntStream(Scanner scanner){
		IntStream stream =IntStream.generate(() -> scanner.nextInt());
		return stream;
	}
	public static DoubleStream intoDoubleStream(Scanner scanner){
		DoubleStream stream =DoubleStream.generate(() -> scanner.nextDouble());
		return stream;
	}
	public static  Stream<String> intoLinesStream(Scanner scanner){
		 Stream<String> stream = Stream.generate(() -> scanner.nextLine());
		return stream;
	}
	public static  Stream<String> intoWordStream(Scanner scanner){
		 Stream<String> stream = Stream.generate(() -> scanner.next());
		return stream;
	}
	
}
