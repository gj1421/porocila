package fri.prpo.stobiskovalcev.api.v1.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class podatkiDto {
    private Float zasedenost;
    private LocalDate date;
    private LocalTime time;

    public podatkiDto(Float zasedenost, LocalDate date, LocalTime time) {
        this.zasedenost = zasedenost;
        this.date = date;
        this.time = time;
    }

    public Float getZasedenost() {
        return zasedenost;
    }

    public void setZasedenost(Float zasedenost) {
        this.zasedenost = zasedenost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
