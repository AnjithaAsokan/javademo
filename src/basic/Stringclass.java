package basic;

public class Stringclass {
	public static void main(String[] args) {
		// TODO Auto-generated method 

		String a="Anjitha";
		String b=" Asokan";
		String c="anjitha ";
		String d="Anjitha Asokan";
		String e="         hey";
	
		
		//concate
		
		System.out.println(a.concat(b));
		
		//equals
		System.out.println(a.equals(c));
		
		//equals ignore case
		System.out.println(a.equalsIgnoreCase(c));
		
		//contains
		System.out.println(d.contains(a));
		
		//touppercase
		
		System.out.println(c.toUpperCase()); 
		
		//tolowercase
		
		System.out.println(c.toLowerCase());
		
		//startswith
		
		System.out.println(a.startsWith(a));
		
		//endswith
		
		System.out.println(a.endsWith(a));
		
		//chartat
		
		System.out.println(a.charAt(4));
		
		//length
		System.out.println(a.length());
		
		//trim
		System.out.println(e.trim());
		

	}


}
