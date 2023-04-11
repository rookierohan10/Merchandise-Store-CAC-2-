-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: javacac
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `productlist`
--

DROP TABLE IF EXISTS `productlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productlist` (
  `Name` varchar(40) NOT NULL,
  `Product_ID` varchar(13) NOT NULL,
  `Price` int NOT NULL,
  `Count` int NOT NULL,
  `Category_ID` varchar(1) NOT NULL,
  `Category_details` varchar(9) NOT NULL,
  `Description` varchar(20) NOT NULL,
  `Product_Details` varchar(65) NOT NULL,
  `imagepath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productlist`
--

LOCK TABLES `productlist` WRITE;
/*!40000 ALTER TABLE `productlist` DISABLE KEYS */;
INSERT INTO `productlist` VALUES ('Batman: Classic Logo(Colourblock)','DC_J_BAT01',1499,4,'C','Clothes','Cargo Jogger','80% Cotton 20% Polyester; Machine Wash',NULL),('Hulkbuster suit','MARVEL_K_1001',899,3,'F','Figures','Home Decor','Completely customizable hulkbuster action figure',NULL),('Itachi Rubber Keychain','NAR_K_0001',349,6,'K','Keychains','Accessories','Itachi Uchiha Keychain; 5cm',NULL),('Marvel Avengers Spiderman Bobblehead','MARVEL_K_101',449,13,'F','Figures','Home Decor','Spiderman cute bobblehead full body action figure',NULL),('Marvel: Captain America\' Shield','MARVEL_K_099',175,20,'K','Keychains','Accessories','Captain American metal keyring',NULL),('Marvel: Classic Logo','MARVEL_C_091',1399,10,'C','Clothes','Oversized Sweatshirt','60% Cotton 40% Ployester Machine Wash',NULL),('Naruto 20th anniversary Figure  (20cm)','NAR_F_0001',2499,5,'F','Figures','Home Decor','Special Edition Naruto 20th anniversary figure; good PVC material',NULL),('Naruto All Generations Poster','NAR_P_0101',149,11,'P','Poster','Home Decor','Naruto all generation high quality 3d poster',NULL),('Naruto Anime Sasuke Uchiha Figure (17cm)','NAR_F_0991',999,3,'F','Figures','Home Decor','Shippuden sasuke uchiha action figure',NULL),('Naruto Kakashi Action Figure','NAR_F_0003',1099,2,'F','Figures','Home Decor','Kakashi of the sharingan action figure (15-17cm appx)',NULL),('Naruto Rasengan Action Figure','NAR_F_1001',749,5,'F','Figures','Home Decor','Naruto Rasengan Action figure 17cm; high quality PVC',NULL),('Sasuke Crow Stomp  (20cm)','NAR_F_0002',1949,6,'F','Figures','Home Decor','Grown Up Sasuke Uchiha; good PVC material',NULL),('Scooby embossed sweater','SCO_T_0001',1099,10,'C','Clothes','T-shirt','Full-sized T-shirt with printed Scooby Dooby Do',NULL),('Son Goku Ultra Instinct','DBZ_F_0100',799,3,'F','Figures','Home Decor','Dragon Ball Z Goku Ultra Instinct Action figure',NULL);
/*!40000 ALTER TABLE `productlist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-11  9:17:40
