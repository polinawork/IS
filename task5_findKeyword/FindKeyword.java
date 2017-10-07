package task5_findKeyword;
import java.nio.file.*;
import java.io.IOException;

public class FindKeyword {
	public static boolean containKw(Path path, String keyword) {
			boolean res;
			try {
				res = Files.lines(path).anyMatch(line -> line.contains(keyword));
			} catch (IOException e) {
				e.printStackTrace();
				res = false;
			}
			return res;

	}
}
