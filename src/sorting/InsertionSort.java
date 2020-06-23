package sorting;

public class InsertionSort {

	public static void main(String args[]) {

		int[] numbers = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int shift = 0;

		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i];
			int position = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (numbers[j] > temp) {
					numbers[j + 1] = numbers[j];
					position = j;
					shift++;
				}
			}

			if (position != -1)
				numbers[position] = temp;
			/* System.out.println("Position ===>" + position + "Tempp====>" + temp); */
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("Total shift required " + shift);

	}

}
