package com.capg.service;

import java.util.Comparator;
import com.capg.ipl.fileio.IPLBatting;

public class BattingDataSorter {

	public static Comparator<IPLBatting> TOP_BATTING_AVG = Comparator.comparing(IPLBatting::getAverage);

	public static Comparator<IPLBatting> TOP_STRIKING_RATE = Comparator.comparing(IPLBatting::getStrikeRate);
}
