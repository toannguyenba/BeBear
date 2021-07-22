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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
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

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'tung@gmail.com','123','Tùng Trần','Tùng','Trần Danh','Trần Danh Tùng',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin'),(2,'Admin1@gmail.com','123','Toàn Trần','Toàn','Trần Danh','Trần Danh Toàn',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin'),(3,'Admin2@gmail.com','123','Vinh Trần','Vinh','Trần Công','Trần Công Vinh',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin'),(4,'Admin3@gmail.com','123','Hoàn Nguyễn','Hoàn','Nguyễn Công','Nguyễn Công Hoàn',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin'),(5,'Admin4@gmail.com','123','Lê Văn','Sơn','Lê Văn','Lê Văn Sơn',0,'1998-05-06 00:00:00','Hà Nội','0988888888',1,1,'2021-05-06 00:00:00','Admin');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-22 21:17:50
