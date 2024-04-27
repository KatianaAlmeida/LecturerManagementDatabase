DROP DATABASE IF EXISTS `Lecturer`;
CREATE DATABASE `Lecturer` DEFAULT CHARACTER SET utf8mb4;
USE `Lecturer`;
--
-- Lecturer Details Table`
--
DROP TABLE IF EXISTS `lecturerDetails`;
CREATE TABLE `lecturerDetails` (
 `lecturerID` INT NOT NULL AUTO_INCREMENT,
 `lecturerFirstName` VARCHAR(50) NOT NULL,
 `lecturerLastName` VARCHAR(50) NOT NULL,
 `campusName` VARCHAR(150) NOT NULL,
 PRIMARY KEY (`lecturerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
