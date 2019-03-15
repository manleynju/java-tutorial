import org.junit.Test;

public class ArrayIntroduction {
	/**
	 * create an array
	 */
	@Test
	public void create() {

		// declaration
		int []t;
		int[] t1;

		// definition
		int[] array1 = {1,2,3};

		// definition
		//int[] array2 = new int[] {1, 2, 3};

		int[] array2 = new int[3];
		array2[0] = 1;
		array2[1] = 2;
		array2[2] = 3;

		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);


		// definition
		int[] array3 = new int[3];

		// definition = declaration + allocate memory

	}

	/**
	 * add element to array
	 */
	@Test
	public void add() {
		int[] array = new int[10];
		array[0] = 0;
		array[0] = 1;
		array[1] = 1;
		array[9] = 10;
	}

	/**
	 * we cannot change the number of elements in an array
	 */
	@Test
	public void remove() {
		int[] array = {1, 2, 3, 4, 5, 6};
	}


	/**
	 * modify element in an array
	 */
	@Test
	public void modify() {
		int[] array = {0, 1, 2, 3, 4, 5, 6};

		array[0] = 0;
		array[1] = 10;
		array[2] = 20;
	}

	/**
	 * iterate every element in an array
	 */
	@Test
	public void iterate() {
		int[] array = {0, 1, 2, 3, 4, 5, 6};
		// way one
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// way two
		for (int element : array) {
			System.out.println(element);
		}

	}
}
