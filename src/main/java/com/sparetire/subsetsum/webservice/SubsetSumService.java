package com.sparetire.subsetsum.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.sparetire.subsetsum.exceptions.SubsetSumArgsInvalid;

@Path("/subsetsum")
public class SubsetSumService {

	@GET
	@Path("/json/{input}")
	@Produces("application/json")
	public String runSubsetSum(@PathParam("input") String input)
			throws SubsetSumArgsInvalid {
		String results = "hello world";

		return results;
	}
}
