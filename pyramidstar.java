import java.util.Scanner;
class PyramidStar{
	public static void main(String[] args) {
		//incomplete
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of triangle: ");
		int height=sc.nextInt();
		System.out.println("    *     ");
		System.out.println("   * *    ");
		System.out.println("  * * *   ");
		System.out.println(" * * * *  ");
		System.out.println("* * * * * ");
		printStar();

	}
	public static void printStar(){
		System.out.println("print");
		for(int i=0;i<5;i++){
			
			for(int j=1;j<=10;j++){
				/*System.out.println(i);
				System.out.println(j);*/
				if(i==0 &&  j==5){
					System.out.print("*");

				}
				else
					System.out.print(" ");
			}
		}
	}
}