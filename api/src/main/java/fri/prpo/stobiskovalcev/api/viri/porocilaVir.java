package fri.prpo.stobiskovalcev.api.viri;

import fri.prpo.stobiskovalcev.api.v1.dtos.podatkiDto;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Logger;


@Path("porocila")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class porocilaVir {

    private Logger log = Logger.getLogger(porocilaVir.class.getName());
    //private Map<ProstorDto, ArrayList<podatkiDto>> porocila;
    private ArrayList<podatkiDto> porocila;

    @PostConstruct
    private void init() {
        porocila = new ArrayList<>();
        //porocila = new HashMap<>();
        //porocila.put(new ProstorDto(1), new ArrayList<>());
    }

    @GET
    public Response getPorocila() {

        log.info("GET porocila");
        return Response.ok(
                porocila
        )
                .build();
    }

    @POST
    public Response addInput(float zasedenost) {
        podatkiDto data = new podatkiDto(zasedenost, LocalDate.now(), LocalTime.now());
        porocila.add(data);
        log.info("Dodan vnos: " + data + ", zasedenost: " + zasedenost);

        return Response.ok().build();
    }
}