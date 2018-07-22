package maxKVisitors.util1;

import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;

public interface Visitor {

	int visit(MyVector vector);
	int visit(MyArray myArray);

}
