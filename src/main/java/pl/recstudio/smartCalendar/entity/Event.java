package pl.recstudio.smartCalendar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name="events")
@Getter @Setter @NoArgsConstructor
@ToString
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate date;
    private String place;
    private BrandEnum brand;

    @Column(name="serviceType")
    @Enumerated(EnumType.STRING)
    private ServiceTypeEnum serviceType;

    @Column(name="additionalInfo")
    private String additionalInfo;

    public Event(LocalDate date, String place, BrandEnum brand, ServiceTypeEnum serviceType, String additionalInfo) {
        this.date = date;
        this.place = place;
        this.brand = brand;
        this.serviceType = serviceType;
        this.additionalInfo = additionalInfo;
    }

}
