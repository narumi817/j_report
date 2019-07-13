# talent schema

# --- !Ups

CREATE TABLE `talent` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `name_read` varchar(255) NOT NULL DEFAULT '',
  `delete_flg` boolean DEFAULT false,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# --- !Downs

DROP TABLE IF EXISTS `talent`;
