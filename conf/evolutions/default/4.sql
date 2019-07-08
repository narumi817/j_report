# stage schema

# --- !Ups

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

# --- !Downs

DROP TABLE `stage`
