package ninja.thoth_station.kafka;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.reactivestreams.Publisher;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.SseElementType;

/**
 * A simple resource retrieving the in-memory "thoth-solver" and sending the
 * items as server-sent events.
 */
@Path("/solved-packages")
public class SolvedPackageResource {

    private static final String SOLVED_PACKAGES2 = "solved-packages";

    @Inject
    @Channel(SOLVED_PACKAGES2)
    Publisher<SolvedPackage> solved_packages;

    @GET
    @Path("/stream")
    @Produces(MediaType.SERVER_SENT_EVENTS)
    @SseElementType("text/plain")
    public Publisher<SolvedPackage> stream() {
        return solved_packages;
    }
}