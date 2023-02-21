package practise.xtg.com;

public class ArthematiOperations {

	public int add(int x, int y) {
		int z=x+y;
		System.out.println("sum is: "+ z);
		return z;
	}

	public int sub(int x, int y) {
		int z;
		if (x > y) {
			z=x-y;
			System.out.println("1st num is greater and diff is : "+ z);
			
			return z;
		} else{
			z=y-x;
			System.out.println("2nd num is greater and diff is jgjgjgj : "+ z);
			return z;
		}
			
	}

	public int multiply(int x, int y) {
		int z=x*y;
		System.out.println("product is: "+ z);
		
		return z;
	}
}
