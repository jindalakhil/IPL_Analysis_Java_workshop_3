package com.capg.service;

import java.util.Comparator;

import com.capg.ipl.fileio.IPLBowling;

public class BowlingDataSorter {

	public static Comparator<IPLBowling> TOP_BOWLING_AVG = Comparator.comparing(IPLBowling::getAverage);

}