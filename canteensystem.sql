-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 05, 2021 at 04:51 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `canteensystem`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `add_canteen_owner` (`owner_id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `start_date` DATE, `end_date` DATE, `email` VARCHAR(30), `phone` INT)  BEGIN
insert into canteen_owner(owner_id,fname,lname,username,start_date,end_date,email,phone) values (owner_id,fname,lname,username,start_date,end_date,email,phone);

insert into user(id,fname,lname,username,email,phone) values (owner_id,fname,lname,username,email,phone);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `add_invoice` (`invoice_id` VARCHAR(20), `user_id` VARCHAR(20), `food_id` VARCHAR(20), `invoice_date` DATE, `invoice_time` TIME, `total` DECIMAL)  BEGIN

insert into invoice(invoice_id,user_id,food_id,invoice_date,invoice_time,total) values (invoice_id,user_id,food_id,invoice_date,invoice_time,total);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `add_user` (`id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `email` VARCHAR(30), `phone` INT)  BEGIN
insert into user(id,fname,lname,username,email,phone) values (admin_id,fname,lname,username,email,phone);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `add_useradmins` (`admin_id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `position` VARCHAR(10), `email` VARCHAR(30), `phone` INT)  BEGIN
insert into admin(admin_id,fname,lname,username,position,email,phone) values (admin_id,fname,lname,username,position,email,phone);
insert into user(id,fname,lname,username,email,phone) values (admin_id,fname,lname,username,email,phone);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_admin` (IN `admin_id` VARCHAR(20))  BEGIN

DELETE FROM user where id=admin_id;

DELETE FROM admin where admin_id=admin_id; 

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_user` (IN `id` VARCHAR(20))  BEGIN
DELETE FROM user WHERE id=id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllFoods` ()  BEGIN

select  *  from food;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_foods` (IN `f_id` VARCHAR(20), `item_id` VARCHAR(20), `f_name` VARCHAR(30), `type` VARCHAR(30), `category` VARCHAR(30), `quantity` INT, `price` DECIMAL, `meal_time` TIME)  BEGIN
insert into food(foods_id,intem_id,food_name,type,category,quantity,price,meal_time) values (f_id,item_id,f_name,type,category,quantity,price,meal_time) ;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_inventory` (`item_id` VARCHAR(20), `item_name` VARCHAR(20), `quantity` INT, `price` DECIMAL, `expired_date` DATE, `supplier_name` VARCHAR(30), `supply_date` DATE, `manufactured_date` DATE)  BEGIN
insert into inventory(intem_id,item_name,quantity,price,expired_date,supplier_name,supply_date,manufactured_date) values (intem_id,item_name,quantity,price,expired_date,supplier_name,supply_date,manufactured_date);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_staff` (`staff_id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `cube_no` VARCHAR(10), `position` VARCHAR(20), `email` VARCHAR(30), `phone` INT)  BEGIN
insert into staff(staff_id,fname,lname,username,cube_no,position,email,phone) values (staff_id,fname,lname,username,cube_no,position,email,phone) ;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_student` (`stu_id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `year` DATE, `room_no` INT, `email` VARCHAR(30), `phone` INT)  insert into student(stu_id,fname,lname,username,year,room_no,email,phone) values (stu_id,fname,lname,username,year,room_no,email,phone) ;$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_admin` (`admin_id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `position` VARCHAR(10), `email` VARCHAR(30), `phone` INT)  BEGIN
UPDATE admin SET 
admin_id=admin_id,
fname=fname,
lname=lname,
username=username,
position=position,
email=email,
phone=phone
WHERE admin_id=admin_id;

UPDATE user SET id=admin_id,
fname=fname,
lname=lname,
username=username,
email=email,
phone=phone
WHERE id=admin_id;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_canteen_owner` (`owner_id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `start_date` DATE, `end_date` DATE, `email` VARCHAR(30), `phone` INT)  BEGIN
UPDATE canteen_owner SET 
owner_id=owner_id,
fname=fname,
lname=lname,
username=username,
start_date=start_date,
end_date=end_date,
email=email,
phone=phone
where owner_id=owner_id;

