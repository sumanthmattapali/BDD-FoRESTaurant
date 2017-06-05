package com.bdd.springcucumber;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * REST Controller for this API
 * @RestController is a convenience annotation that is itself annotated with @Controller and @ResponseBody.
 * Types that carry this annotation are treated as controllers where @RequestMapping methods assume @ResponseBody semantics by default.
 */
@RestController
public class RestaurantController {
    @RequestMapping(method={RequestMethod.GET},value={"/host/lookup"})
    public String greetCustomer() {
        return "Hello, welcome to FoRESTaurant!";
    }

    @RequestMapping(
            value = "/waiter/menu",
            method = RequestMethod.GET,
            headers = "Accept=application/json")
    @ResponseBody
    public String getMenuForCustomer() {
        return "Get some Foos with Header Old";
    }
}
