import static net.mindview.util.Print.*;

public class Flower {
	int petalCount = 0;
	String av = "Initial String"; //av means arg. value
	
	Flower(int petals){ //First constructor with int arg
		petalCount = petals;
		print("Constructor with int arg only, petalCount= " + petalCount);
	}
	
	Flower(String s){ //Second constructor with string arg
		print("Constructor with string arg only, av= " + s);
		av = s;
	}
	
	Flower(String s, int petals){//Third constructor with string and int arg.
		this(petals); //call constructor 'Flower(int petals)'
			//this(av); //Won't work. Constructor call must be the first statement in a constructor
		this.av = s;//Another use of "this"
		print("String and int args!");
	}
	
	Flower(){//set the string and int values
		this("Hello", 26);
		print("Default constructor with no argument!");
	}
	
	void printPetalCount(){
		//this(10);//Constructor call must be the first statement in a constructor
		//Not inside non-constructor
		print("PetalCount = "+ petalCount + "s = " + av);
	}
	
	public static void main(String[] args) {
		Flower f = new Flower();
		f.printPetalCount();
	}
}
