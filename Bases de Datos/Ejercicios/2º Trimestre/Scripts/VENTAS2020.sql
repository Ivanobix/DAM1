CREATE DATABASE  IF NOT EXISTS `ventas` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ventas`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: ventas
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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `numclie` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `repclie` int(11) DEFAULT NULL,
  `limitecredito` int(11) DEFAULT NULL,
  PRIMARY KEY (`numclie`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (2101,'Luis García Antón',106,10850),(2102,'Alvaro Rodríguez',101,10850),(2103,'Jaime Llorens',105,8350),(2105,'Antonio Canales',101,7500),(2106,'Juan Suárez',102,10850),(2107,'Julián López',110,5850),(2108,'Julia Antequera',109,9150),(2109,'Alberto Juanes',103,4150),(2111,'Cristóbal García',103,8350),(2112,'María Silva',108,8350),(2113,'Luisa Maron',104,3350),(2114,'Cristina Bulini',102,3350),(2115,'Vicente Martínez',101,3350),(2117,'Carlos Tena',106,5850),(2118,'Raúl Álvarez',108,10000),(2119,'Salomón Bueno',109,4150),(2120,'Juan Malo',102,8350),(2121,'Vicente Ríos',103,7500),(2122,'José Marchante',105,5000),(2123,'José Libros',102,6650),(2124,'Juan Bolto',107,6650);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `numemp` int(11) NOT NULL,
  `nombre` varchar(25) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `oficina` int(11) DEFAULT NULL,
  `titulo` varchar(50) DEFAULT NULL,
  `contrato` date DEFAULT NULL,
  `jefe` int(11) DEFAULT NULL,
  `cuota` int(11) DEFAULT NULL,
  `ventas` int(11) DEFAULT NULL,
  PRIMARY KEY (`numemp`),
  KEY `fk2` (`oficina`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (101,'Antonio Viguer',45,12,'representante','1986-10-20',104,50000,50800),(102,'Alvaro Jaumes',48,21,'representante','1986-12-10',108,58000,79000),(103,'Juan Rovira',29,24,'representante','1987-03-01',104,45800,47600),(104,'José González',33,12,'dir ventas','1987-05-19',106,33300,23800),(105,'Vicente Pantalla',37,13,'representante','1988-02-12',104,58000,61300),(106,'Luis Antonio',52,11,'dir general','1988-06-14',NULL,45800,49800),(107,'Jorge Gutiérrez',49,22,'representante','1988-11-14',108,50000,31000),(108,'Ana Bustamante',62,21,'dir ventas','1989-10-12',106,58000,60150),(109,'María Sunta',31,28,'representante','1999-10-12',106,50000,65300),(110,'Juan Víctor',41,22,'representante','1990-01-13',104,NULL,76000);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oficinas`
--

DROP TABLE IF EXISTS `oficinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oficinas` (
  `oficina` int(11) NOT NULL,
  `ciudad` varchar(25) DEFAULT NULL,
  `region` varchar(15) DEFAULT 'NORTE',
  `dir` int(11) DEFAULT NULL,
  `objetivo` int(11) DEFAULT NULL,
  `ventas` int(11) DEFAULT NULL,
  PRIMARY KEY (`oficina`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oficinas`
--

LOCK TABLES `oficinas` WRITE;
/*!40000 ALTER TABLE `oficinas` DISABLE KEYS */;
INSERT INTO `oficinas` VALUES (11,'Valencia','este',106,95800,115500),(12,'Alicante','este',104,133500,122500),(13,'Castellón','este',105,58500,61500),(20,'Cádiz','sur',103,80000,50000),(21,'Badajoz','oeste',108,120850,140000),(22,'La Coruña','oeste',108,50000,31000),(24,'Madrid','centro',108,41600,25000),(26,'Pamplona','norte',NULL,71000,80000),(28,'Valencia','este',NULL,150000,160000),(30,'León','norte',NULL,NULL,NULL),(40,'Palencia','norte',104,NULL,12234);
/*!40000 ALTER TABLE `oficinas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos` (
  `codigo` int(11) NOT NULL,
  `numpedido` int(11) DEFAULT NULL,
  `fechapedido` date DEFAULT NULL,
  `clie` int(11) DEFAULT NULL,
  `producto` varchar(5) DEFAULT NULL,
  `cant` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `fk3` (`clie`),
  KEY `fk4` (`producto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,110036,'1997-01-02',2107,'4100z',9),(2,110036,'1997-01-02',2117,'887h',7),(3,112963,'1997-05-10',2103,'41004',28),(4,112968,'1990-01-11',2102,'41004',34),(5,112975,'1997-02-11',2111,'112',6),(6,112979,'1989-10-12',2114,'4100z',6),(7,112983,'1997-05-10',2103,'41004',6),(8,112987,'1997-01-01',2103,'4100y',11),(9,112989,'1997-12-10',2101,'114',6),(10,112992,'1990-04-15',2118,'41002',10),(11,112993,'1997-03-10',2106,'xk48',24),(12,112997,'1997-04-04',2124,'41003',1),(13,113003,'1997-02-05',2108,'779c',3),(14,113007,'1997-01-01',2112,'773c',3),(15,113012,'1997-05-05',2111,'41003',35),(16,113013,'1997-08-06',2118,'41003',1),(17,113024,'1997-07-04',2114,'xk47',20),(18,113027,'1997-02-05',2103,'41002',54),(19,113034,'1997-11-05',2107,'887p',8),(20,113042,'1997-01-01',2113,'887h',5),(21,113045,'1997-07-02',2112,'887h',10),(22,113048,'1997-02-02',2120,'779c',2),(23,113049,'1997-04-04',2118,'xk47',2),(24,113051,'1997-07-06',2118,'xk47',4),(25,113055,'1999-04-01',2108,'4100x',6),(26,113057,'1997-11-01',2111,'4100x',24),(27,113058,'1989-07-04',2108,'112',10),(28,113062,'1997-07-04',2124,'41003',10),(29,113065,'1997-06-03',2106,'xk47',6),(30,113069,'1997-08-01',2109,'773c',22);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `idproducto` varchar(5) NOT NULL,
  `idfab` varchar(3) DEFAULT NULL,
  `descripcion` varchar(25) DEFAULT NULL,
  `precio` decimal(5,2) DEFAULT NULL,
  `existencias` int(11) DEFAULT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES ('112','fea','cubo',0.87,115),('114','fea','cubo',1.46,15),('199',NULL,NULL,2.30,NULL),('41001','aci','arandela',0.30,277),('41002','aci','bisagra',0.40,167),('41003','aci','art t3',0.60,207),('41004','aci','art t4',0.75,139),('41005','bic','manivela',4.00,3),('4100x','aci','junta',0.15,37),('4100y','aci','extractor',17.50,25),('4100z','aci','mont',16.80,28),('41089','bic','rodamiento',1.50,78),('41672','bic','plato',1.20,0),('773c','imm','reostato',5.87,28),('775c','imm','reostato 2',8.50,5),('779c','imm','reostato 3',11.25,0),('887h','imm','caja clavos',0.29,223),('887p','imm','perno',0.15,24),('887x','imm','manivela',2.90,32),('xk47','qsa','red',2.20,38),('xk48','qsa','red',0.80,203),('xk48a','qsa','red',0.70,37);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-28 12:32:16
