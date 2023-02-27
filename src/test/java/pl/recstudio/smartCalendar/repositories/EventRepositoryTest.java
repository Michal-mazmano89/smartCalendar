package pl.recstudio.smartCalendar.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.recstudio.smartCalendar.model.Event;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EventRepositoryTest {

    @Autowired
    private EventRepository eventRepository;

    @Test
    public void saveEvent(){
        Event event = new Event();
        event.setDate("2222-22-22");
        event.setServiceType("FILM");
        event.setAdditionalInfo("dodatkoweinfo2");

        Event savedEvent = eventRepository.save(event);

        System.out.println(event);
    }

    @Test
    public void deleteEvent(){
        int id = 1;
        eventRepository.deleteById(id);
    }


}