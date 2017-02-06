package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.ProductSpecification;
import io.swagger.model.ProductSpecificationCreate;
import io.swagger.model.ProductSpecificationUpdate;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/productSpecification")

@Api(description = "the productSpecification API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-01-31T17:20:32.357Z")

public class ProductSpecificationApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a 'ProductSpecification'", notes = "", response = ProductSpecification.class, tags={ "productSpecification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ProductSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductSpecification.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductSpecification.class) })
    public Response createProductSpecification(ProductSpecificationCreate productSpecification) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "List or find 'ProductSpecification' objects", notes = "", response = ProductSpecification.class, responseContainer = "List", tags={ "productSpecification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductSpecification.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductSpecification.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductSpecification.class, responseContainer = "List") })
    public Response listProductSpecification(@QueryParam("fields") String fields) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a 'ProductSpecification' by Id", notes = "", response = ProductSpecification.class, responseContainer = "List", tags={ "productSpecification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductSpecification.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductSpecification.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Not Found", response = ProductSpecification.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductSpecification.class, responseContainer = "List") })
    public Response retrieveProductSpecification(@PathParam("id") String id,@QueryParam("fields") String fields) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates a 'ProductSpecification' by Id", notes = "", response = ProductSpecification.class, tags={ "productSpecification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updated", response = ProductSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductSpecification.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProductSpecification.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductSpecification.class) })
    public Response updateProductSpecification(@PathParam("id") String id,ProductSpecificationUpdate productSpecification) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates partially a 'ProductSpecification' by Id", notes = "", response = ProductSpecification.class, tags={ "productSpecification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updated", response = ProductSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ProductSpecification.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProductSpecification.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProductSpecification.class) })
    public Response updateProductSpecification_1(@PathParam("id") String id,ProductSpecificationUpdate productSpecification) {
    	return Response.ok().entity("magic!").build();
    }
}

