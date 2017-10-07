package task4_scannnerIntoStream;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
	public static void main(String[] args){
        //String type = "int";	
        //String type = "double";
        //String type = "line";
        String type = "word";
        System.out.println("Input values: ");
        Scanner scanner = new Scanner(System.in);     
        if(type=="int"){
			IntStream stream = ScannerIntoStream.intoIntStream(scanner);
			stream.forEach(System.out::println);
		}
		else if(type=="double"){
			DoubleStream stream = ScannerIntoStream.intoDoubleStream(scanner);
			stream.forEach(System.out::println);	
		}
		else if(type=="line"){
			Stream<String> stream = ScannerIntoStream.intoLinesStream(scanner);
			stream.forEach(System.out::println);
		}
		else if(type=="word"){
			Stream<String> stream = ScannerIntoStream.intoWordStream(scanner);
			stream.forEach(System.out::println);
		}
	}
}
