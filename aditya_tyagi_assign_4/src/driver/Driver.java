package driver;

import java.io.IOException;

import util.FileProcessor;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String input = args[0];
		FileProcessor file = new FileProcessor(input);
				//path of file: 	/home/aditya/Desktop/input.txt
		int line;
		
		while((line = file.nextInt()) != -12083) { 
			
//			String splitLine[] = line.split(":");
			
		System.out.println(line);


	}
	
	
	}
}
