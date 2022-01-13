package me.dcal.meteo.service;

import me.dcal.meteo.model.Meteo;
import me.dcal.meteo.model.MeteoDto;
import me.dcal.meteo.model.Station;
import me.dcal.meteo.model.StationDto;
import me.dcal.meteo.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MeteoService {
    @Autowired
    StationRepository stationRepository;

    public List<StationDto> getStations() {
        return stationsToDto(stationRepository.findAll());
    }

    public StationDto getStation(Integer id) {
        Optional<Station> stationOptional = stationRepository.findById(id);
        if (stationOptional.isPresent()) {
            return stationToDto(stationOptional.get());
        }
        return null;
    }

    public List<StationDto> stationsToDto(List<Station> stations) {
        ArrayList<StationDto> stationDtos = new ArrayList<>();
        StationDto stationDto = null;
        for (Station s : stations) {
            stationDto = new StationDto();
            stationDto.setLatitude(s.getLatitude());
            stationDto.setLongitude(s.getLongitude());
            stationDto.setNom(s.getNom());
            stationDto.setIdStation(s.getIdStation());
            stationDtos.add(stationDto);
        }
        return stationDtos;
    }

    public StationDto stationToDto(Station station) {
        StationDto stationDto = new StationDto();
        stationDto.setIdStation(station.getIdStation());
        stationDto.setLatitude(station.getLatitude());
        stationDto.setLongitude(station.getLongitude());
        stationDto.setNom(station.getNom());
        ArrayList<MeteoDto> meteos = new ArrayList<>();
        for (Meteo m : station.getMeteos()) {
            meteos.add(meteoToDto(m));
        }
        stationDto.setMeteos(meteos);
        return stationDto;
    }

    public MeteoDto meteoToDto(Meteo meteo) {
        MeteoDto meteoDto = new MeteoDto();
        meteoDto.setIdMeteo(meteo.getIdMeteo());
        meteoDto.setCloudAltitude(meteo.getCloudAltitude());
        meteoDto.setCloudCoverage(meteo.getCloudCoverage());
        meteoDto.setHumidity(meteo.getHumidity());
        meteoDto.setPrecipitation(meteo.getPrecipitation());
        meteoDto.setPressure(meteo.getPressure());
        meteoDto.setCurrentTime(meteo.getCurrentTime());
        meteoDto.setTemperature(meteo.getTemperature());
        meteoDto.setUv(meteo.getUv());
        meteoDto.setWindDirection(meteo.getWindDirection());
        meteoDto.setWindDegree(meteo.getWindDegree());
        meteoDto.setWindSpeed(meteo.getWindSpeed());
        return meteoDto;
    }
}
