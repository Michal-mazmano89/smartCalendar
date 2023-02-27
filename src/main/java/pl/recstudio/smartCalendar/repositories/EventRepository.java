package pl.recstudio.smartCalendar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.recstudio.smartCalendar.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
