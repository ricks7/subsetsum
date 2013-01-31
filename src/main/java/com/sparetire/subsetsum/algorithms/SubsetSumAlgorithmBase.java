package com.sparetire.subsetsum.algorithms;

public abstract class SubsetSumAlgorithmBase 
{
    protected int targetValue = 0;
    protected int inputSetLength = 0;
    protected Integer[] inputSet = null;

    public SubsetSumAlgorithmBase(String args[]) throws Exception
    {
        // Verify input paramters
        if (args.length < 3)
        {
            // Not enough input params
            throw new Exception("Invalid number of inputs");
        }
        
        // Parse inputs
        try 
        {
            targetValue = Integer.parseInt(args[0]);
            inputSetLength = args.length - 1;
            inputSet = new Integer[inputSetLength + 1];
            inputSet[0] = 0;
            for (int argIndex = 1; argIndex < inputSetLength + 1; argIndex++)
            {
                inputSet[argIndex] = Integer.parseInt(args[argIndex]);
            }
        }
        catch (Exception e)
        {
            throw new Exception("Invalid paramaters: " + e.getMessage());
        }
    }
    
    abstract public Integer[] process() throws Exception;
            
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