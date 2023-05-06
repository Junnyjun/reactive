package io.junnyland.reactive.ch2;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
public class TemperatureController {
    private final Set<SseEmitter> clients = new CopyOnWriteArraySet<>();

    @GetMapping("/temperature-stream")
    public SseEmitter events() {
        var emitter = new SseEmitter();
        this.clients.add(emitter);

        emitter.onCompletion(() -> this.clients.remove(emitter));
        emitter.onTimeout(() -> this.clients.remove(emitter));
        return emitter;
    }

    @Async
    @EventListener
    public void handleMessage(Temperature temperature) {
        List<SseEmitter> deadEmitter = new ArrayList<>();
        clients.forEach(emitter -> {
            try {
                emitter.send(temperature);
            } catch (Exception e) {
                deadEmitter.add(emitter);
            }
        });
        clients.removeAll(deadEmitter);
    }
}
