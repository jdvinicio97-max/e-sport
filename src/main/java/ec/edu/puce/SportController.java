package ec.edu.puce;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/sport")
public class SportController {


    @GET
    public void saludar() {
        System.out.println("Hola!!");
    }
    @GET
    @Path("/process")
    public String procesar(){
        return "Procesando";
    }
    @GET
    @Path("/hello")
    public String saludo(){
        return "Hola como estas";
    }
}
