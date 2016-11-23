package com.example;



import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	//MessageService 
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    
    @GET
    @Path("userlist")
    @Produces(MediaType.APPLICATION_JSON)
   // public String getUsers() {
    //public Response getUsers() {
    public List<User> getUsers() {
    	
    	List<User> users = UserDAO.getUsers();
    	
    	//return Response.status(201).entity(users).build();

//    	ObjectMapper mapper = new ObjectMapper();
//        try
//        {
//           mapper.writeValue(new File("c://temp/users.json"), users);
//        } catch (JsonGenerationException e){
//           e.printStackTrace();
//        } catch (JsonMappingException e){
//           e.printStackTrace();
//        } catch (IOException e){
//           e.printStackTrace();
//        }
//     	//TODO parse users list into json
    	
    	//messageService
        //return "Users!";
    	return users;
    }
}
