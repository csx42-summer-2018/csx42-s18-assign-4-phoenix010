package maxKVisitors.driver;

public class MaxelementsDisplay {
	
	public int[] printElement(int k,int size,int[] arr) {
		int [] newArr = new int[k];

		for(int i= 0; i<k ; i++) {
//			System.out.println((arr[i]));
			newArr[i] = arr[i];
			
		}
		return newArr;
	}
}
