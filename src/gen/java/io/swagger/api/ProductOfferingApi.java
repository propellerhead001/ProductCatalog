package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.ProductOffering;
import io.swagger.model.ProductOfferingCreate;
import io.swagger.model.ProductOfferingUpdate;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/productOffering")

@Api(description = "the productOffering API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-01-31T17:20:32.357Z")

public class ProductOfferingApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a 'ProductOffering'", notes = "", response = ProductOffering.class, tags={ "productOffering",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ProductOffering.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductOffering.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductOffering.class) })
    public Response createProductOffering(ProductOfferingCreate productOffering) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "List or find 'ProductOffering' objects", notes = "", response = ProductOffering.class, responseContainer = "List", tags={ "productOffering",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductOffering.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductOffering.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductOffering.class, responseContainer = "List") })
    public Response listProductOffering(@QueryParam("fields") String fields) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a 'ProductOffering' by Id", notes = "", response = ProductOffering.class, responseContainer = "List", tags={ "productOffering",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductOffering.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductOffering.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Not Found", response = ProductOffering.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductOffering.class, responseContainer = "List") })
    public Response retrieveProductOffering(@PathParam("id") String id,@QueryParam("fields") String fields) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates a 'ProductOffering' by Id", notes = "", response = ProductOffering.class, tags={ "productOffering",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updated", response = ProductOffering.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductOffering.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProductOffering.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductOffering.class) })
    public Response updateProductOffering(@PathParam("id") String id,ProductOfferingUpdate productOffering) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates partially a 'ProductOffering' by Id", notes = "", response = ProductOffering.class, tags={ "productOffering" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updated", response = ProductOffering.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductOffering.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProductOffering.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductOffering.class) })
    public Response updateProductOffering_1(@PathParam("id") String id,ProductOfferingUpdate productOffering) {
    	return Response.ok().entity("magic!").build();
    }
}

