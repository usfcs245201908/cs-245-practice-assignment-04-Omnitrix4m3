public class SelectionSort implements SortingAlgorithm
{
	public void sort(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
    	{
			int smallest = i;
			
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] < a[smallest])
				{
					smallest = j;
				}
			}
			
			swap(a, i, smallest);
		}
	}

	public static void swap(int[] list, int i, int j)
	{
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}