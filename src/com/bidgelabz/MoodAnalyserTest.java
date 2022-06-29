package com.bidgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {
	 MoodAnalyser object ;
	    @Before
	    public void setUp()
	    {
	        object = new MoodAnalyser();
	    }
	    @Test
	    public void moodAnalyser()
	    {

	        String ans = object.moodAnalyser("I am in Sad Mood");
	        Assert.assertEquals("SAD",ans);
	    }

}
