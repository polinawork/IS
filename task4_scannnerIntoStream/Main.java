package task4_scannnerIntoStream;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()){
			IntStream stream = ScannerIntoStream.intoIntStream(scanner);
			stream.forEach(System.out::println);
		}
		else if(scanner.hasNextDouble()){
			DoubleStream stream = ScannerIntoStream.intoDoubleStream(scanner);
			stream.forEach(System.out::println);	
		}
		else if(scanner.hasNextLine()){
			Stream<String> stream = ScannerIntoStream.intoLinesStream(scanner);
			stream.forEach(System.out::println);
		}
		else if(scanner.hasNext()){
			Stream<String> stream = ScannerIntoStream.intoWordStream(scanner);
			stream.forEach(System.out::println);
		}
	}
}
