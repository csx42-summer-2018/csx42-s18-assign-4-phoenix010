package maxKVisitors.util;


import java.util.Vector;

import maxKVisitors.util1.Visitable;
import maxKVisitors.util1.Visitor;
import maxKVisitors.util2.BubbleVisitable;
import maxKVisitors.util2.BubbleVisitor;
import maxKVisitors.util3.HeapVisitable;
import maxKVisitors.util3.HeapVisitor;

public class MyVector implements Visitable, Insertion,HeapVisitable, BubbleVisitable{

	private Vector<Integer> vec;
	private int size;
	
	public MyVector() {
		this.vec = new Vector<>();
		this.size = vec.size();
	}
	public int getSize() {
		return size;
	}
	public Vector<Integer> getVec() {
		return vec;
	}
	public void insertElements(int input) {
		vec.add(Integer.valueOf(input));
//		System.out.println(vec);
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
