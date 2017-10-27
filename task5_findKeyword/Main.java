package task5_findKeyword;
import java.nio.file.*;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("C:/Program Files/Java/jdk1.8.0_77/src");
		Files.walk(path)
			.filter(p->Files.isRegularFile(p))
			.filter( p-> FindKeyword.containKw(p, "transient"))
			.filter(p->FindKeyword.containKw(p, "volatile"))
			.forEach(System.out::println);
	}
}
