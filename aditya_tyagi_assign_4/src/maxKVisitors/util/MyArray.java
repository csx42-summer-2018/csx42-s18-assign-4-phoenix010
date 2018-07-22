package maxKVisitors.util;

import java.util.ArrayList;

import maxKVisitors.util1.Visitable;
import maxKVisitors.util1.Visitor;
import maxKVisitors.util2.BubbleVisitable;
import maxKVisitors.util2.BubbleVisitor;
import maxKVisitors.util3.HeapVisitable;
import maxKVisitors.util3.HeapVisitor;

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
