# live_report schema

# --- !Ups

CREATE TABLE `live_report` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `live_id` int(10) unsigned NOT NULL,
  `body` text,
  `delete_flg` boolean DEFAULT false,
  `created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_user` int(11) NOT NULL DEFAULT '0',
  `updated_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_user` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `live_id` (`live_id`),
  CONSTRAINT `live_report_ibfk_1` FOREIGN KEY (`live_id`) REFERENCES `live` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


# --- !Downs

DROP TABLE IF EXISTS `live_report`;
