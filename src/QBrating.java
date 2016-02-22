import java.util.Scanner;

public class QBrating {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of passing attempts");
		double att = input.nextInt();
		System.out.println("Enter number of yards");
		double yards = input.nextInt();
		System.out.println("Enter number of completions");
		double comp = input.nextInt();
		System.out.println("Enter number of touchdowns");
		double td = input.nextInt();
		System.out.println("Enter number of interceptions");
		double inter = input.nextInt();
		
		input.close();
		
		double a = (comp/att-.3)*5;
		double b = (yards/att-3)*.25;
		double c = (td/att)*20;
		double d = 2.375-((inter/att)*25);
	
		double passerRating = ((a+b+c+d)/6)*100;
				
		System.out.printf("The quarterback's passer rating is %.2f", passerRating);
		}
	}


