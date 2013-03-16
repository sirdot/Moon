package moon.main;

import java.util.Random;

public class Player
{
	
	public Player()
	{
		this.Spawn();
	}
	
	/*Spawn the player onto the map*/
	public void Spawn()
	{
		Random randomNumGen = new Random(); //Generates a random number.
		
		double spawnLocation = randomNumGen.nextInt((Map.Height + Map.Width) / 2); //Sets spawn limit
	}
	
}
