package task9_streamZip;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args){
		Stream<Integer> first = Stream.of(1,1,1);
		Stream<Integer> second = Stream.of(2,2,2,2);
		Stream<Integer> result=StreamZip.zip(first, second);
		result.forEach(System.out::println);
	}
}
