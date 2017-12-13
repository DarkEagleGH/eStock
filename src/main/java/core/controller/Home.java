package core.controller;

import core.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {
    private MainService mainService;

    @Autowired
    public Home(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
    public String showHomePage() {
        return "tiles.home";
    }
}
