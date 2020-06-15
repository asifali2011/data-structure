package sorting;

public class SelectionSort {

	public static void main(String args[]) {

		int numbers[] = { 14, 33, 27, 10, 35, 19, 25, 44 };

		for (int i = 0; i < numbers.length; i++) {
			int firstLoc = numbers[i];
			int minimunNumber = numbers[i];
			int minimumNumberIndex = 0;
			for (int j = i; j < numbers.length; j++) {
				if (minimunNumber > numbers[j]) {
					minimunNumber = numbers[j];
					minimumNumberIndex = j;

				}

			}

			int temp = numbers[i];
			numbers[i] = minimunNumber;
			numbers[minimumNumberIndex] = temp;

		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
