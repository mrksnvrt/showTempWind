package ee.mrksnvrt.showTempWind.controller;


import ee.mrksnvrt.showTempWind.dto.Weather;
import ee.mrksnvrt.showTempWind.dto.WeatherData;
import ee.mrksnvrt.showTempWind.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("api")
@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;
    //CITY NAME COMES INSIDE FROM FRONT INPUT AS JASON.
    //FROM CONTROLLER IT GOES TO SERVICE
    //http://localhost:8080/api/weather
    @PostMapping("/weather")
    public String getCityName(@RequestBody WeatherData weatherData) {
        return weatherService.weatherDataFromApi(weatherData);
    }

    //SHOW FULL PREVIOUS SEARCHING HISTORY
    //http://localhost:8080/api/showHistory
    @GetMapping("/showHistory")
    public List<Weather> showHistory() {
        return weatherService.getHistory();
    }

    //DELETE ALL SEARCHING HISTORY
    //http://localhost:8080/api/delete
    @DeleteMapping ("/delete")
    public void deleteHistory() {
        weatherService.deleteHistory();
    }

}






