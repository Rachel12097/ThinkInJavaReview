class MyException extends Exception{
	public MyException(){} //Create an exception class
	public MyException(String msg){ //create a constructor with a String argument
		super(msg); //java.lang.Exception
	}				//saved for later retrieval by getMessage() method
}

public class FullConstructors {
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}

	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}
	
	public static void main(String[] args) {
		try{
			f();
		}catch(MyException e){
			e.printStackTrace(System.out);//'System.out' will print the line in this .java
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}

	}

}
