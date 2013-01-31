package com.sparetire.main;

import com.sparetire.subsetsum.algorithms.SubsetSumAlgorithmBase;
import com.sparetire.subsetsum.algorithms.SubsetSumDynamicProgramming;
/**
 * Main class that can be run from the command line.
 * 
 * It is also used by the UI to process all the rules
 * for the given arguments.
 * 
 * 
 * @author Rick
 *
 */
public class SubsetSum {
	/**
	 * Process the arguments from the command line.
	 * Log to results.
	 * 
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
            try
            {
                SubsetSumAlgorithmBase subsetSum = new SubsetSumDynamicProgramming(args);
                Integer[] result = subsetSum.process();
                String resultString = SubsetSumAlgorithmBase.formatResult(result);
                System.out.println(resultString);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
	}
}
