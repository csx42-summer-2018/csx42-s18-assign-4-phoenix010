package maxKVisitors.util2;

public class BubbleSort {

public int[] sortedArray(int[] arr) { // sorting of array in an increasing order.
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		arr2[i] = arr[i];
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < arr2.length - 1; i++) {
				if (arr2[i] < arr2[i + 1]) {
					temp = arr2[i];
					arr2[i] = arr2[i + 1];
					arr2[i + 1] = temp;
					flag = true;
				}
			}
		}
		return arr2;
	}

}
