package iron_lung_style;
import java.util.Scanner;
public class iron_lung_style {
	public static void main(String[] args) {
		int gameState = 0;
		Scanner userInput = new Scanner(System.in);
		while(true) {
			switch(gameState){
			case 0:
				introduction();
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
			}
		}
	}
	
	public static void introduction() {
		speaker("--Initializing--",30);
		speaker("--Downloading latest package--",30);
		speaker("_     _ _______ _______" ,30); 
    		speaker("|     | |______ |______",20  );
    		speaker("|_____| ______| |",10);
		speaker("\n",10);
		
		speaker("\u001B[31m" + "Welcome prisoner",40);
		speaker("You are now aboard USF Achilles of the enigma sector",30);
		speaker("You should already be acquatted with your tasks during your trial but if not we shall go over",30);
		speaker("If you already know your duties pleas type skip to forward this sequence if you wish to continue type proceed",30);
		

		while(true) {
			String response = input.nextLine();
			if (reponse.equalsIgnoreCase("proceed")) {
		speaker("As a plea for guilty and treason you have been subjicated to this space station until your sentence is served and will be tasked with duties commanded by your superiors",30);
		speaker("your main objective is to board a HV55 model submarine to scavange resources and explore areas of interest to us",30);
		speaker("due to the lack of resources and the high pressure of the waters you will traverse your vessel has been slightly modified",30);
		speaker("The submarine does not have a window for you too vieew as the pressure of the deep water will shatter your glass",30);
		speaker("to accomody this we created a camera that will be able to last the high pressure but can only take a picture at a time, type CAMERA to take a picture",30);
		speaker("A computer system was also implemented into the vessel which will be of use to you to help you with your tasks",30);
		speaker("you are also given a map within the system which will show your points of interest and extraction points type map to open it in the submarine console",30);
		speaker("The system will also be able to identify local fauna by taking a picture of whatever is near you with the camera which will be inputted into the Beastiary",30);
		speaker("you can access the beastiary by typing BEASTIARY",30);
		speaker("Be weary of some creatures as they may be hostile but you will be able to stay clear of scare of aggresive creatures if you read about them from the beastiary",30);
		speaker("you're O2 meter is not permenant either",30);
		speaker("due to the high pressure it will deplete quickly every ten steps you make",30);
		speaker("You can view you're O2 meter from the ship console",30);
		speaker("The more areas of interest and objects you explore and extract for us the more you will earn USC credits",30);
		speaker("These credits will allow you to supply yourself with upgrades for your submarine though the ones who do the changes are from third party sources",30);
		speaker("With this we conclude",30);
		speaker("Goodluck prisoner your efforts are of great value to us",30);
		speaker("--USF--",30);
		speaker("--System shutting down--",10);
			break;
			} else if (response.equalsIgnoreCase("Skip")) {
				speaker("--USF--",10);
				speaker("--System shutting down--",10);
				return;
			} else {
				speaker("ERROR invalid command enter Skip or Proceed");
		}
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
			speaker("|                                 Front                                            |");
			speaker("|           |********************************************************|  |=========||");
			speaker("|           |                                                        |  |BEASTIARY||");
			speaker("|           |                                                        |  |_________||");
			speaker("|           |                                                        |             |");
			speaker("|           |                                                        |             |");
			speaker("|  |#####|  |                                                        |             |");
			speaker("|  |-Map-|  |                                                        |             |");
			speaker("|  |#####|  |                                                        |   02 Tank   |");
			speaker("|           |                                                        |  |--------| |");
			speaker("| |######|  |                                                        |  |********| |");
			speaker("| |-Deck-|  |                                                        |  |********| |");
			speaker("| |######|  |********************************************************|  |********| |");
			speaker("|                                                                       |********| |");
			speaker("| Health:" + health + " Currency: "+currency+"                                              |********| |");
			speaker("|--------------------------------------------------------------------------------|");
			speaker("Response: ");
			String response = userInput.nextLine();
			if(response.equalsIgnoreCase("Map")) {
				maps();
				response = userInput.nextLine();
			}			
			
		}
	}
	
	public static void maps() {
		randomizer();
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
		int random_num =0;
		for(int j =0; j < 10; j++) {
		int i = 0;
		int min_value = 0+i;
		int max_value = 100;
		int difference = max_value-min_value;
		random_num = (int)((difference*Math.random())+min_value);
		i++;
		}
		speaker(random_num + "%");
		
		}
	
	public static void speaker(String s) {
		System.out.println(s);
	}
	
}