UPDATE user SET id=owner_id,
fname=fname,
lname=lname,
username=username,
email=email,
phone=phone WHERE id=owner_id;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_food` (`foods_id` VARCHAR(20), `intem_id` VARCHAR(20), `food_name` VARCHAR(30), `type` VARCHAR(30), `category` VARCHAR(30), `quantity` INT, `price` DECIMAL, `meal_time` TIME)  BEGIN
UPDATE food SET
foods_id=foods_id,
intem_id=intem_id,
food_name=food_name,
type=type,
category=category,
quantity=quantity,
price=price,
meal_time=meal_time
where foods_id=foods_id;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_inventory` (`intem_id` VARCHAR(20), `item_name` VARCHAR(20), `quantity` INT, `price` DECIMAL, `expired_date` DATE, `supplier_name` VARCHAR(30), `supply_date` DATE, `manufactured_date` DATE)  BEGIN
UPDATE inventory SET
intem_id=intem_id,
item_name=item_name,
quantity=quantity,
price=price,
expired_date=expired_date,
supplier_name=supplier_name,
supply_date=supply_date,
manufactured_date=manufactured_date
WHERE
intem_id=intem_id;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_invoice` (`invoice_id` VARCHAR(20), `user_id` VARCHAR(20), `food_id` VARCHAR(20), `invoice_date` DATE, `invoice_time` TIME, `total` DECIMAL)  BEGIN
UPDATE invoice SET
invoice_id=invoice_id,
user_id=user_id,
food_id=food_id,
invoice_date=invoice_date,
invoice_time=invoice_time
WHERE
invoice_id=invoice_id;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_orders` (`order_id` VARCHAR(10), `user_id` VARCHAR(20), `order_time` TIME, `order_date` DATE, `total` DECIMAL)  BEGIN
UPDATE orders SET 
order_id=order_id,
user_id=user_id,
order_time=order_time,
order_date=order_date
WHERE
order_id=order_id;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_staff` (`staff_id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `cube_no` VARCHAR(10), `position` VARCHAR(20), `email` VARCHAR(30), `phone` INT)  BEGIN
UPDATE staff SET
staff_id=staff_id,
fname=fname,
lname=lname,
username=username,
cube_no=cube_no,
position=position,
email=email,
phone=phone
WHERE 
staff_id=staff_id;

UPDATE user SET id=staff_id,
fname=fname,
lname=lname,
username=username,
email=email,
phone=phone
WHERE id=staff_id;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_student` (`stu_id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `year` DATE, `room_no` INT, `email` VARCHAR(30), `phone` INT)  BEGIN
UPDATE student SET
stu_id=stu_id,
fname=fname,
lname=lname,
username=username,
year=year,
room_no=room_no,
email=email,
phone=phone
WHERE 
stu_id=stu_id;

UPDATE user SET id=stu_id,
fname=fname,
lname=lname,
username=username,
email=email,
phone=phone
WHERE id=stu_id;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_user` (`id` VARCHAR(20), `fname` VARCHAR(30), `lname` VARCHAR(30), `username` VARCHAR(30), `email` VARCHAR(30), `phone` INT)  BEGIN

UPDATE user SET id=id,
fname=fname,
lname=lname,
username=username,
email=email,
phone=phone
WHERE id=id;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` varchar(20) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `position` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `canteen_owner`
--

