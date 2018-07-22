//path of file: /home/aditya/Desktop/input.txt


package maxKVisitors.driver;

import java.io.IOException;
import java.util.Arrays;

import maxKVisitors.util.MaxHeapVisitor;
import maxKVisitors.util.ModifiedBubbleSortVisitor;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;
import maxKVisitors.util.PopulateVisitor;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		String input = args[0];
		String k = args[1];
		
		PopulateVisitor ppt = new PopulateVisitor(input);
		
		MyArray arr = new MyArray();
		MyArray arr1 = new MyArray();
		
		MyVector vec = new MyVector();
		MyVector vec1 = new MyVector();

		System.out.println("Our ArrayList is: ");
		arr.accept(ppt);
		arr1.accept(ppt);
		System.out.println(arr.getMyArr());
		System.out.println(arr1.getMyArr());
		
		System.out.println("Our Vectors are as follows");
		vec.accept(ppt);
		vec1.accept(ppt);
		System.out.println(vec.getVec());
		System.out.println(vec1.getVec());
		
		
		System.out.println("MaxHeapVisitor for ArrayList");
		MaxHeapVisitor heap = new MaxHeapVisitor(arr.getMyArr()); // for ArrayList

		int[] result = arr.acceptHeap(heap);
		System.out.println(Arrays.toString(result));
		
		System.out.println("MaxHeapVisitor for Vectors");
		MaxHeapVisitor heap1 = new MaxHeapVisitor(vec.getVec());
		int [] result2 = vec.acceptHeap(heap1);
		System.out.println(Arrays.toString(result2));
		
		System.out.println("BubbleSorting in decreasing order for ArrayList");
		ModifiedBubbleSortVisitor mb = new ModifiedBubbleSortVisitor(arr1.getMyArr());
		int[] result3 = arr1.acceptBubbleSort(mb);
		System.out.println(Arrays.toString(result3));
		
		System.out.println("BubbleSorting in decreasing order for Vectors");
		ModifiedBubbleSortVisitor mb1 = new ModifiedBubbleSortVisitor(vec1.getVec());
		int[] result4 = arr1.acceptBubbleSort(mb1);
		System.out.println(Arrays.toString(result4));
		
		
		
		
		
		
		
		

	
	
	}
	
	
}

