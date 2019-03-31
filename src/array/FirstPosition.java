package array;

public class FirstPosition {

	public static int firstPosition(int[] p, int target) {
		if (p.length == 0 ) return -1;
		int low = 0;
		int high = p.length-1;
		while(low<=high) {
			int mid = low + ((high - low) >> 1);
//			System.out.println(mid);
			if(p[mid] > target) {
				high = mid - 1;
			}else if(p[mid] < target ) {
				low = mid + 1;
			}else {
				if(mid==0 || p[mid-1] != target) {
					return mid;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] p = {1,4,4,5,7,7,8,9,9,10};
		
		System.out.println(FirstPosition.firstPosition(p, 7));
		
 	}
}
