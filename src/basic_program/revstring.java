package basic_program;

public class revstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "sriganth hey how are you";
		StringBuffer result = new StringBuffer(input);
		System.out.println(result.reverse());
		
		if(input.equals(result.toString())) {
			System.out.println("palindrome");
		}
		
		else {
			System.out.println("not a palindrome");
		}
		
		
		String words [] = input.split(" ");
		String rev="";
		
		for(String w : words) {
			StringBuffer sb = new StringBuffer(w);
			sb.reverse();
			rev = rev+sb.toString()+" ";
			
			
		}
		System.out.println(rev.trim());

	}

}
