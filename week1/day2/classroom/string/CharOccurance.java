package week1.day2.classroom.string;

public class CharOccurance {
	
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
	
				String str = "welcome to chennai";

				// declare and initialize a variable count to store the number of occurrences
			int c=0;
				
				// convert the string into char array
					char[] array = str.toCharArray();
				//get the length of the array
					int length=array.length;
				// traverse from 0 till the array length 
					for (int i  =0;i< length; i++) {
						System.out.println(array[i]);
						if(array[i]=='e')
						c++;
					}
					// Check the char array has the particular char in it 
				
					// if is has increment the count
						 
					System.out.println("Number of occurance"+ c);
					// print the count out of the loop
	
	}
					
	}

}
