package meteo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Adapter implements MeteoSensor{
    private SensorTemperature in;

    public Adapter(SensorTemperature in) {
        this.in = in;
    }

    @Override
    public int getId() {
        return in.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)in.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dt = LocalDateTime.of(in.year(), 1,1, 0 ,0);
        dt = dt.plusDays(in.day()-1);
        dt = dt.plusSeconds(in.second());
        return dt;
    }
}
