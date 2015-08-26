package com.ashish.javaapplication;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BigIntegerTest {

	private Collection collection;

    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("@AfterClass - oneTimeTearDown");
    }

    @Before
    public void setUp() {
        collection = new ArrayList();
        System.out.println("@Before - setUp");
    }

    @After
    public void tearDown() {
        collection.clear();
        System.out.println("@After - tearDown");
    }
	@Test
	public void testBigInteger () {
		Integer bi = new Integer("2");
		System.out.println(bi.compareTo(0));
		//assertEquals(bi.compareTo(0), 0);
		assertThat("bi", bi.compareTo(0), greaterThanOrEqualTo(0));
		
	}
}
