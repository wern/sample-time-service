package de.mathema.sample.rest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeRestController {

    @GetMapping("/now")
    public String getTime(@RequestHeader Map<String, String> headers){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.YYYY - HH:mm:ss"));
    }

}
