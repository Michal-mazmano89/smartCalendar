package pl.recstudio.smartCalendar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name="events")
@Getter @Setter @NoArgsConstructor
@ToString
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String date;
    private String place;
    @Column(name="serviceType")
    private String serviceType;
    @Column(name="additionalInfo")
    private String additionalInfo;

    public Event(String date, String place, String serviceType, String additionalInfo) {
        this.date = date;
        this.place = place;
        this.serviceType = serviceType;
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String toString() {
        return "Event{" +
                "ID=" + id +
                ", date=" + date +
                ", place='" + place + '\'' +
                ", serviceType=" + serviceType +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
