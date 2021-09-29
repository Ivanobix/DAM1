
CREATE DATABASE  IF NOT EXISTS `mundo` ;
USE `mundo`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: mundo
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
-- Table structure for table `paises`
--

DROP TABLE IF EXISTS `paises`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paises` (
  `Pais` varchar(50) NOT NULL,
  `Capital` varchar(50) DEFAULT NULL,
  `Moneda` varchar(50) DEFAULT NULL,
  `Superficie` int(11) DEFAULT NULL,
  `Poblacion` int(11) DEFAULT NULL,
  `Esperanzavida` int(11) DEFAULT NULL,
  `Mort_infantil` int(11) DEFAULT NULL,
  `PNB` int(11) DEFAULT NULL,
  `PNBpercapita` int(11) DEFAULT NULL,
  `Lengua` varchar(17) DEFAULT NULL,
  `Religion` varchar(15) DEFAULT NULL,
  `Continente` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Pais`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises`
--

LOCK TABLES `paises` WRITE;
/*!40000 ALTER TABLE `paises` DISABLE KEYS */;
INSERT INTO `paises` VALUES ('Afganistán','Kabul','Afgani',647497,23481000,44,158,7360,400,'Pashto-Dari','Musulmana','Asia'),('Albania','Tirana','Lek',28748,3260000,73,30,2199,670,'Tosco-Griego','Atea','Europa'),('Alemania','Berlín','Marco',356755,81869000,76,6,2252343,27510,'Alemán','Protestante','Europa'),('Andorra','Andorra la Vieja','Peseta/Franco',453,64000,0,0,930,15000,'Catalán','Católica','Europa'),('Angola','Luanda','Nueva Kwanza',1246700,10772000,47,124,4422,410,'Portugués','Animista','Africa'),('Antigua y Barbuda','Saint John´s','Dólar Caribe oriental',440,65000,75,18,420,6970,'Inglés','Anglicana','América'),('Antillas Holandesas','Willemstad','Florín',961,200000,77,11,2000,10000,'Neerlandés','Católica','América'),('Arabia Saudí','Riad','Riyal',2149690,18979000,70,21,133540,7040,'Arabe','Musulmana','Asia'),('Argelia','Argel','Dinar',2381741,27959000,70,34,44609,1600,'Arabe','Musulmana','Africa'),('Argentina','Buenos Aires','Peso',2766889,34665000,73,22,278431,8030,'Español','Católica','América'),('Armenia','Eriván','Dram',29800,3760000,71,16,2752,730,'Ruso','Atea','Asia'),('Aruba','Oranjestad','Florín',190,80000,0,0,1080,15000,'Neerlandés','Católica','América'),('Australia','Camberra','Dólar australiano',7686848,18054000,77,6,337909,18720,'Inglés','Anglicana','Oceanía'),('Austria','Viena','Chelín',83849,8054000,77,6,216547,26890,'Alemán','Católica','Europa'),('Azerbaiyán','Bakú','Manat',86600,7510000,70,25,3601,480,'Ruso','Atea','Asia'),('Bahamas','Nassau','Dólar de Bahamas',13935,276000,73,15,3297,11940,'Inglés','Protestante','América'),('Bahrein','Manamá','Dinar',692,577000,72,19,4525,7840,'Arabe','Musulmana','Asia'),('Bangladesh','Dhaka','Taka',143998,119768000,58,79,28599,240,'Bengalí','Musulmana','Asia'),('Barbados','Bridgetown','Dólar de Barbados',431,266000,78,13,1745,6560,'Inglés','Anglicana','América'),('Bélgica','Bruselas','Franco belga',30513,10146000,77,8,250710,24710,'Francés','Católica','Europa'),('Belice','Belmopan','Dólar de Belice',23667,216000,70,36,568,2630,'Inglés','Católica','América'),('Benin','Porto Novo','Franco CFA',112622,5475000,50,95,2034,370,'Francés','Musulmana','Africa'),('Bermudas','Hamilton','Dólar',53,63000,0,0,1860,26600,'Inglés','Anglicana','América'),('Bielorrusia','Minsk','Rublo bielorruso',207595,10339000,70,13,21356,2070,'Ruso','Atea','Europa'),('Bolivia','La Paz','Boliviano',1098581,7414000,60,69,5905,800,'Español','Católica','América'),('Bosnia-Herzegovina','Sarajevo','Dinar',51129,4500000,0,0,3150,700,'Serbocroata','Aconfesional','Europa'),('Botsuana','Gaborone','Pula',600372,1450000,68,56,4381,3020,'Tswana','Animista','Africa'),('Brasil','Brasilia','Real',8511965,159222000,67,44,579787,3640,'Portugués','Católica','América'),('Brunei','Bandar','Dólar de Brunei',5765,285000,75,9,4200,14500,'Malayo','Musulmana','Asia'),('Bulgaria','Sofía','Lev',110912,8409000,71,15,11225,1330,'Búlgaro','Aconfesional','Europa'),('Burkina Faso','Uagadugu','Franco CFA',274200,10377000,49,99,2417,230,'Francés','Animista','Africa'),('Burundi','Bujumbura','Franco',27834,6264000,49,98,984,160,'Kirundi','Católica','Africa'),('Bután','Timphu','Ngultrum',47000,695000,0,0,295,420,'Dzongkha','Budista','Asia'),('Cabo Verde','Praïa','Escudo',4033,380000,65,46,366,960,'Portugués','Católica','Africa'),('Camboya','Phnom Penh','Riel',181035,10024000,53,108,2718,270,'Khmer','Budista','Asia'),('Camerún','Yaundé','Franco CFA',475442,13288000,57,56,8615,650,'Francés','Católica','Africa'),('Canadá','Ottawa','Dólar canadiense',9976139,29606000,78,6,573695,19380,'Francés','Protestante','América'),('Chad','N´Yamena','Franco CFA',1284000,6448000,48,117,1144,180,'Francés','Animista','Africa'),('Chile','Santiago','Peso',756945,14225000,72,12,59151,4160,'Español','Católica','América'),('China','Pekín','Yuan',9596961,1200241000,69,34,744890,620,'Chino','Aconfesional','Asia'),('Chipre','Nicosia','Libra Chipriota',9251,734000,78,8,8700,11500,'Griego-Turco','Ortodoxa','Asia'),('Colombia','Bogotá','Peso',1138914,36813000,70,26,70263,1910,'Español','Católica','América'),('Comores','Moroni','Franco comoriano',2171,499000,56,87,237,470,'Francés','Musulmana','Africa'),('Congo','Brazzaville','Franco CFA',342000,2633000,51,90,1784,680,'Francés','Católica','Africa'),('Corea del Norte','Pyongyang','Won',120538,23867000,70,26,12870,550,'Coreano','Aconfesional','Asia'),('Corea del Sur','Seúl','Won',98484,44851000,72,10,435137,9700,'Coreano','Confucionista','Asia'),('Costa de Marfil','Abiyán','Franco CFA',322462,13978000,55,86,9248,660,'Francés','Animista','Africa'),('Costa Rica','San José','Colón',50700,3399000,77,13,8884,2610,'Español','Católica','América'),('Croacia','Zagreb','Kuna',56538,4778000,74,16,15508,3250,'Serbocroata','Aconfesional','Europa'),('Cuba','La Habana','Peso ',110861,11011000,76,9,7150,650,'Español','Aconfesional','América'),('Dinamarca','Copenhague','Corona danesa',43069,5220000,75,6,156027,29890,'Danés','Protestante','Europa'),('Dominica','Roseau','Dólar Caribe oriental',751,73000,73,17,218,2990,'Inglés','Católica','América'),('Ecuador','Quito','Sucre',283561,11477000,69,36,15997,1390,'Español','Católica','América'),('Egipto','El Cairo','Libra egipcia',1001440,57800000,63,56,45507,790,'Arabe','Musulmana','Africa'),('El Salvador','San Salvador','Colón',21041,5623000,67,36,9057,1610,'Español','Católica','América'),('Emiratos Árabes Unidos','Abu Dabi','Dirham',83600,2460000,75,16,42806,17400,'Arabe','Musulmana','Asia'),('Eritrea','Asmara','Birr',117600,3400000,0,0,578,170,'Amarico','Católica','Africa'),('Eslovaquia','Bratislava','Corona eslovaca',49035,5369000,72,11,15848,2950,'Eslovaco','Aconfesional','Europa'),('Eslovenia','Ljubliana','Tolar',20521,1992000,74,7,16328,8200,'Serbocroata','Aconfesional','Europa'),('España','Madrid','Peseta',504782,39199000,77,7,532347,13580,'Español','Aconfesional','Europa'),('Estados Unidos','Washington','Dólar',9363123,263119000,77,8,7100007,26980,'Inglés','Protestante','América'),('Estonia','Tallin','Corona',45100,1487000,70,14,4252,2860,'Ruso','Atea','Europa'),('Etiopía','Addis Abeba','Birr',1104300,56404000,49,112,5722,100,'Amarico','Católica','Africa'),('Filipinas','Manila','Peso',300000,68595000,66,39,71865,1050,'Tagalo','Católica','Asia'),('Finlandia','Helsinki','Marco finlandés',337009,5110000,76,5,105174,20580,'Finés','Protestante','Europa'),('Fiyi','Suva','Dólar Fiyi',18272,775000,72,21,1895,2440,'Inglés','Católica','Oceanía'),('Francia','París','Franco',547026,58060000,78,6,1451051,24990,'Francés','Católica','Europa'),('Gabón','Libreville','Franco CFA',267667,1077000,55,89,3759,3490,'Francés','Católica','Africa'),('Gambia','Banjul','Dalasi',11295,1113000,46,126,354,320,'Inglés','Musulmana','Africa'),('Gaza y Cisjordania','–','Shekel/Dinar',5258,2151000,0,28,0,0,'Arabe','Musulmana','Asia'),('Georgia','Tbilissi','Rublo',69700,5400000,73,18,2358,440,'Ruso','Atea','Asia'),('Ghana','Accra','Cedi',238537,17075000,59,73,6719,390,'Inglés','Animista','Africa'),('Granada','Saint George´s','Dólar caribeño',344,91000,0,0,271,2980,'Inglés','Católica','América'),('Grecia','Atenas','Dracma',131944,10467000,78,8,85885,8210,'Griego','Ortodoxa','Europa'),('Groenlandia','Nuuk','Corona danesa',2175600,56000,68,0,940,17000,'Danés','Protestante','América'),('Guadalupe','Basse Terre','Franco francés',1779,424000,75,11,3600,8800,'Francés','Católica','América'),('Guam','Agaña','Dólar',549,149000,73,9,1540,11000,'Inglés','Protestante','América'),('Guatemala','Guatemala','Quezal',108899,10621000,66,44,14255,1340,'Español','Católica','América'),('Guayana Francesa','Cayenne','Franco francés',91000,145000,0,0,1400,10000,'Francés','Católica','América'),('Guinea Conakry','Conakry','Franco guineano',245857,6591000,44,128,3593,550,'Francés','Católica','Africa'),('Guinea Ecuatorial','Malabo','Franco CFA',28051,400000,49,111,152,380,'Español','Católica','Africa'),('Guinea-Bissau','Bissau','Peso',36125,1070000,38,136,265,250,'Portugués','Animista','Africa'),('Guyana','Georgetown','Dólar de Guayana',214969,835000,66,60,493,590,'Inglés','Católica','América'),('Haití','Puerto Príncipe','Gurde',27750,7168000,57,72,1777,250,'Francés','Católica','América'),('Holanda','Amsterdam','Florín ',40844,15460000,78,6,371039,24000,'Neerlandés','Católica','Europa'),('Honduras','Tegucigalpa','Lempira',112088,5924000,67,45,3566,600,'Español','Católica','América'),('Hong Kong','Hong Kong','Dólar Hong Kong',1045,6190000,79,5,142332,22990,'Chino','Budista','Asia'),('Hungría','Budapest','Forint',93030,10229000,70,11,42129,4120,'Húngaro','Católica','Europa'),('India','Nueva Delhi','Rupia',3287590,929358000,62,68,319660,340,'Hindi','Hinduista','Asia'),('Indonesia','Yakarta','Rupia',1904569,193277000,64,51,190105,980,'Bahasa indonesia','Musulmana','Asia'),('Irak','Bagdad','Dinar',434924,20097000,66,108,24600,1200,'Arabe','Musulmana','Asia'),('Irán','Teherán','Rial',1648000,64120000,68,45,113400,1850,'Farsi','Musulmana','Asia'),('Irlanda','Dublín','Libra',70283,3586000,77,6,52765,14710,'Irlandés','Católica','Europa'),('Isla de Man','Douglas','Libra esterlina',572,70000,0,0,1050,15000,'Inglés','Católica','Europa'),('Islandia','Reikiavik','Corona islandesa',103000,268000,79,4,6686,24950,'Islandés','Protestante','Europa'),('Islas Caimán','George Town','Dólar de Caimanés',260,33000,0,0,740,24000,'Inglés','Anglicana','América'),('Islas del Canal','Saint Helier','Libra esterlina',195,142000,78,7,2250,15500,'Inglés','Anglicana','Europa'),('Islas Feroe','Torshavn','Corona de Feroe',1400,45000,0,0,510,11000,'Danés','Protestante','Europa'),('Islas Marianas','Saipan','Dólar',477,69000,0,0,110,2500,'Inglés','Protestante','Asia'),('Islas Marshall','Majuro','Dólar',171,56000,0,0,90,1680,'Inglés','Protestante','Oceanía'),('Islas Mayotte','Dzaoudzi','Franco',375,106000,0,0,390,3500,'Francés','Católica','Africa'),('Islas Salomón','Honiara','Dólar Salomón',28446,375000,63,41,341,910,'Inglés','Animista','Oceanía'),('Islas Vírgenes (EE UU)','Charlotte Amalie','Dólar',344,99000,76,19,1790,17000,'Inglés','Protestante','América'),('Israel','Jerusalén','Shekel',20770,5521000,77,8,87875,15920,'Hebreo','Judía','Asia'),('Italia','Roma','Lira',301225,57204000,78,7,1088085,19020,'Italiano','Católica','Europa'),('Jamaica','Kingston','Dólar jamaicano',10991,2522000,74,13,3803,1510,'Inglés','Protestante','América'),('Japón','Tokio','Yen',372313,125213000,80,4,4963587,39640,'Japonés','Sintoista','Asia'),('Jordania','Amman','Dinar',97740,4212000,70,31,6354,1510,'Arabe','Musulmana','Asia'),('Kazajistán','Alma Ata','Tengué',2750000,16606000,69,27,22143,1330,'Ruso','Atea','Asia'),('Kenia','Nairobi','Chelin',582646,26688000,58,58,7583,280,'Suahili','Animista','Africa'),('Kirguizistán','Bichkek','Som',198500,4515000,68,30,3158,700,'Ruso','Atea','Asia'),('Kiribati','Tarawa','Dólar australiano',728,79000,58,55,73,920,'Inglés','Católica','Oceanía'),('Kuwait','Kuwait','Dinar',17818,1664000,76,11,28941,17390,'Arabe','Musulmana','Asia'),('Laos','Vientiane','Kip',236800,4882000,52,90,1694,350,'Lao','Budista','Asia'),('Lesoto','Maseru','Loti',30355,1980000,61,76,1519,770,'Sesotho','Católica','Africa'),('Letonia','Riga','Lat',64500,2516000,69,16,5708,2270,'Ruso','Atea','Europa'),('Líbano','Beirut','Libra libanesa',10400,4005000,68,32,10673,2660,'Arabe','Musulmana','Asia'),('Liberia','Monrovia','Dólar liberiano',111369,2733000,54,172,500,200,'Inglés','Animista','Africa'),('Libia','Trípoli','Dinar',1759540,5407000,65,61,23400,4500,'Arabe','Musulmana','Africa'),('Liechtenstein','Vaduz','Franco suizo',157,31000,0,0,1050,35000,'Alemán','Católica','Europa'),('Lituania','Vilna','Litas',65200,3715000,69,14,7070,1900,'Ruso','Atea','Europa'),('Luxemburgo ','Luxemburgo','Franco luxemburgués',2586,410000,76,6,16876,41210,'Francés','Católica','Europa'),('Macao','Macao','Pataca',16,450000,77,7,7300,18260,'Portugués','Católica','Asia'),('Macedonia','Scopie','Dinar',25713,2119000,73,23,1813,860,'Turco','Musulmana','Europa'),('Madagascar','Antananarivo','Franco malgache',587041,13651000,52,89,3178,230,'Malgache','Animista','Africa'),('Malaisia','Kuala Lumpur','Ringgit',329749,20140000,71,12,78321,3890,'Malayo','Musulmana','Asia'),('Malaui','Lilongwé','Kwacha',118484,9757000,43,133,1623,170,'Inglés','Protestante','Africa'),('Maldivas','Malé','Rufiyaa',298,253000,63,52,251,990,'Maldivo','Musulmana','Asia'),('Malí','Bamaco','Franco CFA',1240000,9788000,50,123,2410,250,'Francés','Musulmana','Africa'),('Malta','La Valeta','Libra maltesa',316,372000,77,9,3100,8500,'Inglés','Católica','Europa'),('Marruecos','Rabat','Dirham',446550,26562000,65,55,29545,1110,'Arabe','Musulmana','Africa'),('Martinica','Fuerte Francia','Franco',1102,380000,77,7,4000,10500,'Francés','Católica','América'),('Mauricio','Puerto Luis','Rupia',2040,1128000,71,16,3185,3380,'Inglés','Hinduista','Africa'),('Mauritania','Nuakchott','Ouguiya',1030700,2274000,51,96,1049,460,'Francés','Musulmana','Africa'),('México','México Distrito Federal','Nuevo peso',1972547,91831000,72,33,304596,3320,'Español','Aconfesional','América'),('Micronesia','Palikir','Dólar',702,107000,64,32,215,1890,'Inglés','Protestante','América'),('Moldavia','Kichinev','Leu moldavo',33700,4344000,69,22,3996,920,'Rumano','Aconfesional','Europa'),('Mónaco','Mónaco','Franco francés',2,34000,0,0,800,25000,'Francés','Católica','Europa'),('Mongolia','Ulan Bator','Tugrik',1565000,2461000,65,55,767,310,'Mongol','Aconfesional','Asia'),('Mozambique','Maputo','Metical',783030,16168000,47,113,1353,80,'Portugués','Animista','Africa'),('Myanmar (Birmania)','Yangon','Kyat',676552,45106000,59,83,35840,800,'Birmano','Budista','Asia'),('Namibia','Windhoek','Dolar namibies',824290,1545000,59,62,3098,2000,'Inglés','Luterana','Africa'),('Nepal','Katmandú','Rupia nepalesa',140797,21456000,55,91,4391,200,'Nepalí','Hinduista','Asia'),('Nicaragua','Managua','Córdoba',130000,4375000,68,46,1659,380,'Español','Católica','América'),('Niger','Niamey','Franco CFA',1267000,9028000,47,119,1961,220,'Francés','Musulmana','Africa'),('Nigeria','Lagos','Naira',923768,111273000,53,80,28411,260,'Inglés','Musulmana','Africa'),('Noruega','Oslo','Corona noruega',324219,4354000,78,5,136077,31250,'Noruego','Protestante','Europa'),('Nueva Caledonia','Numea','Franco CFP',19058,185000,73,15,2120,11500,'Francés','Católica','Oceanía'),('Nueva Zelanda ','Wellington','Dólar NZ',268676,3601000,76,7,51655,14340,'Inglés','Protestante','Oceanía'),('Omán','Mascate','Rial omani',212457,2196000,70,18,10578,4820,'Arabe','Musulmana','Asia'),('Pakistán','Islamabad','Rupia',803943,129905000,60,90,59991,460,'Urdu','Musulmana','Asia'),('Panamá','Panamá','Balboa',77082,2631000,73,23,7253,2750,'Español','Católica','América'),('Papúa Nueva Guinea','Puerto Moresby','Kina',461691,4302000,57,64,4976,1160,'Inglés','Animista','Oceanía'),('Paraguay','Asunción','Guarany',406752,4828000,68,41,8158,1690,'Español','Católica','América'),('Perú','Lima','Nuevo Sol',1285216,23819000,66,47,55019,2310,'Español','Católica','América'),('Polinesia Francesa','Papeete','Franco CFP',3521,225000,70,17,2200,10500,'Francés','Católica','Oceanía'),('Polonia','Varsovia','Zloty',312677,38612000,70,14,107829,2790,'Polaco','Católica','Europa'),('Portugal','Lisboa','Escudo',92082,9927000,75,7,96829,9740,'Portugués','Católica','Europa'),('Puerto Rico','San Juan','Dólar',8897,3717000,75,11,28340,7660,'Español','Católica','América'),('Qatar','Doha','Rial',11427,642000,72,18,7448,11600,'Arabe','Musulmana','Asia'),('Reino Unido','Londres','Libra esterlina',244046,58533000,77,6,1094734,18700,'Inglés','Anglicana','Europa'),('República Centroafricana','Bangui','Franco CFA',622984,3275000,48,98,1123,340,'Francés','Animista','Africa'),('República Checa','Praga','Corona',79000,10332000,73,8,39990,3870,'Checo','Aconfesional','Europa'),('República de Yemen','Sanaa','Rial',527968,15272000,53,100,4044,260,'Arabe','Musulmana','Asia'),('República Democrática del Congo','Kinshasa','Nuevo Zaire',2345409,43848000,0,0,5313,120,'Francés','Católica','Africa'),('República Dominicana','Santo Domingo','Peso ',48734,7822000,71,37,11390,1460,'Español','Católica','América'),('Reunión','Saint Denis','Franco',2510,653000,74,8,5300,8030,'Francés','Católica','Africa'),('Ruanda','Kigali','Franco ruandés',26338,6400000,39,133,1128,180,'Francés','Católica','Africa'),('Rumania','Bucarest','Leu',237500,22692000,70,23,33488,1480,'Rumano','Aconfesional','Europa'),('Rusia','Moscú','Rublo',17075400,148195000,65,18,331948,2240,'Ruso','Atea','Europa'),('Samoa Norteamericana','Fagatogo','Dólar',197,57000,0,0,390,8100,'Inglés','Protestante','Oceanía'),('Samoa Occidental','Apia','Tala',2842,165000,68,22,184,1120,'Inglés','Protestante','Oceanía'),('San Vicente y Granadinas','Kingston','Dólar caribe oriental',388,111000,72,19,253,2280,'Inglés','Protestante','América'),('Sant Kitts-Nevis','Basseterre','Dólar caribe oriental',267,41000,69,31,212,5170,'Inglés','Anglicana','América'),('Santa Lucía','Castries','Dólar caribe oriental',615,158000,71,17,532,3370,'Inglés','Protestante','América'),('Santo Tomé y Príncipe','Santo Tomé','Dobra',964,129000,69,60,45,350,'Portugués','Católica','Africa'),('Senegal','Dakar','Franco CFA',196192,8468000,50,62,5070,600,'Francés','Musulmana','Africa'),('Seychelles','Victoria','Rupia Seychelles',280,74000,72,15,487,6620,'Criollo','Católica','Africa'),('Sierra Leona','Freetown','Leone',71740,4195000,40,179,762,180,'Inglés','Animista','Africa'),('Singapur','Singapur','Dólar de Singapur',618,2987000,76,4,79831,26730,'Malayo','Hinduista','Asia'),('Siria','Damasco','Libra siria',185180,14112000,68,32,15780,1120,'Arabe','Musulmana','Asia'),('Somalia','Mogadiscio','Chelin somalí',637657,9491000,49,128,1355,150,'Somalí','Musulmana','Africa'),('Sri Lanka','Colombo','Rupia',65610,18114000,72,16,12616,700,'Cingalés','Budista','Asia'),('Suazilandia','Mbabane','Lilangeni',17363,900000,58,69,1051,1170,'Inglés','Protestante','Africa'),('Sudán','Jartum','Dinar',2505813,26707000,54,77,7510,260,'Arabe','Musulmana','Africa'),('Suecia','Estocolmo','Corona',449964,8830000,79,4,209720,23750,'Sueco','Protestante','Europa'),('Suiza','Berna','Franco suizo',41288,7039000,78,6,286014,40630,'Alemán','Protestante','Europa'),('Suráfrica','Pretoria','Rand',1221037,41457000,64,50,130918,3160,'Afrikaans','Protestante','Africa'),('Surinam','Paramaribo','Florín de Surinám',163265,410000,70,33,360,880,'Neerlandés','Hinduista','América'),('Tailandia','Bangkok','Baht',514000,58242000,69,35,159630,2740,'Thai','Budista','Asia'),('Tanzania','Dodoma','Chelín tanzano',945087,29646000,51,82,3703,120,'Suahili','Musulmana','Africa'),('Tayikistán','Dushambé','Rublo tayik',143100,5836000,67,42,1976,340,'Ruso','Atea','Asia'),('Togo','Lomé','Franco CFA',56785,4085000,56,88,1266,310,'Francés','Católica','Africa'),('Tonga','Nuku Alofa','Pa´anga',697,104000,69,18,170,1630,'Tongueño','Católica','Oceanía'),('Trinidad y Tobago','Puerto España','Dólar Trinidad Tobago',5130,1287000,72,13,4851,3770,'Inglés','Protestante','América'),('Túnez','Túnez','Dinar',163610,8987000,69,39,16369,1820,'Arabe','Musulmana','Africa'),('Turkmenistán','Achkhabad','Manat',488100,4508000,67,46,4125,920,'Turco','Atea','Asia'),('Turquía','Ankara','Libra turca',780576,61058000,67,48,169452,2780,'Turco','Musulmana','Asia'),('Ucrania','Kiev','Karbovanet',603700,51550000,69,15,84084,1630,'Ruso','Atea','Europa'),('Uganda','Kampala','Chelín',236036,19168000,42,98,4668,240,'Inglés','Católica','Africa'),('Uruguay','Montevideo','Peso',176215,3184000,73,18,16458,5170,'Español','Católica','América'),('Uzbekistán','Tashkent','Sum',447000,22771000,70,30,21979,970,'Ruso','Atea','Asia'),('Vanuatu','Puerto-Vila','Vatu',14763,169000,64,41,202,1200,'Bislama','Protestante','Oceanía'),('Venezuela','Caracas','Bolivar',912050,21671000,71,23,65382,320,'Español','Católica','América'),('Vietnam','Hanoi','Nuevo Dong',329556,73475000,68,41,17634,240,'Vietnamita','Aconfesional','Asia'),('Yibuti','Yibuti','Franco de Yibuti',23000,634000,50,108,360,700,'Cusítica','Musulmana','Africa'),('Yugoslavia ','Belgrado','Nuevo Dinar',87968,10518000,73,18,9940,920,'Serbocroata','Aconfesional','Europa'),('Zambia','Lusaka','Kwacha',752614,8978000,46,109,3605,400,'Inglés','Animista','Africa'),('Zimbabue','Hararé','Dólar zimbabués',390580,11011000,57,55,5933,540,'Inglés','Animista','Africa');
/*!40000 ALTER TABLE `paises` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

