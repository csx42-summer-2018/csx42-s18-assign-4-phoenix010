package maxKVisitors.driver.util1;

import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;

public interface Visitor {
//	int vist(MyArray array);
	int visit(MyVector vector);
	int visit(MyArray myArray);

}
