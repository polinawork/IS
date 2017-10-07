package task8_randomNumbers;

public class RandomNumbers {
	public static long generator(long xn){
		long a = 25214903917L;
        long c = 11L;
        long m = 281474976710656L;
        return (a * xn + c) % m;
	}

}
