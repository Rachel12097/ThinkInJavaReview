public class Exception02 {
	private static Integer i = null;
	
	public static void main(String[] args) {
		//Will probably lead to NullPointerException
		//Need the use of toString
		try{
			System.out.println(i.toString());
		}catch(NullPointerException e){
			System.out.println("Caught NullPointerException");
			e.printStackTrace();
		}
		try{
			i = 10;
			System.out.println(i.toString());
		}catch(NullPointerException e){
			System.out.println("Caught NullPointerException!");//Because i =10, will not catch it
			e.printStackTrace();
		}finally{
			System.out.println("Go Through it");
		}
	}

}
