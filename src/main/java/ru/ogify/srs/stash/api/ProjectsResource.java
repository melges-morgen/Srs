package ru.ogify.srs.stash.api;

import ru.ogify.srs.stash.entities.PageLoadResult;
import ru.ogify.srs.stash.entities.StashProject;

import javax.ws.rs.GET;

/**
 * Created by melge on 22.02.2016.
 */
public interface ProjectsResource {
    @GET
    PageLoadResult<StashProject> allProjects();
}
