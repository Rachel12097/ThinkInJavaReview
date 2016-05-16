import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
		int a[] = {4,7,9,2,6,1};
		//Random rand = new Random();
		//rand.setSeed(System.currentTimeMillis());
		
		//for(int i =0; i<=a.length; i++)
			//a[i] = rand.nextInt(10);
		
		int old[] = (int[]) a.clone(); //Important!
		System.out.println("Array Equal before sort: " + Arrays.equals(old, a));
		Arrays.sort(a);//quick sort
		
		System.out.println("Arrays Equal after sort: " + Arrays.equals(old, a));
		System.out.println("Old Array = " + Arrays.toString(old));
		System.out.println("A Array = " + Arrays.toString(a));

	}

}
