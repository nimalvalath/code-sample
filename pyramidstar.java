import java.util.Scanner;
class PyramidStar{
	public static void main(String[] args) {
		//incomplete
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of triangle: ");
		int height=sc.nextInt();
		System.out.println("    *     ");
		System.out.println("   **    ");
		System.out.println("  ***   ");
		System.out.println(" ****  ");
		System.out.println("*****");
		printPyramidStar1(height);
		System.out.println();
		System.out.println("    *     ");
		System.out.println("   * *    ");
		System.out.println("  * * *   ");
		System.out.println(" * * * *  ");
		System.out.println("* * * * *");
		printPyramidStar2(height);
		System.out.println();

	}
/*	public static void printStar(int height){
		System.out.println("print");
			int i=0;
			while(i<height){
				for(int j=1;j<=(2*height);j++){
				System.out.println(i);
				System.out.println(j);
				if(j==(height-i)){
					System.out.print("*");

				}
				else
					System.out.print(" ");
			}
			System.out.println("\n");
			i++;
			}
			*/
	public static void printPyramidStar1(int height){
		for(int i=1;i<=height;i++){
			for(int j=1;j<=height-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void printPyramidStar2(int height){
		for(int i=1;i<=height;i++){
			for(int j=1;j<=height-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	
}
