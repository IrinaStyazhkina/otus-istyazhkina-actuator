package ru.otus.istyazhkina.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import ru.otus.istyazhkina.repository.VisitorRepository;

@Component("visitorsHealthCheck")
public class VisitorsHealthIndicator implements HealthIndicator {

    private final String message_key = "Visitors repository";
    private final VisitorRepository visitorRepository;

    @Autowired
    public VisitorsHealthIndicator(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    @Override
    public Health health() {
        if (!check()) {
            return Health.down().withDetail(message_key, "No visitors found!").build();
        }

        return Health.up().withDetail(message_key, "There are visitors in your service!").build();
    }

    private boolean check() {
        return visitorRepository.count() > 0;
    }
}
