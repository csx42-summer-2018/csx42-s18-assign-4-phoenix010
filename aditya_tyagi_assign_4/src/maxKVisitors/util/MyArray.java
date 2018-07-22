package maxKVisitors.util;

import java.util.ArrayList;

public class MyArray implements Visitable, Insertion,HeapVisitable, BubbleVisitable{
	
	private  ArrayList<Integer> myArr;
	private int size;

	public MyArray() {
		this.myArr = new ArrayList<Integer>();
		this.size = myArr.size();
	}
	public int getSize() {
		return size;
	}
	public ArrayList<Integer> getMyArr() {
		return myArr;
	}
	public void insertElements(int input) {
		myArr.add(Integer.valueOf(input));
//		System.out.println(myArr);
	}
	@Override
	public int accept(Visitor visitor) {
		
		 return visitor.visit(this);
	}
	
	@Override
	public int[] acceptHeap(HeapVisitor visitor) {
		 return visitor.visitHeap(this);
	}
	@Override
	public int[] acceptBubbleSort(BubbleVisitor visitor) {
		return visitor.visitBubbleSort(this);
	}
	
	
}
