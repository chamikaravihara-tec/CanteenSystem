package CanteenSystem;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;
    private InventoryService inventoryService;
    private TransactionService transactionService;
    private OrderService orderService;
    private InvoiceService invoiceService;

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

    //register user
    @PostMapping("/User_Create")
    public String addUser(@ModelAttribute("user") User user)
    {
        userService.addUser(user);
        return "redirect:/";
    }

    //register Inventory
    @PostMapping("/Create_Inventory")
    public String addInventory(@ModelAttribute("inventory") Inventory inventory)
    {
        inventoryService.addInventory(inventory);
        return "success";
    }

    //register Order
    @PostMapping("/Create_Order")
    public String addOrder(@ModelAttribute("order")CanteenSystem.Order order)
    {
      orderService.addOrder(order);
      return "Success";
    }

    //register Invoice
    @PostMapping("/Create_Invoice")
    public String addInvoice(@ModelAttribute("invoice")Invoice invoice)
    {
     invoiceService.addInvoice(invoice);
     return "success";
    }

    //View User
    @RequestMapping("/canteensystemWeb/forms/View_User")
    public String viewUser(Model model){
        List<User> users = userService.getAllUser();
        model.addAttribute("viewUser", users);

        return "canteensystemWeb/forms/View_User";
    }

    //View Inventory
    @RequestMapping("/canteensystemWeb/forms/View_Product")
    public String viewInventory(Model model){
        List<Inventory> inventory = inventoryService.getAllInventory();
        model.addAttribute("viewInventory",inventory);

        return "canteensystemWeb/forms/View_Product";
    }
    //View Order
    @RequestMapping("/canteensystemWeb/forms/View_Order")
    public String viewOrder(Model model){
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("viewOrders",orders);

        return "canteensystemWeb/forms/View_Order";
    }

    //View Invoice
    @RequestMapping("/canteensystemWeb/forms/View_Invoice")
    public String viewInvoice(Model model){
        List<Invoice> invoices = invoiceService.getAllInvoice();
        model.addAttribute("viewInvoices",invoices);

        return "canteensystemWeb/forms/View_Invoice";
    }

    //Delete user
    @RequestMapping("/canteensystemWeb/forms/Delete_User/{id}")
    public String deleteUser(@PathVariable("id") String id){
        boolean result = userService.deleteUser(id);
        if (result)
            return "redirect:/canteensystemWeb/forms/View_User";
        else
            return "redirect:/canteensystemWeb/forms/Delete_User";
    }

    //Update users
    //@PostMapping("/userUpdate")
    //public String getUpdateUser(@RequestParam("id") String id, @RequestParam("fname") String fname, @RequestParam("lname") Float lname, @RequestParam("username") String username ,@RequestParam("email") String email ,@RequestParam("phone") int phone){
        //userService.userUpdate(id, fname,lname,username,email,phone);
        //return "canteensystemWeb/forms/Edit_User";
    //}





    @RequestMapping("/View_User")
    public String getAllUsers(Model model) { return "canteensystemWeb/forms/View_User"; }

    @GetMapping("/User_Create")
    public String getCreateUser(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "canteensystemWeb/forms/User_Create";
    }

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

    @GetMapping("/New_Product")
    public String getNewProduct(Model model)
    {
        Inventory inventory= new Inventory();
        model.addAttribute("inventory",inventory);
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
    @RequestMapping("/View_Food")
    public String getAllFood(Model model){ return "canteensystemWeb/forms/View_Food";}

    @RequestMapping("/Delete_Food")
    public String getDeleteFood(Model model){ return "canteensystemWeb/forms/Delete_Food";}

    @RequestMapping("/Edit_Food")
    public String getEditFood(Model model){ return "canteensystemWeb/forms/Edit_Food";}

    @RequestMapping("/New_Food")
    public String getNewFood(Model model){return "canteensystemWeb/forms/New_Food";}

    @RequestMapping("/View_Order")
    public String getAllOrder(Model model){ return "canteensystemWeb/forms/View_Order";}

    @GetMapping("/Create_Order")
    public String getNewOrder(Model model){

        CanteenSystem.Order order = new CanteenSystem.Order();
        model.addAttribute("order",order);
        return "canteensystemWeb/forms/Create_Order";

    }

    @RequestMapping("/Edit_Order")
    public String getEditOrder(Model model){ return "canteensystemWeb/forms/Edit_Order";}

    @RequestMapping("/Delete_Order")
    public String getDeleteOrder(Model model){ return "canteensystemWeb/forms/Delete_Order";}

    @RequestMapping("/View_Invoice")
    public String getAllInvoice(Model model){ return "canteensystemWeb/forms/View_Invoice";}

    @RequestMapping("/Invoice")
    public String getNewInvoice(Model model){

        Invoice invoice = new Invoice();
        model.addAttribute("invoice",invoice);
        return "canteensystemWeb/forms/Invoice";
    }

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
