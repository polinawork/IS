package task6_countCharacter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[]  args) throws IOException, FileNotFoundException {
		// args[0] - fileName
		FileReader reader = new FileReader(args[0]);
		// args[1] - character
		char c = args[1].charAt(0);
        System.out.println(CountCharacter.counter(reader, c));
	}
}
