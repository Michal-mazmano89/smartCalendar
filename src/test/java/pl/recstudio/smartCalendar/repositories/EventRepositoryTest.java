package pl.recstudio.smartCalendar.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.recstudio.smartCalendar.entity.BrandEnum;
import pl.recstudio.smartCalendar.entity.Event;
import pl.recstudio.smartCalendar.entity.ServiceTypeEnum;

import java.time.LocalDate;
import java.util.NoSuchElementException;

@SpringBootTest
class EventRepositoryTest {

    @Autowired
    private EventRepository eventRepository;

    @Test
    void saveEvent(){
        Event event = new Event();
        event.setDate(LocalDate.of(2023,1,1));
        event.setPlace("Kielce");
        event.setBrand(BrandEnum.BRAND1);
        event.setServiceType(ServiceTypeEnum.PHOTOVIDEO);
        event.setAdditionalInfo("Info");

        Event savedEvent = eventRepository.save(event);
    }

    @Test
    void readEvent(){
        int EventId = 3;
        try {
            Event event = eventRepository.findById(EventId).orElseThrow();
            System.out.println(event);
        } catch (NoSuchElementException e) {
            System.out.println("Brak wydarzenia o id="+EventId);
          }

    }

    @Test
    void deleteEvent(){
        Integer id = 1;
        eventRepository.deleteById(id);
    }



}