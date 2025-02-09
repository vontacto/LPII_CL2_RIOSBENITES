-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 09-02-2025 a las 14:04:08
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdrios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_proveedorcl2`
--

CREATE TABLE IF NOT EXISTS `tbl_proveedorcl2` (
  `idproveedorcl2` int(11) NOT NULL AUTO_INCREMENT,
  `NOMPROVEECL2` varchar(255) DEFAULT NULL,
  `RUCPROVEECL2` varchar(255) DEFAULT NULL,
  `RSOCIALPROVEECL2` varchar(255) DEFAULT NULL,
  `EMAILPROVEECL2` varchar(255) DEFAULT NULL,
  `FEINGPROVEECL2` date DEFAULT NULL,
  PRIMARY KEY (`idproveedorcl2`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Volcado de datos para la tabla `tbl_proveedorcl2`
--

INSERT INTO `tbl_proveedorcl2` (`idproveedorcl2`, `NOMPROVEECL2`, `RUCPROVEECL2`, `RSOCIALPROVEECL2`, `EMAILPROVEECL2`, `FEINGPROVEECL2`) VALUES
(1, 'Carlos', '5654654654', 'Ciber', 'carlos@gmail.com', '2025-02-09'),
(2, 'Mario', '13432', 'Rios', 'rios@gmail.com', '2025-02-09'),
(3, 'JOse', '654654', 'Maersk', 'jose@gmail.com', '2025-02-09'),
(7, 'Pedro', '54564', '464', 'pedro@gmail.com', '2025-02-09'),
(13, 'Gustavo', '894654654', 'Maroit', 'gutavo@gmail.com', '2025-02-09');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuariocl2`
--

CREATE TABLE IF NOT EXISTS `tbl_usuariocl2` (
  `idusuariocl2` int(11) NOT NULL AUTO_INCREMENT,
  `usuariocl2` varchar(255) NOT NULL,
  `passwordcl2` varchar(255) NOT NULL,
  PRIMARY KEY (`idusuariocl2`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `tbl_usuariocl2`
--

INSERT INTO `tbl_usuariocl2` (`idusuariocl2`, `usuariocl2`, `passwordcl2`) VALUES
(1, 'usuario1', 'password123'),
(2, 'usuario2', 'mypassword'),
(3, 'admin', 'admin'),
(4, 'johndoe', 'johnsecure'),
(5, 'janedoe', 'janesecure');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
