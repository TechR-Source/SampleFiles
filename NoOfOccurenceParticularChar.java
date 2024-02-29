package javaPrograms;

public class NoOfOccurenceParticularChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Automation Overloading"; 
		
		int c = 0;
		char ch = 'o';
		
		for(int i=0; i<str.length(); i++) {
			//String lowCase = str.toLowerCase();
			if(str.charAt(i)==ch) {
				c=c+1;	
			}
		}
		
		System.out.println(c);
		
	}

}
