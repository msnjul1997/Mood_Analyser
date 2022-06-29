package com.bidgelabz.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.bidgelabz.MoodAnalyser;
import com.bidgelabz.MoodAnalyserException;

import junit.framework.Assert;

public class MoodAnalyserTest {
	 MoodAnalyser object ;
	    @Before
	    public void setUp()
	    {
	        object = new MoodAnalyser();
	    }
	    @Test
	    public void moodAnalyser() {
	        try {
	            ExpectedException e =  ExpectedException.none();
	            object.moodAnalyser();
	        } catch (MoodAnalyserException e) {
	            Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL,e.type);
	        }
	    }
}
