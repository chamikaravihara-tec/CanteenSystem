package CanteenSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class InventoryController {
    @Autowired
    private InventoryService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Inventory> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);

        return "canteensystemWeb/forms/index";
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String showNewProductPage(Model model) {
        Inventory product = new Inventory();
        model.addAttribute("product", product);

        return "canteensystemWeb/forms/New_Product";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_product");
        Inventory product = service.get(id);
        mav.addObject("product", product);

        return mav;
    }

    }

