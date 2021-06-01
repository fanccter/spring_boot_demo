DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `name` varchar(100) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES ('test', 'test');