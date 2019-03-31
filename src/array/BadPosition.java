package array;

public class BadPosition {

	int findFirstBadVersion(int n) {
	    if (n <= 0) {
	        return -1;
	    }
	    
	    int start = 1;
	    int end = n;
	    int res = -1;
	    while (start <= end) {
	        int mid = start + ((end - start) >> 1);
	        if (SVNRepo::isBadVersion(mid)) {
	            end = mid - 1;
	            res = mid;
	        } else {
	            start = mid + 1;
	        }
	    }
	    
	    return res;
	}

}
