# member_relation schema

# --- !Ups

CREATE TABLE `member_relation` (
  `group_id` int(11) unsigned NOT NULL,
  `talent_id` int(11) unsigned NOT NULL,
  KEY `group_id` (`group_id`),
  KEY `talent_id` (`talent_id`),
  CONSTRAINT `member_relation_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `artist_group` (`id`),
  CONSTRAINT `member_relation_ibfk_2` FOREIGN KEY (`talent_id`) REFERENCES `talent` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# --- !Downs

DROP TABLE IF EXISTS `member_relation`;
