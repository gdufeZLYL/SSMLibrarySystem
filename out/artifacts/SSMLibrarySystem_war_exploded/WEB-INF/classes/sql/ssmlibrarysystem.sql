/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : ssmlibrarysystem

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-02-15 21:19:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `book_id` varchar(10) NOT NULL COMMENT '书号',
  `book_name` varchar(32) DEFAULT NULL COMMENT '书名',
  `book_detail` text COMMENT '书描述',
  `book_pic` varchar(64) DEFAULT NULL COMMENT '书图片',
  `book_time` datetime DEFAULT NULL COMMENT '书出版日期',
  `book_category_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `book_category_id` (`book_category_id`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`book_category_id`) REFERENCES `category` (`category_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1000', '数据结构与算法', '计算机必修书', null, '2015-02-03 13:22:53', '1000');
INSERT INTO `book` VALUES ('1001', '操作系统', '计算机必修书', null, '2015-02-09 13:22:57', '1000');
INSERT INTO `book` VALUES ('1002', '解剖学原理', '医学书籍', null, '2015-02-06 13:23:02', '1002');
INSERT INTO `book` VALUES ('1003', '百年孤独', '经典名著', null, '2015-02-06 13:23:02', '1001');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` varchar(10) NOT NULL,
  `category_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1000', '计算机');
INSERT INTO `category` VALUES ('1001', '文学');
INSERT INTO `category` VALUES ('1002', '医学');
