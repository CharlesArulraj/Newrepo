package Ecom.Newcom;

public class Sorting {
	static void max_array(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = arr[0];
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.print(max);

	}

	static void min_array(int arr[]) {
		int min = 0;
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			System.out.print("New Pull Request");
		}
		System.out.print(min);

	}

	public static void main(String args[]) {
		int array[] = { 1, 2, 4, 6, 3, 7 };
		Sorting.max_array(array);
		Sorting.min_array(array);
	}
	
}
