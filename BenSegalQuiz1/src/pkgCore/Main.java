package pkgCore;

public class Main 
{

	public static void main(String[] args)
	{
		BaseballCalcs rooth = new BaseballCalcs();
		
		System.out.println("BA: " + rooth.battingAverage());
		System.out.println("TB: " + rooth.totalBases());
		System.out.println("OBP: " + rooth.onBasePercent());
		System.out.println("SLG: " + rooth.sluggingPercent());
		System.out.println("OBS: " + rooth.onBaseAndSlug());
	}

}
