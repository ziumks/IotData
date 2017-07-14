package Controller;

import Model.TemperatureHumidity;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 안재열 on 2017-07-14.
 */
@RestController
public class iotRestCnt {

    private Logger log = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/data",method = RequestMethod.POST)
    public TemperatureHumidity data(@RequestParam("temperature") String temperature, @RequestParam("humidity")String humidity){

        TemperatureHumidity th = new TemperatureHumidity(temperature,humidity);
        log.info(th.toString());
        return th;
    }
}
