-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.18-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cadproduto
--

CREATE DATABASE IF NOT EXISTS cadproduto;
USE cadproduto;

--
-- Definition of table `cadprod`
--

DROP TABLE IF EXISTS `cadprod`;
CREATE TABLE `cadprod` (
  `idCADPROD` int(10) unsigned NOT NULL auto_increment,
  `NOME` varchar(45) default NULL,
  `MARCA` varchar(45) default NULL,
  `CODIGO` int(45) unsigned NOT NULL,
  `PRECO` float default NULL,
  `CATEGORIA` varchar(45) default NULL,
  `VALIDADE` int(45) unsigned NOT NULL,
  `MERCADORIA` varchar(45) NOT NULL,
  PRIMARY KEY  (`idCADPROD`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cadprod`
--

/*!40000 ALTER TABLE `cadprod` DISABLE KEYS */;
INSERT INTO `cadprod` (`idCADPROD`,`NOME`,`MARCA`,`CODIGO`,`PRECO`,`CATEGORIA`,`VALIDADE`,`MERCADORIA`) VALUES 
 (2,'sdad','asdad',333,66,'sdad',336,'NACIONAL'),
 (3,'dasda','dasdsa',222,30,'sdad',33,'IMPORTADO'),
 (4,'arroz','arroz',605,10,'alimento',40502021,'IMPORTADO'),
 (5,'açucar','cristalina',998,12,'alimento',21122021,'IMPORTADO');
/*!40000 ALTER TABLE `cadprod` ENABLE KEYS */;


--
-- Definition of table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `idusuario` int(10) NOT NULL auto_increment,
  `senha` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `EMAIL` varchar(30) default NULL,
  `DATCAD` int(11) NOT NULL,
  `NIVEL` varchar(45) NOT NULL,
  PRIMARY KEY  (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuario`
--

/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`idusuario`,`senha`,`nome`,`EMAIL`,`DATCAD`,`NIVEL`) VALUES 
 (1,'123','eu','gioo',4080999,'ADMINISTRADOR '),
 (4,'sadad','sadad','sda',6555,'ADMINISTRADOR '),
 (5,'321','giovana','giovana@gmail.com',10102020,'ADMINISTRADOR '),
 (6,'321','Paulo','paulo@gmail.com',10102020,'ADMINISTRADOR ');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
