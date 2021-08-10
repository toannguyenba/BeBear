-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: us-cdbr-east-04.cleardb.com    Database: heroku_7de1eadc88abd9c
-- ------------------------------------------------------
-- Server version	5.6.50-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Account`
--

DROP TABLE IF EXISTS `Account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Account` (
  `IdAccount` int(11) NOT NULL AUTO_INCREMENT,
  `Email` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `UserName` varchar(20) DEFAULT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `FullName` varchar(40) NOT NULL,
  `Gender` int(11) DEFAULT NULL,
  `Birthday` datetime DEFAULT NULL,
  `Address` varchar(45) NOT NULL,
  `PhoneNumber` varchar(15) NOT NULL,
  `Role` int(11) NOT NULL,
  `Status` int(11) NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(20) NOT NULL,
  PRIMARY KEY (`IdAccount`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `Account` WRITE;
/*!40000 ALTER TABLE `Account` DISABLE KEYS */;
INSERT INTO `Account` VALUES (1,'tung@gmail.com','123','Tùng Trần','Tùng','Trần Danh','Trần Danh Tùng',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin'),(2,'Admin1@gmail.com','123','Toàn Trần','Toàn','Trần Danh','Trần Danh Toàn',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin'),(3,'Admin2@gmail.com','123','Vinh Trần','Vinh','Trần Công','Trần Công Vinh',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin'),(4,'Admin3@gmail.com','123','Hoàn Nguyễn','Hoàn','Nguyễn Công','Nguyễn Công Hoàn',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin'),(5,'Admin4@gmail.com','123','Lê Văn','Sơn','Lê Văn','Lê Văn Sơn',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin');
/*!40000 ALTER TABLE `Account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Category`
--

DROP TABLE IF EXISTS `Category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Category` (
  `IdCategory` int(11) NOT NULL AUTO_INCREMENT,
  `CategoryName` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Status` int(11) NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdCategory`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Category`
--

LOCK TABLES `Category` WRITE;
/*!40000 ALTER TABLE `Category` DISABLE KEYS */;
INSERT INTO `Category` VALUES (1,'Áo','Áo phông trơn',0,'2021-07-28 17:55:02','SystemAdmin'),(2,'Đồ Nam','Quần âu',0,'2021-07-28 17:42:55','SystemAdmin'),(5,'Quần','Quần',0,'2021-07-28 12:51:15','SystemAdmin');
/*!40000 ALTER TABLE `Category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Color`
--

DROP TABLE IF EXISTS `Color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Color` (
  `IdColor` int(11) NOT NULL AUTO_INCREMENT,
  `ColorName` varchar(45) COLLATE utf8_vietnamese_ci NOT NULL,
  `Description` varchar(45) COLLATE utf8_vietnamese_ci NOT NULL,
  `Status` int(11) DEFAULT NULL,
  `UpdateDatetime` datetime DEFAULT NULL,
  `Updater` varchar(45) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`IdColor`)
) ENGINE=InnoDB AUTO_INCREMENT=1125 DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Color`
--

LOCK TABLES `Color` WRITE;
/*!40000 ALTER TABLE `Color` DISABLE KEYS */;
INSERT INTO `Color` VALUES (5,'Color1','Color1',0,NULL,NULL),(15,'Color2','Color2',0,NULL,NULL),(25,'Color3','Color3',0,'2021-07-18 15:37:26','SystemAdmin'),(35,'Color4','Color4',0,NULL,NULL),(85,'5','5',0,NULL,NULL),(95,'gfsdafd','fdsafds',0,NULL,NULL),(105,'fdsafdsa','àdsafdsa',0,NULL,NULL),(115,'gdfsgfdsf','fdsafdsa',0,'2021-07-14 23:52:46',NULL),(125,'fds','dsafds',0,'2021-07-14 23:55:49','SystemAdmin'),(1005,'Màu hường','fdsfd',0,'2021-07-28 18:14:57','SystemAdmin'),(1015,'Màu Be','Màu Be',0,'2021-07-16 09:22:15','SystemAdmin'),(1025,'Màu đen','Màu đen',0,'2021-07-16 09:37:14','SystemAdmin'),(1035,'Màu trắng','Màu trắng',0,'2021-07-16 09:37:30','SystemAdmin'),(1045,'Màu tôm','Màu tôm',0,'2021-07-16 09:37:41','SystemAdmin'),(1055,'test','test',0,'2021-07-18 09:44:02','SystemAdmin'),(1065,'Màu xanh lam','Màu xanh lam',0,'2021-07-18 15:07:40','SystemAdmin'),(1115,'Màu trắng','Màu trắng',0,'2021-07-18 16:35:41','SystemAdmin');
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Evaluation`
--

DROP TABLE IF EXISTS `Evaluation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Evaluation` (
  `IdEvaluation` int(11) NOT NULL AUTO_INCREMENT,
  `IdAccount` int(11) NOT NULL,
  `IdProduct` int(11) NOT NULL,
  `Rate` float DEFAULT NULL,
  `Comment` varchar(1000) DEFAULT NULL,
  `IdEvaluationMom` int(11) DEFAULT NULL,
  PRIMARY KEY (`IdEvaluation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Evaluation`
--

LOCK TABLES `Evaluation` WRITE;
/*!40000 ALTER TABLE `Evaluation` DISABLE KEYS */;
/*!40000 ALTER TABLE `Evaluation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Orderdetail`
--

DROP TABLE IF EXISTS `Orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Orderdetail` (
  `IdOrderDetail` int(11) NOT NULL AUTO_INCREMENT,
  `IdProductDetail` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` float NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdOrderDetail`,`IdProductDetail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Orderdetail`
--

LOCK TABLES `Orderdetail` WRITE;
/*!40000 ALTER TABLE `Orderdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `Orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `IdOrder` int(11) NOT NULL AUTO_INCREMENT,
  `Email` varchar(20) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `OrderDate` datetime NOT NULL,
  `ProductTypeNumber` int(11) NOT NULL,
  `TotalAmount` float NOT NULL,
  `IsPaid` int(11) NOT NULL,
  `Status` int(11) NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdOrder`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `IdProduct` int(11) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(45) COLLATE utf8_vietnamese_ci NOT NULL,
  `IdCategory` int(11) NOT NULL,
  `Description` varchar(255) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `UpdateDatetime` datetime DEFAULT NULL,
  `Updater` varchar(45) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`IdProduct`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Áo phông',2,'Áo phông trơn',NULL,NULL),(2,'Áo phông',1,'Áo phông in hình','2021-06-30 00:00:00','Admin'),(3,'Quần âu',2,'Quần Âu cao cấp','2021-07-13 00:00:00','Admin');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productdetail`
