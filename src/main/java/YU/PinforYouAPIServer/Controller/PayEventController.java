package YU.PinforYouAPIServer.Controller;

import YU.PinforYouAPIServer.Service.PayEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayEventController {

    @Autowired
    PayEventService payEventService;
}
