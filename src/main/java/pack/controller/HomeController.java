package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pack.Service.PlainService;

@Controller
public class HomeController {

    @Autowired
    PlainService plainService;

    @GetMapping(value = "/")
    public String homePage() {
        return "login";
    }

    @GetMapping(value = "/showAll")
    public String showAll(ModelMap modelMap) {
        modelMap.addAttribute("showAll", plainService.findAllPlains());
        return "login";
    }

    @GetMapping(value = "/capacity")
    public String capacity(ModelMap modelMap) {
        modelMap.addAttribute("capacity", plainService.getCapacity());
        return "login";
    }

    @GetMapping(value = "/c_capacity")
    public String C_capacity(ModelMap modelMap) {
        modelMap.addAttribute("c_capacity", plainService.getC_capacity());
        return "login";
    }

    @GetMapping(value = "/sorted_plains")
    public String sortedPlains(ModelMap modelMap) {
        modelMap.addAttribute("sorted_plains", plainService.sortedPlains());
        return "login";
    }

    @PostMapping(value = "/findPlain")
    public String findByCons(@RequestParam String min, @RequestParam String max, ModelMap modelMap) {
        int x1 = 0, x2 = 0;
        try {
            x1 = Integer.parseInt(min);
            x2 = Integer.parseInt(max);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
        modelMap.addAttribute("plains", plainService.getByFconsume(x1, x2));
        return "login";
    }


}
