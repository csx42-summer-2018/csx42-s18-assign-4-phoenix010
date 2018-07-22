//path of file: /home/aditya/Desktop/input.txt


package maxKVisitors.driver;

import java.io.IOException;
import java.util.Arrays;

import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;
import maxKVisitors.util.Results;
import maxKVisitors.util1.PopulateVisitor;
import maxKVisitors.util2.ModifiedBubbleSortVisitor;
import maxKVisitors.util3.MaxHeapVisitor;

public class Driver {

	public static void main(String[] args) throws IOException {
		try {		
		Validation vd = new Validation();
		vd.cmdValidation(args);
		String input = args[0];
		int k = Integer.parseInt(args[1]);
		PopulateVisitor ppt = new PopulateVisitor(input);
		MyArray arr = new MyArray();
		MyArray arr1 = new MyArray();
		MyVector vec = new MyVector();
		MyVector vec1 = new MyVector();
		arr.accept(ppt);
		arr1.accept(ppt);
		vec.accept(ppt);
		vec1.accept(ppt);
		MaxHeapVisitor heap = new MaxHeapVisitor(arr.getMyArr()); 
		int[] result1 = arr.acceptHeap(heap);
		MaxHeapVisitor heap1 = new MaxHeapVisitor(vec.getVec());
		int [] result2 = vec.acceptHeap(heap1);
		ModifiedBubbleSortVisitor mb = new ModifiedBubbleSortVisitor(arr1.getMyArr());
		int[] result3 = arr1.acceptBubbleSort(mb);

		ModifiedBubbleSortVisitor mb1 = new ModifiedBubbleSortVisitor(vec1.getVec());
		int[] result4 = arr1.acceptBubbleSort(mb1);
		int size = arr.getMyArr().size();
		MaxelementsDisplay display = new MaxelementsDisplay();

		Results rs = new Results();
		
		if(k > size || k <=0) {
			rs.writeToStdout("You have inserted an invalid value of k or your input file is empty. So we can't display the max K elements");
			System.exit(0);
		}
		
		
		result1 = display.printElement(k, size, result1);
		result2 = display.printElement(k, size, result2);
		result3 = display.printElement(k, size, result3);
		result4 = display.printElement(k, size, result4);

		rs.writeToStdout("The max K elements are:");
		rs.writeToStdout(Arrays.toString(result1));
		System.out.println();
		rs.writeToStdout(Arrays.toString(result2));
		System.out.println();
		rs.writeToStdout(Arrays.toString(result3));
		System.out.println();
		rs.writeToStdout(Arrays.toString(result4));
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("You missing some inputs in your command line. Check it again");
			System.err.println("Exiting");
	}
		catch(NullPointerException e) {
		System.err.println("There is no input file. Please pass the correct input file through command line");
		System.err.println("Exiting");
		}
}
}

