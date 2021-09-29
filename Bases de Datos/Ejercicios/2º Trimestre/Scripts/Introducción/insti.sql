CREATE DATABASE  IF NOT EXISTS `insti` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `insti`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: insti
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tablaalumnos`
--

DROP TABLE IF EXISTS `tablaalumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tablaalumnos` (
  `NIF` varchar(12) DEFAULT NULL,
  `Nombre` varchar(40) DEFAULT NULL,
  `Apellido1` varchar(25) DEFAULT NULL,
  `Apellido2` varchar(25) DEFAULT NULL,
  `Edad` tinyint(4) DEFAULT NULL,
  `Parcial1` float DEFAULT NULL,
  `Parcial2` float DEFAULT NULL,
  `Practicas` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tablaalumnos`
--

LOCK TABLES `tablaalumnos` WRITE;
/*!40000 ALTER TABLE `tablaalumnos` DISABLE KEYS */;
INSERT INTO `tablaalumnos` VALUES ('08.353.842-C','Alberto','García','Díaz',NULL,7,4,2),('10.234.456-P','Andrés','García','Pérez',23,5.4,7.3,1.2),('11.234.222-E','Paula','Ramos','Ortega',20,9,7.5,1.5),('12.444.555-D','Marta','Castillo','Rey',NULL,9,7.5,1),('23.786.354-H','Juan','Izquierdo','Donoso',23,2,5,1),('34.753.485-J','José','López','López',19,9,7,2),('41.486.691-W','Juan','Gómez','Jurado',22,5,8,2);
/*!40000 ALTER TABLE `tablaalumnos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-17 11:13:31
