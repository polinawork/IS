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
		int res = floorMod(abs(x), abs(y));
		return gcd2(y, res);
	}
	public static int gcd3(int x, int y){
		if(y == 0) return abs(x);
		int res = div(x, y);
		return gcd3(y, res);
	}
	public static int div(int x, int y){
	        if (y < 0) {
	            return div(x, -y);
	        }
	        if (x < 0) {
	            int res = div(-x, y);
	            if (res != 0) {
	                res = y - res;
	            }
	            return res;
	        }
	        return x%y;
	}
}
