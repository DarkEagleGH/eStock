package core.controller;

import core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class TestController {
    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String getResponseBody() {
        return testService.getMessage();
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public @ResponseBody
    List getItems() {
        return testService.getItems();
    }

    @RequestMapping(value = "/mans", method = RequestMethod.GET)
    public @ResponseBody
    List getMans() {
        return testService.getManufacturers();
    }

    @RequestMapping(value = "/cats", method = RequestMethod.GET)
    public @ResponseBody
    List getCats() {
        return testService.getCategories();
    }

}
