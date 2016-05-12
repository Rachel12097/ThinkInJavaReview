public class Photograph implements Sellable{
	
	private String descript;
	private int price;
	private boolean color;

	//constructor
	public Photograph(String desc, int p, boolean c){
		descript = desc;
		price = p;
		color = c;
	}
	
	public String description(){ //Must
		return descript;
	}
	
	public int listPrice(){ //Must
		return price;
	}
	
	public int lowestPrice(){ //Must, because implement Sallable interface
		return price/2;
	}
	
	public boolean isColor(){
		return color;
	}
}
