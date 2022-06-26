package com.bidgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {
	  MoodAnalyser object ;
	    @BeforeEach
	    public void setUp()
	    {
	        object = new MoodAnalyser("I am in Happy  mood");
	    }
	    @Test
	    public void moodAnalyser()
	    {
	        String ans = object.moodAnalyser();
	        Assert.assertEquals("HAPPY",ans);
	    }

}
