
public class InsertionSort {

	public static void main(String args[])
	{
		int numbers[] = new int[6];
		numbers[0] = 5; //31;
		numbers[1] = 2; //41;
		numbers[2] = 4; //59;
		numbers[3] = 6; //26;
		numbers[4] = 1; //41;
		numbers[5] = 3; //58;
		
		insertionSort(numbers, numbers.length);
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}
	
	static void insertionSort(int numbers[], int array_size)
	{
	  int i, j, key;

	  for (j = 1; j < array_size; j++)
	  {
		  key = numbers[j];
          i = j - 1;
          while (i >= 0 && (numbers[i] > key))
          {
                   numbers[i+1] = numbers[i];
                   i = i - 1;
          }
          numbers[i+1] = key;
	  }
	}
}
