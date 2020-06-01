class Solution {
    public int firstUniqChar(String s) {
        
    	char []charStr = s.toCharArray();
        for( char ch : charStr )
        {
        	int firstIndex = s.indexOf(ch);
        	
        	if ( firstIndex == s.lastIndexOf(ch) )
        	{
        		return firstIndex;
        	}
        }
        
        return -1;
        
    }
}