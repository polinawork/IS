package task6_countCharacter;

import java.io.FileReader;
import java.io.IOException;

public class CountCharacter {
	public static int counter (FileReader reader, char c) throws IOException{
		int counter=0;
		int cur;
        while((cur=reader.read())!=-1){
        	if(cur==c){
        		counter++;
        	}
        } 
		return counter;
	}
}
