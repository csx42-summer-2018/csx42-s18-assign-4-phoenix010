package maxKVisitors.util2;

import java.util.ArrayList;
import java.util.Vector;

import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;

public class ModifiedBubbleSortVisitor implements BubbleVisitor{
	private int[] arr;
	private int size;

	public ModifiedBubbleSortVisitor(ArrayList<Integer> myArr) {
		this.size= myArr.size();
		this.arr = new int[size];
		for(int i=0; i<  myArr.size(); i++) {
			 this.arr[i] = myArr.get(i).intValue();
		}
	}
	public ModifiedBubbleSortVisitor(Vector <Integer> vector) {
		this.size = vector.size();
		this.arr = new int[size];
		for(int i=0; i<vector.size(); i++) {
			 arr[i] = vector.get(i).intValue();
		}
	}
	public int[] getArr() {
		return arr;
	}

	public int getSize() {
		return size;
	}

	@Override
	public int[] visitBubbleSort(MyVector vector) {
		BubbleSort bs = new BubbleSort();
		int [] result = bs.sortedArray(this.arr);
//		result = reverseArray(result,0,(result.length-1));
		return result;

	}

	@Override
	public int[] visitBubbleSort(MyArray myArray) {
		BubbleSort bs = new BubbleSort();
		int [] result = bs.sortedArray(this.arr);
//		result = reverseArray(result,0,(result.length-1));
		return result;
	}

}