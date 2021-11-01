import java.util.Scanner;
public class A3Q14{
public static void main(String[]args){
	
	Scanner gameison =  new Scanner(System.in);
	System.out.print("Enter '0' for SCISSOR, '1' for ROCK & '2' for PAPER: " );
	
	int player1 = gameison.nextInt();
switch(player1)
{
case 0: System.out.print("You are SCISSOR.");break;
case 1: System.out.print("You are ROCK.");break;
case 2: System.out.print("You are PAPER.");break;
}

	int computer = 0 + (int)((2-0)*Math.random());
	
switch(computer)
{
case 0: System.out.print(" "+"The computer is SCISSOR.");break;
case 1: System.out.print(" "+"The computer is ROCK.");break;
case 2: System.out.print(" "+"The computer is PAPER.");break;
}

if(computer == player1)
	System.out.print(" "+"It is DRAW");
else if((computer==2 && player1==0) || (computer==1 && player1==2) ||(computer==0 && player1==1) )
    System.out.print(" "+"You WON.");
else
	System.out.print(" "+"You lose.");

}

}