package com.capg.service;

import java.util.Comparator;

import com.capg.ipl.fileio.IPLAllRounder;


public class AllRounderDataSorter {

	 public static Comparator<IPLAllRounder> BEST_ALL_ROUNDER = Comparator.comparing(player -> player.getWickets() + player.getRuns());
	
	public static Comparator<IPLAllRounder> BEST_BATTING_AND_BOWLING_AVG = Comparator.comparing(player -> player.getAverageRuns() + player.getAverageWickets());
}