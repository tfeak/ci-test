package net.feak.citest;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Strings;

@Path("/token/{id}")
@Produces(MediaType.APPLICATION_JSON)
public class TokenResource {

    @GET
    @Timed(name = "getTokenTiming")
    @Metered(name = "getTokenRate")
    @ExceptionMetered(name = "getTokenExceptionRate")
    public Token getToken(@PathParam("id") String id) {
        return new Token(id);
    }
}