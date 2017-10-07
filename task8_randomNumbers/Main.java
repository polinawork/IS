package task8_randomNumbers;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args){
		Stream<Long> stream = Stream.iterate(5L,xn -> RandomNumbers.generator(xn)).skip(1);
		stream.limit(50).forEach(System.out::println);
	}
}
