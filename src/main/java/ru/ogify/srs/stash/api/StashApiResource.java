package ru.ogify.srs.stash.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * Created by melge on 22.02.2016.
 */
@Path("/rest/api/1.0")
@Produces("application/json")
@Consumes("application/json")
public interface StashApiResource {
    @Path("/projects")
    ProjectsResource projects(@QueryParam("name") String name,
                              @QueryParam("limit") Integer limit,
                              @QueryParam("start") Integer start);
}
