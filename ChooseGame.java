import java.io.*;
import java.util.*;
public class ChooseGame
{
	public static void main(String [] args) throws IOException
	{
		menu();
	}
	
	public static void menu()
	{
		boolean menu = true;
		int userChoice;
		String fileName = "";
		while(menu == true)
		{
			Scanner console = new Scanner(System.in);
			System.out.println("Where do you want to pull a game from?\n1. Steam\n2. Epic \n3. Origin\n4. Nintendo Switch\n5. Nintendo 3DS\n6. Nintendo Wii\n7. PlayStation 3\n8. PlayStation 4\n9. Exit");
			if(console.hasNextInt())
            {
				userChoice = console.nextInt();
				if(userChoice == 1)//Steam
                {
                   fileName = "Steam.txt";
				   System.out.println(gameChoice(fileName));
				   System.out.println("Enjoy game!");
				   menu = false;
                }
				
				else if(userChoice == 2)//Epic
                {
                   fileName = "Epic.txt";
				   System.out.println(gameChoice(fileName));
				   System.out.println("Enjoy game!");
				   menu = false;
                }
				else if(userChoice == 3)//Origin
                {
				   fileName = "Origin.txt";
				   System.out.println(gameChoice(fileName));
				   System.out.println("Enjoy game!");
				   menu = false;
                }
				
				else if(userChoice == 4)//Nintendo Switch
                {
                   fileName = "Switch.txt";
				   System.out.println(gameChoice(fileName));
				   System.out.println("Enjoy game!");
				   menu = false;
                }
				else if(userChoice == 5)//Nintendo 3DS
                {
				   fileName = "3DS.txt";
				   System.out.println(gameChoice(fileName));
				   System.out.println("Enjoy game!");
				   menu = false;
                }
				else if(userChoice == 6)//Nintendo Wii
                {
				   fileName = "Wii.txt";
				   System.out.println(gameChoice(fileName));
				   System.out.println("Enjoy game!");
				   menu = false;
                }
				else if(userChoice == 7)//PlayStation 3
                {
				   fileName = "PlayStation3.txt";
				   System.out.println(gameChoice(fileName));
				   System.out.println("Enjoy game!");
				   menu = false;
                }
				else if(userChoice == 8)//PlayStation 4
                {
				   fileName = "PlayStation4.txt";
				   System.out.println(gameChoice(fileName));
				   System.out.println("Enjoy game!");
				   menu = false;
                }
				else if(userChoice == 9)//Exit
                {
                   System.out.println("Goodbye");
				   menu = false;
                }
				else
                {
                    System.out.println("This is not a valid option");
                }
			}
			else
            {
                System.out.println("Please input valid number");
            }
		}
	}	

	public static String gameChoice(String fileName)
	{
		String game = null;
		try {
		File file = new File(fileName);	
		Random rand = new Random();
		int i = 0;
		for(Scanner scan = new Scanner(file); scan.hasNext();)
		{
			i++;
			String line = scan.nextLine();
			if(rand.nextInt(i) == 0)
			{
				game = line;
			}			
		}     		
		} 
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return game;
	}
}