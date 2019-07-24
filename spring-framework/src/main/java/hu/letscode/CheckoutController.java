package hu.letscode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckoutController {

    private final SomeInterface someInterface;

    public CheckoutController(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    @ResponseBody
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String test() {
        return someInterface.toString();
    }


}
