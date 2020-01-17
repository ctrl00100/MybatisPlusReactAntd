/*
SQLyog Ultimate v8.32 
MySQL - 5.7.28 : Database - w
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`w` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `w`;

/*Table structure for table `mp_user` */

DROP TABLE IF EXISTS `mp_user`;

CREATE TABLE `mp_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `address` varchar(64) DEFAULT NULL,
  `openid` varchar(32) DEFAULT NULL,
  `gmt_create` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `gmt_modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `deleted` tinyint(3) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1204770068332822531 DEFAULT CHARSET=utf8;

/*Data for the table `mp_user` */

insert  into `mp_user`(`id`,`username`,`address`,`openid`,`gmt_create`,`gmt_modified`,`deleted`) values (1,'pp','pp','pp','2019-12-09 21:53:20','2019-12-09 21:53:30',0),(2,'pp',NULL,NULL,'2019-12-09 22:00:23','2019-12-09 22:00:23',0),(3,'pp',NULL,NULL,'2019-12-09 22:00:55','2019-12-09 22:00:55',0),(4,'bb',NULL,'66','2019-12-09 22:02:43','2019-12-09 22:02:43',0),(5,'bb',NULL,'66','2019-12-09 22:03:11','2019-12-09 22:03:11',0),(6,'bb',NULL,'66','2019-12-09 22:03:31','2019-12-09 22:03:31',0),(1204246279803154434,'bb',NULL,'66','2019-12-10 11:47:41','2019-12-10 11:47:41',0),(1204769095392735234,'admin',NULL,NULL,'2019-12-11 22:25:10','2019-12-11 22:25:10',0),(1204770068332822530,'admin',NULL,NULL,'2019-12-11 22:29:02','2019-12-11 22:29:02',0);

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `imgs` text,
  `status` tinyint(1) DEFAULT '0',
  `name` text,
  `ddesc` text,
  `price` bigint(20) DEFAULT NULL,
  `pCategoryId` varchar(20) DEFAULT NULL,
  `categoryId` varchar(20) DEFAULT NULL,
  `detail` text,
  `v` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `products` */

insert  into `products`(`id`,`imgs`,`status`,`name`,`ddesc`,`price`,`pCategoryId`,`categoryId`,`detail`,`v`) values (1,'http://ctrl010.k1772714.club/images/2020/01/02/15779774673019676.jpg--http://ctrl010.k1772714.club/images/2020/01/02/15779774673019676.jpg',2,'联笔记本电脑','嗡嗡嗡',66000,'2','8','<p><span style=\"color: rgb(228,57,60);background-color: rgb(255,255,255);font-size: 12px;\">想你所需，超你所想！精致外观，轻薄便携带光驱，内置正版office杜绝盗版死机，全国联保两年！</span> 222</p>\n<p><span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\">联想（Lenovo）扬天V110 15.6英寸家用轻薄便携商务办公手提笔记本电脑 定制【E2-9010/4G/128G固态】 2G独显 内置</span></p>\n<p><span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\">99999</span></p>\n',0),(2,'http://ctrl010.k1772714.club/images/2020/01/02/15779774673019676.jpg',1,'台式机',NULL,65999,'2','7','<p><span style=\"color: rgb(228,57,60);background-color: rgb(255,255,255);font-size: 12px;\">想你所需，超你所想！精致外观，轻薄便携带光驱，内置正版office杜绝盗版死机，全国联保两年！</span> 222</p>\n<p><span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\">联想（Lenovo）扬天V110 15.6英寸家用轻薄便携商务办公手提笔记本电脑 定制【E2-9010/4G/128G固态】 2G独显 内置</span></p>\n<p><span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\">99999</span></p>\n',0),(3,'http://ctrl010.k1772714.club/images/2020/01/02/15779774673019676.jpg',1,'华硕笔记本',NULL,6799,'2','8','gggn',0),(4,'http://ctrl010.k1772714.club/images/2020/01/02/15779774673019676.jpg',2,'你不知道的c（上卷）',NULL,35,'3','11','<p style=\"text-align:start;\"><span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\">图灵程序设计丛书：你不知道的JavaScript（上卷）</span> <span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\"><strong>[You Don\'t Know JS:Scope &amp; Closures]</strong></span></p>\n<p style=\"text-align:start;\"><span style=\"color: rgb(227,57,60);background-color: rgb(255,255,255);font-size: 12px;\">JavaScript开发经典入门图书 打通JavaScript的任督二脉 领略语言内部的绝美风光</span>&nbsp;</p>\n',0),(5,'http://ctrl010.k1772714.club/images/2020/01/06/1578323304881596.jpg',2,'你不知道的JS（上卷）','15.6英寸窄边框游戏笔记本电脑(i7-8750H 8G 256GSSD+1T GTX1050Ti 4G IPS)',35,'3','12','<p style=\"text-align:start;\"><span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\">图灵程序设计丛书：你不知道的JavaScript（上卷）</span> <span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\"><strong>[You Don\'t Know JS:Scope &amp; Clos</strong></span><span style=\"color: rgb(44,130,201);background-color: rgb(255,255,255);font-size: 16px;\"><strong>ures]</strong></span></p>\n<p style=\"text-align:start;\"><span style=\"color: rgb(227,57,60);background-color: rgb(255,255,255);font-size: 12px;\">JavaScript开发经典入门图书 打通JavaScript的任督二脉 领略语言内部的绝美风光</span>&nbsp;</p>\n',0),(6,'image-1559402436395.jpg',1,'你不知道的JS（上卷）','15.6英寸窄边框游戏笔记本电脑(i7-8750H 8G 256GSSD+1T GTX1050Ti 4G IPS)',35,'2','8','<p style=\"text-align:start;\"><span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\">图灵程序设计丛书：你不知道的JavaScript（上卷）</span> <span style=\"color: rgb(102,102,102);background-color: rgb(255,255,255);font-size: 16px;\"><strong>[You Don\'t Know JS:Scope &amp; Closures]</strong></span></p>\n<p style=\"text-align:start;\"><span style=\"color: rgb(227,57,60);background-color: rgb(255,255,255);font-size: 12px;\">JavaScript开发经典入门图书 打通JavaScript的任督二脉 领略语言内部的绝美风光</span>&nbsp;</p>\n',0),(8,'http://ctrl010.k1772714.club/images/2020/01/06/15783237028508518.jpg',2,'sdsd',NULL,1,'2','8','<p><strong>第四代</strong></p>\n',0),(9,'',0,'222',NULL,3,'1','1','<p></p>\n',0),(10,'',0,'222',NULL,2,'1','1','<p></p>\n',0),(11,'',0,'2',NULL,2,'1','1','<p></p>\n',0),(12,'',0,'2',NULL,2,'2','8','<p></p>\n',0);

