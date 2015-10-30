-- MySQL Script generated by MySQL Workbench
-- 10/29/15 16:26:58
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema test
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema test
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `test` DEFAULT CHARACTER SET utf8 ;
USE `test` ;

-- -----------------------------------------------------
-- Table `test`.`author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`author` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `firstName` VARCHAR(25) NULL DEFAULT NULL COMMENT '',
  `lastName` VARCHAR(25) NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `test`.`cart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`cart` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `test`.`page`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`page` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `test`.`media`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`media` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `title` VARCHAR(25) NOT NULL COMMENT '',
  `price` DECIMAL(15,3) NULL DEFAULT NULL COMMENT '',
  `nbPage` INT(11) NULL DEFAULT NULL COMMENT '',
  `nbTrack` INT(11) NULL DEFAULT NULL COMMENT '',
  `isbn` VARCHAR(25) NULL DEFAULT NULL COMMENT '',
  `category` INT(11) NULL DEFAULT NULL COMMENT '',
  `dateSortie` DATE NULL DEFAULT NULL COMMENT '',
  `Type` INT(11) NULL DEFAULT NULL COMMENT '',
  `id_Page` INT(11) NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `isbn` (`isbn` ASC)  COMMENT '',
  INDEX `FK_Media_id_Page` (`id_Page` ASC)  COMMENT '',
  CONSTRAINT `FK_Media_id_Page`
    FOREIGN KEY (`id_Page`)
    REFERENCES `test`.`page` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `test`.`mediaauthor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`mediaauthor` (
  `id` INT(11) NOT NULL COMMENT '',
  `id_Author` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`, `id_Author`)  COMMENT '',
  INDEX `FK_MediaAuthor_id_Author` (`id_Author` ASC)  COMMENT '',
  CONSTRAINT `FK_MediaAuthor_id`
    FOREIGN KEY (`id`)
    REFERENCES `test`.`media` (`id`),
  CONSTRAINT `FK_MediaAuthor_id_Author`
    FOREIGN KEY (`id_Author`)
    REFERENCES `test`.`author` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `test`.`mediacart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`mediacart` (
  `id` INT(11) NOT NULL COMMENT '',
  `id_Cart` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`, `id_Cart`)  COMMENT '',
  INDEX `FK_MediaCart_id_Cart` (`id_Cart` ASC)  COMMENT '',
  CONSTRAINT `FK_MediaCart_id`
    FOREIGN KEY (`id`)
    REFERENCES `test`.`media` (`id`),
  CONSTRAINT `FK_MediaCart_id_Cart`
    FOREIGN KEY (`id_Cart`)
    REFERENCES `test`.`cart` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `test`.`publisher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`publisher` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `firstName` VARCHAR(25) NULL DEFAULT NULL COMMENT '',
  `lastName` VARCHAR(25) NULL DEFAULT NULL COMMENT '',
  `id_Media` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `FK_Publisher_id_Media` (`id_Media` ASC)  COMMENT '',
  CONSTRAINT `FK_Publisher_id_Media`
    FOREIGN KEY (`id_Media`)
    REFERENCES `test`.`media` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