CREATE TABLE `canteen_owner` (
  `owner_id` varchar(20) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `canteen_owner`
--

INSERT INTO `canteen_owner` (`owner_id`, `fname`, `lname`, `username`, `start_date`, `end_date`, `email`, `phone`) VALUES
('owner123', 'tharindu', 'madusanka', 'yyyy455', '2018-12-12', '2025-12-15', 'tharindu@gmail.com', 758244555);

-- --------------------------------------------------------

--
-- Stand-in structure for view `check_inventory`
-- (See below for the actual view)
--
CREATE TABLE `check_inventory` (
`item_name` varchar(20)
,`quantity` int(11)
,`price` decimal(10,0)
,`expired_date` date
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `display_invoice_details`
-- (See below for the actual view)
--
CREATE TABLE `display_invoice_details` (
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `display_orders`
-- (See below for the actual view)
--
CREATE TABLE `display_orders` (
`order_id` varchar(10)
,`username` varchar(30)
,`phone` int(11)
,`order_time` time
,`order_date` date
);

-- --------------------------------------------------------

--
-- Table structure for table `food`
--

CREATE TABLE `food` (
  `foods_id` varchar(20) NOT NULL,
  `intem_id` varchar(20) DEFAULT NULL,
  `food_name` varchar(30) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `category` varchar(30) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `meal_time` time DEFAULT NULL,
  `image` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `food_item`
--

CREATE TABLE `food_item` (
  `food_id` bigint(20) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `food_name` varchar(255) DEFAULT NULL,
  `food_type` varchar(255) DEFAULT NULL,
  `item_id` bigint(20) NOT NULL,
  `meal_time` varchar(255) DEFAULT NULL,
  `price` float NOT NULL,
  `quantity` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `intem_id` varchar(20) NOT NULL,
  `item_name` varchar(20) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `expired_date` date DEFAULT NULL,
  `supplier_name` varchar(30) DEFAULT NULL,
  `supply_date` date DEFAULT NULL,
  `manufactured_date` date DEFAULT NULL,
  `image` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `inventory_log`
--

CREATE TABLE `inventory_log` (
  `log_id` int(11) NOT NULL,
  `intem_id` varchar(20) DEFAULT NULL,
  `data` varchar(250) DEFAULT NULL,
  `user` varchar(50) DEFAULT NULL,
  `operation` varchar(8) DEFAULT NULL,
  `changed_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `invoice_id` varchar(20) NOT NULL,
  `user_id` varchar(20) DEFAULT NULL,
  `food_id` varchar(20) DEFAULT NULL,
  `invoice_date` date DEFAULT NULL,
  `invoice_time` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `item_log`
--

CREATE TABLE `item_log` (
  `log_id` int(11) NOT NULL,
  `item_id` varchar(6) DEFAULT NULL,
  `data` varchar(250) DEFAULT NULL,
  `user` varchar(50) DEFAULT NULL,
  `operation` varchar(8) DEFAULT NULL,
  `changed_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` varchar(10) NOT NULL,
  `user_id` varchar(20) DEFAULT NULL,
  `order_time` time DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Triggers `orders`
--
DELIMITER $$
CREATE TRIGGER `delete_order_trigger` BEFORE DELETE ON `orders` FOR EACH ROW BEGIN
UPDATE `inventory` SET `quantity`= (`quantity`+ OLD.`quantity`) WHERE `item_id` = OLD.`item_id` ;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `inv_insert_order_trigger` AFTER INSERT ON `orders` FOR EACH ROW BEGIN
UPDATE `inventory` SET `quantity`= (`quantity`- NEW.`quantity`) WHERE `item_id` = NEW.`item_id` ;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `inv_update_order_trigger` AFTER UPDATE ON `orders` FOR EACH ROW BEGIN
UPDATE `inventory` SET `quantity`= (`quantity`- NEW.`quantity`) WHERE `item_id` = NEW.`item_id` ;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `order_log`
--

CREATE TABLE `order_log` (
  `log_id` int(11) NOT NULL,
  `order_id` varchar(20) DEFAULT NULL,
  `order_details` varchar(250) DEFAULT NULL,
  `user` varchar(50) DEFAULT NULL,
  `operation` varchar(8) DEFAULT NULL,
  `changed_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` varchar(20) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `cube_no` varchar(10) DEFAULT NULL,
  `position` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `stu_id` varchar(20) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `year` date DEFAULT NULL,
  `room_no` int(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transaction_id` int(11) NOT NULL,
  `intem_id` varchar(255) DEFAULT NULL,
  `order_amount` float DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `transaction_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transactions_summary`
--

CREATE TABLE `transactions_summary` (
  `id` int(11) NOT NULL,
  `transaction_date` date DEFAULT NULL,
  `total_amount` float DEFAULT NULL,
  `transactions_count` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaction_log`
--

CREATE TABLE `transaction_log` (
  `log_id` int(11) NOT NULL,
  `transaction_id` int(11) DEFAULT NULL,
  `transaction_details` varchar(250) DEFAULT NULL,
  `user` varchar(50) DEFAULT NULL,
  `operation` varchar(8) DEFAULT NULL,
  `changed_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` varchar(20) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user_log`
--

CREATE TABLE `user_log` (
  `id` int(11) NOT NULL,
  `user_details` varchar(250) DEFAULT NULL,
  `user` varchar(50) DEFAULT NULL,
  `operation` varchar(8) DEFAULT NULL,
  `changed_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_inventory`
-- (See below for the actual view)
--
CREATE TABLE `view_inventory` (
`intem_id` varchar(20)
,`item_name` varchar(20)
,`price` decimal(10,0)
,`quantity` int(11)
,`manufactured_date` date
,`expired_date` date
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_users`
-- (See below for the actual view)
--
CREATE TABLE `view_users` (
`id` varchar(20)
,`fname` varchar(30)
,`lname` varchar(30)
,`username` varchar(30)
,`email` varchar(30)
,`phone` int(11)
);

-- --------------------------------------------------------

--
-- Structure for view `check_inventory`
--
DROP TABLE IF EXISTS `check_inventory`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `check_inventory`  AS  select `inventory`.`item_name` AS `item_name`,`inventory`.`quantity` AS `quantity`,`inventory`.`price` AS `price`,`inventory`.`expired_date` AS `expired_date` from `inventory` ;

-- --------------------------------------------------------

--
-- Structure for view `display_invoice_details`
--
DROP TABLE IF EXISTS `display_invoice_details`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `display_invoice_details`  AS  select `invoice`.`invoice_id` AS `invoice_id`,`food`.`food_name` AS `food_name`,`invoice`.`total` AS `total` from (`food` join `invoice` on(`invoice`.`food_id` = `invoice`.`food_id`)) ;

-- --------------------------------------------------------

--
-- Structure for view `display_orders`
--
DROP TABLE IF EXISTS `display_orders`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `display_orders`  AS  select `orders`.`order_id` AS `order_id`,`user`.`username` AS `username`,`user`.`phone` AS `phone`,`orders`.`order_time` AS `order_time`,`orders`.`order_date` AS `order_date` from (`user` join `orders` on(`user`.`id` = `orders`.`order_id`)) ;

-- --------------------------------------------------------

--
-- Structure for view `view_inventory`
--
DROP TABLE IF EXISTS `view_inventory`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_inventory`  AS  select `inventory`.`intem_id` AS `intem_id`,`inventory`.`item_name` AS `item_name`,`inventory`.`price` AS `price`,`inventory`.`quantity` AS `quantity`,`inventory`.`manufactured_date` AS `manufactured_date`,`inventory`.`expired_date` AS `expired_date` from `inventory` ;

-- --------------------------------------------------------

--
-- Structure for view `view_users`
--
DROP TABLE IF EXISTS `view_users`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_users`  AS  select `user`.`id` AS `id`,`user`.`fname` AS `fname`,`user`.`lname` AS `lname`,`user`.`username` AS `username`,`user`.`email` AS `email`,`user`.`phone` AS `phone` from `user` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `canteen_owner`
--
ALTER TABLE `canteen_owner`
  ADD PRIMARY KEY (`owner_id`);

--
-- Indexes for table `food`
--
ALTER TABLE `food`
  ADD PRIMARY KEY (`foods_id`);

--
-- Indexes for table `food_item`
--
ALTER TABLE `food_item`
  ADD PRIMARY KEY (`food_id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`intem_id`);

--
-- Indexes for table `inventory_log`
--
ALTER TABLE `inventory_log`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`invoice_id`);

--
-- Indexes for table `item_log`
--
ALTER TABLE `item_log`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `order_log`
--
ALTER TABLE `order_log`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`stu_id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transaction_id`);

--
-- Indexes for table `transactions_summary`
--
ALTER TABLE `transactions_summary`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaction_log`
--
ALTER TABLE `transaction_log`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_log`
--
ALTER TABLE `user_log`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `food_item`
--
ALTER TABLE `food_item`
  MODIFY `food_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `inventory_log`
--
ALTER TABLE `inventory_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `item_log`
--
ALTER TABLE `item_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `order_log`
--
ALTER TABLE `order_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `transaction_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `transactions_summary`
--
ALTER TABLE `transactions_summary`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `transaction_log`
--
ALTER TABLE `transaction_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user_log`
--
ALTER TABLE `user_log`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

DELIMITER $$
--
-- Events
--
CREATE DEFINER=`root`@`localhost` EVENT `daily_transaction_summery` ON SCHEDULE EVERY 1 DAY STARTS '2021-07-02 23:59:55' ON COMPLETION PRESERVE ENABLE DO INSERT INTO `transaction`(`transaction_date`, `total_amount`) VALUES (DATE(NOW()), calculate_transaction_summery())$$

DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
