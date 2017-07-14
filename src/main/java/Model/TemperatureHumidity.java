package Model;

/**
 * This class is for temperature-humidity sensor data
 * Created by 안재열 on 2017-07-14.
 */
public class TemperatureHumidity {
    private String temperature;
    private String humidity;

    public TemperatureHumidity(){};
    public TemperatureHumidity(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "TemperatureHumidity{" +
                "temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }
}
