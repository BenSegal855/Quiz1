package pkgCore;

import java.util.Scanner;
public class BaseballCalcs 
{
	// Attributes
	private int hits, doubles, tripples, atBats, runs, homeRuns, walks;
	Scanner in = new Scanner(System.in);
	
	//Methods
	public BaseballCalcs() //construction
	{
		System.out.println("Input num hits");
		hits = in.nextInt();
		
		System.out.println("Input num doubles");
		doubles = in.nextInt();
		
		System.out.println("Input num tripples");
		tripples = in.nextInt();
		
		System.out.println("Input num at bats");
		atBats = in.nextInt();
		
		System.out.println("Input num runs");
		runs = in.nextInt();
		
		System.out.println("Input num home runs");
		homeRuns = in.nextInt();
		
		System.out.println("Input num walks");
		walks = in.nextInt();
	}
		
	public double battingAverage()
	{
		return (double)hits / atBats;
	}
	
	public double onBasePercent()
	{
		return (double)(hits + walks) / (atBats + walks);
	}
	
	public int totalBases()
	{
		return runs + 2*doubles + 3*tripples + 4*homeRuns;
	}
	
	public double sluggingPercent()
	{
		return (double) totalBases() / atBats;
	}
	
	public double onBaseAndSlug()
	{
		return sluggingPercent() + onBasePercent();
	}
}
