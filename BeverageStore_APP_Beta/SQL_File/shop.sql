-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- 主機: 127.0.0.1
-- 產生時間： 2018 年 09 月 24 日 07:41
-- 伺服器版本: 10.1.22-MariaDB
-- PHP 版本： 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `test`
--

-- --------------------------------------------------------

--
-- 資料表結構 `shop`
--

CREATE TABLE `shop` (
  `orderid` int(11) NOT NULL,
  `id` varchar(15) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `sugar` varchar(45) DEFAULT NULL,
  `num` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=big5;

--
-- 資料表的匯出資料 `shop`
--

INSERT INTO `shop` (`orderid`, `id`, `type`, `size`, `sugar`, `num`) VALUES
(1, '11', '紅茶', '大杯', '半糖', 2),
(2, '11', '紅茶', '大杯', '半糖', 2),
(3, '11', '綠茶', '小杯', '無糖', 4),
(4, '11', '紅茶', '大杯', '全糖', 1),
(5, '22', '紅茶', '大杯', '全糖', 2),
(6, '44', '綠茶', '小杯', '無糖', 4),
(7, '33', '紅茶', '大杯', '全糖', 1),
(8, '33', '綠茶', '小杯', '少糖', 100);

--
-- 已匯出資料表的索引
--

--
-- 資料表索引 `shop`
--
ALTER TABLE `shop`
  ADD PRIMARY KEY (`orderid`);

--
-- 在匯出的資料表使用 AUTO_INCREMENT
--

--
-- 使用資料表 AUTO_INCREMENT `shop`
--
ALTER TABLE `shop`
  MODIFY `orderid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
