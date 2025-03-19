package iron_lung_style;

import java.util.*;

public class iron_lung_style {
	// Global variables used for a seperate part of the code (excluding the array, that was fixed, issue was with player position)
	static int playerX = 1;
	static int playerY = 1;

	// static char[][] biome1 = {
	// {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
	// {'#', '.', '.', '.', '#', '.', '.', '.', '.', '#'},
	// {'#', '.', '#', '.', '#', '.', '#', '#', '.', '#'},
	// {'#', '.', '#', '.', '.', '.', '.', '#', '.', '#'},
	// {'#', '.', '.', '#', '#', '#', '.', '.', '.', '#'},
	// {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
	// };
	public static void main(String[] args) {
		int gameState = 0;
		Scanner userInput = new Scanner(System.in);
		while (true) {
			//Variables that we tried but chose not to work.
//			int playerX = 1;
//			int playerY = 1;
			//This worked
		
			char[][] biome1 = { { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
					{ '#', '.', '.', '.', '#', '.', '.', '.', '.', '#' },
					{ '#', '.', '#', '.', '#', '.', '#', '#', '.', '#' },
					{ '#', '.', '#', '.', '.', '.', '.', '#', '.', '#' },
					{ '#', '.', '.', '#', '#', '#', '.', '.', '.', '#' },
					{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' } };
			switch (gameState) {
			case 0:
				speaker("Enter 'proceed' to access data log:");
				String proceed = userInput.nextLine();
				introduction();
				gameState = 1;
				break;
			case 1:
				menuScreen();
				String gameChange = userInput.nextLine();
				if (gameChange.equalsIgnoreCase("Start")) {
					gameState = 2;
				} else {
					speaker("Try again");
				}
				break;
			case 2:
				int currency = 0;
				userInput = new Scanner(System.in);
				Front();
				String roomSelect = userInput.nextLine();
				while (true) {
					int i = 100;
					int Change = randomizer(0, i);
					if (roomSelect.equalsIgnoreCase("Front")) {
						Front();
						roomSelect = userInput.nextLine();
					} else if (roomSelect.equalsIgnoreCase("Engine")) {
						EngineRoom(currency);
						roomSelect = userInput.nextLine();
					} else if (roomSelect.equalsIgnoreCase("Map")) {
						displayMap(biome1/* , playerX, playerY */);
						System.out.print("Move (W/A/S/D or Q to quit): ");
						char move = userInput.next().toUpperCase().charAt(0);
						movePlayer(move, biome1/* , playerX, playerY */);
						if (move == 'Q') {
							Front();
							roomSelect = userInput.nextLine();
						}
					} else if (Change < 33) {
						EngineRoom_f1();
						roomSelect = userInput.nextLine();

					} else if (Change > 67) {
						battle();
						roomSelect = userInput.nextLine();
					} else if (roomSelect.equalsIgnoreCase("Exit")) {
						speaker("--System shutting down--\r\n" + "Software Terminated");
						System.exit(0);
					}

					else {
						speaker("|PLEASE TRY AGAIN|");
						roomSelect = userInput.nextLine();
					}
					i -= 5;
				}
			}
		}
	}

	public static void introduction() {
		Scanner userInput = new Scanner(System.in);
		speaker("--Initializing--");
		speaker("--Downloading latest package--");
		speaker("_     _ _______ _______");
		speaker("|     | |______ |______");
		speaker("|_____| ______| |");

		// Intro sequence where playe rcan input yes or no to continue with the tutorial
		speaker("\u001B[31m" + "Welcome prisoner");
		speaker("You are now aboard USF Achilles of the enigma sector");
		speaker("You should already be acquatted with your tasks during your trial but if not we shall go over");
		speaker("If you already know your duties pleas type skip to forward this sequence if you wish to continue type proceed");

		while (true) {
			String response = userInput.nextLine();
			if (response.equalsIgnoreCase("proceed")) {
				speaker("As a plea for guilty and treason you have been subjicated to this space station until your sentence is served and will be tasked with duties commanded by your superiors");
				speaker("your main objective is to board a HV55 model submarine to scavange resources and explore areas of interest to us");
				speaker("If you already know your duties pleas type SKIP to forward this sequence");
				speaker("As a plea for guilty and treason you have been subjicated to this space station and will be tasked with duties commanded by your superiors");
				speaker("your task is to board a HV55 model submarine to scavange resources and explore areas of interest to us");
				speaker("due to the lack of resources and the high pressure of the waters you will traverse your vessel has been slightly modified");
				speaker("The submarine does not have a window for you too vieew as the pressure of the deep water will shatter your glass");
				speaker("to accomody this we created a camera that will be able to last the high pressure but can only take a picture at a time, type CAMERA to take a picture");
				speaker("The more areas of interest and objects you explore and extract for us the more you will earn USC credits");
				speaker("These credits will allow you to supply yourself with upgrades for your submarine though the ones who do the changes are from third party sources");
				speaker("With this we conclude");
				speaker("FURTHER INSTRUCTIONS:");
				speaker("To access the various rooms, ensure to type out the rooms of interest");
				speaker("For events such as battle and fixing the submarine, \nfollow the instructions on the terminal screen in order to safe return back.");
				speaker("Failure to do so will result into death (game over)");
				speaker("Goodluck prisoner your efforts are of great value to us");
				speaker("--USF--");
				speaker("--System shutting down--");
				break;
			} else if (response.equalsIgnoreCase("Skip")) {
				speaker("FURTHER INSTRUCTIONS:");
				speaker("To access the various rooms, ensure to type out the rooms of interest");
				speaker("For events such as battle and fixing the submarine, \nfollow the instructions on the terminal screen in order to safe return back.");
				speaker("Failure to do so will result into death (game over)");
				speaker("--USF--");
				speaker("--System shutting down--");
				return;
			} else {
				speaker("ERROR invalid command enter Skip or Proceed");
			}
		}
	}

	public static void menuScreen() {
		speaker("\u001B[31m" + "|--------------------------------------------------------------------------------|");
		speaker("|                            IRON LUNG                                           |");
		speaker("|                              Remake                                            |");
		speaker("|                                                                                |");
		speaker("|                            Type Start                                          |");
		speaker("|--------------------------------------------------------------------------------|");
		speaker("Response: ");

	}

	public static void Front() {
		Scanner userInput = new Scanner(System.in);
		int currency = 0;
		speaker("\u001B[31m" + "|-------------------------------------------------------------|\r\n"
				+ "|                             [Terminal]                      |\r\n"
				+ "|           |**********************************************|  |\r\n" + "|           |Currency: "
				+ currency + " Credits                           |  |\r\n"
				+ "|           |----------------------------------------------|  |\r\n"
				+ "|           |User: Commander on line.                      |  |\r\n"
				+ "|           |@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@%%%%%%%%% |  |\r\n"
				+ "|           |@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%@@@ |  |\r\n"
				+ "|           |@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%@@@@@ |  |\r\n"
				+ "|           |@@@@@@@@@@@@%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@ |  |\r\n"
				+ "|           |@@@@@@@@@@%%%%%##%#####%%%%%###%###%%%%%%%@%% |  |\r\n"
				+ "|           |@@@@@@@%%%%%#######***********++++==+****#%%% |  |\r\n"
				+ "|           |@@@@@@%%%%#######*******++++++=========++*#%% |  |\r\n"
				+ "|           |@@@@@@%%%#######***+++++++=====--========+*%% |  |\r\n"
				+ "|           |@@@@%%%%%%%#####****++++++====++++++***+==+#% |  |\r\n"
				+ "|           |@@@%#%%@@@@@@@%%%##*********######%######*=*% |  |\r\n"
				+ "|           |@@%#%%%%%%%@@@@@%%%%##***##%%%%%%%#+====+*++# |  | \r\n"
				+ "|           |@@%#%%#######%%%@%%%%##*+*#######*++=---===+# |  |\r\n"
				+ "|           |@%%####%######%%%%%%%#*+--=+*#####*+=--==--=* |  |\r\n"
				+ "|           |#%###%%%%%@@@@##%%####*+=---=###%%%%**%#*=--+ |  |\r\n"
				+ "|           |%%#####%%%%%%#########*+=----=++****+==-----+ |  |\r\n"
				+ "|           |####*#######******####*+==-----=====--::::--= |  |\r\n"
				+ "| |------|  |####*************#####*+=-==-:::------:::::-= |  |\r\n"
				+ "| |Select|  |#####************###***+------::-----:::::--= |  |\r\n"
				+ "| |Rooms |  |######**********##*****+---:------:::::::--=+ |  |\r\n"
				+ "| |Below |  |+#######*******#***####*+===-::---::::::--=== |  |\r\n"
				+ "| |------|  | +##%%####*****###%%%%%##*###%#+=--::::--===+-|  |\r\n"
				+ "|           |**#%%%%%#####**#######*=+*+==+==---::---===++=|  |\r\n"
				+ "| |#####|   |###%%%%%#############+=**+======-------==++** |  |\r\n"
				+ "| |-Map-|   |%%%%%%%%#############****++=======---====++** |  |\r\n"
				+ "| |#####|   |%%%%%%%%%#######%%%%%%%#######*+=========+*** |  |\r\n"
				+ "|           |%%%%%%%%%%%%%%%%%%%%##*##**+++*#*+=====+++*** |  |\r\n"
				+ "| |######|  |%%%%%%%%%%%%%%%%%%%#**+**+++++++++++==+++**** |  |\r\n"
				+ "| |Engine|  |%%%%%%%%%%%%%%%%%%%%%%######***++++++++****** |  |\r\n"
				+ "| |######|  |**********************************************|  |\r\n"
				+ "|-------------------------------------------------------------|\r\n"
				+ "|  {Tasks}  |Explore the ocean through 'Map'.              |  |\r\n"
				+ "|           |Check to make sure Engine is working fine.    |  |\r\n"
				+ "|-------------------------------------------------------------|");
		speaker("Response: ");

	}

	public static void EngineRoom(int currency) {
		Scanner userInput = new Scanner(System.in);
		speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
		speaker("|                           	    [Engine]                            |");
		speaker("|           |********************************************************|  |");
		speaker("|           |Everything is fixed, nothing is wrong right now.        |  |");
		speaker("|           |Await for further and new issues                        |  |");
		speaker("|           |                                                        |  |");
		speaker("|           |                                                        |  |");
		speaker("| |#######| |                                                        |  |");
		speaker("| |-Front-| |                                                        |  |");
		speaker("| |#######| |                                                        |  |");
		speaker("|           |                                                        |  |");
		speaker("| |#######| |                                                        |  |");
		speaker("| |--Map--| | Currency:" + currency + "                                             |  |");
		speaker("| |#######| |********************************************************|  |");
		speaker("|-----------------------------------------------------------------------|");
		speaker("Response: ");

	}

	public static int EngineRoom_f1() {
		Scanner userInput = new Scanner(System.in);
		int chances = 3;
		int currency = 0;
		speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
		speaker("|                             		[Engine]                             |");
		speaker("|           |********************************************************|  |");
		speaker("|           | - Engine failure                                       |  |");
		speaker("|           | - Please input the the word Fix for fixing the engine. |  |");
		speaker("|           | - You have " + chances + " chances. Failure to type will result to   |  |");
		speaker("|           |   ships navigation and communication failure and       |  |");
		speaker("| |#######| |   result of shields coming down.                       |  |");
		speaker("| |-Front-| | - Effects of engine down: Drowning or consumed by      |  |");
		speaker("| |#######| |   creatures.                                           |  |");
		speaker("|           |                                                        |  |");
		speaker("| |#######| |                                                        |  |");
		speaker("| |--Map--| |                                                        |  |");
		speaker("| |#######| |********************************************************|  |");
		speaker("|-----------------------------------------------------------------------|");
		speaker("Response: ");
		String response = userInput.nextLine();
		boolean repeat = true;
		while (repeat != false) {
			if (response.equalsIgnoreCase("Fix")) {
				speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
				speaker("|                             		[Engine]                             |");
				speaker("|           |********************************************************|  |");
				speaker("|           | - Congrats!!                                           |  |");
				speaker("|           | - Engine has been restored, system will now clear tasks|  |");
				speaker("|           |                                                        |  |");
				speaker("|           |                                                        |  |");
				speaker("| |#######| |                                                        |  |");
				speaker("| |-Front-| |                                                        |  |");
				speaker("| |#######| |                                                        |  |");
				speaker("|           |                                                        |  |");
				speaker("| |#######| |                                                        |  |");
				speaker("| |--Map--| |                                                        |  |");
				speaker("| |#######| |********************************************************|  |");
				speaker("|-----------------------------------------------------------------------|");
				speaker("Response: ");
				currency += 100;
				repeat = false;

			} else {
				chances--;
				speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
				speaker("|                             		[Engine]                             |");
				speaker("|           |********************************************************|  |");
				speaker("|           | - Engine failure                                       |  |");
				speaker("|           | - Please input the the word Fix for fixing the engine. |  |");
				speaker("|           | - You have " + chances + " chances. Failure to type will result to   |  |");
				speaker("|           |   ships navigation and communication failure and       |  |");
				speaker("| |#######| |   result of shields coming down.                       |  |");
				speaker("| |-Front-| | - Effects of engine down: Drowning or consumed by      |  |");
				speaker("| |#######| |   creatures.                                           |  |");
				speaker("|           |                                                        |  |");
				speaker("| |#######| |                                                        |  |");
				speaker("| |--Map--| |                                                        |  |");
				speaker("| |#######| |********************************************************|  |");
				speaker("|-----------------------------------------------------------------------|");
				speaker("Response: ");
				response = userInput.nextLine();
				if (chances <= 1) {
					speaker("Game Over");
					System.exit(0);
				} else {
				}
			}
		}
		return currency;

	}

	public static void displayMap(char[][] biome1/* , int playerY, int playerX) */) {
		System.out.println("\n-------- MAP ---------");
		for (int y = 0; y < 6; y++) {
			for (int x = 0; x < 10; x++) {
				if (y == playerY && x == playerX) {
					System.out.print("@ "); // Player icon
				} else {
					System.out.print(biome1[y][x] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------\n");
	}

	public static void movePlayer(char direction, char[][] biome1/* , int playerX, int playerY */) {
		int newX = playerX;
		int newY = playerY;
		switch (direction) {
		case 'W':
			newY--;
			break;
		case 'A':
			newX--;
			break;
		case 'S':
			newY++;
			break;
		case 'D':
			newX++;
			break;
		case 'Q':
			speaker("Leaving map, returning to Terminal");
			break;
		default:
			System.out.println("Invalid input! Use W, A, S, D, or Q.");
			return;
		}
		// Prevent movement into walls
		if (newY >= 0 && newY < 6 && newX >= 0 && newX < 10 && biome1[newY][newX] == '.') {
			playerX = newX;
			playerY = newY;
		} else {
			System.out.println("You can't move there! It's a wall.");
		}
	}

	public static void speaker(String s) {
		System.out.println(s);
	}

	public static int randomizer(int a, int b) {
		int random_num;
		int min_value = a;
		int max_value = b;
		int difference = max_value - min_value + 1;
		random_num = (int) ((difference * Math.random()) + min_value);
		return random_num;
	}

	public static void battle() {
		int enemy_health = 100;
		int player_health = 100;
		Scanner userInput = new Scanner(System.in);
		speaker("LOCAL FAUNA DETECTED:" + "Razorfin" + "HAS APPROACHED THE VESSEL");
		while (!(enemy_health < 0 || player_health < 0)) {

			speaker("What will your action be?");

			speaker("--Attack--" + "\n--Block--");

			String player_choice = userInput.nextLine();

			if (player_choice.equalsIgnoreCase("Attack")) {

				enemy_health = enemy_health - randomizer(0, 25);

				speaker("THREAT HP:" + enemy_health);

				int enemy_move = enemy_ai();

				if (enemy_move > 6) {
					player_health = player_health - enemy_move;
					speaker("VESSEL HP:" + player_health);

				}

				else {
					player_health = player_health;
					speaker("VESSEL HP:" + player_health);

				}

			}

			else if (player_choice.equalsIgnoreCase("Block")) {
				player_health = player_health;
				speaker("VESSEL HP:" + player_health);
			}

			if (!(player_health > 0)) {
				speaker("MISSION FAILED");
				System.exit(0);
			}

			else if (!(enemy_health > 0)) {
				speaker("THREAT NEUTRALIZED");
				speaker("SYSTEM.REDIRECT.TERMINAL");
				//int currency = randomizer(0, 100);
				Front();
			}

		}

	}

	public static int enemy_ai() {
		int random_atk = randomizer(0, 13);
		if (random_atk > 6) {

			speaker("OPPOSING THREAT DAMAGE:" + random_atk);
		} else {

		}

		return random_atk;
	}

//	public static void viewBestiary() {
//		speaker("BEASTIARY");
//		if (beastiary.isEmpty()) {
//			speaker("No data available");
//		} else {
//			for (String creature : beastiary) {
//				speaker("- " + creature);
//			}
//		}
//	}

}
