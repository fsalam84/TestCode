import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewUnitTest {

	@Test
	void  TestMethod() {
		//Declaring the string to test.
		String myString = "The cow jumped over the moon.";
		//Declaring the array for the string by spliting it
		String[] Names = myString.split(" ");
		//Declaring the longest String variable to the first index of Names
		String longest = Names[0];
		//Looping using for loop to the length of the array
		for (int i=0;i< Names.length;i++) {
			//Declaring the String name as a new string to get the index variable of Names
			 String name = Names[i];
			 	//Using if conditional statement to define the logic
			    if(name.length() > longest.length())
			        longest = name;
			    //if the string name is longer than the 1st index variable then declare longest to the current index of name variable.
			   
	}	
		//Print the longest variable.
		System.out.println(longest);
		//Print the longest variable length.
		System.out.println(longest.length());
		}
	
//

}
