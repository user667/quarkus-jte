package ch.elmundi.playground.jte;

import dev.renann.quarkus.jte.runtime.TemplateRenderer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class JtePage {

    private final Page page = Page.builder()
            .withTitle("Home")
            .withDescription("This is the homepage rendered with jte")
            .build();

    @Inject
    private TemplateRenderer templateRenderer;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return templateRenderer.render("templates/page.jte", Collections.singletonMap("page", page));
    }
}
