-- MySQL Script generated by MySQL Workbench
-- qui 08 jun 2017 00:48:03 -03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema scmc
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `scmc` ;

-- -----------------------------------------------------
-- Schema scmc
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `scmc` DEFAULT CHARACTER SET utf8 ;
USE `scmc` ;

-- -----------------------------------------------------
-- Table `login`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `login` ;

CREATE TABLE IF NOT EXISTS `login` (
  `idLogin` INT NOT NULL,
  `nome` VARCHAR(20) NOT NULL,
  `senha` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`idLogin`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pessoa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pessoa` ;

CREATE TABLE IF NOT EXISTS `pessoa` (
  `idPessoa` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `endereco` VARCHAR(60) NULL,
  `telefone` INT NULL,
  `estadoCivil` VARCHAR(45) NULL,
  `nascimento` DATE NULL,
  `sexo` CHAR(1) NULL,
  `nFilhos` INT NULL,
  `dtBatismo` DATE NULL,
  `igAnterior` VARCHAR(45) NULL,
  PRIMARY KEY (`idPessoa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `congregacao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `congregacao` ;

CREATE TABLE IF NOT EXISTS `congregacao` (
  `idCongregacao` INT NOT NULL,
  `razaoSocial` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(60) NULL,
  `CNPJ` INT NOT NULL,
  `telefone` INT NULL,
  PRIMARY KEY (`idCongregacao`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `CNPJ_UNIQUE` ON `congregacao` (`CNPJ` ASC);


-- -----------------------------------------------------
-- Table `eventos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventos` ;

CREATE TABLE IF NOT EXISTS `eventos` (
  `ideventos` INT NOT NULL,
  `data` DATE NULL,
  `hora` TIME(4) NULL,
  `descricao` VARCHAR(45) NULL,
  `idLogin` INT NULL,
  PRIMARY KEY (`ideventos`),
  CONSTRAINT `fk_idLogin`
    FOREIGN KEY (`idLogin`)
    REFERENCES `login` (`idLogin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_idLogin_idx` ON `eventos` (`idLogin` ASC);


-- -----------------------------------------------------
-- Table `pessoaCongregacao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pessoaCongregacao` ;

CREATE TABLE IF NOT EXISTS `pessoaCongregacao` (
  `idpessoaCongregacao` INT NOT NULL,
  `idPessoa` INT NULL,
  `idCongregacao` INT NULL,
  PRIMARY KEY (`idpessoaCongregacao`),
  CONSTRAINT `fk_idCongregacao`
    FOREIGN KEY (`idCongregacao`)
    REFERENCES `congregacao` (`idCongregacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_idPessoa`
    FOREIGN KEY (`idPessoa`)
    REFERENCES `pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_idCongregacao_idx` ON `pessoaCongregacao` (`idCongregacao` ASC);

CREATE INDEX `fk_idPessoa_idx` ON `pessoaCongregacao` (`idPessoa` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
