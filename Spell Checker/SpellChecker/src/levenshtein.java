
import java.util.Scanner;

public class levenshtein {
	public static int distanceBetween(String first, String second) {
		first = first.toLowerCase();
		second = second.toLowerCase();
		int[] costVal = new int[second.length() + 1];
		for(int i = 0; i < first.length(); i++) 
		{
			int count = i;
			for (int j = 0; j <= second.length(); j++)
			{
				if(i==0){
					costVal[j] = j;
				}
				else
				{
					if(j > 0)
					{
						int value = costVal[j-1];
						if(first.charAt(i-1) != second.charAt(j-1))
							value = Math.min(Math.min(value, count), costVal[j]) + 1;
						costVal[j-1] = count;
						count = value;
					}
				}
			}
			if (i > 0)
				costVal[second.length()] = count;
		}
		return costVal[second.length()-1];
	}
	
	public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first word you want to add: ");
		String number1 = reader.nextLine();
        System.out.println("Enter the second word you want to add: ");
		String number2 = reader.nextLine();
		int distance = levenshtein.distanceBetween(number1, number2);
		System.out.println("The Distance between " + number1 + " and " + number2 + " is " + distance);
		reader.close();
	
	}
	
}

