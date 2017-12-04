package utils;

public class ArrayUtils {
	public static int[] reverse(int[] arr) {
		int len = arr.length-1;
		for(int i = 0; i <= len; i++) {
			int instance = arr[i];
			arr[len - i] = instance;
		}
		return arr;
	}

	public static String stringifyArray(int[] arr) {
		int len = arr.length-1;
		String result = "";

		for(int i = 0; i <= len; i++) {
			result = result + arr[i] + ", " ;
		}
		return result;
	}

}