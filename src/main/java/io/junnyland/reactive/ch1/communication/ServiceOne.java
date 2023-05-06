package io.junnyland.reactive.ch1.communication;


import org.springframework.web.bind.annotation.RestController;

/**
 * Example of blocking communication
 */
@RestController
@RequestMapping("api/v1/resource/a")
public class ServiceOne {
    private static final String PORT = "8080";

    @GetMapping
    public ExamplesCollection processRequest() {
        RestTemplate template = new RestTemplate();
        ExamplesCollection result = template.getForObject(
                "http://localhost:" + PORT + "/api/v1/resource/b",
                ExamplesCollection.class
        );

        processResultFurther(result);

        return result;
    }

    private void processResultFurther(ExamplesCollection result) {
        // Do some processing
    }
}
