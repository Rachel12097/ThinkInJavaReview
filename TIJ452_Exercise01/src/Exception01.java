class Exercise1 extends Exception{
	public Exercise1(String msg){
		super(msg);
		System.out.println("Exercise1(String msg)");
	}
}

public class Exception01 {
	public static void f() throws Exercise1{
		System.out.println("Throwing Exercise1 from f()");
		throw new Exercise1("From f()");
	}
	
	public static void main(String[] args) {
		try{
			f();
		}catch(Exercise1 e){
			System.err.println("Caught Excerise1");
			e.printStackTrace();
		}finally{
			System.out.println("I made it!");
		}

	}

}