/*Table structure for table `roles` */

DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `id` bigint(22) NOT NULL AUTO_INCREMENT,
  `menus` char(200) DEFAULT NULL,
  `name` char(22) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `_v` int(2) DEFAULT NULL,
  `auth_time` datetime DEFAULT NULL,
  `auth_name` char(22) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `roles` */

insert  into `roles`(`id`,`menus`,`name`,`create_time`,`_v`,`auth_time`,`auth_name`) values (1,'/order--/charts/pie--/charts/line--/user--/role','经理1','2020-01-08 03:05:13',NULL,'2020-01-08 03:05:13','admin'),(2,'/product','经理2','2020-01-08 03:05:13',NULL,'2020-01-08 03:05:13','test008'),(3,'/role--/charts/pie','经理3','2020-01-08 03:05:13',NULL,'2020-01-08 03:05:13','test008'),(4,'/role','经理4','2020-01-08 07:07:53',NULL,NULL,NULL),(18,'/order','大苏打','2020-01-08 12:51:05',NULL,'2020-01-09 07:16:01','admin');

/*Table structure for table `tchild` */

DROP TABLE IF EXISTS `tchild`;

CREATE TABLE `tchild` (
  `Idme` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自Id',
  `parentId` bigint(20) NOT NULL COMMENT '父Id',
  `name` varchar(20) DEFAULT NULL COMMENT '子分类名',
  `v` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`Idme`),
  KEY `FK_tchild` (`parentId`),
  CONSTRAINT `FK_tchild` FOREIGN KEY (`parentId`) REFERENCES `tparent` (`Did`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `tchild` */

insert  into `tchild`(`Idme`,`parentId`,`name`,`v`) values (1,1,'电视',0),(2,1,'冰箱',0),(3,1,'洗衣机',0),(7,2,'台式计算机',0),(8,2,'笔记本',0),(9,2,'上网本',0),(10,2,'台式计算机2',0),(11,3,'c',0),(12,3,'js',0),(13,4,'外套',0);

/*Table structure for table `tparent` */

DROP TABLE IF EXISTS `tparent`;

CREATE TABLE `tparent` (
  `Did` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自Id',
  `parentId` bigint(20) NOT NULL DEFAULT '0' COMMENT '一级分类Id',
  `idc` bigint(20) DEFAULT NULL COMMENT '二级分类Id',
  `name` varchar(20) DEFAULT NULL COMMENT '一级Id名称',
  `v` tinyint(2) DEFAULT '0',
  PRIMARY KEY (`Did`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `tparent` */

insert  into `tparent`(`Did`,`parentId`,`idc`,`name`,`v`) values (1,0,1,'家用电器1',0),(2,0,2,'电脑2',0),(3,0,3,'图书3',0),(4,0,4,'服装4',0),(11,0,NULL,'呈现出55',0);

/*Table structure for table `uuser` */

DROP TABLE IF EXISTS `uuser`;

CREATE TABLE `uuser` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `role_id` varchar(20) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `v` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `uuser` */

insert  into `uuser`(`id`,`username`,`password`,`phone`,`email`,`role_id`,`create_time`,`v`) values (2,'admin','admin','123','123','1','2019-12-11 22:30:22',0),(7,'mall','123123','18200000000','k1772714@163.com','18','2020-01-10 22:53:14',NULL),(8,'a255555','123123','',NULL,'3','2020-01-10 22:54:26',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
