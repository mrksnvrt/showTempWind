package ee.mrksnvrt.showTempWind.controller;


import ee.mrksnvrt.showTempWind.dto.Weather;
import ee.mrksnvrt.showTempWind.service.DeleteService;
import ee.mrksnvrt.showTempWind.service.ShowHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DeleteController {

    @Autowired
    DeleteService deleteService;

    //DELETE ALL SEARCHING HISTORY
    //http://localhost:8080/api/weather/delete
    @CrossOrigin
    @GetMapping("api/weather/delete")
    public void deleteHistory() {
         deleteService.deleteHistory();
    }
}
