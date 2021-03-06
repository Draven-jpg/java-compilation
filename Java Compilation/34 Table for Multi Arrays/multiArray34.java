/*
 * This Program prints Table using Multi-Dimensional Array;
 */
 class multiArray34 {
	 public static void main(String[] args) {
		 int[][] firstArray= {{1,2,3,4,5},{6,7,8,9,10}};
		 int[][] secondArray ={{48,47,69,54},{23},{56,34,12,65,76}};
		 
		 System.out.println("First Table of Multi-Dimensional Array");
		 display(firstArray);//displaying table using method
		
		 System.out.println("Second Table of Multi-Dimensional Array");
		 display(secondArray);//displaying table using method
 }
 
 	public static void display (int x[][]){
 		for(int rows=0;rows<x.length;rows++) {
 			for(int column=0;column<x[rows].length;column++) {
 				System.out.print(x[rows][column]+"\t");
 				
 			}
 			System.out.println();
 		}
 		
 	}
}
