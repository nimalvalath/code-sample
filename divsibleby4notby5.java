import java.util.Scanner;
class Div4NotBy5{
public void findNumber(int from,int to){
	for(;from<=to;from++){
		if(from%4==0 && from%5!=0){
			System.out.println(from);
		}
	}
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Div4NotBy5 d=new Div4NotBy5();
	int from=0;
	int to=0;	
	System.out.println("from should be < to");
	System.out.println("enter from");
	from=sc.nextInt();
	System.out.println("enter to");
	to=sc.nextInt();
	d.findNumber(from,to);
	System.out.println("pgm end");
	}
}