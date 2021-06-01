DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `name` varchar(100) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`user` (`name`, `password`) VALUES ('test', '098f6bcd4621d373cade4e832627b4f6');