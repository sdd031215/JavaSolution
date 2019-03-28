package array;

public class FindTargetValue {

	public int FindTargetValue(int[] a, int target) {
		if(a[a.length-1] < target || a[0]> target) return -1;
		
		int low = 0; 
		int high = a.length-1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(target > a[mid]) {
				low = mid + 1;
			}else if(target < a[mid]) {
				high = mid -1;
			}else
				return mid;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a =  {1,2,2,4,5,5,7,9};
		int target = 7;
		
		FindTargetValue f = new FindTargetValue();
		System.out.println(f.FindTargetValue(a, target));
				
	}
}
