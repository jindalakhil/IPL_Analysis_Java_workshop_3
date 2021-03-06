package com.capg.ipl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.capg.ipl.*;
import com.capg.ipl.fileio.*;
import com.capg.service.*;

import junit.framework.Assert;

public class IPLBowlingDataTest {
	private IPLAnalyser iplAnalyser;
	List<IPLBowling> bowlingList = new ArrayList<IPLBowling>();
	List<IPLBowling> sortedList;
	public static final String BOWLING_DATA_FILE_PATH = "BowlingData.csv";
	
	@Before
	public void initialize() throws IPLException {
		iplAnalyser = new IPLAnalyser();
		bowlingList = iplAnalyser.loadCsvFile(BOWLING_DATA_FILE_PATH, IPLBowling.class);
		sortedList = new ArrayList<IPLBowling>();
	}
	
	
	@Test
	public void givenBowlingData_shouldRetuenList() throws IPLException {
		Assert.assertEquals(101, bowlingList.size());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopStrikeRate() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_BOWLING_STRIKE_RATE);
		Assert.assertEquals("Krishnappa Gowtham", sortedList.get(100).getPlayer());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopBowlingAvg() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_BOWLING_AVG);
		Assert.assertEquals("Krishnappa Gowtham", sortedList.get(100).getPlayer());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopEconomyRate() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_ECONOMY_RATE);
		Assert.assertEquals("Ben Cutting", sortedList.get(100).getPlayer());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopStrikeRateWith5And4Wickets() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_SR_WITH_5W_AND_4W);
		Assert.assertEquals("Krishnappa Gowtham", sortedList.get(100).getPlayer());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopAvgWithBesrSR() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_AVG_WITH_BEST_SR);
		Assert.assertEquals("Krishnappa Gowtham", sortedList.get(100).getPlayer());
	}
	
	@Test
	public void givenBowlingData_shouldReturnMaxWicketsWithBestAvg() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.MAX_WICKET_WITH_BEST_BOWLING_AVG);
		Assert.assertEquals("Imran Tahir", sortedList.get(100).getPlayer());
	}
}
