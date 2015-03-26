import java.util.Scanner;

public class TennisMatch {
	private static int[] player1 = new int[5];
	private static int[] player2 = new int[5];
	static Scanner input;
	static int counterPlayer1=0,counterPlayer2=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---Tennis Match---\nEnter Player1 set score: ");
		
		for(int i=0;i<5;i++)
		{
			input = new Scanner(System.in);
			player1[i]= input.nextInt();
		}
		System.out.println("Enter Player2 set score: ");
		
		for(int i=0;i<5;i++)
		{
			input = new Scanner(System.in);
			player2[i]= input.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			if(player1[i]>player2[i])
			{
				counterPlayer1++;
			}
			else
			{
				counterPlayer2++;
			}
		}
		if(counterPlayer1>counterPlayer2)
			System.out.println("\n Congratulation Player1. You won match!!!");
		else
			System.out.println("\n Congratulation Player2. You won match!!!");
	}
}
