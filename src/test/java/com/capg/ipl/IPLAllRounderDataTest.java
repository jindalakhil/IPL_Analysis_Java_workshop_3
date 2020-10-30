package com.capg.ipl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.capg.ipl.fileio.*;
import com.capg.service.*;

import junit.framework.Assert;

public class IPLAllRounderDataTest {

	public static final String BATTING_DATA_FILE_PATH = "BattingData.csv";
	public static final String BOWLING_DATA_FILE_PATH = "BowlingData.csv";
	private IPLAnalyser iplAnalyser;
	List<IPLBatting> battingList = new ArrayList<IPLBatting>();
	List<IPLBowling> bowlingList = new ArrayList<IPLBowling>();
	List<IPLAllRounder> sortedList;

	@Before
	public void initialize() throws IPLException {
		iplAnalyser = new IPLAnalyser();
		battingList = iplAnalyser.loadCsvFile(BATTING_DATA_FILE_PATH, IPLBatting.class);
		bowlingList = iplAnalyser.loadCsvFile(BOWLING_DATA_FILE_PATH, IPLBowling.class);
		sortedList = new ArrayList<IPLAllRounder>();
	}

	@Test
	public void givenBattingAndBowlingData_ShouldReturnBestAvg() {
		sortedList = iplAnalyser.sortAllRounderData(battingList, bowlingList, AllRounderDataSorter.BEST_BATTING_AND_BOWLING_AVG);
		Collections.reverse(sortedList);
		Assert.assertEquals("Krishnappa Gowtham", sortedList.get(0).getPlayer());
	}

	@Test
	public void givenBattingAndBowlingData_ShouldReturnBestAllRounder() {
		sortedList = iplAnalyser.sortAllRounderData(battingList, bowlingList, AllRounderDataSorter.BEST_ALL_ROUNDER);
	    Collections.reverse(sortedList);
		Assert.assertEquals("Andre Russell", sortedList.get(0).getPlayer());
	}
}
