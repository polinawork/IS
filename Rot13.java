package Rot13;

public class Rot13 {
	public static String rot13(String str) {
		char[]cur=str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			if(cur[i]>='a'&&cur[i]<='m'){
				cur[i]+=13;
			}
			else if(cur[i]>='A'&&cur[i]<='M'){ 
				cur[i]+=13;
				}
			else if(cur[i]>='n'&&cur[i]<='z'){
				cur[i]-=13;
			}
			else if(cur[i]>='N'&&cur[i]<='Z'){
				cur[i]-=13;
			}
		}
		str=String.copyValueOf(cur); 
		return str;
	}
}
