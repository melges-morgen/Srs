package ru.ogify.srs.rest.resources;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ogify.srs.stash.api.StashApiResource;
import ru.ogify.srs.stash.entities.PageLoadResult;
import ru.ogify.srs.stash.entities.StashProject;

import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;
import javax.ws.rs.*;
import java.util.Collections;

/**
 * Created by melge on 21.02.2016.
 */
@Component
@Path("/projects")
@Consumes("application/json")
@Produces("application/json")
public class ProjectResource {
    @Autowired
    StashApiResource stashApiResource;

    @GET
    public PageLoadResult<StashProject> available(@QueryParam("name") String name) {
        return stashApiResource.projects().allProjects();
    }

    @GET
    public PageLoadResult<StashProject> added() {
        return new PageLoadResult<>();
    }

    @GET
    @Path("/{key}")
    public StashProject byKey(@NotEmpty @NotNull @PathParam("key") String projectKey) {

    }

    @GET
    @Path("/{key}/repos")
    public
}
