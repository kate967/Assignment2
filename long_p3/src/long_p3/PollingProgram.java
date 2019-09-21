package long_p3;

import java.util.Scanner;

public class PollingProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int issue = 0;
		int numResponse = 0;
		float[][] topicAvg = new float[5][1];
		
		int[] header = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] topics = {"Halo 3", "Zelda ", "Diablo", "Madden", "Skyrim"};
		int[][] responses = new int[5][10];
		int rateAgain = 1, i = 0, j = 0;
		
		//printing blank table
		for(i = 0; i < 10; i++)
		{
			if(i == 0)
			{
				System.out.print("         |");
			}
			
			System.out.print(" " + header[i] + " |");
			
			if(i == 9)
			{
				System.out.print(" Averages |");
				System.out.println();
			}
		}
		
		for(i = 0; i < 5; i++)
		{
			System.out.println("+--------+");
			System.out.print("| " + topics[i] + " |");
			
			for(j = 0; j < 10; j++)
			{
				System.out.print(" " + responses[i][j] + " |");
				
				if(j == 9)
				{
					System.out.printf("     0");
					System.out.println();
				}
			}
			
			if(i == 4)
			{
				System.out.println("+--------+");
			}
		}
		
		while(rateAgain == 1) 
		{
			if(rateAgain == 0)
			{
				break;
			}
			else
			{
				numResponse++;
				
				System.out.println("\nRate the following games from 1 - 10\n");
				
				//count responses and update averages
				for(i = 0; i < 5; i++)
				{
					System.out.println(topics[i] + ":");
					issue = scnr.nextInt();
					
					if(issue == 1)
					{
						responses[i][0]++;
						topicAvg[i][0] += 1;
					}
					else if(issue == 2)
					{
						responses[i][1]++;
						topicAvg[i][0] += 2;
					}
					else if(issue == 3)
					{
						responses[i][2]++;
						topicAvg[i][0] += 3;
					}
					else if(issue == 4)
					{
						responses[i][3]++;
						topicAvg[i][0] += 4;
					}
					else if(issue == 5)
					{
						responses[i][4]++;
						topicAvg[i][0] += 5;
					}
					else if(issue == 6)
					{
						responses[i][5]++;
						topicAvg[i][0] += 6;
					}
					else if(issue == 7)
					{
						responses[i][6]++;
						topicAvg[i][0] += 7;
					}
					else if(issue == 8)
					{
						responses[i][7]++;
						topicAvg[i][0] += 8;
					}
					else if(issue == 9)
					{
						responses[i][8]++;
						topicAvg[i][0] += 9;
					}
					else if(issue == 10)
					{
						responses[i][9]++;
						topicAvg[i][0] += 10;
					}
					else
					{
						System.out.println("Invalid Number");
					}					
				}
				
				//printing updated table
				for(i = 0; i < 10; i++)
				{
					if(i == 0)
					{
						System.out.print("         |");
					}
					
					System.out.print(" " + header[i] + " |");
					
					if(i == 9)
					{
						System.out.print(" Averages");
						System.out.println();
					}
				}
				
				for(i = 0; i < 5; i++)
				{
					System.out.println("+--------+");
					System.out.print("| " + topics[i] + " |");
					
					for(j = 0; j < 10; j++)
					{
						System.out.print(" " + responses[i][j] + " |");
						
						if(j == 9)
						{
							System.out.printf("   %.2f", (topicAvg[i][0]/numResponse));
							System.out.println();
						}
					}
					
					if(i == 4)
					{
						System.out.println("+--------+");
					}
				}
				
				System.out.println();
				
				//highest point total
				if(topicAvg[0][0] > topicAvg [1][0] && topicAvg[0][0] > topicAvg[2][0] && topicAvg[0][0] > topicAvg[3][0] && topicAvg[0][0] > topicAvg[4][0])
				{
					System.out.println("Highest point total: " + topics[0]);
				}
				else if(topicAvg[1][0] > topicAvg [0][0] && topicAvg[1][0] > topicAvg[2][0] && topicAvg[1][0] > topicAvg[3][0] && topicAvg[1][0] > topicAvg[4][0])
				{
					System.out.println("Highest point total: " + topics[1]);
				}
				else if(topicAvg[2][0] > topicAvg [0][0] && topicAvg[2][0] > topicAvg[1][0] && topicAvg[2][0] > topicAvg[3][0] && topicAvg[2][0] > topicAvg[4][0])
				{
					System.out.println("Highest point total: " + topics[2]);
				}
				else if(topicAvg[3][0] > topicAvg [0][0] && topicAvg[3][0] > topicAvg[1][0] && topicAvg[3][0] > topicAvg[2][0] && topicAvg[3][0] > topicAvg[4][0])
				{
					System.out.println("Highest point total: " + topics[3]);
				}
				else if(topicAvg[4][0] > topicAvg [0][0] && topicAvg[4][0] > topicAvg[1][0] && topicAvg[4][0] > topicAvg[2][0] && topicAvg[4][0] > topicAvg[3][0])
				{
					System.out.println("Highest point total: " + topics[3]);
				}
				else
				{
					System.out.println("Highest point total: There's a tie! Keep voting!");
				}
				
				System.out.println();
				
				//lowest point total
				if(topicAvg[0][0] < topicAvg [1][0] && topicAvg[0][0] < topicAvg[2][0] && topicAvg[0][0] < topicAvg[3][0] && topicAvg[0][0] < topicAvg[4][0])
				{
					System.out.println("Lowest point total: " + topics[0]);
				}
				else if(topicAvg[1][0] < topicAvg [0][0] && topicAvg[1][0] < topicAvg[2][0] && topicAvg[1][0] < topicAvg[3][0] && topicAvg[1][0] < topicAvg[4][0])
				{
					System.out.println("Lowest point total: " + topics[1]);
				}
				else if(topicAvg[2][0] < topicAvg [0][0] && topicAvg[2][0] < topicAvg[1][0] && topicAvg[2][0] < topicAvg[3][0] && topicAvg[2][0] < topicAvg[4][0])
				{
					System.out.println("Lowest point total: " + topics[2]);
				}
				else if(topicAvg[3][0] < topicAvg [0][0] && topicAvg[3][0] < topicAvg[1][0] && topicAvg[3][0] < topicAvg[2][0] && topicAvg[3][0] < topicAvg[4][0])
				{
					System.out.println("Lowest point total: " + topics[3]);
				}
				else if(topicAvg[4][0] < topicAvg [0][0] && topicAvg[4][0] < topicAvg[1][0] && topicAvg[4][0] < topicAvg[2][0] && topicAvg[4][0] < topicAvg[3][0])
				{
					System.out.println("Lowest point total: " + topics[3]);
				}
				else
				{
					System.out.println("Lowest point total: There's a tie! Keep voting!");
				}
				
			}
			
			//prompt for submitting another rating
			System.out.println();
			System.out.println("Would you like to submit another rating? (0 = no, 1 = yes)");
			rateAgain = scnr.nextInt();
		}

	}

}
