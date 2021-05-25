package ee.mrksnvrt.showTempWind.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class Weather {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Integer id;
        private String cityName;
        private String temperature;
        private String windSpeed;
        private String windDeg;
        private LocalDateTime date;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getCityName() {
                return cityName;
        }

        public void setCityName(String cityName) {
                this.cityName = cityName;
        }

        public String getTemperature() {
                return temperature;
        }

        public void setTemperature(String temperature) {
                this.temperature = temperature;
        }

        public String getWindSpeed() {
                return windSpeed;
        }

        public void setWindSpeed(String windSpeed) {
                this.windSpeed = windSpeed;
        }

        public String getWindDeg() {
                return windDeg;
        }

        public void setWindDeg(String windDeg) {
                this.windDeg = windDeg;
        }

        public LocalDateTime getDate() {
                return date;
        }

        public void setDate(LocalDateTime date) {
                this.date = date;
        }
}
