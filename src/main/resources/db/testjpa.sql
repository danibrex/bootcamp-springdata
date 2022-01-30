-- SQL Dump
-- version 5.1.1
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-01-2022 a las 22:41:12
-- Versión del servidor: 10.4.21-MariaDB

--
-- Author Daniel
--
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `testjpa`
--
CREATE DATABASE IF NOT EXISTS `testjpa` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `testjpa`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO persona (id, nombre, apellidos) VALUES
(1, 'Marta', 'Nelson'),
(2, 'Daniel', 'Van'),
(3, 'Lucas ', 'Grijander'),
(4, 'Anastasio', 'Randelmore'),
(5, 'Carmen', 'Esther'),
(6, 'Daniel', 'Lord'),
(7, 'Lucas', 'Martón'),
(8, 'Sas', 'Anderson'),
(9, 'Jander', 'Clander'),
(10, 'Berta', 'Cleotilda'),
(11, 'Anabel', 'Cart'),
(12, 'Flanders', 'McYurtonite'),
(13, 'Rissoto', 'Parmesani Ramnna'),
(14, 'Julio', 'César'),
(15, 'Carmen Esther', 'Pichaco'),
(16, 'Felice J.', 'Anderson'),
(17, 'Barman', 'Stranger '),
(18, 'Babasos', 'Ambrosio'),
(19, 'Bingo', 'Chacho'),
(20, 'Noeman', 'Helderwitch'),
(21, 'dede', 'dede');


COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
