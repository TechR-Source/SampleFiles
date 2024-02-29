package stringPrograms;

public class StringBufferBuilder {
	
	public static void main(String[] args) {
		
		//String, String buffer, String builder class is child of the CharSequence interface.  
		
		//String is immutable    		 
		
		//There are no straight forward option to reverse the string. We must use either string builder/buffer to reverse the string
		
		/*
		String buffer is mutable 					      	String builder is mutable
		String buffer is child class of CharSequence		String builder is child class of CharSequence
		String buffer is synchronized / Thread Safe			String builder is non synchronized / Not Thread Safe
		(Allowing the thread one by one)					(Multiple threads can access simultaneously) 
		*/
		
		
		//String: 
		
		String str = "Automation";
		System.out.println(str.concat("Testing"));
		System.out.println(str);					//String is mutable 
		
		
		//String buffer / Builder 
		

		StringBuffer strValueSB = new StringBuffer("selenium ");
		System.out.println(strValueSB.append("Automation"));
		System.out.println(strValueSB.capacity());
 
		StringBuilder strValue = new StringBuilder("Software ");
		System.out.println(strValue.append("Testing"));
		System.out.println(strValue.reverse());
		System.out.println(strValue.capacity());  //Returns the current capacity. The capacity is the number of characters that can be stored
		
		System.out.println(strValue.replace(0, 5, "data"));
		System.out.println(strValue.insert(4, "Mild"));
		
		System.out.println(strValue.subSequence(4, 6));  //Substring in Java is a commonly used method of java. lang. String class that is used to create smaller strings from the bigger one. 

	}

}
