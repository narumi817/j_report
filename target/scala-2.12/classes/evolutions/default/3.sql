# place schema

# --- !Ups

CREATE TABLE `place` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `prefectures` int(11) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `delete_flg` boolean DEFAULT false,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# --- !Downs

DROP TABLE IF EXISTS `place`;
