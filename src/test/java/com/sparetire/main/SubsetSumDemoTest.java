package com.sparetire.main;

import com.sparetire.main.SubsetSum;
import com.sparetire.subsetsum.algorithms.SubsetSumAlgorithmBase;
import com.sparetire.subsetsum.algorithms.SubsetSumDynamicProgramming;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * More of an integration test.
 * 
 *	
 * @author Rick
 *
 */
public class SubsetSumDemoTest {
    SubsetSum sut;

    @Before
    public void setup() {
            sut = new SubsetSum();
    }
        
    @Test
    public void test1() 
    {
        try {
            String[] args = {"15", "1", "2", "3", "5", "7", "10"};
            String resultString = test(args);
            assert( resultString.equals("{7,5,2,1}"));
        }
        catch (Exception e)
        {
            assert(false);
        }
    }
    
    @Test
    public void test2() 
    {
        try {
            String[] args = {"9", "1", "2", "3", "5", "7", "10"};
            String resultString = test(args);
            assert( resultString.equals("{5,3,1}"));
        }
        catch (Exception e)
        {
            assert(false);
        }
    }
    
    @Test
    public void test3() 
    {
        try {
            String[] args = {"100", "1", "2", "3", "5", "7", "10"};
            String resultString = test(args);
            assert( resultString.equals("No combination matches"));
        }
        catch (Exception e)
        {
            assert(false);
        }
    }

    @Test
    public void test4() 
    {
        try {
            String[] args = {"12", "1", "1", "100", "22", "11"};
            String resultString = test(args);
            assert( resultString.equals("{11,1}"));
        }
        catch (Exception e)
        {
            assert(false);
        }
    }
    
    @Test
    public void test5() 
    {
        try {
            String[] args = {"5", "1", "2", "4", "10", "22"};
            String resultString = test(args);
            assert( resultString.equals("{4,1}"));
        }
        catch (Exception e)
        {
            assert(false);
        }
    }
    
    private String test(String[] args) throws Exception
    {
        String resultString = null;
        SubsetSumAlgorithmBase subsetSum = new SubsetSumDynamicProgramming(args);
        Integer[] result = subsetSum.process();
        resultString = SubsetSumAlgorithmBase.formatResult(result);
        System.out.println(args[0] + " = " + resultString);
        return resultString;
    }
}
