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
			}
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
			speaker("|                                 Front                                          |");
			speaker("|           |********************************************************|           |");
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
