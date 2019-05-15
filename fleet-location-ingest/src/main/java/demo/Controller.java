package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    //private MessageChannel output;
    private Source source;

    @RequestMapping(path = "/api/locations", method = RequestMethod.POST)
    public void locations(@RequestBody String positionInfo) {
        // this.output.send(MessageBuilder.withPayload(positionInfo).build());
        this.source.output().send(MessageBuilder.withPayload(positionInfo).build());
    }
}
