package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/validate", method= RequestMethod.POST)
    public boolean validate(@RequestBody User user) {
        if(user.getLoginId().equals("demo") && user.getPassWord().equals("pwd123") ){
            return true;
        }
        return false;
    }
}
