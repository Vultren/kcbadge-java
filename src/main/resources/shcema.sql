-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema kcbadge
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema kcbadge
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `kcbadge` DEFAULT CHARACTER SET latin1 ;
USE `kcbadge` ;

-- -----------------------------------------------------
-- Table `kcbadge`.`ship_class`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`ship_class` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`ship_class` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name_en` VARCHAR(45) NULL DEFAULT NULL,
  `name_jp` VARCHAR(45) NULL DEFAULT NULL,
  `name_ch` VARCHAR(45) NULL DEFAULT NULL,
  `name_tw` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kcbadge`.`ship_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`ship_type` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`ship_type` (
  `id` VARCHAR(3) NOT NULL,
  `name_en` VARCHAR(45) NULL DEFAULT NULL,
  `name_jp` VARCHAR(45) NULL DEFAULT NULL,
  `name_ch` VARCHAR(45) NULL DEFAULT NULL,
  `name_tw` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kcbadge`.`offset`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`offset` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`offset` (
  `id` INT(11) NOT NULL,
  `offset_x` INT(11) NOT NULL DEFAULT 0,
  `offset_y` INT(11) NOT NULL DEFAULT 0,
  `dam_offset_x` INT(11) NOT NULL DEFAULT 0,
  `dam_offset_y` INT(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `kcbadge`.`ship`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`ship` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`ship` (
  `id` INT(11) NOT NULL,
  `ship_type` VARCHAR(3) NOT NULL,
  `ship_class` INT(11) NOT NULL,
  `offset_id` INT(11) NULL,
  `ship_name_en` VARCHAR(45) NULL DEFAULT NULL,
  `ship_name_jp` VARCHAR(45) NULL DEFAULT NULL,
  `ship_name_ch` VARCHAR(45) NULL DEFAULT NULL,
  `ship_name_tw` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_ship_ship_class1_idx` (`ship_class` ASC),
  INDEX `fk_ship_ship_type1_idx` (`ship_type` ASC),
  INDEX `fk_ship_offset1_idx` (`offset_id` ASC),
  CONSTRAINT `fk_ship_ship_class1`
    FOREIGN KEY (`ship_class`)
    REFERENCES `kcbadge`.`ship_class` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ship_ship_type1`
    FOREIGN KEY (`ship_type`)
    REFERENCES `kcbadge`.`ship_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ship_offset1`
    FOREIGN KEY (`offset_id`)
    REFERENCES `kcbadge`.`offset` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kcbadge`.`implication`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`implication` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`implication` (
  `ship_id` INT(11) NOT NULL,
  `implicated_ship_id` INT(11) NOT NULL,
  PRIMARY KEY (`ship_id`, `implicated_ship_id`),
  INDEX `fk_implication_ship1_idx` (`implicated_ship_id` ASC),
  CONSTRAINT `SHIP_IMPL_KEY`
    FOREIGN KEY (`ship_id`)
    REFERENCES `kcbadge`.`ship` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_implication_ship1`
    FOREIGN KEY (`implicated_ship_id`)
    REFERENCES `kcbadge`.`ship` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kcbadge`.`rarity`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`rarity` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`rarity` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kcbadge`.`seasonal`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`seasonal` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`seasonal` (
  `id` INT(11) NOT NULL,
  `name_en` VARCHAR(45) NULL DEFAULT NULL,
  `name_jp` VARCHAR(45) NULL DEFAULT NULL,
  `name_ch` VARCHAR(45) NULL DEFAULT NULL,
  `name_tw` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kcbadge`.`kanmusu`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`kanmusu` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`kanmusu` (
  `id` INT(11) NOT NULL,
  `fleet_id` INT(11) NULL DEFAULT NULL,
  `rarity_id` INT(11) NOT NULL,
  `ship_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_kanmusu_rarity1_idx` (`rarity_id` ASC),
  INDEX `fk_kanmusu_ship1_idx` (`ship_id` ASC),
  CONSTRAINT `fk_kanmusu_rarity1`
    FOREIGN KEY (`rarity_id`)
    REFERENCES `kcbadge`.`rarity` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_kanmusu_ship1`
    FOREIGN KEY (`ship_id`)
    REFERENCES `kcbadge`.`ship` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `kcbadge`.`abyssal`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kcbadge`.`abyssal` ;

CREATE TABLE IF NOT EXISTS `kcbadge`.`abyssal` (
  `id` INT(11) NOT NULL,
  `ship_id` INT(11) NOT NULL,
  `damageable` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  INDEX `fk_abyssal_ship1_idx` (`ship_id` ASC),
  CONSTRAINT `fk_abyssal_ship1`
    FOREIGN KEY (`ship_id`)
    REFERENCES `kcbadge`.`ship` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
