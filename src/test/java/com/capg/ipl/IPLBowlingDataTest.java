package com.capg.ipl;

import java.util.List;

import org.junit.Test;

import com.capg.ipl.fileio.*;

import junit.framework.Assert;

public class IPLBowlingDataTest {

	public static final String BOWLING_DATA_FILE_PATH = "BowlingData.csv";
	
	@Test
	public void givenBowlingData_shouldRetuenList() throws IPLException {
		CsvFileLoader csvFileLoader = new CsvFileLoader();
		List<IPLBowling> bowlingList = csvFileLoader.loadCsvFile(BOWLING_DATA_FILE_PATH, IPLBowling.class);
		Assert.assertEquals(101, bowlingList.size());
	}
}
