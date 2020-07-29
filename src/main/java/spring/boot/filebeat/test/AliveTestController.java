package spring.boot.filebeat.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alive")
public class AliveTestController {

    private final static Logger logger = LoggerFactory.getLogger(AliveTestController.class);

    @RequestMapping(value = "/isAlive", produces = "application/json; charset=utf-8")
    public @ResponseBody
    String isAlive() throws Exception {
        return "Success";
    }
}