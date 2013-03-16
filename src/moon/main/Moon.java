package moon.main;

public class Moon
{
	@SuppressWarnings("unused")
	private static Moon Moon;
	@SuppressWarnings("unused")
	private static Player Player;
	@SuppressWarnings("unused")
	private static Map Map;
	
	public Moon()
	{
		Player = new Player();
		Map = new Map();
	}

	public static void main(String[] args)
	{
		Moon = new Moon();
	}

}
