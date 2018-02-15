package pkgCore;

import java.util.Scanner;
public class BaseballCalcs 
{
	// Attributes
	private int hits, singles, doubles, tripples, atBats, runs, homeRuns, walks, hitsByPitch, sacFlies;
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
		
		System.out.println("Input num hits by pitch");
		hitsByPitch = in.nextInt();
		
		System.out.println("Input num sacrifice flies");
		sacFlies = in.nextInt();
		
		singles = hits - doubles - tripples - homeRuns;
	}
	
	public BaseballCalcs(int numHits, int numDoubles, int numTripples, int numAtBats, int numRuns, int numHomeRuns, int numWalks, int numHitsByPitch, int numSacFlies)
	{
		hits = numHits;
		doubles = numDoubles;
		tripples = numTripples;
		atBats = numAtBats;
		runs = numRuns;
		homeRuns = numHomeRuns;
		walks = numWalks;
		hitsByPitch = numHitsByPitch;
		sacFlies = numSacFlies;
		
		singles = hits - doubles - tripples - homeRuns;
	}
	

	public double battingAverage()
	{
		return (double)hits / atBats;
	}
	
	public double onBasePercent()
	{
		return (double)(hits + walks + hitsByPitch) / (atBats + walks + sacFlies);
	}
	
	public int totalBases()
	{
		return singles + 2*doubles + 3*tripples + 4*homeRuns;
	}
	
	public double sluggingPercent()
	{
		return (double) totalBases() / atBats;
	}
	
	public double onBaseAndSlug()
	{
		return sluggingPercent() + onBasePercent();
	}
	
	/****************************************************************************************************************/
	
	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getSingles() {
		return singles;
	}

	public void setSingles(int singles) {
		this.singles = singles;
	}

	public int getDoubles() {
		return doubles;
	}

	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}

	public int getTripples() {
		return tripples;
	}

	public void setTripples(int tripples) {
		this.tripples = tripples;
	}

	public int getAtBats() {
		return atBats;
	}

	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}

	public int getWalks() {
		return walks;
	}

	public void setWalks(int walks) {
		this.walks = walks;
	}

	public int getHitsByPitch() {
		return hitsByPitch;
	}

	public void setHitsByPitch(int hitsByPitch) {
		this.hitsByPitch = hitsByPitch;
	}

	public int getSacFlies() {
		return sacFlies;
	}

	public void setSacFlies(int sacFlies) {
		this.sacFlies = sacFlies;
	}
	
}
