package ee.mrksnvrt.showTempWind.controller;


import ee.mrksnvrt.showTempWind.dto.WeatherData;
import ee.mrksnvrt.showTempWind.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RestController
public class AddController {

    @Autowired
    AddService tempWindService;
    //ADD SEARCH RESULTS TO SQL DATABASE
    //http://localhost:8080/api/weather/tempWind
    @CrossOrigin
    @PostMapping("api/weather/tempWind")
    public void showBalance(@RequestBody WeatherData weatherData) {
        tempWindService.addResultToDatabase(weatherData);
    }
}
