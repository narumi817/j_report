# ************************************************************
# Sequel Pro SQL dump
# バージョン 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# ホスト: 127.0.0.1 (MySQL 5.7.26)
# データベース: j_report
# 作成時刻: 2019-07-04 14:48:35 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

# --- !Ups
# テーブルのダンプ group
# ------------------------------------------------------------

DROP TABLE IF EXISTS `group`;

CREATE TABLE `group` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `name_read` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# テーブルのダンプ live
# ------------------------------------------------------------

DROP TABLE IF EXISTS `live`;

CREATE TABLE `live` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `stage_id` int(11) unsigned NOT NULL,
  `place_id` int(11) unsigned NOT NULL,
  `date` date DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `remarks` text,
  `created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_user` int(11) NOT NULL DEFAULT '0',
  `updated_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_user` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `stage_id` (`stage_id`),
  KEY `place_id` (`place_id`),
  CONSTRAINT `live_ibfk_1` FOREIGN KEY (`stage_id`) REFERENCES `stage` (`id`),
  CONSTRAINT `live_ibfk_2` FOREIGN KEY (`place_id`) REFERENCES `place` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# テーブルのダンプ live_report
# ------------------------------------------------------------

DROP TABLE IF EXISTS `live_report`;

CREATE TABLE `live_report` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `live_id` int(10) unsigned NOT NULL,
  `body` text,
  `created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_user` int(11) NOT NULL DEFAULT '0',
  `updated_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_user` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `live_id` (`live_id`),
  CONSTRAINT `live_report_ibfk_1` FOREIGN KEY (`live_id`) REFERENCES `live` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# テーブルのダンプ member_relation
# ------------------------------------------------------------

DROP TABLE IF EXISTS `member_relation`;

CREATE TABLE `member_relation` (
  `group_id` int(11) unsigned NOT NULL,
  `talent_id` int(11) unsigned NOT NULL,
  KEY `group_id` (`group_id`),
  KEY `talent_id` (`talent_id`),
  CONSTRAINT `member_relation_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `group` (`id`),
  CONSTRAINT `member_relation_ibfk_2` FOREIGN KEY (`talent_id`) REFERENCES `talent` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# テーブルのダンプ place
# ------------------------------------------------------------

DROP TABLE IF EXISTS `place`;

CREATE TABLE `place` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `prefectures` int(11) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# テーブルのダンプ stage
# ------------------------------------------------------------

DROP TABLE IF EXISTS `stage`;

CREATE TABLE `stage` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `name_read` varchar(255) DEFAULT NULL,
  `start_datetime` date DEFAULT NULL,
  `end_datetime` date DEFAULT NULL,
  `stage_type` int(11) NOT NULL DEFAULT '1',
  `remarks` text,
  `created_dateimte` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_user` int(11) NOT NULL DEFAULT '0',
  `updated_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_user` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# テーブルのダンプ stage_relation
# ------------------------------------------------------------

DROP TABLE IF EXISTS `stage_relation`;

CREATE TABLE `stage_relation` (
  `group_id` int(11) unsigned NOT NULL,
  `talent_id` int(11) unsigned NOT NULL,
  `stage_id` int(11) unsigned NOT NULL,
  KEY `group_id` (`group_id`),
  KEY `talent_id` (`talent_id`),
  KEY `stage_id` (`stage_id`),
  CONSTRAINT `stage_relation_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `group` (`id`),
  CONSTRAINT `stage_relation_ibfk_2` FOREIGN KEY (`talent_id`) REFERENCES `talent` (`id`),
  CONSTRAINT `stage_relation_ibfk_3` FOREIGN KEY (`stage_id`) REFERENCES `stage` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# テーブルのダンプ talent
# ------------------------------------------------------------

DROP TABLE IF EXISTS `talent`;

CREATE TABLE `talent` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `name_read` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




# --- !Downs
