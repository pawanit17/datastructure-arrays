import java.util.Arrays;

// https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3349/
import java.util.Arrays;

public class GreedyTwoCityVisit 
{
	public static void main( String args[] )
	{
		int [][] costs = new int[][] { {10,20}, {30,200}, {400,50}, {30,20} };
		System.out.println( new Solution().twoCitySchedCost(costs) );
		
		costs = new int[][] { {10,20}, {300,200}, {400,1500}, {30,2200} };
		System.out.println( new Solution().twoCitySchedCost(costs) );
	}
	
}

class Solution
{
    public int twoCitySchedCost(int[][] costs)
    {
    	int costIncurred = 0;
    	int N = costs.length/2;
    	
    	// Sort the array of costs based on largest difference between the two.
    	// This gives us clear indication on where we would gain the most - Greedy!.
    	Arrays.sort( costs, (row1,row2)->{
    		return (row2[1]-row2[0]) - (row1[1]-row1[0]); 
    	});

    	for( int i = 0; i < costs.length; ++i )
    	{
    		if( i < N )
    		{
    			// Cases where opting for first city is optimal.
    			costIncurred += costs[i][0];
    		}
    		else
    		{
    			// Cases where opting for second city is optimal.
    			costIncurred += costs[i][1];
    		}
    	}
    	
    	return costIncurred;
        
    }
}