/*
SQLyog Professional v12.14 (64 bit)
MySQL - 8.0.30 : Database - lenovo
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lenovo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `lenovo`;

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL COMMENT '商品id',
  `user_id` int DEFAULT NULL COMMENT '用户id',
  `num` int DEFAULT NULL COMMENT '商品数量',
  `price` decimal(10,2) DEFAULT NULL COMMENT '商品单价',
  `total` varchar(255) DEFAULT NULL COMMENT '此商品总价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3;

/*Data for the table `car` */

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mobile` varchar(32) NOT NULL COMMENT '手机号',
  `pwd` varchar(32) NOT NULL COMMENT '密码',
  `nick_name` varchar(32) DEFAULT NULL COMMENT '昵称',
  `real_name` varchar(32) DEFAULT NULL COMMENT '真实名',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱号',
  `gender` tinyint(1) DEFAULT '0' COMMENT '性别，默认值false',
  `register_time` datetime DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobile` (`mobile`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;

/*Data for the table `member` */

insert  into `member`(`id`,`mobile`,`pwd`,`nick_name`,`real_name`,`email`,`gender`,`register_time`) values

(11,'15764029639','1',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `order_detail` */

DROP TABLE IF EXISTS `order_detail`;

CREATE TABLE `order_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL COMMENT '商品id',
  `order_id` varchar(255) DEFAULT NULL COMMENT '订单id',
  `status` int DEFAULT NULL COMMENT '0.未退货 1已退货',
  `num` int DEFAULT NULL COMMENT '此商品数量',
  `total` varchar(255) DEFAULT NULL COMMENT '此商品总价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8mb3;

/*Data for the table `order_detail` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `price` varchar(255) DEFAULT NULL COMMENT '商品价格',
  `collectedNum` int DEFAULT '0' COMMENT '被收藏次数',
  `buyNum` int DEFAULT '0' COMMENT '被购买次数',
  `url` varchar(255) DEFAULT NULL COMMENT '商品图品地址',
  `discription` text COMMENT '商品详情描述',
  `stock` int DEFAULT NULL COMMENT '库存',
  `pam1` varchar(255) DEFAULT NULL COMMENT '参数1',
  `pam2` varchar(255) DEFAULT NULL COMMENT '参数2',
  `pam3` varchar(255) DEFAULT NULL COMMENT '参数3',
  `val3` varchar(255) DEFAULT NULL COMMENT '值3',
  `val2` varchar(255) DEFAULT NULL COMMENT '值2',
  `val1` varchar(255) DEFAULT NULL COMMENT '值1',
  `type` int DEFAULT NULL,
  `discount` int DEFAULT '10' COMMENT '折扣',
  `category_id1` int DEFAULT NULL COMMENT '一级类目id',
  `category_id2` int DEFAULT NULL COMMENT '二级类目id',
  `isDelete` int DEFAULT '0' COMMENT '是否被删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3;

/*Data for the table `product` */

insert  into `product`(`id`,`name`,`price`,`collectedNum`,`buyNum`,`url`,`discription`,`stock`,`pam1`,`pam2`,`pam3`,`val3`,`val2`,`val1`,`type`,`discount`,`category_id1`,`category_id2`,`isDelete`) values

(1,'ThinkPad',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,0,0),

(2,'ThinkBook',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,0,0),

(3,'小新air',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3,0,0),

(4,'ThinkPadE14','5399',0,0,'ThinkPadE14','第12代智能英特尔酷睿i5-1240P/Windows 11 家庭中文版/16G/512GB SSD/英特尔锐钜Xe显卡/14英寸FHD 广视角 LED背光显示屏 100% sRGB 色域/银色',100,NULL,NULL,NULL,NULL,NULL,NULL,NULL,10,1,4,0),

(5,'ThinkPadX13','7999',0,0,'ThinkPadX13','英特尔Evo平台认证酷睿i5-1240P/Windows 11 家庭中文版/16G LPDDR5/512G SSD/锐炬Xe显卡/13.3英寸WUXGA LED背光显示屏/LTE版/内置SIM卡（12个月流量）',100,NULL,NULL,NULL,NULL,NULL,NULL,NULL,10,1,5,0),

(6,'ThinkPadneo14','6999',0,0,'ThinkPadneo14','AMD锐龙7 6800H移动处理器/Windows 11 家庭中文版/16GB/512GB SSD/AMD Radeon 680M集成显卡/14英寸2.2K 16:10 100% sRGB屏幕/暗夜黑',100,NULL,NULL,NULL,NULL,NULL,NULL,NULL,10,1,6,0),

(7,'ThinkBook14p','5699',0,0,'ThinkBook14p','AMD 锐龙7 5800H移动处理器/Windows 11 家庭中文版/16GB/512GB SSD/集成显卡（AMD Radeon Graphics）/14英寸 2.2K 广视角 LCD四边窄防眩光雾面屏（100% sRGB）/电源键指纹识别/银灰色',100,NULL,NULL,NULL,NULL,NULL,NULL,NULL,10,2,7,0),

(8,'联想小新pro14','4999',0,0,'联想小新pro14','第12代智能英特尔® 酷睿™ i9-12900H/Windows11家庭中文版/14英寸/16GB/512GB SSD/集成显卡/皓月银',100,NULL,NULL,NULL,NULL,NULL,NULL,NULL,10,3,8,0);

/*Table structure for table `product_category` */

DROP TABLE IF EXISTS `product_category`;

CREATE TABLE `product_category` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '此商品id',
  `name` varchar(255) DEFAULT NULL COMMENT '商品名',
  `fid` int DEFAULT NULL COMMENT '商品父类目id',
  `isDelete` int DEFAULT '0' COMMENT '商品是否被删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb3;

/*Data for the table `product_category` */

/*Table structure for table `product_order` */

DROP TABLE IF EXISTS `product_order`;

CREATE TABLE `product_order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL COMMENT '用户id',
  `code` varchar(255) DEFAULT NULL COMMENT '订单号',
  `addTime` datetime DEFAULT NULL COMMENT '下单时间',
  `total` varchar(255) DEFAULT NULL COMMENT '订单总价值',
  `isDelete` int DEFAULT '0' COMMENT '订单是否被删除',
  `status` int DEFAULT NULL COMMENT '0.新建代发货1.已取消 2已发货3.以收货4已评价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb3;

/*Data for the table `product_order` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
