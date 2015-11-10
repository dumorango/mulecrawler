package crawler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("/search")
public class Facade {
  @GET
    public String search() throws Exception {  
       return "Fake search result";
  }
}
