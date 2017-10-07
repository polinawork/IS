package task5_findKeyword;
import java.nio.file.*;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("c:/program files/java/jdk1.8.0_112/src.unzip");
		Files.walk(path)
			.filter(p->Files.isRegularFile(p))
			.filter( p-> FindKeyword.containKw(p, "transient"))
			.filter(p->FindKeyword.containKw(p, "volatile"))
			.forEach(System.out::println);
	}
}
