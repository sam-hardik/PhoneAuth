public class ArrayOperations
{
	public static void main(String args[])
	{
		int[] array={1,3,5,7,9,2,4,6,8};
		Operations operations=new Operations();
		operations.traverseArray(array);
	}
	
	
}
class Operations
{
	void traverseArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Elements at Position "+i+" is "+array[i]);
		}
	}
}