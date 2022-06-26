package com.bidgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {
	 MoodAnalyser object ;
	private Assert Assertion;
	    @Before
	    public void setUp()
	    {
	        object = new MoodAnalyser("This is a happy message");
	    }
	    @Test
	    public void moodAnalyser()
	    {
	        String ans = object.moodAnalyser();
	        Assertion.assertEquals("HAPPY",ans);
	    }

}
