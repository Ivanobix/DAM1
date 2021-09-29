CREATE DATABASE  IF NOT EXISTS `tecnologia` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tecnologia`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: tecnologia
-- ------------------------------------------------------
-- Server version	5.5.24

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
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventario` (
  `Nombre` varchar(50) DEFAULT NULL,
  `Categoria` varchar(50) DEFAULT NULL,
  `Situacion` varchar(50) DEFAULT NULL,
  `Unidades` int(11) DEFAULT NULL,
  `Preciounidad` decimal(10,2) DEFAULT NULL,
  `Fecha` datetime DEFAULT NULL,
  `Reparacion` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
INSERT INTO `inventario` VALUES ('Alambre de cobre (metros)','Complementos','Estantería 2',10,0.50,'2001-09-15 00:00:00',''),('Alambre de latón (metros)','Complementos','Estantería 2',12,0.70,'2001-04-10 00:00:00',''),('Alicate corta-alambres','Herramientas','Panel 1',3,2.00,'2001-04-01 00:00:00','\0'),('Alicate universal','Herramientas','Panel 1',8,2.50,'2001-04-01 00:00:00','\0'),('Arandelas (bolsa varios tamaños)','Complementos','Armario 2',5,1.20,'2002-01-08 00:00:00','\0'),('Arco de sierra','Herramientas','Panel 2',2,2.60,'2001-04-10 00:00:00','\0'),('Arco segueta','Herramientas','Panel 2',2,2.80,'2000-10-01 00:00:00','\0'),('Bola de 12 mm','Complementos','Armario 2',25,1.80,'2001-05-01 00:00:00','\0'),('Bola de 4 mm','Complementos','Armario 2',150,1.90,'2001-09-12 00:00:00','\0'),('Bola de 9 mm','Complementos','Armario 2',50,2.00,'2001-04-01 00:00:00','\0'),('Bombilla 4,5 V','Electricidad','Armario 1',10,1.70,'2000-09-15 00:00:00','\0'),('Bombilla rosca esférica 4,5 V','Electricidad','Armario 1',8,1.80,'2002-02-02 00:00:00','\0'),('Bulón latón','Transmisión','Armario 5',10,2.00,'2000-10-01 00:00:00','\0'),('Cable paralelo (metros)','Electricidad','Armario 1',15,2.30,'2000-09-15 00:00:00','\0'),('Cable varios colores (metros)','Electricidad','Armario 1',50,2.20,'2001-12-20 00:00:00','\0'),('Clema de 4 conexiones','Electricidad','Armario 1',10,2.00,'2001-05-01 00:00:00','\0'),('Coche aeropropulsado','Motores','Vitrina',1,15000.00,'2001-02-16 00:00:00','\0'),('Conector banana','Electricidad','Armario 1',15,10.00,'2000-09-15 00:00:00','\0'),('Correa caucho','Transmisión','Armario 5',20,12.00,'2000-10-01 00:00:00','\0'),('Cortador de cuchilla fija','Herramientas','Estantería 1',3,13.00,'2001-09-15 00:00:00','\0'),('Cortador de cuchilla giratoria','Herramientas','Estantería 1',4,14.00,'2000-09-15 00:00:00',''),('Destornillador de estrella','Herramientas','Panel 1',6,5.80,'2001-04-10 00:00:00','\0'),('Destornillador plano','Herramientas','Panel 1',6,5.30,'2001-09-10 00:00:00','\0'),('Eje de biela con rótula','Transmisión','Armario 5',2,24.00,'2001-12-20 00:00:00','\0'),('Engranaje 17 dientes','Engranajes','Armario 5',8,9.00,'2001-12-20 00:00:00','\0'),('Engranaje 18/9 dientes','Engranajes','Armario 5',7,9.70,'2000-10-01 00:00:00','\0'),('Engranaje bulón 26 dientes','Engranajes','Armario 5',8,9.80,'2000-09-15 00:00:00','\0'),('Engranaje cónico','Engranajes','Armario 5',5,12.00,'2001-10-15 00:00:00',''),('Escofina','Herramientas','Estantería 2',6,10.00,'2000-09-15 00:00:00','\0'),('Escuadra carpintero','Herramientas','Panel 1',4,17.00,'2001-09-10 00:00:00','\0'),('Gafa de protección','Herramientas','Armario 1',15,15.50,'2002-02-02 00:00:00','\0'),('Gatos (juego)','Herramientas','Estantería 2',3,30.00,'2000-10-01 00:00:00','\0'),('Grapadora tapicero','Herramientas','Armario 2',2,25.00,'2001-05-01 00:00:00','\0'),('Guantes protectores','Herramientas','Armario 1',15,11.00,'2000-09-30 00:00:00','\0'),('Hélice tripala de latón','Hélices','Armario 3',6,23.00,'2001-05-01 00:00:00','\0'),('Hélice tripala de plástico','Hélices','Armario 3',16,20.00,'2001-05-21 00:00:00','\0'),('Hélice turbina','Hélices','Armario 3',6,16.00,'2001-12-20 00:00:00',''),('Interruptor','Electricidad','Armario 1',7,4.00,'2001-05-01 00:00:00','\0'),('Interruptor de contrapeso','Electricidad','Armario 1',6,5.00,'2001-09-15 00:00:00',''),('LED (verdes y rojos)','Electricidad','Armario 1',20,14.00,'2000-09-15 00:00:00','\0'),('Lima plana','Herramientas','Panel 2',3,12.00,'2001-02-16 00:00:00','\0'),('Lima triangular','Herramientas','Panel 2',3,13.00,'2002-01-08 00:00:00','\0'),('Martillo carpintero','Herramientas','Panel 2',8,14.75,'2001-02-16 00:00:00','\0'),('Martillo de goma','Herramientas','Panel 1',8,13.80,'2000-10-01 00:00:00','\0'),('Metro plegable','Herramientas','Estantería 1',12,11.80,'2000-09-15 00:00:00','\0'),('Micromotor con mecanismo reductor','Motores','Vitrina',4,26.00,'2002-02-02 00:00:00',''),('Motor 1,5-12 V','Motores','Armario 3',2,80.00,'2001-12-20 00:00:00','\0'),('Motor 4,5 V','Motores','Armario 3',1,60.00,'2000-09-15 00:00:00',''),('Motor 4,5 V doble eje','Motores','Armario 3',3,76.00,'2002-01-08 00:00:00','\0'),('Motor con hélice y timón','Motores','Vitrina',1,97.00,'2001-12-20 00:00:00','\0'),('Motor solar fotovoltaico','Motores','Vitrina',1,112.00,'2002-02-02 00:00:00',''),('Muelle comprimir','Complementos','Armario 2',10,40.00,'2001-05-21 00:00:00','\0'),('Muelle estirar','Complementos','Armario 2',10,42.00,'2001-05-01 00:00:00','\0'),('Nivel','Herramientas','Armario 1',6,27.00,'2002-01-08 00:00:00','\0'),('Pinza cocodrilo','Electricidad','Armario 1',8,17.00,'2002-02-02 00:00:00','\0'),('Piñón 10 dientes','Engranajes','Armario 5',9,12.00,'2001-09-20 00:00:00','\0'),('Piñón 10 dientes para motores','Engranajes','Armario 5',6,13.00,'2000-10-01 00:00:00','\0'),('Polea aluminio 12 mm','Poleas','Armario 4',15,20.00,'2000-09-30 00:00:00','\0'),('Polea aluminio 30 mm','Poleas','Armario 4',5,22.00,'2001-10-15 00:00:00','\0'),('Polea doble aluminio 30/10 mm','Poleas','Armario 4',6,27.00,'2001-09-30 00:00:00','\0'),('Polea latón 3 mm','Poleas','Armario 4',8,17.00,'2000-10-01 00:00:00','\0'),('Polea latón 5 mm','Poleas','Armario 4',10,18.00,'2000-09-30 00:00:00','\0'),('Polea latón 8 mm','Poleas','Armario 4',4,19.00,'2000-10-01 00:00:00',''),('Polea plástico 15 mm','Poleas','Armario 4',15,14.00,'2000-10-01 00:00:00','\0'),('Polea plástico 27 mm','Poleas','Armario 4',10,15.00,'2001-02-16 00:00:00','\0'),('Polea plástico 33 mm','Poleas','Armario 4',5,17.00,'2000-09-30 00:00:00','\0'),('Prolongador latón para ejes','Transmisión','Armario 5',12,11.00,'2000-10-01 00:00:00','\0'),('Regla metálica','Herramientas','Armario 2',2,9.00,'2001-09-30 00:00:00','\0'),('Rueda de 40 mm','Ruedas','Armario 4',10,28.00,'2001-04-01 00:00:00','\0'),('Rueda de 50 mm','Ruedas','Armario 4',10,30.00,'2001-02-16 00:00:00','\0'),('Rueda de 60 mm','Ruedas','Armario 4',10,36.00,'2001-09-30 00:00:00','\0'),('Serrucho de madera','Herramientas','Panel 2',2,27.00,'2001-02-16 00:00:00','\0'),('Sinfín latón','Transmisión','Armario 5',6,8.00,'2000-09-30 00:00:00','\0'),('Soldador eléctrico','Herramientas','Armario 1',2,120.00,'2000-09-15 00:00:00',''),('Tijera electricista','Herramientas','Panel 1',3,18.00,'2001-02-16 00:00:00','\0'),('Tijera para cartón','Herramientas','Estantería 1',15,12.00,'2000-09-15 00:00:00','\0'),('Tornillos (bolsa varios tamaños)','Complementos','Armario 2',5,10.00,'2000-09-15 00:00:00','\0'),('Tuercas (bolsa varios tamaños)','Complementos','Armario 2',5,12.00,'2000-09-15 00:00:00','\0');
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-10-20 14:23:29
