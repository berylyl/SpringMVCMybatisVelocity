DROP DATABASE IF EXISTS test;
CREATE DATABASE test DEFAULT CHARACTER SET utf8;

USE `test`;

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(30) DEFAULT NULL,
  `userName` varchar(30) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `married` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;