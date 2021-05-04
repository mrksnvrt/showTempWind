package ee.mrksnvrt.showTempWind.service;
import ee.mrksnvrt.showTempWind.dto.Weather;
import ee.mrksnvrt.showTempWind.dto.WeatherData;
import ee.mrksnvrt.showTempWind.repository.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AddService {

    @Autowired
    WeatherRepo weatherRepo;
    //CITY/TEMPERATURE/WINDSPEED&DEG
    public void addResultToDatabase(WeatherData weatherData) {
        //NEW OBJECT
        Weather weather = new Weather();
        weather.setCityName(weatherData.getCityName());
        weather.setTemperature(weatherData.getTemperature());
        weather.setWindSpeed(weatherData.getWindSpeed());
        weather.setWindDeg(weatherData.getWindDeg());
        weather.setDate(LocalDateTime.now());
        weatherRepo.save(weather);
    }
}


