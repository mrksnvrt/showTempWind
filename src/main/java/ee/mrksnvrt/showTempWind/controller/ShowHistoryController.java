package ee.mrksnvrt.showTempWind.controller;


import ee.mrksnvrt.showTempWind.dto.Weather;
import ee.mrksnvrt.showTempWind.service.ShowHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ShowHistoryController {

    @Autowired
    ShowHistoryService showHistory;

    //SHOW FULL PREVIOUS SEARCHING HISTORY
    //http://localhost:8080/api/weather/showHistory
    @CrossOrigin
    @GetMapping("api/weather/showHistory")
    public List<Weather> showHistory() {
        return showHistory.getHistory();
    }
}
