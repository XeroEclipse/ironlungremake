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
			speaker("|                                 Front                                          |");
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
