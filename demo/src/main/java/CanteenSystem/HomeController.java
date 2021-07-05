package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/Login")
    public String getLogin(Model model) {
        return "canteensystemWeb/forms/Login";
    }

    @RequestMapping("/")
    public String getIndex(Model model) {
        return "canteensystemWeb/index";
    }

    //Login User
    @PostMapping("/Login")
    public String login(@RequestParam("email") String u_email, @RequestParam("password") String u_password) {
        User user = userService.loginUser(u_email, u_password);
        if (Objects.nonNull(user)) {
            String u_usertype = user.getUsertype();
            if (u_usertype == "Admin") {
                return "canteensystemWeb/admin";
            } else if (u_usertype == "Staff") {
                return "canteensystemWeb/home";
            } else if (u_usertype == "Student") {
                return "canteensystemWeb/home";
            } else {
                return "canteensystemWeb/owner";
            }

        } return "";
    }




    @RequestMapping("/View_User")
    public String getAllUsers(Model model) { return "canteensystemWeb/forms/View_User"; }

    @RequestMapping("/User_Create")
    public String getCreateUser(Model model){return "canteensystemWeb/forms/User_Create";}

    @RequestMapping("/User_Update")
    public String getUpdateUser(Model model)
    {
        return "canteensystemWeb/forms/Edit_User";
    }

    @RequestMapping("/User_Delete")
    public String getDeleteUser(Model model)
    {
        return "canteensystemWeb/forms/Delete_User";
    }

    @RequestMapping("/View_Product")
    public String getAllProduct(Model model) {return "canteensystemWeb/forms/View_Product"; }

    @RequestMapping("/New_Product")
    public String getNewProduct(Model model)
    {
        return "canteensystemWeb/forms/New_Product";
    }

    @RequestMapping("/Edit_Product")
    public String getEditProduct(Model model)
    {
        return "canteensystemWeb/forms/Edit_Product";
    }

    @RequestMapping("/Delete_Product")
    public String getDeleteProduct(Model model)
    {
        return "canteensystemWeb/forms/Delete_product";
    }

    @RequestMapping("/View_Order")
    public String getAllOrder(Model model){ return "canteensystemWeb/forms/View_Order";}

    @RequestMapping("/Create_Order")
    public String getNewOrder(Model model){ return "canteensystemWeb/forms/Create_Order";}

    @RequestMapping("/Edit_Order")
    public String getEditOrder(Model model){ return "canteensystemWeb/forms/Edit_Order";}

    @RequestMapping("/Delete_Order")
    public String getDeleteOrder(Model model){ return "canteensystemWeb/forms/Delete_Order";}

    @RequestMapping("/View_Invoice")
    public String getAllInvoice(Model model){ return "canteensystemWeb/forms/View_Invoice";}

    @RequestMapping("/Invoice")
    public String getNewInvoice(Model model){ return "canteensystemWeb/forms/Invoice";}

    @RequestMapping("/Edit_Invoice")
    public String getEditInvoice(Model model){ return "canteensystemWeb/forms/Edit_Invoice";}

    @RequestMapping("/Delete_invoice")
    public String getDeleteInvoice(Model model){ return "canteensystemWeb/forms/Delete_Invoice";}

    @RequestMapping("/Logout")
    public String getLogOut(Model model) { return "canteensystemWeb/index"; }

    @RequestMapping("/Menu")
        public String getMenu(Model model) { return "canteensystemWeb/menu"; }

    @RequestMapping("/Contact")
    public String getOrder(Model model) { return "canteensystemWeb/contact"; }

    @RequestMapping("/Account")
    public String getAccount(Model model) { return "canteensystemWeb/account"; }

    @RequestMapping("/Inventory")
    public String getInventory(Model model) { return "canteensystemWeb/inventory"; }

    @RequestMapping("/Admin")
    public String getAdmin(Model model) { return "canteensystemWeb/admin"; }

    @RequestMapping("/invoice")
    public String getInvoice(Model model){ return "canteensystemWeb/invoice";}

    @RequestMapping("/Order")
    public String getOrderPage(Model model){ return "canteensystemWeb/order";}

    @RequestMapping("/Home")
    public String getUser(Model model) { return "canteensystemWeb/home"; }

    @RequestMapping("/CanteenOwner")
    public String getOwner(Model model) { return "canteensystemWeb/owner"; }



}
