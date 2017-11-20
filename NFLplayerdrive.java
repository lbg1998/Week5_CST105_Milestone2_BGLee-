/** Program: NFLPlayerDriver
* File: NFLPlayerDriver.java
* Author: Byung Gil Lee
* Date: November 19, 2017
* It is my own work.
**/
public class NFLplayerdrive {
	public static void main(String[] args) {
		 System.out.println("No arg constructor test ");
		 NFLPlayer nfl_player1 =new NFLPlayer();
		 System.out.println("Player1 ID :Actual "+nfl_player1.getId()+", Expeted : 0");
		 System.out.println("Player1 name :Actual "+nfl_player1.getName()+", Expeted : null");

		 System.out.println("\nparamter constructor test ");
		 NFLPlayer nfl_player2 =new NFLPlayer();
		 System.out.println("Player2 name :Actual "+nfl_player2.getName()+", Expeted : smith");
		 System.out.println("Player2 ID :Actual "+nfl_player2.getId()+", Expeted : 12");
		System.out.println("\nSetters and getters function testing");
		 System.out.println("Player1 ID set to 13");
		nfl_player1.setId(13);
		 System.out.println("Player1 ID :Actual "+nfl_player1.getId()+", Expeted : 13"); 
		 }
		}