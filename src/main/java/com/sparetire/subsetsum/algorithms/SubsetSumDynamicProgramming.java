package com.sparetire.subsetsum.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rsoza
 */
public class SubsetSumDynamicProgramming extends SubsetSumAlgorithmBase
{

    public SubsetSumDynamicProgramming(String args[]) throws Exception
    {
        super(args);
    }
    
    public Integer[] process() throws Exception
    {
        Integer[] result = null;
        
        try 
        {
            // Initialize table for DP
            Integer DP[] = new Integer[targetValue+1];
            Arrays.fill(DP, 0);
            
            // For each sum, determine the smallest index that its input value is 
            // with in a subset to achieve the sum
            for (int partialSum=1; partialSum<=targetValue; partialSum ++)
            {
                int inputIndex;
                for (inputIndex=1;inputIndex<=inputSetLength;inputIndex++)
                {
                    int inputValue = 0;
                    if (inputSet[inputIndex] != null)
                    {
                        inputValue = inputSet[inputIndex];
                    }
                    
                    // Delta from potential sum
                    int delta=partialSum-inputValue;  
                    
                    if (delta<0)                  
                    {
                        // potential sum too large, skip to next
                        continue;
                    }
                    else if (DP[delta]==null)           
                    {
                        // Invalid value                        
                        continue;
                    }
                    else if (DP[delta]<inputIndex)               
                    {
                        // Found valid indices in asc order
                        break;                        
                    }
                }
                
                if (inputIndex<=inputSetLength)
                {
                    DP[partialSum]= inputIndex;
                }
                else
                {
                    // Flag as invalid 
                    DP[partialSum]= null;
                }
            }

            // Return matching set
            if (DP[targetValue]!=null)
            {
                ArrayList tempResult = new ArrayList();
                int i = targetValue;
                Integer inputValue = inputSet[DP[i]];
                if (inputValue != null)
                {
                    for ( i = targetValue ;i>0;i-=inputValue.intValue())
                    {
                        if (DP[i] > 0)
                        {
                            tempResult.add(inputSet[DP[i]]);
                            inputValue = inputSet[DP[i]];
                            if (inputValue == null)
                            {
                                break;
                            }
                        }
                        else
                        {
                                break;
                        }
                    }
                }
                
                if (tempResult.size() > 0)
                    result = (Integer[]) tempResult.toArray(new Integer[tempResult.size()]);
            }
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
        return result;
    }
    
    public static String formatResult(Integer[] result)
    {
        String resultString = "";
        
        if (result == null)
        {
            resultString = "No combination matches";
        }
        else
        {
            for (int resultIndex=0; resultIndex<result.length; resultIndex++)
            {
                resultString = resultString + result[resultIndex] + ",";
            }
            
            if (resultString.length()>0)
            {
                // Remove extra comma and add pretty print
                resultString = resultString.substring(0, resultString.length()-1);
                resultString = "{" + resultString + "}";
            }
        }
        return resultString;
    }
}