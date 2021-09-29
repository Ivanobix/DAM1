CREATE DATABASE  IF NOT EXISTS `supermercado` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `supermercado`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: supermercado3
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
-- Table structure for table `articulos`
--

DROP TABLE IF EXISTS `articulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `articulos` (
  `CODART` int(11) NOT NULL,
  `NOMART` varchar(40) DEFAULT NULL,
  `DPTO` int(11) DEFAULT NULL,
  `PRECIOUNIDAD` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`CODART`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulos`
--

LOCK TABLES `articulos` WRITE;
/*!40000 ALTER TABLE `articulos` DISABLE KEYS */;
INSERT INTO `articulos` VALUES (1,'Rotuladores',1,3.00),(2,'Bolígrafo',1,1.80),(3,'Lápiz',1,1.00),(4,'Goma',1,0.30),(5,'Juego toallas',3,15.30),(6,'Edredón nórdico',3,97.50),(7,'Impresora láser Canon',2,1000.00),(8,'Tejano',4,88.00),(9,'Galletas',5,1.50),(10,'Cazadora cuero',4,300.00),(11,'Cuaderno',1,2.00),(12,'Albornoz',3,58.00),(13,'Aceite',5,3.20),(14,'Leche',5,1.19),(15,'Ordenador Airis',2,1250.00);
/*!40000 ALTER TABLE `articulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departamentos` (
  `DEPART` int(11) NOT NULL,
  `NOMBRE` varchar(50) DEFAULT NULL,
  `PLANTA` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`DEPART`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (1,'Librería','Baja'),(2,'Electrónica','Primera'),(3,'Hogar','Segunda'),(4,'Moda','Tercera'),(5,'Alimentación','Cuarta');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendedores`
--

DROP TABLE IF EXISTS `vendedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendedores` (
  `CODVEND` smallint(6) NOT NULL,
  `DEPARTAMENTO` int(11) DEFAULT NULL,
  `APELLIDOS` varchar(50) DEFAULT NULL,
  `NOMBRE` varchar(25) DEFAULT NULL,
  `FECHANACIM` date DEFAULT NULL,
  `TELEFONO` varchar(14) DEFAULT NULL,
  `SUELDO` int(11) DEFAULT NULL,
  `FECHAALTA` date DEFAULT NULL,
  `NUMHIJOS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CODVEND`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendedores`
--

LOCK TABLES `vendedores` WRITE;
/*!40000 ALTER TABLE `vendedores` DISABLE KEYS */;
INSERT INTO `vendedores` VALUES (10,1,'Martínez Fernández','Sara','1965-02-07','987234456',1100,'1988-01-20',1),(20,2,'Rodríguez Sanz','Juan','1970-11-03',NULL,1400,'1992-10-30',2),(30,1,'Santos Pérez','María','1965-12-04','987204422',1500,'1990-03-01',0),(40,5,'González Marcos','Diego','1962-10-01',NULL,1250,'1992-03-02',1),(50,3,'Pablos García','Elena','1975-12-12','987215577',1150,'2003-05-05',0),(60,4,'Gómez Sánchez','Ángel','1970-02-13','987223356',1300,'1995-08-03',2),(70,4,'Ramos Sanz','Laura','1969-03-08',NULL,1000,'2004-01-03',0),(80,3,'García López','Raúl','1970-04-05','987213344',1200,'1999-04-01',1),(90,5,'Lorenzo Jiménez','Marta','1966-11-23',NULL,1000,'2004-09-22',2);
/*!40000 ALTER TABLE `vendedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventas` (
  `Idventa` int(11) NOT NULL,
  `Codvend` smallint(6) DEFAULT NULL,
  `Codartic` int(11) DEFAULT NULL,
  `Unidvend` smallint(6) DEFAULT NULL,
  `Fechaventa` date DEFAULT NULL,
  PRIMARY KEY (`Idventa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,10,1,4,'2006-03-01'),(2,30,2,10,'2006-02-02'),(3,10,3,5,'2006-03-01'),(4,30,4,20,'2006-08-04'),(5,20,7,1,'2006-07-07'),(6,60,8,1,'2006-03-01'),(7,60,10,1,'2006-03-01'),(8,10,11,5,'2006-03-05'),(9,40,13,6,'2006-06-05'),(10,40,14,12,'2006-03-05'),(11,20,15,1,'2006-10-01');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-07 11:53:47
