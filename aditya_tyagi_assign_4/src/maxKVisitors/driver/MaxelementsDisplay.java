package maxKVisitors.driver;

public class MaxelementsDisplay {
	
	public int[] printElement(int k,int size,int[] arr) {
		int [] newArr = new int[k];
	if(k > size || k <=0) {
		System.out.println("You have inserted an invalid value of k. So we can't display the max K elements");
		return null;
	}
	else {
		for(int i= 0; i<k ; i++) {
//			System.out.println((arr[i]));
			newArr[i] = arr[i];
			
		}
		return newArr;
	}
}
}