class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
		
    	int m = arr.length;

    	for( int inx = 0; inx < m; ++inx )
    	{
        	int n = arr[inx].length;
			
			// Edge case: If the input array contains only a single row with empty elements in it, we return a false.
			// Example: [[]]
        	if( n > 0 )
        	{
	    		// Optimization 1: If last element of array is less than target, move to next row.
	    		if( arr[inx][n-1] < target )
	    		{
	    			continue;
	    		}
	
	    		int key = Arrays.binarySearch(arr[inx], target);
	    		if( key >= 0 ) return true;
	    		
	    		break;
        	}
    	}
    	return false;
    }
}