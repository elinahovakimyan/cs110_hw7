import animals.Puppy;
import utils.Math;
import utils.ArrayUtils;

public class Driver {
	public static void main(String[] args) {
		Puppy Joey = new Puppy("Joey");
		System.out.println(Joey.getName());
		
		Puppy Chandler = new Puppy("Chandler");
		System.out.println(Chandler.getName());
		
		Puppy Ross = new Puppy("Ross");
		System.out.println(Ross.getName());


		System.out.println(Math.factorial(3));
		System.out.println(Math.factorialLoop(4.3));

		int[] a = { 9, 20, 3, 44, 88, 300};
		System.out.println(ArrayUtils.reverse(a));

		int[] b = ArrayUtils.reverse(a);
		System.out.println(ArrayUtils.stringifyArray(b));


	}
}