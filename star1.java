import java.util.Scanner;
class Star1{
	public void printStar(int height){
		for(int i=1;i<=height;i++){
			for(int j=1;j<=i;j++){
				if(j==1||j==i||i ==height){
					System.out.print("*");	
				}
				else{
						System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
			
			
	}
	public static void main(String[] args) {
		Star1 s= new Star1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of triangle: ");
		int height=sc.nextInt();
		s.printStar(height);
	}
}