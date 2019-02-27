/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.21-log : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssm`;

/*Table structure for table `classes` */

DROP TABLE IF EXISTS `classes`;

CREATE TABLE `classes` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

/*Data for the table `classes` */

insert  into `classes`(`class_id`,`class_name`) values (1,'一班'),(2,'二班'),(3,'三班'),(4,'四班'),(5,'五班'),(6,'六班'),(7,'七班'),(8,'八班'),(9,'九班'),(10,'十班'),(11,'十一班');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(32) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

/*Data for the table `student` */

insert  into `student`(`student_id`,`student_name`,`class_id`) values (1,'小明1',1),(2,'小明2',1),(3,'小明3',1),(4,'小明4',1),(5,'小明5',1),(6,'小明6',1),(7,'小明7',1),(8,'小明8',1),(9,'小明9',1),(10,'小明10',1),(11,'小明11',1),(12,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
