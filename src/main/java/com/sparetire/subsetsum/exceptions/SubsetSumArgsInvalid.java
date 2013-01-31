package com.sparetire.subsetsum.exceptions;
/**
 * Business exception to indicate if the arguments
 * provided are valid.
 * 
 * @author Rick
 *
 */
public class SubsetSumArgsInvalid extends Exception {

	private static final long serialVersionUID = 1974274984690217745L;
	/**
	 * Initialize the message
	 * @param message
	 */
	public SubsetSumArgsInvalid(String message) {
		super(message);
	}
}
