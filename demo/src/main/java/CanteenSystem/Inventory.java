package CanteenSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


    @Entity
    public class Inventory {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long product_id;
        private String product_name;
        private String quantity;
        private String supplier_name;
        private double supply_date;
        private double manufacture_date;
        private double expire_date;
        private float price;
        private String image;



        public Long getId() {
            return product_id;
        }

        public void setId(Long id) {
            this.product_id = id;
        }

        public String getName() {
            return product_name;
        }

        public void setName(String name) {
            this.product_name = name;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getSupplier_name() {
            return supplier_name;
        }

        public void setSupplier_name(String supplier_name) {
            this.supplier_name = supplier_name;
        }

        public double getSupply_date() {
            return supply_date;
        }

        public void setSupply_date(double supply_date) {
            this.supply_date = supply_date;
        }

        public double getManufacture_date() {
            return manufacture_date;
        }

        public void setManufacture_date(double manufacture_date) {
            this.manufacture_date = manufacture_date;
        }

        public double getExpire_date() {
            return expire_date;
        }

        public void setExpire_date(double expire_date) {
            this.expire_date = expire_date;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

