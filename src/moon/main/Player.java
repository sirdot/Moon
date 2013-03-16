package moon.main;

import java.util.Random;

public class Player
{
	
	private int SpawnX;
	private int SpawnY;
	private Object nation;
	
	public Player()
	{
		this.Spawn();
	}
	
	/*Spawn the player onto the map*/
	public void Spawn()
	{
		Random randomNumGen = new Random(); //Generates a random number.
		
		double spawnLocation = randomNumGen.nextInt((Map.Height + Map.Width) / 2); //Sets spawn limit
		
		SpawnX = (int) spawnLocation;
		SpawnY = (int) spawnLocation;
		
		System.out.println("X:" + SpawnX + " Y:" + SpawnY);
	}
	
	public void setNation(String Nation)
	{
		if(Nation.isEmpty())
		{
			System.out.println("The String Nation is empty!");
			System.exit(0);
		} else {
			System.out.println(Nation);
			this.nation = Nation;
		}
	}
	
}
