import java.awt.List;
import java.util.ArrayList;


public class TestClass {
public static void main(String[] args) {
	
	//Call the method TestMethod()
	TestMethod();
	
	
	
}
	public static void  TestMethod() {
		String myString = "The cow jumped over the moon.";

		String[] Names = myString.split(" ");
		
		String longest = Names[0];
	
		for (int i=0;i< Names.length;i++) {
		//	System.out.println("this is the array text:" +array[i]);
			//Get the length of each text
			 String name = Names[i];
	
			    if(name.length() > longest.length())
			        longest = name;
			   
	}	
		System.out.println(longest);
		System.out.println(longest.length());
		}
	


	public static void  TestMethod2() {
		int[] arr = { 1, 2, 3, 4, 5 };

		ArrayList<Integer> list = new ArrayList<>(arr.length);

		for (int i : arr) {
			list.add(Integer.valueOf(i));
		}

		System.out.println(list);
	}
	
	
}
