package JavaPractice;

public class RemoveJunk {

	public static void main(String[] args) {
		
		
		String s = "@!$$!@$!@$!@$$!@$testing844?><:}}";	
		//Regular Exp - [a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);
	}

}
