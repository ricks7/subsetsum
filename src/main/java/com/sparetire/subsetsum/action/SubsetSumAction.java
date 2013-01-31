package com.sparetire.subsetsum.action;

import com.sparetire.subsetsum.model.Data;
import com.opensymphony.xwork2.ActionSupport;
import com.sparetire.subsetsum.algorithms.SubsetSumAlgorithmBase;
import com.sparetire.subsetsum.algorithms.SubsetSumDynamicProgramming;
/**
 * Struts 2 Action class that is defined in struts.xml
 * 
 * @author Rick
 *
 */
public class SubsetSumAction extends ActionSupport {

	//Form input
	private Data data = new Data();

        private String results = "";
        
        private SubsetSumAlgorithmBase subsetSum = null;
        
	/**
	 * 
	 * @return indication of success
	 */
	public String runSubsetSum() {
            try
            {
                if (subsetSum != null)
                {
                    Integer[] result = subsetSum.process();
                    this.results = SubsetSumAlgorithmBase.formatResult(result);
                }
            }
            catch (Exception e)
            {
                results = "Error: " + e.getMessage();
            }

            return SUCCESS;
	}
	/**
	 * Called by framework to validate form entry fields before
	 * running Rule
	 */
	public void validate() {
	
		try {
                    if (data.args() != null)
                    {
                        subsetSum = new SubsetSumDynamicProgramming(data.args());
                    }
		} catch (Exception invalid) {
			addFieldError( "data.input", invalid.getMessage() );
		}
		
	}
	/**
	 * Results of processing the subset sum 
	 * @return
	 */
	public String getSubsetSumResults() {
		return results;
	}

	public void setSubsetSumResults(String results) {
		this.results = results;
	}
	/**
	 * The data this is modified via the form
	 * @return
	 */
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
}
