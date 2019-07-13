# live schema

# --- !Ups
CREATE TABLE `live` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `stage_id` int(11) unsigned NOT NULL,
  `place_id` int(11) unsigned NOT NULL,
  `date` date DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `remarks` text,
  `delete_flg` boolean DEFAULT false,
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


# --- !Downs
DROP TABLE IF EXISTS `live`;
