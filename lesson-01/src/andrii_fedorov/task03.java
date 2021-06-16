package andrii_fedorov;

import java.util.Arrays;
import java.util.OptionalInt;

public class task03 {
	
	public static void main(String[] args) {
		
		
	int[] age = {6, 8, 29, 88, 33, 23, 9, 49, 65, 22};
	OptionalInt max = Arrays.stream(age).max();
	System.out.println(max.getAsInt());
	OptionalInt min = Arrays.stream(age).min();
	System.out.println(min.getAsInt());
		
		 
			   
		  
		 
		
		
		
		
		
		
		
		
		
		
		
	}
}
