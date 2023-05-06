package io.junnyland.reactive.ch2;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

import static java.math.BigDecimal.valueOf;
import static java.util.concurrent.TimeUnit.SECONDS;

public interface TemperatureSensor {

    @Component
    @RequiredArgsConstructor
    class TemperatureSensorUsecase implements TemperatureSensor {
        private final ApplicationEventPublisher publisher;
        private final RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create()
        private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        @PostConstruct
        public void startProcessing() {
            this.executor.schedule(this::probe, 1, SECONDS);
        }

        private void probe() {

            var temperature = new Temperature(valueOf(randomGenerator.nextGaussian() * 10).add(valueOf(16)));
            this.publisher.publishEvent(temperature);
            this.executor.schedule(this::probe, randomGenerator.nextLong(5000L), SECONDS);
        }
    }
}
