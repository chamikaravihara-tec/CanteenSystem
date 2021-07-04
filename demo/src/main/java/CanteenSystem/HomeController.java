package CanteenSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/Login" )
    public String getLogin(Model model)
    {
        return "canteensystemWeb/forms/Login";
    }
    @RequestMapping("/" )
    public String getIndex(Model model)
    {
        return "canteensystemWeb/index";
    }

    @RequestMapping("/User_Create")
    public String getCreateUser(Model model){return "canteensystemWeb/forms/User_Create";}

    @RequestMapping("/Menu")
        public String getMenu(Model model)
    {
        return "canteensystemWeb/menu";
    }

    @RequestMapping("/Contact")
    public String getOrder(Model model)
    {
        return "canteensystemWeb/contact";
    }


}
