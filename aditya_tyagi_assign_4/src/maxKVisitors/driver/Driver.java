//path of file: /home/aditya/Desktop/input.txt


package maxKVisitors.driver;

import java.io.IOException;

import maxKVisitors.util.FileProcessor;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;
import maxKVisitors.util.PopulateVisitor;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		String input = args[0];
		PopulateVisitor ppt = new PopulateVisitor(input);


		MyArray arr = new MyArray();
		System.out.println("Our ArrayList is: ");
		arr.accept(ppt); //populatevisitor is called
		
		MyVector vectors = new MyVector();
		System.out.println("Our Vectors are as follows");
		vectors.accept(ppt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int val = file.nextInt();
//		System.out.println(val);
		
		
//		int line;
//		while((line = file.nextInt()) != -12083) { 
//			System.out.println(line);
//		}
	
	
	}
	
	public static String getInput(String input) {
		return input;
	}
}

