public class String2 {

	public static void main(String[] args) {
		//             01234 56789 012345
		
		String text = "Hello world Java";
		
		//extract substring "ll"
		//extract substring "world"
		//extract substring Java
		//generate error
		
        //System.out.println(text.substring(?,?));
		System.out.println(text.substring(2));//llo world java
		System.out.println(text.indexOf('a'));//13
		System.out.println(text.length()); //16
		System.out.println(text.charAt(text.length()-1)); //a
		System.out.println(text.replace('1' , 'r')); //Herro Worrd java
		
		
		System.out.println("Hashcode: " +text.hashCode());
		
		String s1 = "pro";
		String s2 = "gram";
		System.out.println(s1 + s2);
		
		StringBuffer buff = new StringBuffer();
		buff.append("This");
		buff.append("  ");
		buff.append("is");
		
		System.out.println(buff.toString());
		
		 System.out.println(text);
		 
		 
		 //for from end to begin
		 //get char
		 //concat to result
		 String reverse = "";
		 StringBuffer sb = new StringBuffer();
		 for(int i = text.length() - 1; i >= 0; i--) {
			 //reverse = reverse + text.charAt(i); //method 1
			 sb.append(text.charAt(i));//method 2
		 }
		 System.out.println(sb.toString());
		 sb = new StringBuffer(text);
		System.out.println(reverse);
	}

}