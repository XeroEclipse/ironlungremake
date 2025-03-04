package iron_lung_style;
import java.util.Scanner;
public class iron_lung_style {
	public static void main(String[] args) {
		int gameState = 0;
		Scanner userInput = new Scanner(System.in);
		while(true) {
			switch(gameState){
			case 0:
				menuScreen();
				String gameChange = userInput.nextLine();
				randomizer();
				if(gameChange.equals("Start")) {
					gameState = 1;
				}
				else {
					speaker("Try again");
					gameChange = userInput.nextLine();
				}
				break;
				
			case 1:
				
				game1();
				speaker("Software Terminated");
				break;
				
			case 2:
				settings();
				speaker("Software Terminated");
				break;
			}
		}
	}

	public static void introduction(); {
		speaker("--Initializing--");
		speaker("--Downloading latest package--");
		speaker("\n");
		speaker("_     _ _______ _______" ); 
    		speaker("|     | |______ |______"  );
    		speaker("|_____| ______| |");
		
		speaker("Welcome prisoner");
		speaker("You are now aboard USF Achilles of the enigma sector");
		speaker("You should already be acquatted with your tasks during your trial but if not we shall go over");
		speaker("If you already know your duties pleas type SKIP to forward this sequence");
		speaker("As a plea for guilty and treason you have been subjicated to this space station and will be tasked with duties commanded by your superiors");
		speaker("your task is to board a HV55 model submarine to scavange resources and explore areas of interest to us");
		speaker("due to the lack of resources and the high pressure of the waters you will traverse your vessel has been slightly modified");
		speaker("The submarine does not have a window for you too vieew as the pressure of the deep water will shatter your glass");
		speaker("to accomody this we created a camera that will be able to last the high pressure but can only take a picture at a time, type CAMERA to take a picture):
		speaker("A computer system was also implemented into the vessel which will be of use to you to help you with your tasks");
		speaker("you are also given a map within the system which will show your points of interest and extraction points type map to open it in the submarine console);
		speaker("The system will also be able to identify local fauna by taking a picture of whatever is near you with the camera which will be inputted into the Beastiary");
		speaker("you can access the beastiary by typing BEASTIARY");
		speaker("Be weary of some creatures as they may be hostile but you will be able to stay clear of scare of aggresive creatures if you read about them from the beastiary");
		speaker("you're O2 meter is not permenant either");
		speaker("due to the high pressure it will deplete quickly every ten steps you make");
		speaker("You can view you're O2 meter from the ship console");
		speaker("The more areas of interest and objects you explore and extract for us the more you will earn USC credits");
		speaker("These credits will allow you to supply yourself with upgrades for your submarine though the ones who do the changes are from third party sources");
		speaker("With this we conclude");
		speaker("Goodluck prisonor your efforts are of great value to us");
		speaker("--USC--");
		speaker("--System shutting down--");
	}
	
	private static String settings() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void menuScreen() {
		speaker("\u001B[31m" + "|--------------------------------------------------------------------------------|");
		speaker("|                                                                                |");
		speaker("|                                                                                |");
		speaker("|                            IRON LUNG                                           |");
		speaker("|                              Remake                                            |");
		speaker("|                                                                                |");
		speaker("|                            Type Start                                          |");
		speaker("|                           Type Settings                                        |");
		speaker("|                                                                                |");
		speaker("|                                                                                |");
		speaker("|                                                                                |");
		speaker("|--------------------------------------------------------------------------------|");
		speaker("Response: ");
		
		
	}
	
	public static void game1() {
		Scanner userInput = new Scanner(System.in);
		int game = 0;
		int health = 100;
		int currency = 0;
		while(game == 0) {
			speaker("\u001B[31m" + "|--------------------------------------------------------------------------------|");
			speaker("|                                  Ship Console                                  |");
			speaker("|           |********************************************************|           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|           |                                                        |           |");
			speaker("|  |#####|  |                                                        |           |");
			speaker("|  |-Map-|  |                                                        |           |");
			speaker("|  |#####|  |                                                        |   02 Tank |");
			speaker("|           |                                                        |  |--------|");
			speaker("| |######|  |                                                        |  |********|");
			speaker("| |-Deck-|  |                                                        |  |********|");
			speaker("| |######|  |********************************************************|  |********|");
			speaker("|                                                                       |********|");
			speaker("| Health:" + health + " Currency: "+currency+"                                                |********|");
			speaker("|--------------------------------------------------------------------------------|");
			speaker("Response: ");
			String response = userInput.nextLine();
			if(response.equalsIgnoreCase("Map")) {
				maps();
				response = userInput.nextLine();
			}			
			
		}
	}
	
	public static void speaker(String s) {
		System.out.println(s);
	}
	
	public static void maps() {
		int playerX = 10;
		int playerY = 10;
		int WIDTH = 10;
		int HEIGHT = 6;
		   // Map with walls ('#') and open spaces ('.')
		char[][]  biome1 = {
			       {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
			       {'#', '.', '.', '.', '#', '.', '.', '.', '.', '#'},
			       {'#', '.', '#', '.', '#', '.', '#', '#', '.', '#'},
			       {'#', '.', '#', '.', '.', '.', '.', '#', '.', '#'},
			       {'#', '.', '.', '#', '#', '#', '.', '.', '.', '#'},
			       {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
			   };
	     System.out.println("\n-------- MAP ---------");
		 for (int y = 0; y < HEIGHT; y++) {
	           for (int x = 0; x < WIDTH; x++) {
	                   System.out.print(biome1[y][x]); // Display map
	               }
	           System.out.println();
	       }
	       System.out.println("---------------------\n");
	   }

	public static void randomizer() {
		long currentMillis = System.currentTimeMillis();
		int seed = (int) currentMillis;
		for(int i = 1; i < 25; i++) {
			int random1 = 2065 + i;
			seed = (int) (((seed * random1 + 300)%random1)-(seed * random1 + 300));
			speaker("Random Number:" + (int)(seed));
		}
		
	}
}
