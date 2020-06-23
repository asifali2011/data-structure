package sorting;

public class ShellSort {

	public static void main(String args[]) {

		int array[] = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int count = 2;
		int interval = array.length / count;
		int steps = 0;

		while (interval >= 1) {
			for (int i = 0; i < array.length; i++) {
				if (i + interval <= array.length - 1) {
					if (array[i] > array[i + interval]) {
						int temp = array[i + interval];
						array[i + interval] = array[i];
						array[i] = temp;
						steps++;
					}
				}
				if (i - interval >= 0) {
					if (array[i] < array[i - interval]) {
						int temp = array[i - interval];
						array[i - interval] = array[i];
						array[i] = temp;
						steps++;
					}
				}

			}
			count *= 2;
			interval = array.length / count;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("Total steps " + steps);

	}

}
