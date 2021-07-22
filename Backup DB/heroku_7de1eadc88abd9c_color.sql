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
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `color` (
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
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
INSERT INTO `color` VALUES (5,'Color1','Color1',0,NULL,NULL),(15,'Color2','Color2',0,NULL,NULL),(25,'Color3','Color3',0,'2021-07-18 15:37:26','SystemAdmin'),(35,'Color4','Color4',0,NULL,NULL),(85,'5','5',0,NULL,NULL),(95,'gfsdafd','fdsafds',0,NULL,NULL),(105,'fdsafdsa','àdsafdsa',0,NULL,NULL),(115,'gdfsgfdsf','fdsafdsa',0,'2021-07-14 23:52:46',NULL),(125,'fds','dsafds',0,'2021-07-14 23:55:49','SystemAdmin'),(1005,'gsdf','fdsfd',0,'2021-07-15 00:00:05','SystemAdmin'),(1015,'Màu Be','Màu Be',0,'2021-07-16 09:22:15','SystemAdmin'),(1025,'Màu đen','Màu đen',0,'2021-07-16 09:37:14','SystemAdmin'),(1035,'Màu trắng','Màu trắng',0,'2021-07-16 09:37:30','SystemAdmin'),(1045,'Màu tôm','Màu tôm',0,'2021-07-16 09:37:41','SystemAdmin'),(1055,'test','test',0,'2021-07-18 09:44:02','SystemAdmin'),(1065,'Màu xanh lam','Màu xanh lam',0,'2021-07-18 15:07:40','SystemAdmin'),(1115,'Màu trắng','Màu trắng',0,'2021-07-18 16:35:41','SystemAdmin');
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-22 21:18:04
