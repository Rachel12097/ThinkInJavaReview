//Composition for code reuse
//toString method

public class SprinklerSystem {
	private int i;
	private float f;
	private String value1, value2;
	private WaterSource source = new WaterSource();
	public String toString(){
		return
				"value 1" + value1 + " " +
				"value 2" + value2 + " " +
				"i = " + i + " " + "f = " + f + " " +
				"source = " + source;
	}
	
class WaterSource {
	private String s;
	WaterSource(){
		System.out.println("WaterSource()");
		s = "Apple";
	}
	public String toString(){
		return s;
	}
}
	
	public static void main(String[] args) {
		SprinklerSystem obj = new SprinklerSystem();
		System.out.println(obj);

	}

}
