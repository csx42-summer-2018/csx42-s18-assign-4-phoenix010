package maxKVisitors.util1;
import maxKVisitors.util.FileProcessor;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;

import java.io.IOException;



public class PopulateVisitor implements Visitor {
	private String input; 
	
	public PopulateVisitor(String input) {
		this.input = input;
	}
	

@Override
	public int visit(MyVector vector) {
	
	try {
		
		FileProcessor file = new FileProcessor(input);
		int line;
		while((line = file.nextInt()) != -12083) {
			vector.insertElements(line);
		}
		return -12083;

		}catch(IOException ex) {
			ex.printStackTrace();
			
		}
		return -12083;

	}

@Override
public int visit(MyArray myArray) {
	
	try {
		
		FileProcessor file = new FileProcessor(input);
		int line;
		while((line = file.nextInt()) != -12083) {
			myArray.insertElements(line);
		}
	
		}catch(IOException ex) {
			ex.printStackTrace();
			
		}
		return -1;
}

}
