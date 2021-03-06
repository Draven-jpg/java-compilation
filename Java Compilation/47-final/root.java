
public class root {
	public static void main (String[] args) {
		Sum sumObj = new Sum(100);
		
		for(int i=0; i<5 ;i++) {
			sumObj.add();
			System.out.println(sumObj.toString());
		}
	}
}

class Sum{
	private int sum;
	private final int number;
	//this constructor took 100
	public Sum(int x) {
		number = x ;
	}
	//constructor to add
	public void add()
	{
		sum+=number;
	}
	//constructor int to string
	public String toString() {
		return String.format("sum  = %s", sum);
	}
}
