package CanteenSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String getIndex(Model model)
    {
        return "canteensystemWeb.index";
    }

    @RequestMapping(path = "/menu")
    public String getMenuPage(Model model)
    {
        return "canteensystemWeb.menu";
    }


}
