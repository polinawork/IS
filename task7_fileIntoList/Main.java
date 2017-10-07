package task7_fileIntoList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		long len = file.length();
		long averagelen = 10; //avarage length set in advence
		FileReader reader = new FileReader(args[0]);
		BufferedReader bReader = new BufferedReader(reader);
		String line;
		ArrayList<String> list = new ArrayList<String>((int)(len/averagelen));
		while((line = bReader.readLine()) != null){
			list.add(line);
        }
        int numberOfLines = Integer.parseInt(args[1]);
        int randomStr;
        for(int i=0; i<numberOfLines; ++i){
        	randomStr = 0+(int)(Math.random()*(list.size()-1));
        	System.out.println(list.get(randomStr));
        }
        bReader.close();
	}
}
