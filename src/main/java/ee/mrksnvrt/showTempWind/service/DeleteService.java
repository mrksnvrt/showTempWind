package ee.mrksnvrt.showTempWind.service;

import ee.mrksnvrt.showTempWind.dto.Weather;
import ee.mrksnvrt.showTempWind.repository.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeleteService {

    @Autowired
    WeatherRepo weatherRepo;
    public void deleteHistory() {
        weatherRepo.deleteAll();
    }
}
