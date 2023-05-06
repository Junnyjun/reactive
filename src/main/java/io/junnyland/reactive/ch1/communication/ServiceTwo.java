package io.junnyland.reactive.ch1.communication;


import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/resource/b")
public class ServiceTwo {

    @GetMapping
    public ExamplesCollection process() throws InterruptedException {
        Thread.sleep(1000);

        ExamplesCollection ec = new ExamplesCollection();
        ec.setValue("test");

        return ec;
    }
}
