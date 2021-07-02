package CanteenSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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

        return "index";
    }

    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        Inventory product = new Inventory();
        model.addAttribute("product", product);

        return "new_product";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editProduct(@ModelAttribute("product") Inventory product) {


        return "Edit_Product";
    }

    }

