CREATE DATABASE  IF NOT EXISTS `otrabiblio2020` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `otrabiblio2020`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: bib2018
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
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genero` (
  `idgenero` int(11) NOT NULL,
  `nombre` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idgenero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Caballeresco'),(2,'Novela'),(3,'Aventura'),(4,'Político'),(5,'Biografía'),(6,'Autobiografía');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libros`
--

DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libros` (
  `Codlibro` int(11) NOT NULL,
  `Nombrelibro` varchar(60) DEFAULT NULL,
  `Editorial` varchar(25) DEFAULT NULL,
  `Autor` varchar(25) DEFAULT NULL,
  `Genero` int(11) DEFAULT NULL,
  `PaisAutor` varchar(20) DEFAULT NULL,
  `Numpag` smallint(6) DEFAULT NULL,
  `Añoedic` smallint(6) DEFAULT NULL,
  `Preciolibro` int(11) DEFAULT NULL,
  PRIMARY KEY (`Codlibro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros` VALUES (1,'Don Quijote de La Mancha I','Anaya','Miguel de Cervantes',1,'España',517,1991,28),(2,'Don Quijote deLa Mancha II','Anaya','Miguel de Cervantes',1,'España',611,1991,31),(3,'Historias de Nueva Orleans','Alfaguara','William Faulkner',2,'Estados Unidos',186,1985,7),(4,'El principito','Andina','Antoine Saint-Exupery',3,'Francia',120,1996,8),(5,'El príncipe','S.M.','Maquiavelo',4,'Italia',210,1995,11),(6,'Diplomacia','S.M.','Henry Kissinger',4,'Alemania',825,1997,18),(7,'Los Windsor','Plaza & Janes','Kitty Kelley',5,'Gran Bretaña',620,1998,11),(8,'El Último Emperador','Caralt','Pu-Yi',6,'China',353,1989,10),(9,'Fortunata y Jacinta','Plaza & Janes','Pérez Galdós',2,'España',325,1984,12);
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prestamos` (
  `Numpedido` int(11) NOT NULL,
  `Codlibro` int(11) DEFAULT NULL,
  `Codusuario` int(11) DEFAULT NULL,
  `Fsalida` date DEFAULT NULL,
  `Fmax` date DEFAULT NULL,
  `Fdevol` date DEFAULT NULL,
  PRIMARY KEY (`Numpedido`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (1,1,3,'2017-10-28','2017-11-11','2017-11-09'),(2,3,2,'2017-10-30','2017-11-16','2017-11-18'),(3,2,5,'2017-11-14','2017-11-26','2017-11-21'),(4,5,6,'2017-11-17','2017-11-29','2017-12-01'),(5,9,2,'2017-11-17','2017-12-01','2017-11-26'),(6,2,4,'2017-11-17','2017-12-03','2017-11-27'),(7,4,3,'2017-11-22','2017-12-03','2017-12-04'),(8,1,1,'2017-11-26','2017-12-05','2017-12-07'),(9,3,6,'2017-11-27','2017-12-05','2017-12-05'),(10,7,3,'2017-11-29','2017-12-14','2017-12-11'),(11,3,2,'2017-11-29','2017-12-18','2017-12-16');
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `Codusuario` int(11) NOT NULL,
  `Nombre` varchar(15) DEFAULT NULL,
  `Apellidos` varchar(25) DEFAULT NULL,
  `DNI` varchar(50) DEFAULT NULL,
  `Domicilio` varchar(50) DEFAULT NULL,
  `Poblacion` varchar(30) DEFAULT NULL,
  `Provincia` varchar(20) DEFAULT NULL,
  `Fechanac` date DEFAULT NULL,
  PRIMARY KEY (`Codusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Inés','Posadas Gil','42117892S','Av. Escaleritas 12','Las Palmas G.C.','Las Palmas','1971-07-04'),(2,'José','Sánchez Pons','31765348D','Mesa y López 51','Las Palmas G.C.','Las Palmas','1966-09-07'),(3,'Miguel','Gómez Sáez','11542981G','Gran Vía 71','Madrid','Madrid','1976-12-09'),(4,'Eva','Santana Páez','78542450L','Pío Baroja 23','Bilbao','Vizcaya','1980-05-23'),(5,'Yolanda','Betancor Díaz','44312870Z','El Cid 45','Miranda de Ebro','Burgos','1976-09-17'),(6,'Juan Luis','Blasco Pita','47234471P','Jaime I, 65','Alcira','Valencia','1982-03-01');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-28 18:20:26
