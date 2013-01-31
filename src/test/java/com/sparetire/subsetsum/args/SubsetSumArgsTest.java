package com.sparetire.subsetsum.args;

import com.sparetire.subsetsum.algorithms.SubsetSumAlgorithmBase;
import com.sparetire.subsetsum.algorithms.SubsetSumDynamicProgramming;
import com.sparetire.subsetsum.exceptions.SubsetSumArgsInvalid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the RuleIntegerArgs
 * 
 * @author Rick
 *
 */
public class SubsetSumArgsTest {
	SubsetSumArgsTest sut;
	@Before
	public void setup () {
		sut = new SubsetSumArgsTest();
	}
	
    @Test(expected=Exception.class)
    public void testNotEnoughInputs() throws Exception
    {
        String[] args = {"1", "2"};
        SubsetSumAlgorithmBase subsetSum = new SubsetSumDynamicProgramming(args);
    }
    
    @Test(expected=Exception.class)
    public void testInvalidInputs() throws Exception
    {
        String[] args = {"one", "two", "three", "four"};
        SubsetSumAlgorithmBase subsetSum = new SubsetSumDynamicProgramming(args);
    }
    
}
