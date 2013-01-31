package com.sparetire.subsetsum.webservice;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.sparetire.subsetsum.exceptions.SubsetSumArgsInvalid;

@Provider
public class SubsetSumServiceExceptionMapper implements ExceptionMapper<SubsetSumArgsInvalid>{
	 @Context
	    private HttpHeaders headers;
	
	 @Override
	public Response toResponse(SubsetSumArgsInvalid e) {
		return Response.status(Status.BAD_REQUEST)
				. entity(e.getMessage())
				. type(headers.getMediaType())
				. build(); 

	}

}
