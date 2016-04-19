package utilities.maths;

public class MathsUtility {

	public MathsUtility() {
		
	}
	
	public static int gcd(int x, int y){
		int r = 0, a, b;
		if(x > y){
			a = x;
			b = y;
		}else{
			a = y;
			b = x;
		}
		r = b;
		while(a % b != 0){
			r = a % b;
			a = b;
			b = r;
		}
		return r;
	}
	
	public static int gcdRecursive(int x, int y){
		if(y == 0)
			return x;
		return gcdRecursive(y, x % y);
	}

	public static void main(String[] args) {

	}

}
