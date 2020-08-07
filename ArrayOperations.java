public class ArrayOperations
{
	public static void main(String args...)
	{
		int[] array={1,3,5,7,9,2,4,6,8};
	}
	
	
}
public class Operations
{
	void TraverseArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Elements at Position "+i+1+" is "+array[i]);
		}
	}
}