CREATE DATABASE  IF NOT EXISTS `empresa` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `empresa`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: empresa
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `departamento` (
  `Depnum` smallint(6) NOT NULL,
  `Nombredep` varchar(14) DEFAULT NULL,
  `Localidad` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Depnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES (10,'Contabilidad','Sevilla'),(20,'Investigación','Madrid'),(30,'Ventas','Barcelona'),(40,'Producción','Bilbao');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `empleado` (
  `Idempleado` smallint(6) NOT NULL,
  `Nombre` varchar(20) DEFAULT NULL,
  `Oficio` varchar(10) DEFAULT NULL,
  `Dir` smallint(6) DEFAULT NULL,
  `Fechaalta` date DEFAULT NULL,
  `Salario` float(7,2) DEFAULT NULL,
  `Comision` float(6,2) DEFAULT NULL,
  `Depnum` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`Idempleado`),
  KEY `FK1_idx` (`Depnum`),
  CONSTRAINT `FK1` FOREIGN KEY (`Depnum`) REFERENCES `departamento` (`depnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (7369,'Sánchez','Empleado',7902,'1980-12-17',625.05,0.00,20),(7499,'Arroyo','Vendedor',7698,'1980-02-20',125.01,234.39,30),(7521,'Sala','Vendedor',7698,'1981-02-22',976.64,390.66,30),(7566,'Jiménez','Director',7839,'1981-04-02',2324.41,0.00,20),(7654,'Martín','Vendedor',7698,'1981-09-29',976.64,1093.84,30),(7698,'Negro','Director',7839,'1981-05-01',2226.75,0.00,30),(7782,'Cerezo','Director',7839,'1981-06-09',1914.22,0.00,10),(7788,'Gil','Analista',7566,'1981-11-09',2343.95,0.00,20),(7839,'Rey','Presidente',0,'1981-11-17',3906.58,0.00,10),(7844,'Tovar','Vendedor',7698,'1981-09-08',1171.97,0.00,30),(7876,'Alonso','Empleado',7788,'1981-09-23',859.45,0.00,20),(7900,'Jimeno','Empleado',7698,'1981-12-03',742.25,0.00,30),(7902,'Fernández','Analista',7566,'1981-12-03',2343.95,0.00,20),(7934,'Muñoz','Empleado',7782,'1982-01-23',1015.71,0.00,10);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-10 12:03:12
