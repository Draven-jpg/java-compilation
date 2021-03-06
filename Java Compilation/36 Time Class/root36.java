
public class root36 {
	public static void main(String[] args) {
	node36 nodeobj = new node36();
	System.out.println(nodeobj.toMilitarytime());
	System.out.println(nodeobj.toRegulartime());
	nodeobj.setTime(25,78,59);
	System.out.println(nodeobj.toMilitarytime());//military time
	System.out.println(nodeobj.toRegulartime());//regular time
}}
