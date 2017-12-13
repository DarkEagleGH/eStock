package core.controller;

import core.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/adminpanel")
public class Admin {
    private MainService mainService;

    @Autowired
    public Admin(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public
    String getRootPage() {
        return "tiles.adminpanel";
    }
}
