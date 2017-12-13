package core.controller;

import core.model.FiltersBundle;
import core.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class Customer {
    private MainService mainService;

    @Autowired
    public Customer(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getFullList() {
        ModelAndView modelAndView = new ModelAndView("tiles.customer");
        modelAndView.addObject("itemsList", mainService.getAllItems());
//        modelAndView.addObject("manufacturersList", testService.getAllManufacturers());
//        modelAndView.addObject("categoriesList", testService.getAllCategories());
        modelAndView.addObject("filtersBundle", mainService.prepareNewBundle());
        return modelAndView;
    }

    @RequestMapping(value = "/filter", method = RequestMethod.POST)
    public ModelAndView getFilteredList(@ModelAttribute("filtersBundle") FiltersBundle bundle) {
        ModelAndView modelAndView = new ModelAndView("tiles.customer");

        modelAndView.addObject("itemsList", mainService.getAllItems());
//        modelAndView.addObject("itemsList", testService.getFilteredItems(bundle));
//        modelAndView.addObject("manufacturersList", testService.getAllManufacturers());
//        modelAndView.addObject("categoriesList", testService.getAllCategories());
        modelAndView.addObject("filtersBundle", bundle);
        return modelAndView;
    }
}
