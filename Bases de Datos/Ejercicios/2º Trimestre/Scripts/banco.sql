CREATE DATABASE  IF NOT EXISTS `bancos` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bancos`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: bancos
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
-- Table structure for table `banco`
--

DROP TABLE IF EXISTS `banco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banco` (
  `numentidad` varchar(5) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `sede` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`numentidad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banco`
--

LOCK TABLES `banco` WRITE;
/*!40000 ALTER TABLE `banco` DISABLE KEYS */;
INSERT INTO `banco` VALUES ('0030','Banco Español de Crédito, S.A.','Madrid'),('0075','Banco de España','Madrid'),('0086','Banco Santander','Madrid'),('2100','La Caixa','Barcelona'),('2105','La Camp','Valencia'),('2120','Bancaja','Valencia'),('2121','Caixa Catalunya','Barcelona');
/*!40000 ALTER TABLE `banco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `Idcliente` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `fechanac` date DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Francisco Pérez','Calle A, 68','1945-09-20','938452378'),(2,'María Serrano','Pz America, 23','1969-06-05','964124589'),(3,'Juan Jose Bonfill','Av. Cartagena,34','1975-06-23','964567891'),(4,'Mercedes Sanjuan','Calle Valencia,45','1986-03-02','965457896'),(5,'Carmen Bastos','C/Alta,3','1979-12-03','987332244'),(6,'David Bustamente','Av. América,45','1989-11-11','918456912'),(7,'Lara Sainz','Pza. Las Cortes','1980-11-05','987564534'),(8,'Diego López','C/ Los Álamos','1975-11-08','965778899');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuentas` (
  `cuenta` varchar(12) NOT NULL,
  `saldo` int(11) DEFAULT NULL,
  `numentidad` varchar(5) DEFAULT NULL,
  `numsucursal` varchar(5) DEFAULT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas`
--

LOCK TABLES `cuentas` WRITE;
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` VALUES ('000100200340',3450,'0075','0178',2,'Ahorro'),('000123001234',10236,'2100','0176',1,'Ahorro'),('000200030040',235,'0075','0178',2,'Corriente'),('001001001001',20231,'2100','0175',1,'Corriente'),('011009944747',1800,'2100','0175',2,'Corriente'),('091237894134',52045,'2105','0179',2,'Ahorro'),('123456789410',12569,'0075','0176',1,'Corriente'),('246897654321',9600,'0030','0215',8,'Corriente'),('422441144188',2700,'2105','0179',6,'Corriente'),('450364891570',45000,'0075','0176',1,'Ahorro'),('478912345645',2500,'0030','0215',2,'Ahorro'),('489001100110',8900,'2100','0176',3,'Corriente'),('851165791599',10000,'2105','0179',5,'Ahorro'),('987332211223',12500,'2100','0176',7,'Ahorro');
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursal`
--

DROP TABLE IF EXISTS `sucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sucursal` (
  `numentidad` varchar(5) NOT NULL,
  `numsucursal` varchar(5) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `director` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`numentidad`,`numsucursal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursal`
--

LOCK TABLES `sucursal` WRITE;
/*!40000 ALTER TABLE `sucursal` DISABLE KEYS */;
INSERT INTO `sucursal` VALUES ('0030','0215','Pz. España,23','Santiago Beltran'),('0075','0125','Pz. Santa Ana','Jose Fernandez'),('0075','0176','Paseo del Prado,6','Mariano Borrell'),('0075','0178','C. Alcalá, 78','Mariano Ozores'),('2100','0175','Tarragona,1','Antonio Vidal'),('2100','0176','Avd. America,45','Javier Sanz'),('2105','0178','San Agustiín, 12','Castellón');
/*!40000 ALTER TABLE `sucursal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-02 21:48:37
