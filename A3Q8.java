import java.util.Scanner;
public class A3Q8{
public static void main(String[]args){
	
	Scanner elder = new Scanner(System.in);
	System.out.print("Enter the age of Rahul,Aayush & Ajay : " );
	int Rahul = elder.nextInt(),Aayush = elder.nextInt(),Ajay = elder.nextInt();
	
	
	if((Rahul>Aayush)&&(Rahul>Ajay))
	        System.out.print("Rahul is Elder" );
	else if((Aayush>Rahul)&&(Aayush>Ajay))
            System.out.print("Aayush is Elder" );
	else
            System.out.print("Rahul is Elder" );
	
}}