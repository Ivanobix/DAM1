CREATE DATABASE  IF NOT EXISTS `videoclub2020` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `videoclub2020`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: videoclub
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
-- Table structure for table `alquiler`
--

DROP TABLE IF EXISTS `alquiler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alquiler` (
  `CODIGOSOCIO` int(11) NOT NULL,
  `CODIGOSTOCK` int(11) NOT NULL,
  `FECHASALIDA` date NOT NULL,
  `FECHADEVOLUCION` date DEFAULT NULL,
  PRIMARY KEY (`CODIGOSOCIO`,`CODIGOSTOCK`,`FECHASALIDA`),
  KEY `fk6` (`CODIGOSTOCK`),
  KEY `fk8` (`CODIGOSOCIO`),
  KEY `fk3` (`CODIGOSOCIO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alquiler`
--

LOCK TABLES `alquiler` WRITE;
/*!40000 ALTER TABLE `alquiler` DISABLE KEYS */;
INSERT INTO `alquiler` VALUES (1,3,'2017-07-04','2017-07-15'),(1,4,'2017-04-04','2017-04-16'),(1,7,'2017-12-12','2017-12-25'),(1,10,'2017-06-04','2017-06-12'),(2,1,'2017-10-01','2017-11-12'),(2,4,'2017-05-10','2017-05-23'),(2,7,'2017-08-13','2017-08-15'),(2,13,'2017-03-01','2017-03-22'),(3,6,'2018-01-13','2018-01-22'),(3,7,'2018-02-12','2018-02-22'),(5,10,'2018-01-12','2018-01-15'),(5,11,'2017-09-13','2017-09-16'),(5,15,'2018-01-12','2018-02-13'),(5,17,'2018-01-27','2018-01-30'),(6,3,'2018-01-04',NULL),(7,4,'2018-02-04',NULL),(7,9,'2018-01-20',NULL),(7,18,'2018-02-14',NULL),(8,9,'2017-10-04','2017-10-26');
/*!40000 ALTER TABLE `alquiler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `CODCAT` int(11) NOT NULL,
  `DESCRIPCIÓN` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`CODCAT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Terror'),(2,'Comedia'),(3,'Drama'),(4,'Ciencia Ficción'),(5,'Aventura'),(6,'Musical'),(7,'Oeste');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peliculas` (
  `CODPEL` int(11) NOT NULL,
  `TITULO` varchar(40) DEFAULT NULL,
  `CODCATEG` int(11) DEFAULT NULL,
  `PRECIOCOMPRA` int(11) DEFAULT NULL,
  `PRECIOALQUILER` float DEFAULT NULL,
  `MAXIMODIAS` int(11) DEFAULT NULL,
  `OFERTA` float DEFAULT NULL,
  `COMENTARIO` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CODPEL`),
  KEY `fk1` (`CODCATEG`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peliculas`
--

LOCK TABLES `peliculas` WRITE;
/*!40000 ALTER TABLE `peliculas` DISABLE KEYS */;
INSERT INTO `peliculas` VALUES (1,'CANTANDO BAJO LA LLUVIA',6,25,2.5,3,0.2,'Entretenida'),(2,'SÓLO ANTE EL PELIGRO',7,30,3.75,2,0.5,'No hay que perdérsela'),(3,'UN DÍA EN LAS CARRERAS',2,20,2.5,2,0.25,'Para pasar un buen rato'),(4,'DRÁCULA',1,36,3.75,2,0.15,'Terror hasta el final'),(5,'EN BUSCA DEL TEMPLO MALDITO',5,42,2.5,2,0.2,'Cine de aventuras'),(6,'LA GUERRA DE LAS GALAXIAS',4,29,3,7,0.3,'La mejor de la serie'),(7,'EL BUENO, EL FEO Y EL MALO',7,32,2,2,0.15,'Una de vaqueros'),(8,'EL GUATEQUE',2,32,2,7,0.25,'Lo mejor de Peter Selles'),(9,'PSICOSIS',1,36,3.5,2,0.1,'Intriga y suspense'),(10,'EL GOLPE',2,28,2.75,2,0,'La mejor trama que jamás existió'),(12,'RAMBO',5,22,2,3,0.3,'NO ME GUSTA');
/*!40000 ALTER TABLE `peliculas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socios`
--

DROP TABLE IF EXISTS `socios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socios` (
  `CODSOC` int(11) NOT NULL,
  `APELLIDOS` varchar(20) DEFAULT NULL,
  `NOMBRE` varchar(15) DEFAULT NULL,
  `DIRECCIÓN` varchar(30) DEFAULT NULL,
  `CIUDAD` varchar(20) DEFAULT NULL,
  `CP` varchar(7) DEFAULT NULL,
  `PROVINCIA` varchar(15) DEFAULT NULL,
  `TELEFONO` varchar(12) DEFAULT NULL,
  `MOVIL` varchar(12) DEFAULT NULL,
  `MAIL` varchar(50) DEFAULT NULL,
  `NIF` varchar(12) DEFAULT NULL,
  `FECHANAC` date DEFAULT NULL,
  `FECHAALTA` date DEFAULT NULL,
  `OBSERVACIONES` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CODSOC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socios`
--

LOCK TABLES `socios` WRITE;
/*!40000 ALTER TABLE `socios` DISABLE KEYS */;
INSERT INTO `socios` VALUES (1,'PEREZ RICO','ANTONIO','C/Maissonave, 7','Alicante','03005','ALICANTE','965.45.64.46','609.11.22.33','antoniop@hotmail.com','22.166.300-H','1972-04-15','1992-10-12',NULL),(2,'BERNAL LLINARES','Mº JOSÉ','Sol, 23 D','ALICANTE','03005','ALICANTE','965.22.16.36',NULL,'mariajo@wanadoo.es','74.456.123-J','1964-01-30','1994-10-01',NULL),(3,'LEAL RICO','JESÚS','Luna, 29','ALICANTE','03158','ALICANTE',NULL,'633.22.48.90',NULL,'12.123.456-A','1979-06-01','1995-08-15',NULL),(4,'MATEO RIPOLL','ALBERTO','Oscar Espla, 16','ELCHE','03222','ALICANTE','965.12.00.64','630.55.97.16',NULL,'22.336.156-R','1964-09-11','1995-02-04','Le cuesta devolverlas'),(5,'MIRA MIRA','CÉSAR','Avenida, 10','ALICANTE','03654','ALICANTE','965.20.20.13','609.11.44.11',NULL,'24.258.369-F','1982-12-03','1995-04-03',NULL),(6,'RICO BERNAL','LOLI','Sol, 55','EL CAMPELLO','03010','ALICANTE',NULL,'666.15.15.77','lolir@ctv.es','21.131.464-A','1980-05-15','1995-09-08',NULL),(7,'OLIVER MIRA','MARTA','Pinoso, 33','ALICANTE','03007','ALICANTE','965.36.16.16',NULL,'martao@hotmail.com','23.333.446-D','1979-09-16','1995-09-25','Familia del jefe'),(8,'SANCHÍS RICO','MARÍA','Picasso, 1','ALICANTE','03007','ALICANTE',NULL,'687.66.80.69',NULL,'22.159.357-A','1985-08-08','1995-08-30',NULL),(9,'PÉREZ LEAL','ANDRÉS','La Torre, 40','TORRELLANO','03894','ALICANTE','965.28.49.44','627.11.55.99','andresp@midominio.com   ','25.159.963-B','1980-11-19','1995-10-01','Viene su mujer Ana');
/*!40000 ALTER TABLE `socios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock` (
  `CODSTOCK` int(11) NOT NULL,
  `CODPELIC` int(11) DEFAULT NULL,
  `FORMATO` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`CODSTOCK`),
  KEY `FK4` (`CODPELIC`),
  KEY `fk2` (`CODPELIC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,1,'VHS'),(2,1,'VHS'),(3,1,'DVD'),(4,2,'VHS'),(5,3,'DVD'),(6,3,'DVD'),(7,4,'VHS'),(8,4,'DVD'),(9,5,'DVD'),(10,6,'VHS'),(11,6,'VHS'),(12,6,'VHS'),(13,7,'VHS'),(14,8,'DVD'),(15,8,'DVD'),(16,9,'VHS'),(17,9,'DVD'),(18,10,'VHS'),(19,10,'DVD'),(20,10,'DVD');
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-05  8:56:57
