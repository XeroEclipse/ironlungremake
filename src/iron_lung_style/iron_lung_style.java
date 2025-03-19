package iron_lung_style;

import java.util.*;

public class iron_lung_style {
	public static void main(String[] args) {
		int gameState = 0;
		Scanner userInput = new Scanner(System.in);
		while (true) {
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
				game();
				speaker("Software Terminated");
				return;
			}
		}
	}
	
	public static void introduction() {
		speaker("--Initializing--");
		speaker("--Downloading latest package--");
		speaker("\u001B[31m" + "_     _ _______ _______");
		speaker("|     | |______ |______");
		speaker("|_____| ______| |");
		speaker("\n");
		speaker("\u001B[31m" + "Welcome prisoner");
		speaker("You are now aboard USF Achilles of the enigma sector.");
		speaker("If you already know your duties, type 'skip'. Otherwise, type 'next'.");
		Scanner userInput = new Scanner(System.in);
		String response = userInput.nextLine();
		while (true) {
			if (response.equalsIgnoreCase("next")) {
				speaker("Explaining the game...");
				break;
			} else if (response.equalsIgnoreCase("skip")) {
				speaker("--USF-- System shutting down.");
				return;
			} /*
				 * else { speaker("ERROR: Invalid command. Enter 'Skip' or 'next'."); response =
				 * scanner.nextLine(); }
				 */
		}
	}

	public static void menuScreen() {
		speaker("\u001B[31m" + "|--------------------------------------------------------------------------------|");
		speaker("|                            IRON LUNG                                           |");
		speaker("|                              Remake                                            |");
		speaker("|                                                                                |");
		speaker("|                            Type Start                                          |");
		speaker("|                           Type Settings                                        |");
		speaker("|--------------------------------------------------------------------------------|");
		speaker("Response: ");

	}

	public static void game() {
		int currency = 0;
		Scanner userInput = new Scanner(System.in);
		Front(currency);
		String roomSelect = userInput.nextLine();
		while (true) {
			int roomChange = randomizer(0, 100);
			if (roomSelect.equalsIgnoreCase("Front")) {
				Front(currency);
				roomSelect = userInput.nextLine();
			} else if (roomSelect.equalsIgnoreCase("Engine")) {
				EngineRoom(currency);
				roomSelect = userInput.nextLine();
			} else if (roomSelect.equalsIgnoreCase("Map")) {
				System.out.print("Move (W/A/S/D or Q to quit): ");
				char move = userInput.next().toUpperCase().charAt(0);
				maps(move);
				if (move == 'Q') {
					Front(currency);
					roomSelect = userInput.nextLine();
				}
			} else if (roomChange < 33) {
				EngineRoom_f1();
				roomSelect = userInput.nextLine();
				
			} else if (roomChange > 66) {
				battle();
				roomSelect = userInput.nextLine();
			}

			else {
				speaker("|PLEASE TRY AGAIN|");
				roomSelect = userInput.nextLine();
			}
		}
	}

	public static int Front(int currency) {
		Scanner userInput = new Scanner(System.in);
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
				+ "|           |####*************#####*+=-==-:::------:::::-= |  |\r\n"
				+ "|           |#####************###***+------::-----:::::--= |  |\r\n"
				+ "|           |######**********##*****+---:------:::::::--=+ |  |\r\n"
				+ "|           |+#######*******#***####*+===-::---::::::--=== |  |\r\n"
				+ "|           | +##%%####*****###%%%%%##*###%#+=--::::--===+-|  |\r\n"
				+ "|           |**#%%%%%#####**#######*=+*+==+==---::---===++=|  |\r\n"
				+ "| |######|  |###%%%%%#############+=**+======-------==++** |  |\r\n"
				+ "| |-Maps-|  |%%%%%%%%#############****++=======---====++** |  |\r\n"
				+ "| |######|  |%%%%%%%%%#######%%%%%%%#######*+=========+*** |  |\r\n"
				+ "|           |%%%%%%%%%%%%%%%%%%%%##*##**+++*#*+=====+++*** |  |\r\n"
				+ "| |######|  |%%%%%%%%%%%%%%%%%%%#**+**+++++++++++==+++**** |  |\r\n"
				+ "| |Engine|  |%%%%%%%%%%%%%%%%%%%%%%######***++++++++****** |  |\r\n"
				+ "| |######|  |**********************************************|  |\r\n"
				+ "|-------------------------------------------------------------|\r\n"
				+ "|  {Tasks}  |Explore the ocean through 'Maps'.             |  |\r\n"
				+ "|           |Check to make sure Engine is working fine.    |  |\r\n"
				+ "|-------------------------------------------------------------|");
		speaker("Response: ");
		return currency;

	}

	public static void EngineRoom(int currency) {
		Scanner userInput = new Scanner(System.in);
		speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
		speaker("|                             [Engine]                             |");
		speaker("|           |********************************************************|  |");
		speaker("|           |                                                        |  |");
		speaker("|           |                                                        |  |");
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
		int game = 0;
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
		while(repeat = true) {
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
			if(chances < 1) {
				speaker("Game Over");
				System.exit(0);
			}
			else {
				repeat = true;
			}
		}
		}
		return currency;

	}

	public static void maps(char direction) {
		int playerX = 1;
		int playerY = 1;
		int newX = playerX;
		int newY = playerY;
		int WIDTH = 10;
		int HEIGHT = 6;
		int currency = 0;
		char[][] biome1 = { { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
				{ '#', '.', '.', '.', '#', '.', '.', '.', '.', '#' },
				{ '#', '.', '#', '.', '#', '.', '#', '#', '.', '#' },
				{ '#', '.', '#', '.', '.', '.', '.', '#', '.', '#' },
				{ '#', '.', '.', '#', '#', '#', '.', '.', '.', '#' },
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' } };
		switch (direction) {
		case 'W':
			newY -= 1;
			break;
		case 'A':
			newX -= 1;
			break;
		case 'S':
			newY += 1;
			break;
		case 'D':
			newX += 1;
			break;
		default:
			speaker("Invalid input! Use W, A, S, D, or Q.");
			return;
		}
		// Prevent movement into walls
		if (newY >= 0 && newY < HEIGHT && newX >= 0 && newX < WIDTH && biome1[newY][newX] == '.') {
			playerX = newX;
			playerY = newY;
		} else {
			speaker("You can't move there! It's a wall.");
		}

		speaker("\n-------- MAP ---------");
		for (int y = 0; y < HEIGHT; y++) {
			for (int x = 0; x < WIDTH; x++) {
				if (y == playerY && x == playerX) {
					System.out.print("@ "); // Player icon
				} else {
					System.out.print(biome1[y][x] + " ");
				}
			}
			speaker("");
		}
		speaker("---------------------\n");

	}

	public static void speaker(String s) {
		System.out.println(s);
	}

	public static int randomizer(int a, int b) {
		int random_num = 0;
		int i = 0;
		int min_value = a;
		int max_value = b;
		int difference = max_value - min_value + 1;
		random_num = (int) ((difference * Math.random()) + min_value);
		i++;
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

				if (enemy_move > 50) {
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
				int currency = randomizer(0, 100);
				Front(currency);
			}

		}

	}

	public static int enemy_ai() {
		int random_atk = randomizer(0, 100);
		if (random_atk > 50) {
			speaker("OPPOSING THREAT DAMAGE:" + random_atk);
		} else {

		}

		return random_atk;
	}
