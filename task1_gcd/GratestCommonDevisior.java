package task1_gcd;
import static java.lang.Math.*;

public class GratestCommonDevisior {
	public static int gcd1(int x, int y){
		if(y == 0) return abs(x);
		int res = abs(x%y);
		return gcd1(y, res);
	}
	public static int gcd2(int x, int y){
		if(y == 0) return abs(x);
		int res = abs(floorMod(x, y));
		return gcd2(y, res);
	}
}
