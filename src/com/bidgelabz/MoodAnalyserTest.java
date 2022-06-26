package com.bidgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {
	  MoodAnalyser object ;
	    @BeforeEach
	    public void setUp()
	    {
	    	 object = new MoodAnalyser();
	    }
	    @Test
	    public void moodAnalyser()
	    { 
	    	//Test case 2.1:
	        String ans = object.moodAnalyser();
	        Assert.assertEquals("HAPPY",ans);
	    }

}
