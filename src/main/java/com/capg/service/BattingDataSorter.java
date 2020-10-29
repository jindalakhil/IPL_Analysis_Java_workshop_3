package com.capg.service;

import java.util.Comparator;
import com.capg.ipl.fileio.IPLBatting;

public class BattingDataSorter {

	public final static Comparator<IPLBatting> TOP_BATTING_AVG = Comparator.comparing(IPLBatting::getAverage);
}
