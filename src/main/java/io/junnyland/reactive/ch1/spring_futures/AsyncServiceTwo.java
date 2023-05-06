package io.junnyland.reactive.ch1.spring_futures;


import io.junnyland.reactive.ch1.commons.ExamplesCollection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/resource/b")
public class AsyncServiceTwo {

    @GetMapping
    public ExamplesCollection process() throws InterruptedException {
        Thread.sleep(1000);

        ExamplesCollection ec = new ExamplesCollection();
        ec.setValue("test");

        return ec;
    }
}
