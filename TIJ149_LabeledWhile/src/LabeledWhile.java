import static net.mindview.util.Print.*;

public class LabeledWhile {

	public static void main(String[] args) {
		
		int i = 0;
		outer:
			while(true){
				print("Outer while loop!");
				
				while(true){
					i++;
					print("i = " + i);
					if(i == 1){
						print("Continue");
						continue;
					}
					
					if(i == 3){
						print("Continue Outter");
						continue outer;
					}
					
					if(i == 5){
						print("Break");
						break;
					}
					
					if(i == 7){
						print("Break Outer");
						break outer;
					}
				}
			}

	}

}
