package io.swagger.api;

import io.swagger.model.Hub;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/hub")

@Api(description = "the hub API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-01-31T17:20:32.357Z")

public class HubApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "hubCreate", notes = "", response = Hub.class, tags={ "hub",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Hub", response = Hub.class) })
    public Response hubCreate(Hub hub) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{hubId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "hubDelete", notes = "", response = void.class, tags={ "hub",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success", response = void.class) })
    public Response hubDelete(@PathParam("hubId") String hubId) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "hubFind", notes = "", response = Hub.class, responseContainer = "List", tags={ "hub",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of Hub", response = Hub.class, responseContainer = "List") })
    public Response hubFind() {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{hubId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "hubGet", notes = "", response = Hub.class, tags={ "hub" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Hub", response = Hub.class) })
    public Response hubGet(@PathParam("hubId") String hubId) {
    	return Response.ok().entity("magic!").build();
    }
}

