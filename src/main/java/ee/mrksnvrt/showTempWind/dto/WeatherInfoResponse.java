package ee.mrksnvrt.showTempWind.dto;

public class WeatherInfoResponse {


    private Main main;
    private Wind wind;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public static class Main {
        private String temp;

        public String getTemp(){ return temp;}

        public void setTemp(String temp) {this.temp = temp; }
    }

    public static class Wind {
        private String speed;
        private String deg;

        public String getSpeed() { return speed;}
        public void setSpeed(String speed) {this.speed = speed; }

        public String getDeg() { return  deg;}
        public  void setDeg(String deg) {this.deg = deg;}
    }


}
