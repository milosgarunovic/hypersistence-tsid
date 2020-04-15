package com.github.f4b6a3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.github.f4b6a3.tsid.creator.TimeSortableIdCreatorTest;
import com.github.f4b6a3.tsid.strategy.timestamp.DefaultTimestampStrategyTest;
import com.github.f4b6a3.tsid.util.TsidTimeUtilTest;
import com.github.f4b6a3.tsid.util.TsidUtilTest;
import com.github.f4b6a3.tsid.util.TsidValidatorTest;
import com.github.f4b6a3.tsid.util.TsidConverterTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TimeSortableIdCreatorTest.class,
	DefaultTimestampStrategyTest.class,
	TsidTimeUtilTest.class,
	TsidUtilTest.class,
	TsidValidatorTest.class,
	TsidConverterTest.class,
})

/**
 * 
 * It bundles all JUnit test cases.
 * 
 * Also see {@link UniquenesTest}. 
 *
 */
public class TestSuite {
}