package array;

public class FindPeak {

	public int findPeak(int[] a) {
		if(a.length == 1) return 0;
		int low = 0;
		int high = a.length-1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(a[mid+1] > a[mid] ) {	//右边
				low = mid + 1;
			}else if (a[mid-1] > a[mid]) {	//左边
				high = mid ;
			}else 
				return mid;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		FindPeak f = new FindPeak();
//		int[] a = {1, 2, 1, 3, 4, 5, 7,5};
		int[] a = {1,2,3,4,1};
		System.out.println(f.findPeak(a));
	}
}