--

DROP TABLE IF EXISTS `productdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productdetail` (
  `IdProduct` int(11) NOT NULL,
  `IdColor` int(11) NOT NULL,
  `IdSize` int(11) NOT NULL,
  `quantity` int(11) DEFAULT '0',
  `price` float DEFAULT '0',
  `SalePrice` float DEFAULT '0',
  `Status` int(11) NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  `idProductDetail` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idProductDetail`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productdetail`
--

LOCK TABLES `productdetail` WRITE;
/*!40000 ALTER TABLE `productdetail` DISABLE KEYS */;
INSERT INTO `productdetail` VALUES (1,5,15,5,10,16456,0,'2021-08-02 23:23:55','Admin',5),(3,1115,35,5,10,1,1,'2021-08-03 09:13:50','Admin',15),(3,1005,15,5,10,1,0,'2021-08-03 09:23:34','Admin',25),(3,1005,25,5,1007,16456,1,'2021-08-03 09:25:40','Admin',35),(3,1025,35,3,5000,3000,2,'2021-08-03 23:07:13','Admin',45),(1,35,15,5,535,16456,0,'2021-08-03 23:16:25','Admin',55),(2,95,25,5,10,3000,1,'2021-08-03 23:44:35','Admin',65),(3,1045,35,9,9999,999,1,'2021-08-04 18:49:47','Admin',75);
/*!40000 ALTER TABLE `productdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productphoto`
--

DROP TABLE IF EXISTS `productphoto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productphoto` (
  `IdProductDetail` int(11) DEFAULT NULL,
  `IdPhoto` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`IdPhoto`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productphoto`
--

LOCK TABLES `productphoto` WRITE;
/*!40000 ALTER TABLE `productphoto` DISABLE KEYS */;
INSERT INTO `productphoto` VALUES (75,1,NULL);
/*!40000 ALTER TABLE `productphoto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `size`
--

DROP TABLE IF EXISTS `size`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `size` (
  `IdSize` int(11) NOT NULL AUTO_INCREMENT,
  `SizeName` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Status` int(11) NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdSize`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `size`
--

LOCK TABLES `size` WRITE;
/*!40000 ALTER TABLE `size` DISABLE KEYS */;
INSERT INTO `size` VALUES (5,'S','Small',0,'2021-07-18 17:44:37','SystemAdmin'),(15,'M','Midle',0,'2021-07-18 17:43:24','SystemAdmin'),(25,'L','Large',0,'2021-07-18 17:44:52','SystemAdmin'),(35,'XL','Extra Large',0,'2021-07-18 17:45:47','SystemAdmin');
/*!40000 ALTER TABLE `size` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-09 21:16:38
