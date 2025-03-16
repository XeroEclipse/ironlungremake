package iron_lung_style;

import java.util.*;

public class iron_lung_style {
	public static void main(String[] args) {
		int gameState = 0;
		Scanner userInput = new Scanner(System.in);
		while (true) {
			switch (gameState) {
			case 0:
				introduction();
				menuScreen();
				String gameChange = userInput.nextLine();
				if (gameChange.equals("Start")) {
					gameState = 1;
				} else {
					speaker("Try again");
					gameChange = userInput.nextLine();
				}
				break;
			case 1:
				game();
				System.exit(0);
			}
		}
	}

	public static void introduction() {
		speaker("--Initializing--");
		speaker("--Downloading latest package--");
		speaker("\n");
		speaker("_     _ _______ _______");
		speaker("|     | |______ |______");
		speaker("|_____| ______| |");

		speaker("\u001B[31m" + "Welcome prisoner");
		speaker("You are now aboard USF Achilles of the enigma sector");
		speaker("You should already be acquatted with your tasks during your trial but if not we shall go over");
		speaker("If you already know your duties pleas type SKIP to forward this sequence");
		speaker("As a plea for guilty and treason you have been subjicated to this space station and will be tasked with duties commanded by your superiors");
		speaker("your task is to board a HV55 model submarine to scavange resources and explore areas of interest to us");
		speaker("due to the lack of resources and the high pressure of the waters you will traverse your vessel has been slightly modified");
		speaker("The submarine does not have a window for you too vieew as the pressure of the deep water will shatter your glass");
		speaker("to accomody this we created a camera that will be able to last the high pressure but can only take a picture at a time, type CAMERA to take a picture");
		speaker("A computer system was also implemented into the vessel which will be of use to you to help you with your tasks");
		speaker("you are also given a map within the system which will show your points of interest and extraction points type map to open it in the submarine console");
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

	public static void game() {
		Scanner userInput = new Scanner(System.in);
		speaker("Where would you like to spawn?" + "\nFront. \nEngine Room."
				+ "\n Personal Recommendation is to start at Front.");
		speaker("Response:");
		String roomSelect = userInput.nextLine();
		while (true) {
			if (roomSelect.equalsIgnoreCase("Front")) {
				Front();
				roomSelect = userInput.nextLine();
			} else if (roomSelect.equalsIgnoreCase("Engine Room")) {
				EngineRoom();
				roomSelect = userInput.nextLine();
			} else if (roomSelect.equalsIgnoreCase("Map")) {
				maps();
				roomSelect = userInput.nextLine();
			}
			// else if( == randomizer()+10) {
			// EngineRoom_f1();
			// roomSelect = userInput.nextLine();
			// }
			// else if( timer() == randomizer()+5) {
			// EngineRoom_f2();
			// roomSelect = userInput.nextLine();
			// }
		}
	}

	public static void Front() {
		Scanner userInput = new Scanner(System.in);
		int currency = 100;
		speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
		speaker("|                                [Front]                                |");
		speaker("|           |********************************************************|  |");
		speaker("|           |" + currency + "                                                      |  |");
		speaker("|           |                                                        |  |");
		speaker("|           |                                                        |  |");
		speaker("|           |                                                        |  |");
		speaker("| |######|  |                                                        |  |");
		speaker("| |-Maps-|  |                                                        |  |");
		speaker("| |######|  |                                                        |  |");
		speaker("|           |                                                        |  |");
		speaker("| |######|  |                                                        |  |");
		speaker("| |Engine|  |                                                        |  |");
		speaker("| |######|  |********************************************************|  |");
		speaker("|-----------------------------------------------------------------------|");
		speaker("Response: ");
	}

	public static void EngineRoom() {
		Scanner userInput = new Scanner(System.in);
		int currency = 0;
		speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
		speaker("|                             [Engine Room]                             |");
		speaker("|           |********************************************************|  |");
		speaker("|           | - Engine failure                                       |  |");
		speaker("|           | - Please input the " + " Fix " + " for engine failure  |  |");
		speaker("|           |                                                        |  |");
		speaker("|           |                                                        |  |");
		speaker("| |#######| |                                                        |  |");
		speaker("| |-Front-| |                                                        |  |");
		speaker("| |#######| |                                                        |  |");
		speaker("|           |                                                        |  |");
		speaker("| |#######| |                                                        |  |");
		speaker("| |--Map--| | Currency:" + currency + "                                                |  |");
		speaker("| |#######| |********************************************************|  |");
		speaker("|-----------------------------------------------------------------------|");
		speaker("Response: ");

	}

	public static void EngineRoom_f1() {
		Scanner userInput = new Scanner(System.in);
		int game = 0;
		int chances = 3;
		speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
		speaker("|                             [Engine Room]                             |");
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
		while (!(response.equalsIgnoreCase("Fix"))) {
			if (response.equalsIgnoreCase("Fix")) {
				speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
				speaker("|                             [Engine Room]                             |");
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
				response = userInput.nextLine();
				if (response.equalsIgnoreCase("Front")) {
					Front();
				}
			} else {
				chances -= 1;
				speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
				speaker("|                             [Engine Room]                             |");
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
			}

		}
	}

	public static void EngineRoom_f2() {
		Scanner userInput = new Scanner(System.in);
		int game = 0;
		int n = 0;
		while (game == 0) {
			speaker("\u001B[31m" + "|-----------------------------------------------------------------------|");
			speaker("|                             [Engine Room]                             |");
			speaker("|           |********************************************************|  |");
			speaker("|           | - Shields down                                         |  |");
			speaker("|           | - Please input the worldDefense to raise shields again.|  |");
			speaker("|           | - You have " + n + " chances. Failure to type will result to   |  |");
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
			if (response.equalsIgnoreCase("Map")) {
				maps();
				response = userInput.nextLine();
			}

		}
	}



	public static void viewBestiary() {
		speaker("BEASTIARY);
		if (bestiary.isEmpty()) {
			speaker("No data available");
		} else {
			for (String creature : bestiary) {
				speaker("- " + creature);
			}
	}

	// Maps
	public static void maps() {
		randomizer();
		int playerX = 1;
		int playerY = 1;
		int WIDTH = 10;
		int HEIGHT = 6;
		// Map with walls ('#') and open spaces ('.')
		char[][] biome1 = { { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
				{ '#', '.', '.', '.', '#', '.', '.', '.', '.', '#' },
				{ '#', '.', '#', '.', '#', '.', '#', '#', '.', '#' },
				{ '#', '.', '#', '.', '.', '.', '.', '#', '.', '#' },
				{ '#', '.', '.', '#', '#', '#', '.', '.', '.', '#' },
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' } };

		if (biome1[playerY][playerX] == '.') {
			biome1[playerY][playerX] = '@';
		}

		System.out.println("\n-------- MAP ---------");
		for (int y = 0; y < HEIGHT; y++) {
			for (int x = 0; x < WIDTH; x++) {
				System.out.print(biome1[y][x] + ""); // Display map
			}
			System.out.println();
		}
		System.out.println("---------------------\n");
	}

	public static int randomizer() {
		int random_num = 0;
		int i = 0;
		int min_value = 0 + i;
		int max_value = 100;
		int difference = max_value - min_value + 1;
		random_num = (int) ((difference * Math.random()) + min_value);
		i++;
		return random_num;
	}

	public static void battle() {
		int creature = 0;
		int enemy_health = 100;
		int player_health = 100;
		Scanner userInput = new Scanner(System.in);
		speaker("A" + creature + "Has appeared");
		while (!(enemy_health < 0 || player_health < 0)) {
			speaker("What would you like to do?");
			speaker("--Attack--" + "\n--Block--");
			String player_choice = userInput.nextLine();
			if (player_choice.equalsIgnoreCase("Attack")) {
				enemy_health = 100 - randomizer();
				speaker("Enemy now has" + enemy_health);
				player_health = player_health - enemy_ai(0);
				speaker("Player Health is " + player_health);
			} else if (player_choice.equalsIgnoreCase("Block")) {
				player_health = player_health;
				speaker("Player Health is " + player_health);
			}
		}

	}

	public static int enemy_ai(int a) {
		int random_atk = randomizer();
		if (random_atk >= 50) {
			speaker("Opponent has done" + random_atk);
		}
		if (random_atk < 50) {
			speaker("Opponents has blocked the attack");
		}

		return random_atk;
	}

	public static void speaker(String s) {
		System.out.println(s);
	}

}
