package task2_hexadecimalToDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(HexadecimalToDecimal.convert(str));
        
	}
}
