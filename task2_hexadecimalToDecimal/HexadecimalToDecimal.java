package task2_hexadecimalToDecimal;

public class HexadecimalToDecimal{
	public static int convert (String str){
		int res = Integer.parseInt(str, 16);
		return res;
	}
}
