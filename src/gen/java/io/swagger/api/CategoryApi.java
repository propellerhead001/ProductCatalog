package io.swagger.api;

import io.swagger.model.Category;
import io.swagger.model.CategoryCreate;
import io.swagger.model.CategoryUpdate;
import io.swagger.model.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/category")

@Api(description = "the category API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-01-31T17:20:32.357Z")

public class CategoryApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a 'Category'", notes = "", response = Category.class, tags={ "category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = Category.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Category.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Category.class) })
    public Response createCategory(CategoryCreate category) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "List or find 'Category' objects", notes = "", response = Category.class, responseContainer = "List", tags={ "category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Category.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Category.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Category.class, responseContainer = "List") })
    public Response listCategory(@QueryParam("fields") String fields) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a 'Category' by Id", notes = "", response = Category.class, responseContainer = "List", tags={ "category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Category.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Category.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Not Found", response = Category.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Category.class, responseContainer = "List") })
    public Response retrieveCategory(@PathParam("id") String id,@QueryParam("fields") String fields) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates a 'Category' by Id", notes = "", response = Category.class, tags={ "category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updated", response = Category.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Category.class),
        @ApiResponse(code = 404, message = "Not Found", response = Category.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Category.class) })
    public Response updateCategory(@PathParam("id") String id,CategoryUpdate category) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates partially a 'Category' by Id", notes = "", response = Category.class, tags={ "category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updated", response = Category.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Category.class),
        @ApiResponse(code = 404, message = "Not Found", response = Category.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Category.class) })
    public Response updateCategory_1(@PathParam("id") String id,CategoryUpdate category) {
    	return Response.ok().entity("magic!").build();
    }
}

