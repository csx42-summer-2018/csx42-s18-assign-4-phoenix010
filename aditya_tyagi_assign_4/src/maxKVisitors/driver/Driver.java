package maxKVisitors.driver;

import java.io.IOException;

import maxKVisitors.util.FileProcessor;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String input = args[0];
		FileProcessor file = new FileProcessor(input);
		//path of file: 	/home/aditya/Desktop/input.txt
		int line;
		
		
//		int val = file.nextInt();
//		System.out.println(val);
		while((line = file.nextInt()) != -12083) { 
			System.out.println(line);
		}
	
	
	}
}

