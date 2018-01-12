
public class SearchAlgorithms {
	public static int linSearch(int[]test, int query)
	{
		for(int i = 0; i < test.length; i++)
		{
			if(query == test[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[]test, int query)
	{
		int l = 0;
		int r = test.length-1;
		while (l <= r)
		{
			int mid = (l + r)/2;
			if (test[mid] == query)
			{
				return mid;
			}
			else if(test[mid] > query)
			{
				r = mid;
				mid = (l + r)/2;
			}
			else if(test[mid] < query)
			{
				l=mid + 2;
				mid = (l + r)/2;
			}
		}
		return -1;
}
	
	
	
	public static void main (String[]args)
{
		int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] test2 = {0, 4, 5, 6, 12, 15, 17, 23, 29};
	
		System.out.println(binSearch(test1,3));
		System.out.println(linSearch(test1,3));
	
		System.out.println(binSearch(test2,23));
		System.out.println(linSearch(test2,23));
	
		System.out.println(binSearch(test2,25));
		System.out.println(linSearch(test2,25));
	
		System.out.println(binSearch(test1,10));
		System.out.println(linSearch(test1,1));
	
		System.out.println(binSearch(test1,1));
} 
}
 