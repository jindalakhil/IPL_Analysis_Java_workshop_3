package com.capg.ipl.fileio;

public class IPLAllRounder {

	private String player;
	private int runs;
	private int wickets;
	private double averageRuns;
	private double averageWickets;

	public IPLAllRounder(String player, int runs, int wickets, double averageRuns, double averageWickets) {
		this.player = player;
		this.runs = runs;
		this.wickets = wickets;
		this.averageRuns = averageRuns;
		this.averageWickets = averageWickets;
	}

	public String getPlayer() {
		return player;
	}

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

	public double getAverageRuns() {
		return averageRuns;
	}

	public double getAverageWickets() {
		return averageWickets;
	}

}