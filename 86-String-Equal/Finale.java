
public class Finale {
	public static void main(String[] args) {
		String a = "apples";
		String b = "Bucky";
		String c = "BUCKY";
		System.out.println(a.length());
		
		if(a.equals("apples")){
			System.out.println("it equals apples");
		}
		
		if(b.equalsIgnoreCase(c)){
			System.out.println("Bucky's Match");
		}
	}
}
