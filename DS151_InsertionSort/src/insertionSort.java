public class insertionSort{

public static void insertionSort (char[] a){
	
	int n = a.length;
	for(int i =1; i<a.length;i++){
		char cur = a[i];
		int j = i-1; //Left hand side char.
	
	while((j>0)&&(a[j]>cur))//move left hand char to back
		a[j+1] = a[j--];
	
	a[j+1] = cur;
	}
		
	
	
	}

}
