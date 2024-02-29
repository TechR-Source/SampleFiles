package javaPrograms;

public class UpperCaseAndLowerCaseCount {
	
	public static void main(String[] args) {
	
	String str = "AutoMAtionS Testing ";
	char ch=0;
	int upCase=0, lwrCase=0, space=0;

	for (int i=0; i<str.length(); i++) {

		ch = str.charAt(i);

		int ascValue = (int) ch;    //Type Cast to convert the chat to int

		if(ascValue>=65 && ascValue<=90)
		{	
			upCase = upCase+1;
		} else if (ascValue==32) {
			space=space+1;
		}
		else {
			lwrCase = lwrCase+1;
		}
	}
	
	System.out.println(upCase);
	System.out.println(lwrCase);
	System.out.println(space);
	
	}
}
