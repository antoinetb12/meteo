package me.dcal.meteo.control;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.dcal.meteo.model.StationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import me.dcal.meteo.model.Station;
import me.dcal.meteo.service.MeteoService;

@RestController
public class MeteoController {
    @Autowired
    MeteoService meteoService;


    @GetMapping(path = "/stations", produces = "application/json")
    @ResponseBody
    public List<StationDto> getStations() {
        List<StationDto> stations = meteoService.getStations();
        return stations;
    }

    @GetMapping(path = "/station/{id}", produces = "application/json")
    @ResponseBody
    public StationDto getStation(@PathVariable String id) {
        StationDto station = meteoService.getStation(Integer.parseInt(id));
        return station;
    }
}
