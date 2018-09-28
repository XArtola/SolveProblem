/**
 * 
 */

/**
 * @author ik013043z1
 *
 */import java.util.Scanner;
 
public class SolveProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Give a token:");
		
		if(Sc.hasNext()) {
			
			String Token = Sc.next();
			System.out.println("You typed:"+Token);
			Token = Sc.nextLine();
			
		}
		
		if(Sc.hasNextLine()) {
			
			String Line = Sc.nextLine();
			System.out.println("You typed the line:"+Line);
			
		}

	}

}
