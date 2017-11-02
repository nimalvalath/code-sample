import java.util.Scanner;
class Factors{
	public void findFactors(int num){
		System.out.println("factors of -->"+num);
		for(int i=1;i<=num;i++){

			if (num%i==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Factors f= new Factors();
		System.out.println("enter positive number other than 0");
		int num=sc.nextInt();
		f.findFactors(num);
	}
}