package CanteenSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.math.BigInteger;
import java.sql.Blob;
import java.util.Date;


@Entity
    public class Inventory {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer intem_id;
        private String item_name;
        private Integer quantity;
        private Double price;
        private Date expired_date;
        private String supplier_name;
        private Date supply_date;
        private Date manufactured_date;
        private String product_name;
        private Blob image;

    public Integer getIntem_id() {
        return intem_id;
    }

    public void setIntem_id(Integer intem_id) {
        this.intem_id = intem_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getExpired_date() {
        return expired_date;
    }

    public void setExpired_date(Date expired_date) {
        this.expired_date = expired_date;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public Date getSupply_date() {
        return supply_date;
    }

    public void setSupply_date(Date supply_date) {
        this.supply_date = supply_date;
    }

    public Date getManufactured_date() {
        return manufactured_date;
    }

    public void setManufactured_date(Date manufactured_date) {
        this.manufactured_date = manufactured_date;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
    
}

