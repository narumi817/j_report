# stage_relation schema

# --- !Ups

CREATE TABLE `stage_relation` (
  `group_id` int(11) unsigned NOT NULL,
  `talent_id` int(11) unsigned NOT NULL,
  `stage_id` int(11) unsigned NOT NULL,
  KEY `group_id` (`group_id`),
  KEY `talent_id` (`talent_id`),
  KEY `stage_id` (`stage_id`),
  CONSTRAINT `stage_relation_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `artist_group` (`id`),
  CONSTRAINT `stage_relation_ibfk_2` FOREIGN KEY (`talent_id`) REFERENCES `talent` (`id`),
  CONSTRAINT `stage_relation_ibfk_3` FOREIGN KEY (`stage_id`) REFERENCES `stage` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# --- !Downs
DROP TABLE IF EXISTS `stage_relation`;
