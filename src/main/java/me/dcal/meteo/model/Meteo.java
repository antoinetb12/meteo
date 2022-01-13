package me.dcal.meteo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="meteo")
public class Meteo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_meteo", unique=true)
	Integer idMeteo;
	@Column(name="cur_time")
	Timestamp currentTime;
	@Column(name="humidity")
	Double humidity;
	@Column(name="pressure")
	Double pressure;
	@Column(name="temperature")
	Double temperature;
	@Column(name="uv")
	Double uv;
	@Column(name="cloud_coverage")
	Double cloudCoverage;
	@Column(name="cloud_altitude")
	Double cloudAltitude;
	@Column(name="precipitation")
	Double precipitation;
	@Column(name="wind_direction")
	String windDirection;
	@Column(name="wind_degree")
	Double windDegree;
	@Column(name="wind_speed")
	Double windSpeed;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="station_id", nullable=false)
	Station station;

	public Integer getIdMeteo() {
		return idMeteo;
	}

	public void setIdMeteo(Integer idMeteo) {
		this.idMeteo = idMeteo;
	}

	public Timestamp getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Timestamp currentTime) {
		this.currentTime = currentTime;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
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

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}
}
