-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.28-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para trabajofinalprogramacion
CREATE DATABASE IF NOT EXISTS `trabajofinalprogramacion` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;
USE `trabajofinalprogramacion`;

-- Volcando estructura para tabla trabajofinalprogramacion.bodybuilder
CREATE TABLE IF NOT EXISTS `bodybuilder` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Height` int(11) NOT NULL,
  `Weight` decimal(5,2) NOT NULL,
  `Category` int(4) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `fk_category` (`Category`),
  CONSTRAINT `fk_category` FOREIGN KEY (`Category`) REFERENCES `category` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla trabajofinalprogramacion.bodybuilder: ~3 rows (aproximadamente)
INSERT INTO `bodybuilder` (`Id`, `Name`, `Age`, `Height`, `Weight`, `Category`) VALUES
	(58, 'Ronnie Coleman', 107, 190, 90.00, 1),
	(83, 'Ramon DIno', 23, 190, 90.00, 2),
	(90, 'Mauro', 23, 170, 91.00, 3),
	(94, 'Dani', 20, 190, 90.00, 3);

-- Volcando estructura para tabla trabajofinalprogramacion.category
CREATE TABLE IF NOT EXISTS `category` (
  `Id` int(4) NOT NULL AUTO_INCREMENT,
  `Name` varchar(10) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla trabajofinalprogramacion.category: ~2 rows (aproximadamente)
INSERT INTO `category` (`Id`, `Name`) VALUES
	(1, 'Open'),
	(2, 'Classic'),
	(3, 'Mens');

-- Volcando estructura para tabla trabajofinalprogramacion.user
CREATE TABLE IF NOT EXISTS `user` (
  `Uid` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `UserSurname` varchar(30) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Password` varchar(200) NOT NULL,
  `Role` varchar(10) NOT NULL,
  PRIMARY KEY (`Uid`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla trabajofinalprogramacion.user: ~30 rows (aproximadamente)
INSERT INTO `user` (`Uid`, `Username`, `UserSurname`, `Email`, `Password`, `Role`) VALUES
	(10, 'admin', 'admin', 'admin@gmail.com', 'admin', 'Admin'),
	(11, 'ivan', 'ivan', 'ivan', 'ivan', 'Admin'),
	(12, 'garri', 'garri', 'garri', 'garri', 'User'),
	(17, 'admin', 'admin', 'admin', 'admin', 'User'),
	(18, 'Jesus', 'Azul', 'azul@gmail.com', 'jesus', 'Admin'),
	(19, 'jesus', 'jesus', 'jesus', 'jesus', 'Admin'),
	(22, 'Manolo', 'Manolo', 'Manolo', 'Manolo', 'Admin'),
	(23, 'sebas', 'sebas', 'sebas', 'sebas', 'User'),
	(24, 'Sebastian', 'Gandia', 'sebastian@gmail.com', 'sebas', 'Admin'),
	(25, 'ivan', 'oliver', 'ivanoliver@gmail.com', 'ivan', 'Admin'),
	(26, 'jesus', 'Vasquez', 'jesus@gmail.com', 'jesus', 'Admin'),
	(27, 'adrian', 'ruiz', 'adrian@gmail.com', 'adrian', 'Admin'),
	(28, 'David', 'Guisado', 'david@gmail.com', 'David', 'Admin'),
	(29, 'marta', 'marta', 'marta', 'marta', 'User'),
	(30, 'juan', 'juan', 'juan', 'juan', 'Admin'),
	(31, 'IvanFinal', 'dads', 'dasda', 'IvanFinal', 'User'),
	(32, 'lupe', 'lupe', 'lupe', 'lupe', 'Admin'),
	(33, 'genshin', 'genshin', 'genshin', 'genshin', 'Admin'),
	(34, 'genshin', 'genshin', 'genshin', 'genshin', 'Admin'),
	(35, '', '', '', '', 'Select'),
	(36, '', 'dad', 'dasd', 'dasd', 'Admin'),
	(37, '', 'dasd', 'dasd', 'dasd', 'User'),
	(38, '', '', '', '', 'Select'),
	(39, 'das', 'das', 'das', 'das', 'Admin'),
	(40, 'popop', 'popop', 'popop', 'popop', 'Admin'),
	(41, 'rei', 'ayanami', 'rei', 'rei', 'Admin'),
	(42, 'dasd', 'das', 'dasd', 'asdas', 'User'),
	(43, 'fdsfs', 'fsdfs', 'fsdfsd', 'fsdf', 'User'),
	(44, 'fafa', 'fafa', 'fafa', 'fafa', 'Admin'),
	(45, 'reireireireireirei', 'reireireireireirei', 'reireireireirei', 'reireireireirei', 'Admin'),
	(46, 'Roberto', 'Roberto', 'Roberto', 'Roberto', 'Admin'),
	(47, 'dasdas', 'dasdas', 'dasdas', 'dasdas', 'User'),
	(48, 'ggggg', 'ggggg', 'ggggg', 'ggggg', 'User'),
	(49, 'sebas', 'gandia', 'sebas@gmail.com', 'sebas', 'Admin'),
	(50, 'Dani', 'Dani', 'Dani', 'Dani', 'Admin'),
	(51, 'user', 'user', 'user', 'user', 'User');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
