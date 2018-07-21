package maxKVisitors.util;

import java.util.ArrayList;

public class MyArray implements Visitable {
	
	private  ArrayList<Integer> myArr;

	public MyArray() {
		this.myArr = new ArrayList();
	}
	public void insertElements(int input) {
		myArr.add(Integer.valueOf(input));
		System.out.println(myArr);
	}
	
	
	@Override
	public int accept(Visitor visitor) {
		
		 return visitor.visit(this);
		
		
	}

}
