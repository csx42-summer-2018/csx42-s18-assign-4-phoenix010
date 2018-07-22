package maxKVisitors.util;


import java.util.Vector;

public class MyVector implements Visitable, Insertion,HeapVisitable, BubbleVisitable{

	private Vector<Integer> vec;
	
	public MyVector() {
		this.vec = new Vector<>();
		
	}
	public void insertElements(int input) {
		vec.add(Integer.valueOf(input));
//		System.out.println(vec);
	}
	
	public Vector<Integer> getVec() {
		return vec;
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
