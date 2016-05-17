-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 2016 m. Geg 17 d. 20:09
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sudoku`
--

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `sudoku`
--

DROP TABLE IF EXISTS `sudoku`;
CREATE TABLE IF NOT EXISTS `sudoku` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DURATION` int(11) DEFAULT NULL,
  `INITIAL` varchar(255) DEFAULT NULL,
  `SOLVED` varchar(255) DEFAULT NULL,
  `TYPE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Sukurta duomenų kopija lentelei `sudoku`
--

INSERT INTO `sudoku` (`ID`, `DURATION`, `INITIAL`, `SOLVED`, `TYPE`) VALUES
(1, 20, 'https://www.dropbox.com/s/8e3icfm6nbrlkjy/1.jpg?raw=1', 'https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Sudoku-by-L2G-20050714_solution.svg/2000px-Sudoku-by-L2G-20050714_solution.svg.png', 'EASY'),
(2, 23, 'http://www.educationworld.com/a_lesson/sudoku/images/sudoku_002.gif', 'http://www.educationworld.com/a_lesson/sudoku/images/sudoku_002.gif', 'MEDIUM'),
(3, 23, 'https://static-secure.guim.co.uk/sys-images/Guardian/Pix/pictures/2013/5/8/1368009788984/Sudoku2500hard.gif', 'https://static-secure.guim.co.uk/sys-images/Guardian/Pix/pictures/2013/5/8/1368009788984/Sudoku2500hard.gif', 'MEDIUM'),
(4, 24, 'http://blog.oup.com/wp-content/uploads/2012/02/17CluePuzzle1.jpg', 'https://www.brainbashers.com/gifs/sudokucomplete.gif', 'HARD'),
(5, 23, 'http://www.jibble.org/impossible-sudoku/UNSOLVABLE-1.png', 'http://www.educationworld.com/a_lesson/sudoku/images/sudoku_002.gif', 'MEDIUM');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
