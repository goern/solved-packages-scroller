package ninja.thoth_station.kafka;

import io.smallrye.reactive.messaging.annotations.Channel;
import org.reactivestreams.Publisher;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.SseElementType;

/**
 * A simple resource retrieving the in-memory "thoth-solver" and sending the items as server-sent events.
 */
@Path("/solved-packages")
public class SolvedPackageResource {

    @Inject
    @Channel("solved-packages") Publisher<SolvedPackage> solved_packages; 

    @GET
    @Path("/stream")
    @Produces(MediaType.SERVER_SENT_EVENTS) 
    @SseElementType("text/plain") 
    public Publisher<SolvedPackage> stream() { 
        return solved_packages;
    }
}