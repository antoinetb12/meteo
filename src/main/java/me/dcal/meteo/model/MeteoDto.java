package me.dcal.meteo.model;
import java.sql.Timestamp;

public class MeteoDto {
    Integer idMeteo;
    Timestamp currentTime;
    Double humidity;
    Double pressure;
    Double temperature;
    Double uv;
    Double cloudCoverage;
    Double cloudAltitude;
    Double precipitation;
    String windDirection;
    Double windDegree;
    Double windSpeed;

    public Integer getIdMeteo() {
        return idMeteo;
    }

    public void setIdMeteo(Integer idMeteo) {
        this.idMeteo = idMeteo;
    }


    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Timestamp getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Timestamp currentTime) {
        this.currentTime = currentTime;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Double getCloudCoverage() {
        return cloudCoverage;
    }

    public void setCloudCoverage(Double cloudCoverage) {
        this.cloudCoverage = cloudCoverage;
    }

    public Double getCloudAltitude() {
        return cloudAltitude;
    }

    public void setCloudAltitude(Double cloudAltitude) {
        this.cloudAltitude = cloudAltitude;
    }

    public Double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Double precipitation) {
        this.precipitation = precipitation;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Double getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Double windDegree) {
        this.windDegree = windDegree;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
