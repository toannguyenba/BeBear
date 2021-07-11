-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bebear_shop
-- ------------------------------------------------------
-- Server versifsdfsdfdon	8.0.20

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
-- Table structure for table `account`
--
create database `BeBear`;
use `BeBear`;
DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `IdAccount` int NOT NULL AUTO_INCREMENT,
  `Email` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `UserName` varchar(20), -- Bỏ
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `FullName` varchar(40) NOT NULL,
  `Gender` int DEFAULT NULL,
  `Birthday` datetime DEFAULT NULL,
  `Address` varchar(45) NOT NULL,
  `PhoneNumber` varchar(15) NOT NULL,
  `Role` int NOT NULL,   -- Đổi tên thành role
  `Status` int NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(20) NOT NULL,
  PRIMARY KEY (`IdAccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `IdCategory` int NOT NULL AUTO_INCREMENT,
  `CategoryName` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Status` int NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdCategory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `color` (
  `IdColor` int NOT NULL AUTO_INCREMENT,
  `ColorName` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Status` int NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdColor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdetail` (
  `IdOrderDetail` int NOT NULL AUTO_INCREMENT,
  `IdProductDetail` int NOT NULL,
  `Quantity` int NOT NULL,
  `Price` float NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdOrderDetail`,`IdProductDetail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `IdOrder` int NOT NULL AUTO_INCREMENT,
  `Email` varchar(20) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `OrderDate` datetime NOT NULL,
  `ProductTypeNumber` int NOT NULL,
  `TotalAmount` float NOT NULL,
  `IsPaid` int NOT NULL,
  `Status` int NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdOrder`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
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
  `IdProduct` int NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(45) NOT NULL,
  `IdCategory` int NOT NULL,
  `Image1` varchar(100) NOT NULL,
  `Image2` varchar(100) NOT NULL,
  `Image3` varchar(100) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdProduct`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

CREATE TABLE `productPhoto` (
  `IdProduct` int NOT NULL,
  `IdPhoto` int NOT NULL AUTO_INCREMENT,
  `URL` varchar(255),
  PRIMARY KEY (`IdPhoto`)
);

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Table structure for table `productdetail`
--

DROP TABLE IF EXISTS `productdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productdetail` (
  `IdProductDetail` int NOT NULL AUTO_INCREMENT,
  `IdProduct` int NOT NULL,
  `IdColor` int NOT NULL,
  `IdSize` int NOT NULL,
  `Quantity` int NOT NULL,
  `Price` float NOT NULL,
  `SalePrice` float NOT NULL,
  `Status` int NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdProductDetail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productdetail`
--

LOCK TABLES `productdetail` WRITE;
/*!40000 ALTER TABLE `productdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `productdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `size`
--

DROP TABLE IF EXISTS `size`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `size` (
  `IdSize` int NOT NULL AUTO_INCREMENT,
  `SizeName` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Status` int NOT NULL,
  `UpdateDatetime` datetime NOT NULL,
  `Updater` varchar(45) NOT NULL,
  PRIMARY KEY (`IdSize`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `size`
--

LOCK TABLES `size` WRITE;
/*!40000 ALTER TABLE `size` DISABLE KEYS */;
/*!40000 ALTER TABLE `size` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bebear_shop'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-03 17:08:01
