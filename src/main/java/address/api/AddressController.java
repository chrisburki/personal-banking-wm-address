package address.api;

import address.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@CrossOrigin
@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="", method = RequestMethod.GET)
    public Address findCustomer(@RequestParam("key") String key) {

        final String street = "Untedorf 5";
        final String place = "Aeugst am Albis";
        final String plz = "8914";

        return new Address(counter.incrementAndGet(), key, street, place, plz);
    }

    @RequestMapping(value="/ready", method = RequestMethod.GET)
    public Address readyCustomer() {

        final String key = "RDY";
        final String street = "Ready 5";
        final String place = "Ready";
        final String plz = "2000";

        return new Address(counter.incrementAndGet(), key, street, place, plz);
    }

}
