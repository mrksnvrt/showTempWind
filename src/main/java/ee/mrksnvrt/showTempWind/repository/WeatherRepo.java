package ee.mrksnvrt.showTempWind.repository;

import ee.mrksnvrt.showTempWind.dto.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepo extends JpaRepository<Weather, Integer>{

}
