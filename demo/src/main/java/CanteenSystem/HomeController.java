package CanteenSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String getIndex(Model model)
    {
        return "canteensystemWeb/index";
    }
<<<<<<< HEAD

 
=======
>>>>>>> 3eb99c0bd13df64a441f360c7f8926ee9a0e14c4


}
