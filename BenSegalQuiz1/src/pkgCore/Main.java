package pkgCore;

public class Main 
{

	public static void main(String[] args)
	{
		BaseballCalcs rooth = new BaseballCalcs(204,44,16,540,177,59,145,4,0);
		
		System.out.println("BA: " + Math.round(rooth.battingAverage() * 1000)/1000.0);
		System.out.println("TB: " + rooth.totalBases());
		System.out.println("OBP: " + Math.round(rooth.onBasePercent() * 1000)/1000.0);
		System.out.println("SLG: " + Math.round(rooth.sluggingPercent() * 1000)/1000.0);
		System.out.println("OBS: " + Math.round(rooth.onBaseAndSlug() * 1000)/1000.0);
	}

}
