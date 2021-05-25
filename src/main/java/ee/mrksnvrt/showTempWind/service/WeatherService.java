package ee.mrksnvrt.showTempWind.service;

import ee.mrksnvrt.showTempWind.dto.Weather;
import ee.mrksnvrt.showTempWind.dto.WeatherData;
import ee.mrksnvrt.showTempWind.dto.WeatherInfoResponse;
import ee.mrksnvrt.showTempWind.repository.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WeatherService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    WeatherRepo weatherRepo;

    //THROUGH OPENWEATHERMAP WE ARE ASKING WEATHER FORECAST FOR THE CITY WHICH CAME INSIDE FROM CONTROLLER.
    //FUNCTION IS RETURNING WEATHER DATA AND ALSO ADDING TO DATABASE TEMP WIND AND DATE.
    public String weatherDataFromApi(WeatherData weatherData) {
        //GETTING DATA FROM API;
        ResponseEntity<WeatherInfoResponse> responseEntity = restTemplate.getForEntity("http://api.openweathermap.org/data/2.5/weather?q=" + weatherData.getCityName() + "&appid=a8775018b559279894847e4fe88bcd30" + "&units=metric", WeatherInfoResponse.class);
        if (true) {
            //FROM WEATHERINFORESPONSE YOU CAN MODIFY WHAT YOU WANT TO GET FROM JASON WHICH COMES FROM API RESPONSE;
            WeatherInfoResponse body = responseEntity.getBody();
            String temp = body.getMain().getTemp();
            String deg = body.getWind().getDeg();
            String speed = body.getWind().getSpeed();
            //NEW OBJECT
            Weather weather = new Weather();
            weather.setCityName(weatherData.getCityName());
            weather.setTemperature(temp);
            weather.setWindSpeed(speed);
            weather.setWindDeg(deg);
            weather.setDate(LocalDateTime.now());
            weatherRepo.save(weather);
            return "Hello there! Temperature in " + weatherData.getCityName() + " is " + temp + "C and wind parameters are = " + speed + "m/s and " + deg + " degrees" ;
        } else {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }

    //SHOW ALL PREVIOUS SEARCH HISTORY
    public List<Weather> getHistory() {
        return weatherRepo.findAll();
    }

    //DELETE ALL PREVIOUS SEARCH HISTORY
    public void deleteHistory() {
        weatherRepo.deleteAll();
    }
}






