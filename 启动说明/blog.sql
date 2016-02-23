CREATE DATABASE jfinal_demo;

USE jfinal_demo;

CREATE TABLE `blog` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(200) NOT NULL,
  `content` mediumtext NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `blog` VALUES ('1', 'JFinal Demo Title here', 'JFinal Demo Content here');
INSERT INTO `blog` VALUES ('2', 'test 1', 'test 1');
INSERT INTO `blog` VALUES ('3', 'test 2', 'test 2');
INSERT INTO `blog` VALUES ('4', 'test 3', 'test 3');
INSERT INTO `blog` VALUES ('5', 'test 4', 'test 4');



CREATE TABLE `form` (
  `form_id` int(11) NOT NULL AUTO_INCREMENT,
  `form_name` varchar(30) DEFAULT NULL,
  `form_gender` varchar(1) DEFAULT NULL,
  `form_year` varchar(3) DEFAULT NULL,
  `form_info` varchar(200) DEFAULT NULL,
  `form_city` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`form_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO mydemo.form (form_id, form_name, form_gender, form_year, form_info, form_city) VALUES (1, 'maple', 'm', '27', '测试信息', '0311');
