<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [数据库基础知识](#%E6%95%B0%E6%8D%AE%E5%BA%93%E5%9F%BA%E7%A1%80%E7%9F%A5%E8%AF%86)
  - [数据库的定义](#%E6%95%B0%E6%8D%AE%E5%BA%93%E7%9A%84%E5%AE%9A%E4%B9%89)
  - [什么是SQL？](#%E4%BB%80%E4%B9%88%E6%98%AFsql)
  - [什么是MySQL?](#%E4%BB%80%E4%B9%88%E6%98%AFmysql)
  - [MySQL的架构](#mysql%E7%9A%84%E6%9E%B6%E6%9E%84)
  - [MySQL的binlog有有几种录入格式？分别有什么区别？](#mysql%E7%9A%84binlog%E6%9C%89%E6%9C%89%E5%87%A0%E7%A7%8D%E5%BD%95%E5%85%A5%E6%A0%BC%E5%BC%8F%E5%88%86%E5%88%AB%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB)
- [MySQL常用函数](#mysql%E5%B8%B8%E7%94%A8%E5%87%BD%E6%95%B0)
  - [聚合函数](#%E8%81%9A%E5%90%88%E5%87%BD%E6%95%B0)
  - [数学函数](#%E6%95%B0%E5%AD%A6%E5%87%BD%E6%95%B0)
  - [字符串函数](#%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%87%BD%E6%95%B0)
  - [日期和时间函数](#%E6%97%A5%E6%9C%9F%E5%92%8C%E6%97%B6%E9%97%B4%E5%87%BD%E6%95%B0)
  - [条件判断函数](#%E6%9D%A1%E4%BB%B6%E5%88%A4%E6%96%AD%E5%87%BD%E6%95%B0)
  - [系统信息函数](#%E7%B3%BB%E7%BB%9F%E4%BF%A1%E6%81%AF%E5%87%BD%E6%95%B0)
  - [加密函数](#%E5%8A%A0%E5%AF%86%E5%87%BD%E6%95%B0)
- [索引](#%E7%B4%A2%E5%BC%95)
  - [B+树索引和哈希索引的区别](#b%E6%A0%91%E7%B4%A2%E5%BC%95%E5%92%8C%E5%93%88%E5%B8%8C%E7%B4%A2%E5%BC%95%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [B树和B+树的区别](#b%E6%A0%91%E5%92%8Cb%E6%A0%91%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [聚集索引和辅助索引](#%E8%81%9A%E9%9B%86%E7%B4%A2%E5%BC%95%E5%92%8C%E8%BE%85%E5%8A%A9%E7%B4%A2%E5%BC%95)
    - [聚集索引](#%E8%81%9A%E9%9B%86%E7%B4%A2%E5%BC%95)
    - [辅助索引](#%E8%BE%85%E5%8A%A9%E7%B4%A2%E5%BC%95)
  - [联合索引](#%E8%81%94%E5%90%88%E7%B4%A2%E5%BC%95)
  - [什么情况下应不建或少建索引](#%E4%BB%80%E4%B9%88%E6%83%85%E5%86%B5%E4%B8%8B%E5%BA%94%E4%B8%8D%E5%BB%BA%E6%88%96%E5%B0%91%E5%BB%BA%E7%B4%A2%E5%BC%95)
  - [哪些情况会导致索引失效？](#%E5%93%AA%E4%BA%9B%E6%83%85%E5%86%B5%E4%BC%9A%E5%AF%BC%E8%87%B4%E7%B4%A2%E5%BC%95%E5%A4%B1%E6%95%88)
  - [key和index的区别](#key%E5%92%8Cindex%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [如果索引值为null，走不走索引?](#%E5%A6%82%E6%9E%9C%E7%B4%A2%E5%BC%95%E5%80%BC%E4%B8%BAnull%E8%B5%B0%E4%B8%8D%E8%B5%B0%E7%B4%A2%E5%BC%95)
  - [判断列是否要添加索引的标准](#%E5%88%A4%E6%96%AD%E5%88%97%E6%98%AF%E5%90%A6%E8%A6%81%E6%B7%BB%E5%8A%A0%E7%B4%A2%E5%BC%95%E7%9A%84%E6%A0%87%E5%87%86)
- [锁](#%E9%94%81)
  - [行锁](#%E8%A1%8C%E9%94%81)
    - [优点](#%E4%BC%98%E7%82%B9)
    - [缺点](#%E7%BC%BA%E7%82%B9)
  - [锁的算法](#%E9%94%81%E7%9A%84%E7%AE%97%E6%B3%95)
    - [Record Lock](#record-lock)
    - [Gap Lock](#gap-lock)
    - [Next-Key Lock](#next-key-lock)
  - [锁选择](#%E9%94%81%E9%80%89%E6%8B%A9)
  - [悲观锁和乐观锁](#%E6%82%B2%E8%A7%82%E9%94%81%E5%92%8C%E4%B9%90%E8%A7%82%E9%94%81)
    - [悲观锁和乐观锁使用在哪些场景？](#%E6%82%B2%E8%A7%82%E9%94%81%E5%92%8C%E4%B9%90%E8%A7%82%E9%94%81%E4%BD%BF%E7%94%A8%E5%9C%A8%E5%93%AA%E4%BA%9B%E5%9C%BA%E6%99%AF)
    - [乐观锁重试](#%E4%B9%90%E8%A7%82%E9%94%81%E9%87%8D%E8%AF%95)
  - [数据库死锁的产生原因及解决办法](#%E6%95%B0%E6%8D%AE%E5%BA%93%E6%AD%BB%E9%94%81%E7%9A%84%E4%BA%A7%E7%94%9F%E5%8E%9F%E5%9B%A0%E5%8F%8A%E8%A7%A3%E5%86%B3%E5%8A%9E%E6%B3%95)
- [MySQL分区](#mysql%E5%88%86%E5%8C%BA)
  - [什么是分区？](#%E4%BB%80%E4%B9%88%E6%98%AF%E5%88%86%E5%8C%BA)
  - [分区与分表的区别](#%E5%88%86%E5%8C%BA%E4%B8%8E%E5%88%86%E8%A1%A8%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [使用场景](#%E4%BD%BF%E7%94%A8%E5%9C%BA%E6%99%AF)
  - [限制](#%E9%99%90%E5%88%B6)
  - [如何判断当前MySQL是否支持分区？](#%E5%A6%82%E4%BD%95%E5%88%A4%E6%96%AD%E5%BD%93%E5%89%8Dmysql%E6%98%AF%E5%90%A6%E6%94%AF%E6%8C%81%E5%88%86%E5%8C%BA)
  - [MySQL支持的分区类型有哪些？](#mysql%E6%94%AF%E6%8C%81%E7%9A%84%E5%88%86%E5%8C%BA%E7%B1%BB%E5%9E%8B%E6%9C%89%E5%93%AA%E4%BA%9B)
- [日志模块](#%E6%97%A5%E5%BF%97%E6%A8%A1%E5%9D%97)
  - [redo log（重做日志）](#redo-log%E9%87%8D%E5%81%9A%E6%97%A5%E5%BF%97)
  - [binlog（归档日志）](#binlog%E5%BD%92%E6%A1%A3%E6%97%A5%E5%BF%97)
  - [两种日志区别](#%E4%B8%A4%E7%A7%8D%E6%97%A5%E5%BF%97%E5%8C%BA%E5%88%AB)
- [四种隔离级别](#%E5%9B%9B%E7%A7%8D%E9%9A%94%E7%A6%BB%E7%BA%A7%E5%88%AB)
  - [MySQL的事务隔离级别的底层实现原理](#mysql%E7%9A%84%E4%BA%8B%E5%8A%A1%E9%9A%94%E7%A6%BB%E7%BA%A7%E5%88%AB%E7%9A%84%E5%BA%95%E5%B1%82%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86)
- [对于脏读，不可重复读，幻读的理解](#%E5%AF%B9%E4%BA%8E%E8%84%8F%E8%AF%BB%E4%B8%8D%E5%8F%AF%E9%87%8D%E5%A4%8D%E8%AF%BB%E5%B9%BB%E8%AF%BB%E7%9A%84%E7%90%86%E8%A7%A3)
  - [脏读](#%E8%84%8F%E8%AF%BB)
  - [不可重复读](#%E4%B8%8D%E5%8F%AF%E9%87%8D%E5%A4%8D%E8%AF%BB)
  - [幻读](#%E5%B9%BB%E8%AF%BB)
  - [不可重复读和幻读区别](#%E4%B8%8D%E5%8F%AF%E9%87%8D%E5%A4%8D%E8%AF%BB%E5%92%8C%E5%B9%BB%E8%AF%BB%E5%8C%BA%E5%88%AB)
  - [InnoDB的RR级别如何避免幻读？](#innodb%E7%9A%84rr%E7%BA%A7%E5%88%AB%E5%A6%82%E4%BD%95%E9%81%BF%E5%85%8D%E5%B9%BB%E8%AF%BB)
- [关于MVVC](#%E5%85%B3%E4%BA%8Emvvc)
- [存储过程](#%E5%AD%98%E5%82%A8%E8%BF%87%E7%A8%8B)
- [Mysql存储引擎](#mysql%E5%AD%98%E5%82%A8%E5%BC%95%E6%93%8E)
  - [MyISAM和InnoDB的区别](#myisam%E5%92%8Cinnodb%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [如何选择](#%E5%A6%82%E4%BD%95%E9%80%89%E6%8B%A9)
- [mysql主从同步](#mysql%E4%B8%BB%E4%BB%8E%E5%90%8C%E6%AD%A5)
  - [MySQL主从复制的两种方式](#mysql%E4%B8%BB%E4%BB%8E%E5%A4%8D%E5%88%B6%E7%9A%84%E4%B8%A4%E7%A7%8D%E6%96%B9%E5%BC%8F)
  - [使用主从同步的好处](#%E4%BD%BF%E7%94%A8%E4%B8%BB%E4%BB%8E%E5%90%8C%E6%AD%A5%E7%9A%84%E5%A5%BD%E5%A4%84)
  - [主从复制原理](#%E4%B8%BB%E4%BB%8E%E5%A4%8D%E5%88%B6%E5%8E%9F%E7%90%86)
  - [主从复制延迟及解决](#%E4%B8%BB%E4%BB%8E%E5%A4%8D%E5%88%B6%E5%BB%B6%E8%BF%9F%E5%8F%8A%E8%A7%A3%E5%86%B3)
- [MySQL事务原理](#mysql%E4%BA%8B%E5%8A%A1%E5%8E%9F%E7%90%86)
  - [undo 日志文件](#undo-%E6%97%A5%E5%BF%97%E6%96%87%E4%BB%B6)
  - [redo/undo日志文件](#redoundo%E6%97%A5%E5%BF%97%E6%96%87%E4%BB%B6)
- [为什么用自增列作为主键](#%E4%B8%BA%E4%BB%80%E4%B9%88%E7%94%A8%E8%87%AA%E5%A2%9E%E5%88%97%E4%BD%9C%E4%B8%BA%E4%B8%BB%E9%94%AE)
- [Join的实现原理](#join%E7%9A%84%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86)
  - [优化](#%E4%BC%98%E5%8C%96)
- [MySQL优化](#mysql%E4%BC%98%E5%8C%96)
  - [一条sql执行过长的时间，你如何优化，从哪些方面？](#%E4%B8%80%E6%9D%A1sql%E6%89%A7%E8%A1%8C%E8%BF%87%E9%95%BF%E7%9A%84%E6%97%B6%E9%97%B4%E4%BD%A0%E5%A6%82%E4%BD%95%E4%BC%98%E5%8C%96%E4%BB%8E%E5%93%AA%E4%BA%9B%E6%96%B9%E9%9D%A2)
- [MySQL中binary log和redo log顺序一致性问题](#mysql%E4%B8%ADbinary-log%E5%92%8Credo-log%E9%A1%BA%E5%BA%8F%E4%B8%80%E8%87%B4%E6%80%A7%E9%97%AE%E9%A2%98)
- [一个表有3000万记录，假如有一列占8位字节的字段，根据这一列建索引的话索引树的高度是多少？](#%E4%B8%80%E4%B8%AA%E8%A1%A8%E6%9C%893000%E4%B8%87%E8%AE%B0%E5%BD%95%E5%81%87%E5%A6%82%E6%9C%89%E4%B8%80%E5%88%97%E5%8D%A08%E4%BD%8D%E5%AD%97%E8%8A%82%E7%9A%84%E5%AD%97%E6%AE%B5%E6%A0%B9%E6%8D%AE%E8%BF%99%E4%B8%80%E5%88%97%E5%BB%BA%E7%B4%A2%E5%BC%95%E7%9A%84%E8%AF%9D%E7%B4%A2%E5%BC%95%E6%A0%91%E7%9A%84%E9%AB%98%E5%BA%A6%E6%98%AF%E5%A4%9A%E5%B0%91)
- [b+树一般多高，能存储多少数据？](#b%E6%A0%91%E4%B8%80%E8%88%AC%E5%A4%9A%E9%AB%98%E8%83%BD%E5%AD%98%E5%82%A8%E5%A4%9A%E5%B0%91%E6%95%B0%E6%8D%AE)
- [为什么要给表加上主键？](#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E7%BB%99%E8%A1%A8%E5%8A%A0%E4%B8%8A%E4%B8%BB%E9%94%AE)
- [为何要使用自增int作为主键？](#%E4%B8%BA%E4%BD%95%E8%A6%81%E4%BD%BF%E7%94%A8%E8%87%AA%E5%A2%9Eint%E4%BD%9C%E4%B8%BA%E4%B8%BB%E9%94%AE)
- [MySQL中sql注入是什么，如何避免？](#mysql%E4%B8%ADsql%E6%B3%A8%E5%85%A5%E6%98%AF%E4%BB%80%E4%B9%88%E5%A6%82%E4%BD%95%E9%81%BF%E5%85%8D)
- [SQL中where、having、group by、order by执行和书写顺序？](#sql%E4%B8%ADwherehavinggroup-byorder-by%E6%89%A7%E8%A1%8C%E5%92%8C%E4%B9%A6%E5%86%99%E9%A1%BA%E5%BA%8F)
- [水平分库后查询如何排序](#%E6%B0%B4%E5%B9%B3%E5%88%86%E5%BA%93%E5%90%8E%E6%9F%A5%E8%AF%A2%E5%A6%82%E4%BD%95%E6%8E%92%E5%BA%8F)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# 数据库基础知识
## 数据库的定义

数据库：物理操作文件系统或其他形式文件类型的集合；

实例：MySQL 数据库由后台线程以及一个共享内存区组成；

在 MySQL 中，实例和数据库往往都是一一对应的，而我们也无法直接操作数据库，而是要通过数据库实例来操作数据库文件，可以理解为数据库实例是数据库为上层提供的一个专门用于操作的接口。

在 Unix 上，启动一个 MySQL 实例往往会产生两个进程，mysqld 就是真正的数据库服务守护进程，而 mysqld_safe 是一个用于检查和设置 mysqld 启动的控制程序，它负责监控 MySQL 进程的执行，当 mysqld 发生错误时，mysqld_safe 会对其状态进行检查并在合适的条件下重启。
## 什么是SQL？
结构化查询语言(Structured Query Language)简称SQL，是一种数据库查询语言。

作用：用于存取数据、查询、更新和管理关系数据库系统。
## 什么是MySQL?
MySQL是一个关系型数据库管理系统，由瑞典MySQL AB 公司开发，属于 Oracle 旗下产品。MySQL 是最流行的关系型数据库管理系统之一，在 WEB 应用方面，MySQL是最好的 RDBMS (Relational Database Management System，关系数据库管理系统) 应用软件之一。在Java企业级开发中非常常用，因为 MySQL 是开源免费的，并且方便扩展。

## MySQL的架构

![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-8.png)


![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-9.png)

## MySQL的binlog有有几种录入格式？分别有什么区别？
有三种格式，statement，row和mixed。
1. statement模式下，每一条会修改数据的sql都会记录在binlog中。不需要记录每一行的变化，减少了binlog日志量，节约了IO，提高性能。由于sql
的执行是有上下文的，因此在保存的时候需要保存相关的信息，同时还有一些使用了函数之类的语句无法被记录复制。
2. row级别下，不记录sql语句上下文相关信息，仅保存哪条记录被修改。记录单元为每一行的改动，基本是可以全部记下来但是由于很多操作，会导致大量行的改动(比如alter table)，因此这种模式的文件保存的信息太多，日志量太大。
3. mixed，一种折中的方案，普通操作使用statement记录，当无法使用statement的时候使用row。
此外，新版的MySQL中对row级别也做了一些优化，当表结构发生变化的时候，会记录语句而不是逐行记录。


# MySQL常用函数
## 聚合函数
- count（）：求数据表的行数
- max（）：求某列的最大数值
- min（）：求某列的最小值
- sum（）：对数据表的某列进行求和操作
- avg()：对数据表的某列进行求平均值操作

## 数学函数
- abs(X):返回X的绝对值
- mod(N,M)或%:返回N被M除的余数
- floor(X):返回不大于X的最大整数值
- round(X) :返回参数X的四舍五入的一个整数

## 字符串函数
- concat(str1,str2,...):返回来自于参数连结的字符串
- length(str):返回字符串str的长度
- substring(str,pos):从字符串str的起始位置pos返回一个子串
- replace(str,from_str,to_str):返回字符串str，其字符串from_str的所有出现由字符串to_str代替

## 日期和时间函数
- dayofweek(date):返回日期date的星期索引(1=星期天，2=星期一, …7=星期六)
- dayofmonth(date):返回date的月份中的日期，在1到31范围内
- month(date):返回date的月份，范围1到12
- now():以‘YYYY-MM-DD HH:MM:SS’或YYYYMMDDHHMMSS格式返回当前的日期和时间

## 条件判断函数
- CASE value WHEN [compare-value] THEN result [WHEN [compare-value] THEN result ...
如：SELECT CASE WHEN 1>0 THEN 'true' ELSE 'false' END;
- IF(expr1,expr2,expr3)：如果 expr1 是TRUE，则 IF()的返回值为expr2; 否则返回值则为 expr3

## 系统信息函数
- version()：函数返回数据库的版本号
- connection_ID()：函数返回服务器的连接数
- database()和schema()返回当前数据库名。

## 加密函数
- password(str)：函数可以对字符串str进行加密
- MD5(str)加密函数




# 索引
索引是数据库中非常非常重要的概念，它是存储引擎能够快速定位记录的秘密武器，对于提升数据库的性能、减轻数据库服务器的负担有着非常重要的作用；索引优化是对查询性能优化的最有效手段，它能够轻松地将查询的性能提高几个数量级。


**为什么使用数据索引能提高效率？**
1. 数据索引的存储是有序的
2. 在有序的情况下，通过索引查询一个数据是无需遍历索引记录的
3. 极端情况下，数据索引的查询效率为二分法查询效率，趋近于 log2(N)

## B+树索引和哈希索引的区别
B+树是一个平衡的多叉树，从根节点到每个叶子节点的高度差值不超过1，而且同层级的节点间有指针相互链接，是有序的

![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-1.jpg)

哈希索引就是采用一定的哈希算法，把键值换算成新的哈希值，检索时不需要类似B+树那样从根节点到叶子节点逐级查找，只需一次哈希算法即可,是无序的

![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-2.jpg)

**哈希索引的优势：**

1. 等值查询。哈希索引具有绝对优势（前提是：没有大量重复键值，如果大量重复键值时，哈希索引的效率很低，因为存在所谓的哈希碰撞问题。）

**哈希索引不适用的场景：**

1. 不支持范围查询
2. 不支持索引完成排序
3. 不支持联合索引的最左前缀匹配规则


通常，B+树索引结构适用于绝大多数场景，像下面这种场景用哈希索引才更有优势：

在HEAP表中，如果存储的数据重复度很低（也就是说基数很大），对该列数据以等值查询为主，没有范围查询、没有排序的时候，特别适合采用哈希索引，例如这种SQL：
```mysql
select id,name from table where name='李明'; — 仅等值查询
```
而常用的InnoDB引擎中默认使用的是B+树索引，它会实时监控表上索引的使用情况，如果认为建立哈希索引可以提高查询效率，则自动在内存中的“自适应哈希索引缓冲区”建立哈希索引（在InnoDB中默认开启自适应哈希索引），通过观察搜索模式，MySQL会利用index key的前缀建立哈希索引，如果一个表几乎大部分都在缓冲池中，那么建立一个哈希索引能够加快等值查询。

注意：在某些工作负载下，通过哈希索引查找带来的性能提升远大于额外的监控索引搜索情况和保持这个哈希表结构所带来的开销。但某些时候，在负载高的情况下，自适应哈希索引中添加的read/write锁也会带来竞争，比如高并发的join操作。like操作和%的通配符操作也不适用于自适应哈希索引，可能要关闭自适应哈希索引。



## B树和B+树的区别
1. B树，每个节点都存储key和data，所有节点组成这棵树，并且叶子节点指针为nul，叶子结点不包含任何关键字信息。
![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-3.jpg)
2. B+树，所有的叶子结点中包含了全部关键字的信息，及指向含有这些关键字记录的指针，且叶子结点本身依关键字的大小自小而大的顺序链接，所有的非终端结点可以看成是索引部分，结点中仅含有其子树根结点中最大（或最小）关键字。 (而B 树的非终节点也包含需要查找的有效信息)

![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-4.jpg)


**为什么说B+比B树更适合实际应用中操作系统的文件索引和数据库索引？**

1、 B+的磁盘读写代价更低

B+的内部结点并没有指向关键字具体信息的指针。因此其内部结点相对B树更小。如果把所有同一内部结点的关键字存放在同一盘块中，那么盘块所能容纳的关键字数量也越多。一次性读入内存中的需要查找的关键字也就越多。相对来说IO读写次数也就降低了。

2、 B+-tree的查询效率更加稳定

由于非终结点并不是最终指向文件内容的结点，而只是叶子结点中关键字的索引。所以任何关键字的查找必须走一条从根结点到叶子结点的路。所有关键字查询的路径长度相同，导致每一个数据的查询效率相当。


## 聚集索引和辅助索引
数据库中的 B+ 树索引可以分为聚集索引（clustered index）和辅助索引（secondary index），它们之间的最大区别就是，聚集索引中存放着一条行记录的全部信息，而辅助索引中只包含索引列和一个用于查找对应行记录的『书签』。

### 聚集索引
聚集索引：指索引项的排序方式和表中数据记录排序方式一致的索引，每张表只能有一个聚集索引，聚集索引的叶子节点存储了整个行数据。

解释：什么叫索引项的排序方式和表中数据记录排序方式一致呢？

我们把一本字典看做是数据库的表，那么字典的拼音目录就是聚集索引，它按照A-Z排列。实际存储的字也是按A-Z排列的。这就是索引项的排序方式和表中数据记录排序方式一致。


对于Innodb，主键毫无疑问是一个聚集索引。但是当一个表没有主键，或者没有一个索引，Innodb会如何处理呢。请看如下规则:
1. 如果一个主键被定义了，那么这个主键就是作为聚集索引。
2. 如果没有主键被定义，那么该表的第一个唯一非空索引被作为聚集索引。
3. 如果没有主键也没有合适的唯一索引，那么innodb内部会生成一个隐藏的主键作为聚集索引，这个隐藏的主键是一个6个字节的列，该列的值会随着数据的插入自增。

![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-6.png)
    
### 辅助索引
辅助索引：辅助索引中索引的逻辑顺序与磁盘上行的物理存储顺序不同，一个表中可以拥有多个非聚集索引。叶子节点并不包含行记录的全部数据。叶子节点除了包含键值以外，还存储了一个指向改行数据的聚集索引建的书签。

辅助索引可以理解成字典按偏旁去查字。

辅助索引的存在并不会影响聚集索引，因为聚集索引构成的 B+ 树是数据实际存储的形式，而辅助索引只用于加速数据的查找，所以一张表上往往有多个辅助索引以此来提升数据库的性能。

一张表一定包含一个聚集索引构成的 B+ 树以及若干辅助索引的构成的 B+ 树。

通过辅助索引查找到对应的主键，最后在聚集索引中使用主键获取对应的行记录，这也是通常情况下行记录的查找方式。

![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-7.png)

## 联合索引
1. 联合索引是两个或更多个列上的索引。对于联合索引:Mysql从左到右的使用索引中的字段，一个查询可以只使用索引中的一部份，但只能是最左侧部分。例如索引是key index (a,b,c). 可以支持a   、    a,b   、  a,b,c 3种组合进行查找，但不支持 b,c进行查找 .当最左侧字段是常量引用时，索引就十分有效。
2. 利用索引中的附加列，您可以缩小搜索的范围，但使用一个具有两列的索引 不同于使用两个单独的索引。复合索引的结构与电话簿类似，人名由姓和名构成，电话簿首先按姓氏对进行排序，然后按名字对有相同姓氏的人进行排序。如果您知 道姓，电话簿将非常有用；如果您知道姓和名，电话簿则更为有用，但如果您只知道名不姓，电话簿将没有用处。

## 什么情况下应不建或少建索引
1. 表记录太少
2. 经常插入、删除、修改的表
3. 数据重复且分布平均的表字段，假如一个表有10万行记录，有一个字段A只有T和F两种值，且每个值的分布概率大约为50%，那么对这种表A字段建索引一般不会提高数据库的查询速度。
4. 经常和主字段一块查询但主字段索引值比较多的表字段

## 哪些情况会导致索引失效？
1. 左模糊
2. 不符合最左原则
3. or
4. is null
5. !=或<>
6. in 和 not in
7. 表达式操作：where num/2=100 
8. 函数：where substring(name,1,3)='abc'


## key和index的区别
1. key 是数据库的物理结构，它包含两层意义和作用，一是约束（偏重于约束和规范数据库的结构完整性），二是索引（辅助查询用的）。包括primary key, unique key, foreign key 等
2. index是数据库的物理结构，它只是辅助查询的，它创建时会在另外的表空间（mysql中的innodb表空间）以一个类似目录的结构存储。索引要分类的话，分为前缀索引、全文本索引等；


## 如果索引值为null，走不走索引?
答案：走

MySQL难以优化引用了可空列的查询,它会使索引、索引统计和值更加复杂。可空列需要更多的储存空间，还需要在MySQL内部进行特殊处理。当可空列被索引的时候，

每条记录都需要一个额外的字节，还可能导致 MyISAM 中固定大小的索引(例如一个整数列上的索引)变成可变大小的索引。 

即使要在表中储存「没有值」的字段，还是有可能不使用 NULL 的，考虑使用 0、特殊值或空字符串来代替它。 

把 NULL 列改为 NOT NULL 带来的性能提升很小，所以除非确定它引入了问题，否则就不要把它当作优先的优化措施。
然后，如果计划对列进行索引，就要尽量避免把它设置为可空,**虽然在mysql里 Null值的列也是走索引的**。对MySQL来说，null是一个特殊的值。

##为什么MySQL的索引结构，采用了B+树，没有使用跳跃表呢？
1. 首先，跳跃表不适用于磁盘读取的场景，B+树的页天生就和磁盘块对应
2. 其二，跳跃表的查找效率不如B+树效率高，也不如B+树稳定。


## 判断列是否要添加索引的标准
有时候由数据库的查询优化器自动判断是否使用索引；
- 1、较频繁的作为查询条件的字段应该创建索引，且唯一性较好的
- 2、show index from table_name ##  查看该表的索引信息

Cardinality 值非常重要，优化器会根据这个值来判断是否使用这个索引，但是这个值并不是实时更新的，即并非索引的更新都会更新该值，因为代价太大，只是一个大概值

Cardinality ：非常关键的值，标识索引中唯一值的数目的估计值，Cardinality/表的记录数应尽可能的接近1，如果非常小,那用户需要考虑是否还有必要创建这个索引。故在访问高选择性属性的字段并从表中取出很少一部分数据时，对于字段添加B+树索引是非常有必要的


# 锁
锁的种类一般分为乐观锁和悲观锁两种，InnoDB 存储引擎中使用的就是悲观锁，而按照锁的粒度划分，也可以分成行锁和表锁.

## 行锁
### 优点
1. 当在许多线程中访问不同的行时只存在少量锁定冲突。
2. 回滚时只有少量的更改
3. 可以长时间锁定单一的行。
### 缺点
1. 比页级或表级锁定占用更多的内存。
2. 当在表的大部分中使用时，比页级或表级锁定速度慢，因为你必须获取更多的锁。
3. 如果你在大部分数据上经常进行GROUP BY操作或者必须经常扫描整个表，比其它锁定明显慢很多。
4. 用高级别锁定，通过支持不同的类型锁定，你也可以很容易地调节应用程序，因为其锁成本小于行级锁定。

## 锁的算法
三种锁的算法：Record Lock、Gap Lock 和 Next-Key Lock
### Record Lock
记录锁（Record Lock）是加到索引记录上的锁，假设我们存在下面的一张表 users：
```java
  CREATE TABLE users(
        id INT NOT NULL AUTO_INCREMENT,
        last_name VARCHAR(255) NOT NULL,
        first_name VARCHAR(255),
        age INT,
        PRIMARY KEY(id),
        KEY(last_name),
        KEY(age)
    );
``` 
如果我们使用 id 或者 last_name 作为 SQL 中 WHERE 语句的过滤条件，那么 InnoDB 就可以通过索引建立的 B+ 树找到行记录并添加索引，但是如果使用 first_name 作为过滤条件时，由于 InnoDB 不知道待修改的记录具体存放的位置，也无法对将要修改哪条记录提前做出判断就会锁定整个表。
    
### Gap Lock
记录锁是在存储引擎中最为常见的锁，除了记录锁之外，InnoDB 中还存在间隙锁（Gap Lock），间隙锁是对索引记录中的一段连续区域的锁；当使用类似 SELECT * FROM users WHERE id BETWEEN 10 AND 20 FOR UPDATE; 的 SQL 语句时，就会阻止其他事务向表中插入 id = 15 的记录，因为整个范围都被间隙锁锁定了。
    
间隙锁是存储引擎对于性能和并发做出的权衡，并且只用于某些事务隔离级别。
    
虽然间隙锁中也分为共享锁和互斥锁，不过它们之间并不是互斥的，也就是不同的事务可以同时持有一段相同范围的共享锁和互斥锁，它唯一阻止的就是其他事务向这个范围中添加新的记录。

Gap Lock的作用是为了阻止多个事务将记录插入到同一个范围内，这样会导致幻读的产生。用户可以通过以下两种服务显式地关闭Gap Lock。
1. 将事务的隔离级别设置为READ COMMITTED
2. 将参数innodb_locks_unsafe_for_binlog设置为1


除了外键约束和唯一性检查需要的Gap Lock，其余情况仅使用Record Lock进行锁定。这样做破坏了事务的隔离性，并且对于replication会导致主动数据的不一致。
    
### Next-Key Lock
Next-Key Lock是结合了Gap Lock和Record Lock的一种锁定算法,其设置的目的是为了解决幻读问题。
 
当查询的索引含有唯一属性的时候，InnoDB存储引擎会对Next-Key Lock进行优化，将其降为Record Lock，即仅仅锁住索引本身，而不是范围，从而提高并发效率。

对于唯一值的锁定，Next-Key Lock降级为Record Lock仅存在于查询所有的唯一索引列。若唯一索引由多个列组成，而查询仅是查找多个唯一索引列中的其中一个，那么查询其实是range类型，而不是point类型的查询。此时InnoDB存储引擎依然使用Next-Key Lock进行锁定。

## 锁选择

下面我们针对大部分的SQL类型分析是如何加锁的，假设事务隔离级别为可重复读

**select .. from**  

不加任何类型的锁

**select...from lock in share mode**

在扫描到的任何索引记录上加共享的（shared）next-key lock，还有主键聚集索引加排它锁 

**select..from for update**

在扫描到的任何索引记录上加排它的next-key lock，还有主键聚集索引加排它锁 

**update..where   delete from..where**

在扫描到的任何索引记录上加next-key lock，还有主键聚集索引加排它锁 

**insert into..**

简单的insert会在insert的行对应的索引记录上加一个排它锁，这是一个record lock，并没有gap，所以并不会阻塞其他session在gap间隙里插入记录。不过在insert操作之前，还会加一种锁，官方文档称它为insertion intention gap lock，也就是意向的gap锁。这个意向gap锁的作用就是预示着当多事务并发插入相同的gap空隙时，只要插入的记录不是gap间隙中的相同位置，则无需等待其他session就可完成，这样就使得insert操作无须加真正的gap lock。想象一下，如果一个表有一个索引idx_test，表中有记录1和8，那么每个事务都可以在2和7之间插入任何记录，只会对当前插入的记录加record lock，并不会阻塞其他session插入与自己不同的记录，因为他们并没有任何冲突。

## 悲观锁和乐观锁
### 悲观锁和乐观锁使用在哪些场景？
悲观锁和乐观锁是数据库用来保证数据并发安全防止更新丢失的两种方法，楼主列举的例子在select ... for update前加个事务就可以防止更新丢失。悲观锁和乐观锁大部分场景下差异不大，一些独特场景下有一些差别，一般我们可以从如下几个方面来判断：
1. 响应速度：如果需要非常高的响应速度，建议采用乐观锁方案，成功就执行，不成功就失败，不需要等待其他并发去释放锁
2. 冲突频率：如果冲突频率非常高，建议采用悲观锁，保证成功率，如果冲突频率大，乐观锁会需要多次重试才能成功，代价比较大
3. 重试代价：如果重试代价大，建议采用悲观锁

### 乐观锁重试
并发修改同一记录时，避免更新丢失，需要加锁。要么在应用层加锁，要么在缓存加锁，要么在数据库层使用乐观锁，使用version作为更新依据。说明：如果每次访问冲突概率小于20%，推荐使用乐观锁，否则使用悲观锁。乐观锁的重试次数不得小于3次。


## 数据库死锁的产生原因及解决办法
**死锁的第一种情况**
一个用户A 访问表A(锁住了表A),然后又访问表B；另一个用户B 访问表B(锁住了表B)，然后企图访问表A；这时用户A由于用户B已经锁住表B，它必须等待用户B释放表B才能继续，同样
用户B要等用户A释放表A才能继续，这就死锁就产生了。

解决方法：
- 对于数据库的多表操作时，尽量按照相同的顺序进 行处理，尽量避免同时锁定两个资源，如操作A和B两张表时，总是按先A后B的顺序处理， 必须同时锁定两个资源时，要保证在任何时刻都应该**按照相同的顺序**来锁定资源。

**死锁的第二种情况**
用户A查询一条纪录，然后修改该条纪录；这时用户B修改该条纪录，**这时用户A的事务里锁的性质由查询的共享锁企图上升到独占锁**，而用户B里的独占锁由于A 有共享锁存在所以必须等A释放掉共享锁，而**A由于B的独占锁而无法上升的独占锁也就不可能释放共享锁**，于是出现了死锁。

解决方法：
1. 对于按钮等控件，点击后使其立刻失效，不让用户重复点击，避免对同时对同一条记录操作。
2. 使用乐观锁进行控制。
3. 使用悲观锁进行控制。

**死锁的第三种情况**
如果在事务中执行了一条不满足条件的update语句，则执行全表扫描，把行级锁上升为表级锁，多个这样的事务执行后，就很容易产生死锁和阻塞。类似的情 况还有当表中的数据量非常庞大而索引建的过少或不合适的时候，使得经常发生全表扫描，最终应用系统会越来越慢，最终发生阻塞或死锁。

解决方法：
- SQL语句中不要使用太复杂的关联多表的查询；使用“执行计划”对SQL语句进行分析，对于有全表扫描的SQL语句，建立相应的索引进行优化。








# MySQL分区
## 什么是分区？
表分区，是指根据一定规则，将数据库中的一张表分解成多个更小的，容易管理的部分。从逻辑上看，只有一张表，但是底层却是由多个物理分区组成。

## 分区与分表的区别
分表：指的是通过一定规则，将一张表分解成多张不同的表。比如将用户订单记录根据时间成多个表。 

分表与分区的区别在于：分区从逻辑上来讲只有一张表，而分表则是将一张表分解成多张表。



## 使用场景

1. 表非常大，无法全部存在内存，或者只在表的最后有热点数据，其他都是历史数据。
2. 分区表的数据更易维护，可以对独立的分区进行独立的操作。
3. 分区表的数据可以分布在不同的机器上，从而高效适用资源。
4. 可以使用分区表来避免某些特殊的瓶颈
5. 可以备份和恢复独立的分区

## 限制
1. 一个表最多只能有1024个分区 
2. MySQL5.1中，分区表达式必须是整数，或者返回整数的表达式。在MySQL5.5中提供了非整数表达式分区的支持。 
3. 如果分区字段中有主键或者唯一索引的列，那么多有主键列和唯一索引列都必须包含进来。即：分区字段要么不包含主键或者索引列，要么包含全部主键和索引列。
4. 分区表中无法使用外键约束 
5. 需要对现有表的结构进行修改
6. 所有分区都必须使用相同的存储引擎
7. 分区函数中可以使用的函数和表达式会有一些限制
8. 某些存储引擎不支持分区
9. 对于MyISAM的分区表，不能使用load index into cache
10. 对于MyISAM表，使用分区表时需要打开更多的文件描述符

## 如何判断当前MySQL是否支持分区？
命令：show variables like '%partition%' 运行结果:

mysql> show variables like '%partition%';
```mysql
+-------------------+-------+
| Variable_name     | Value |
+-------------------+-------+
| have_partitioning | YES   |
+-------------------+-------+
```
1 row in set (0.00 sec)
have_partintioning 的值为YES，表示支持分区。

## MySQL支持的分区类型有哪些？
1. RANGE分区： 这种模式允许将数据划分不同范围。例如可以将一个表通过年份划分成若干个分区
2. LIST分区： 这种模式允许系统通过预定义的列表的值来对数据进行分割。按照List中的值分区，与RANGE的区别是，range分区的区间范围值是连续的。 
3. HASH分区 ：这中模式允许通过对表的一个或多个列的Hash Key进行计算，最后通过这个Hash码不同数值对应的数据区域进行分区。例如可以建立一个对表主键进行分区的表。
4. KEY分区 ：上面Hash模式的一种延伸，这里的Hash Key是MySQL系统产生的。

# 日志模块
## redo log（重做日志）
如果每一次的更新操作都需要写进磁盘，然后磁盘也要找到对应的那条记录，然后再更新，整个过程 IO 成本、查找成本都很高。为了解决这个问题，可以使用 WAL 技术，WAL 的全称是 Write-Ahead Logging，它的关键点就是先写日志，再写磁盘

具体来说，当有一条记录需要更新的时候，InnoDB 引擎就会先把记录写到 redo log里面，并更新内存，这个时候更新就算完成了。同时，InnoDB 引擎会在适当的时候，将这个操作记录更新到磁盘里面，而这个更新往往是在系统比较空闲的时候做。

InnoDB 的 redo log 是固定大小的，比如可以配置为一组 4 个文件，每个文件的大小是 1GB，也就是总共就可以记录 4GB 的操作。从头开始写，写到末尾就又回到开头循环写。


## binlog（归档日志）
MySQL 整体来看，其实就有两块：一块是 Server 层，它主要做的是 MySQL 功能层面的事情；还有一块是引擎层，负责存储相关的具体事宜。 redo log 是 InnoDB 引擎特有的日志，而 Server 层也有自己的日志，称为 binlog（归档日志）

作用：
1. 可以用来查看数据库的变更历史（具体的时间点所有的SQL操作）
2. 数据库增量备份和恢复（增量备份和基于时间点的恢复）
3. MySQL的复制（主主数据库的复制、主从数据库的复制）

## 两种日志区别
1. redo log 是 InnoDB 引擎特有的；binlog 是 MySQL 的 Server 层实现的，所有引擎都可以使用。
2. redo log 是物理日志，记录的是“在某个数据页上做了什么修改”；binlog 是逻辑日志，记录的是这个语句的原始逻辑，比如“给 ID=2 这一行的 c 字段加 1 ”。
3. redo log 是循环写的，空间固定会用完；binlog 是可以追加写入的。“追加写”是指 binlog 文件写到一定大小后会切换到下一个，并不会覆盖以前的日志。

# 四种隔离级别

1. Serializable (串行化)：可避免脏读、不可重复读、幻读的发生。
2. Repeatable read (可重复读)：可避免脏读、不可重复读的发生。
3. Read committed (读已提交)：可避免脏读的发生。
4. Read uncommitted (读未提交)：最低级别，任何情况都无法保证。

## MySQL的事务隔离级别的底层实现原理
底层实现原理主要在读，写都会加排他锁
1. 不会加锁
2. MVCC 每次select
3. MVCC 第一次select
4. 加共享锁，读写互斥

**1、 READ UNCOMMITTED（你读了别人正在处理的数据）**

读不会加任何锁。而写会加排他锁，并到事务结束之后释放。

**2、READ COMMITTED（两次读的都是真的（不脏读） 可是却存在不可重复，你读的期间别人插进来对数据操作了）**

读取数据不加锁而是使用了MVCC机制，写数据时，使用排它锁。

该级别下还是遗留了不可重复读和幻读问题： MVCC版本的生成时机: 是**每次select时**。这就意味着，如果我们在事务A中执行多次的select，在每次select之间有其他事务更新了我们读取的数据并提交了，那就出现了不可重复读，即：重复读时，会出现数据不一致问题，后面我们会讲解超支现象，就是这种引起的。

读时通过mvcc，访问的是创建版本最大&&删除版本为空的记录

**3、REPEATABLE READ（事务是多次读取，得到的相同的值）**
READ COMMITTED级别不同的是MVCC版本的生成时机，即：一次事务中只在第一次select时生成版本，后续的查询都是在这个版本上进行，从而实现了可重复读。

读时通过mvcc，访问的是创建版本小于等于当前版本&&（删除版本大于当前版本 || 删除版本为空）的记录

**4、SERIALISABLE（你读的时候别人看不到，隔离开，单独执行）**
该级别下，会自动将所有普通select转化为select ... lock in share mode执行，即针对同一数据的所有读写都变成互斥的了，可靠性大大提高，并发性大大降低。



# 对于脏读，不可重复读，幻读的理解

## 脏读
 针对未提交数据

 如果一个事务中对数据进行了更新，但事务还没有提交，另一个事务可以“看到”该事务没有提交的更新结果，这样造成的问题就是，如果第一个事务回滚，那么，第二个事务在此之前所“看到”的数据就是一笔脏数据。

## 不可重复读
针对其他提交前后，读取数据本身的对比

不可重复读取是指同一个事务在整个事务过程中对同一笔数据进行读取，每次读取结果都不同。如果事务1在事务2的更新操作之前读取一次数据，在事务2的更新操作之后再读取同一笔数据一次，两次结果是不同的，所以，Read Uncommitted也无法避免不可重复读取的问题。

## 幻读
针对其他提交前后，读取数据条数的对比

幻读是指同样一笔查询在整个事务过程中多次执行后，查询所得的结果集是不一样的。幻读针对的是多笔记录。在Read Uncommitted隔离级别下， 不管事务2的插入操作是否提交，事务1在插入操作之前和之后执行相同的查询，取得的结果集是不同的，所以，Read Uncommitted同样无法避免幻读的问题。

## 不可重复读和幻读区别
- 不可重复读:同样的条件，你读取过的数据，再次读取出来发现值不一样了。
- 幻读:同样的条件，第1次和第2次读出来的记录数不一样

不可重复读重点在于只锁住update和delete，而幻读的重点还在于锁住insert。

如果使用锁机制来实现这两种隔离级别，**在可重复读中，该sql第一次读取到数据后，就将这些数据加锁，其它事务无法修改这些数据，就可以实现可重复读了。但这种方法却无法锁住insert的数据，所以当事务A先前读取了数据，或者修改了全部数据，事务B还是可以insert数据提交，这时事务A就会发现莫名其妙多了一条之前没有的数据，这就是幻读**，不能通过行锁来避免。需要Serializable隔离级别 ，读用读锁，写用写锁，读锁和写锁互斥，这么做可以有效的避免幻读、不可重复读、脏读等问题，但会极大的降低数据库的并发能力。

所以说不可重复读和幻读最大的区别，有没有锁住insert。


## InnoDB的RR级别如何避免幻读？
避免幻读，需要应用使用加锁读来保证。而这个加锁度使用到的机制就是next-key locks。

在RR的隔离级别下，Innodb使用MVVC和next-key locks解决幻读，MVVC解决的是普通读（快照读）的幻读，next-key locks解决的是当前读情况下的幻读。

# 关于MVVC
MySQL InnoDB存储引擎，实现的是基于多版本的并发控制协议——MVCC (Multi-Version Concurrency Control) (注：与MVCC相对的，是基于锁的并发控制，Lock-Based Concurrency Control)。MVCC最大的好处：读不加锁，读写不冲突。在读多写少的OLTP应用中，读写不冲突是非常重要的，极大的增加了系统的并发性能，现阶段几乎所有的RDBMS，都支持了MVCC。

1. LBCC：Lock-Based Concurrency Control，基于锁的并发控制。
2. MVCC：Multi-Version Concurrency Control，基于多版本的并发控制协议。纯粹基于锁的并发机制并发量低，MVCC是在基于锁的并发控制上的改进，主要是在读操作上提高了并发量。

在MVCC并发控制中，读操作可以分成两类：

1. 快照读 (snapshot read)：读取的是记录的可见版本 (有可能是历史版本)，不用加锁（共享读锁s锁也不加，所以不会阻塞其他事务的写）。
2. 当前读 (current read)：读取的是记录的最新版本，并且，当前读返回的记录，都会加上锁，保证其他事务不会再并发修改这条记录。





# 存储过程

简单的说，就是一组SQL语句集，功能强大，可以实现一些比较复杂的逻辑功能，类似于JAVA语言中的方法；

ps:存储过程跟触发器有点类似，都是一组SQL集，但是存储过程是主动调用的，且功能比触发器更加强大，触发器是某件事触发后自动调用；

有哪些特性
1. 有输入输出参数，可以声明变量，有if/else, case,while等控制语句，通过编写存储过程，可以实现复杂的逻辑功能；
2. 函数的普遍特性：模块化，封装，代码复用；
3. 速度快，只有首次执行需经过编译和优化步骤，后续被调用可以直接执行，省去以上步骤；







# Mysql存储引擎

## MyISAM和InnoDB的区别

1. InnoDB支持事务，MyISAM不支持，对于InnoDB每一条SQL语言都默认封装成事务，自动提交，这样会影响速度，所以最好把多条SQL语言放在begin和commit之间，组成一个事务；  

2. InnoDB支持外键，而MyISAM不支持。对一个包含外键的InnoDB表转为MYISAM会失败；  

3. InnoDB是聚集索引，数据文件是和索引绑在一起的，必须要有主键，通过主键索引效率很高。但是辅助索引需要两次查询，先查询到主键，然后再通过主键查询到数据。因此，主键不应该过大，因为主键太大，其他索引也都会很大。而MyISAM是非聚集索引，数据文件是分离的，索引保存的是数据文件的指针。主键索引和辅助索引是独立的。 

4. InnoDB不保存表的具体行数，执行select count(*) from table时需要全表扫描。而MyISAM用一个变量保存了整个表的行数，执行上述语句时只需要读出该变量即可，速度很快；  

5. Innodb不支持全文索引，而MyISAM支持全文索引，查询效率上MyISAM要高；   



## 如何选择

1. 是否要支持事务，如果要请选择innodb，如果不需要可以考虑MyISAM；

2. 如果表中绝大多数都只是读查询，可以考虑MyISAM，如果既有读写也挺频繁，请使用InnoDB。

3. 系统奔溃后，MyISAM恢复起来更困难，能否接受；

4. MySQL5.5版本开始Innodb已经成为Mysql的默认引擎(之前是MyISAM)，说明其优势是有目共睹的，如果你不知道用什么，那就用InnoDB，至少不会差。



# mysql主从同步

主从同步使得数据可以从一个数据库服务器复制到其他服务器上，在复制数据时，一个服务器充当主服务器（master），其余的服务器充当从服务器（slave）。因为复制是异步进行的，所以从服务器不需要一直连接着主服务器，从服务器甚至可以通过拨号断断续续地连接主服务器。通过配置文件，可以指定复制所有的数据库，某个数据库，甚至是某个数据库上的某个表。


## MySQL主从复制的两种方式
1. 通过binary log配置主从
2. 通过GTID配置主从

## 使用主从同步的好处

1. 通过增加从服务器来提高数据库的性能，在主服务器上执行写入和更新，在从服务器上向外提供读功能，可以动态地调整从服务器的数量，从而调整整个数据库的性能。
2. 提高数据安全-因为数据已复制到从服务器，从服务器可以终止复制进程，所以，可以在从服务器上备份而不破坏主服务器相应数据
3. 在主服务器上生成实时数据，而在从服务器上分析这些数据，从而提高主服务器的性能

## 主从复制原理
>1. 主库需要一个线程叫做I/O线程
>2. 从库需要两个线程完成，一个叫做I/O线程，一个叫做sql线程

![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/MySQL-5.jpg)

1. 主库必须要开启binlog日志才能完成主从同步，当用户请求到主的库里面，会将增删改的东西记录到binlog日志里面.
2. 主从复制是从库去找主库的，建立时，我们在从库上使用change master指定master的ip，端口，二进制文件名称，pos，master的密码等信息。并在从库上开启start  slave就会开启同步.
3. 开启同步后，先是从向主发起请求。然后主库进行验证从库是否正常，验证之后，主库就会给从库按照信息发送日志.
4. 从库上存放日志的地方叫做中继日志（relay log），其实从库里面还有一个master info信息，这个里面记录的是change master的信息，每一次取日志回来都会对从库的master  info信息进行更新，接下来从库根据master  info的binlog信息去主库在取跟新的binlog信息，

从库的io线程会实时依据master.info信息的去主库的binlog日志里面读取更新的内容，将更新的内容取回到自己的中继日志中，同时会更新master.info信息，此时sql线程实时会从中继日志中读取并执行里面的sql语句。


##  主从复制延迟及解决
原因：主库并发量大，而从库复制是单线程，从库过多，主从系统配置不当，cpu，内存等，慢sql过大多，大的事物，网络延迟，跨公网的主从复制很容易导致主从复制延迟

解决方法
1. 适当数量的从库，3-5个，从库配置更好的硬件，网络配置等
2. 将大事物拆分成多个小事物进行提交，表加主键，否在会全表扫描
3. mysql 5.7.19 + 版本支持并行复制
4. 如果对实时性要求高的系统，从服务器只当备份使用，数据从缓存返回，降低主服务器压力。

主机与从机之间的物理延迟是无法避免的，既然无法避免就可以考虑尝试通过缓存等方式，降低新修改数据被立即读取的概率。

# MySQL事务原理
ACID是通过redo 和 undo 日志文件实现的，不管是redo还是undo文件都会有一个缓存我们称之为redo_buf和undo_buf。同样，数据库文件也会有缓存称之为data_buf。

## undo 日志文件
undo记录了数据在事务开始之前的值，当事务执行失败或者ROLLBACK时可以通过undo记录的值来恢复数据。例如 AA和BB的初始值分别为3，5。
```
A 事务开始
B 记录AA=3到undo_buf
C 修改AA=1
D 记录BB=5到undo_buf
E 修改BB=7
F 将undo_buf写到undo(磁盘)
G 将data_buf写到datafile(磁盘)
H 事务提交
```
1. 如果事务在F之前崩溃由于数据还没写入磁盘，所以数据不会被破坏。
2. 如果事务在G之前崩溃或者回滚则可以根据undo恢复到初始状态。 

但是单纯使用undo保证原子性和持久性需要在事务提交之前将数据写到磁盘，浪费大量I/O。

## redo/undo日志文件
引入redo日志记录数据修改后的值，可以避免数据在事务提交之前必须写入到磁盘的需求，减少I/O。
```
A 事务开始
B 记录AA=3到undo_buf
C 修改AA=1 记录redo_buf
D 记录BB=5到undo_buf
E 修改BB=7 记录redo_buf
F 将redo_buf写到redo（磁盘）
G 事务提交
```
通过undo保证事务的原子性，redo保证持久性。 

1. F之前崩溃由于所有数据都在内存，恢复后重新冲磁盘载入之前的数据，数据没有被破坏。 
2. FG之间的崩溃可以使用redo来恢复。 
3. G之前的回滚都可以使用undo来完成。


# 为什么用自增列作为主键
1. 如果我们定义了主键(PRIMARY KEY)，那么InnoDB会选择主键作为聚集索引、如果没有显式定义主键，则InnoDB会选择第一个不包含有NULL值的唯一索引作为主键索引、如果也没有这样的唯一索引，则InnoDB会选择内置6字节长的ROWID作为隐含的聚集索引(ROWID随着行记录的写入而主键递增，这个ROWID不像ORACLE的ROWID那样可引用，是隐含的)。

2. 数据记录本身被存于主索引（一颗B+Tree）的叶子节点上。这就要求同一个叶子节点内（大小为一个内存页或磁盘页）的各条数据记录按主键顺序存放，因此每当有一条新的记录插入时，MySQL会根据其主键将其插入适当的节点和位置，如果页面达到装载因子（InnoDB默认为15/16），则开辟一个新的页（节点）

3. 如果表使用自增主键，那么每次插入新的记录，记录就会顺序添加到当前索引节点的后续位置，当一页写满，就会自动开辟一个新的页

4. 如果使用非自增主键（如果身份证号或学号等），由于每次插入主键的值近似于随机，因此每次新纪录都要被插到现有索引页得中间某个位置，此时MySQL不得不为了将新记录插到合适位置而移动数据，甚至目标页面可能已经被回写到磁盘上而从缓存中清掉，此时又要从磁盘上读回来，这增加了很多开销，同时频繁的移动、分页操作造成了大量的碎片，得到了不够紧凑的索引结构，后续不得不通过OPTIMIZE TABLE来重建表并优化填充页面。


# Join的实现原理

MySQL是只支持一种JOIN算法Nested-Loop Join（嵌套循环链接），他没有其他很多数据库所提供的Hash Join（哈希链接），也没有Sort-Merge Join（合并链接）。

当进行多表连接查询时， 驱动表 的定义为：

1. 指定了联接条件时，满足查询条件的记录行数少的表为驱动表

2. 未指定联接条件时，行数少的表为驱动表

Nested-Loop Join实际上就是是通过驱动表的结果集作为循环基础数据，然后一条一条地通过该结果集中的数据作为过滤条件到下一个表中查询数据，然后合并结果。还细分为三种

1. Simple Nested-Loop Join：从驱动表中取出R1匹配S表所有列，然后R2，R3,直到将R表中的所有数据匹配完，然后合并数据
2. Index Nested-Loop Join：驱动表会根据关联字段的索引进行查找，当在索引上找到了符合的值，再回表进行查询，也就是只有当匹配到索引以后才会进行回表，如果非驱动表的关联键是主键的话，这样来说性能就会非常的高。
3. Block Nested-Loop Join：如果Join的列没有索引，这时MySQL会优先使用Block Nested-Loop Join的算法，Block Nested-Loop Join对比Simple Nested-Loop Join多了一个中间处理的过程，也就是join buffer，使用join buffer将驱动表的查询JOIN相关列都给缓冲到了JOIN BUFFER当中，然后批量与非驱动表进行比较，可以将多次比较合并到一次，降低了非驱动表的访问频率。

## 优化

1. 不推荐用join，让mysql自己决定，mysql查询优化器会自动选择数据量最小的那张表作为驱动表。
2. 因为用left join的时候，左边的是驱动表，考虑到查询效率，能用join就不要用left\right join 使用外连接非常影响查询效率，就算要用也要用数据量最小的表作为驱动表来驱动大表，以此保证：“永远用小结果集驱动大结果集”，尽可能减少JOIN中Nested Loop的循环次数。




# MySQL优化
1. 开启查询缓存，优化查询
2. explain你的select查询，这可以帮你分析你的查询语句或是表结构的性能瓶颈。EXPLAIN 的查询结果还会告诉你你的索引主键被如何利用的，你的数据表是如何被搜索和排序的
3. 当只要一行数据时使用limit 1，MySQL数据库引擎会在找到一条数据后停止搜索，而不是继续往后查少下一条符合记录的数据
4. 为搜索字段建索引
5. 使用 ENUM 而不是 VARCHAR，如果你有一个字段，比如“性别”，“国家”，“民族”，“状态”或“部门”，你知道这些字段的取值是有限而且固定的，那么，你应该使用 ENUM 而不是VARCHAR。
6. Prepared Statements
Prepared Statements很像存储过程，是一种运行在后台的SQL语句集合，我们可以从使用 prepared statements 获得很多好处，无论是性能问题还是安全问题。Prepared Statements 可以检查一些你绑定好的变量，这样可以保护你的程序不会受到“SQL注入式”攻击
7. 垂直分表
8. 选择正确的存储引擎



针对 Innodb 存储引擎的三大特性有：两次写，自适应哈希索引，插入缓冲；

1. double write（两次写）作用：可以保证页损坏之后，有副本直接可以进行恢复。
2. adaptive hash index（自适应哈希索引）作用：Innodb 存储引擎会监控对表上索引的查找，如果观察到建立哈希索引可以带来速度上的提升，则建立哈希索引。读写速度上也有所提高。
3. insert buffer （插入缓冲）作用：针对普通索引的插入把随机 IO 变成顺序 IO，并合并插入磁盘

## 一条sql执行过长的时间，你如何优化，从哪些方面？
1. 查看sql是否涉及多表的联表或者子查询，如果有，看是**否能进行业务拆分**，相关字段冗余或者合并成临时表（业务和算法的优化）
2. 涉及链表的查询，是否能进行**分表查询**，单表查询之后的结果进行字段整合
3. 如果以上两种都不能操作，非要链表查询，那么考虑对相对应的查询条件做索引。加快查询速度
4. 针对数量大的表进行**历史表分离**（如交易流水表）
5. 数据库**主从分离**，读写分离，降低读写针对同一表同时的压力，至于主从同步，mysql有自带的binlog实现 主从同步
6. explain分析sql语句，查看执行计划，**分析索引是否用上，分析扫描行数**等等
7. 查看**mysql执行日志**，看看是否有其他方面的问题


# MySQL中binary log和redo log顺序一致性问题
MySQL是多存储引擎的，不管使用那种存储引擎，都会有binary log，而不一定有redo log，简单的说，binlog是MySQL Server层的，redo log是InnoDB层的

二进制日志主要有三个作用：1、数据的即时点恢复 2、主从复制，原理和恢复一样 3、通过信息审计，判断是否存在注入的攻击

InnoDB的重做日志：记录每一页的更新的物理情况，用来保证事务安全的。

二进制文件仅在事务提交前进行提交，即只写磁盘一次，而重做日志条目在事务进行的过程被不断写入到日志文件中，写入重做日志文件的操作不是直接写，
而是写入一个重做日志缓存（redo log buffer）后，然后安装一定的条件顺序地写入日志文件

MySQL为了保证master和slave的数据一致性，就必须保证binlog和InnoDB redo日志的一致性（因为备库通过二进制日志重放主库提交的事务，而主库binlog写入在commit之前，如果写完binlog主库crash，再次启动时会回滚事务。但此时从库已经执行，则会造成主备数据不一致）
MySQL引入二阶段提交（two phase commit or 2pc），MySQL内部会自动将普通事务当做一个XA事务（内部分布式事物）来处理：

– 自动为每个事务分配一个唯一的ID（XID）。

– COMMIT会被自动的分成Prepare和Commit两个阶段。

– Binlog会被当做事务协调者(Transaction Coordinator)，Binlog Event会被当做协调者日志。


Binlog在2PC中充当了事务的协调者（Transaction Coordinator）。由Binlog来通知InnoDB引擎来执行prepare，commit或者rollback的步骤。事务提交的整个过程如下：
在这里插入图片描述

以上的图片中可以看到，事务的提交主要分为两个主要步骤：

准备阶段（Storage Engine（InnoDB） Transaction Prepare Phase）
此时SQL已经成功执行，并生成xid信息及redo和undo的内存日志。然后调用prepare方法完成第一阶段，papare方法实际上什么也没做，将事务状态设为TRX_PREPARED，并将redo log刷磁盘。

提交阶段(Storage Engine（InnoDB）Commit Phase)
2.1 记录协调者日志，即Binlog日志。

如果事务涉及的所有存储引擎的prepare都执行成功，则调用TC_LOG_BINLOG::log_xid方法将SQL语句写到binlog（write()将binary log内存日志数据写入文件系统缓存，fsync()将binary log文件系统缓存日志数据永久写入磁盘）。此时，事务已经铁定要提交了。否则，调用ha_rollback_trans方法回滚事务，而SQL语句实际上也不会写到binlog。

2.2 告诉引擎做commit。

最后，调用引擎的commit完成事务的提交。会清除undo信息，刷redo日志，将事务设为TRX_NOT_STARTED状态。

PS：记录Binlog是在InnoDB引擎Prepare（即Redo Log写入磁盘）之后，这点至关重要。

由上面的二阶段提交流程可以看出，一旦步骤2中的操作完成，就确保了事务的提交，即使在执行步骤3时数据库发送了宕机。此外需要注意的是，每个步骤都需要进行一次fsync操作才能保证上下两层数据的一致性。步骤2的fsync参数由sync_binlog=1控制，步骤3的fsync由参数innodb_flush_log_at_trx_commit=1控制，俗称“双1”，是保证CrashSafe的根本。

# 一个表有3000万记录，假如有一列占8位字节的字段，根据这一列建索引的话索引树的高度是多少？
表的记录数是N，每一个BTREE节点平均有B个索引KEY，那么B+TREE索引树的高度就是logNB(等价于logN/logB)

现在我们假设表3000W条记录（因为2^25=33554432），如果每个节点保存64个索引KEY,那么索引的高度就是（log2^25)/log64≈ 25/6 ≈ 4.17

节点保存的KEY的数量为pagesize/(keysize+pointsize)

假设平均指针大小是8个字节，那么索引树的每个节点可以存储16k/((8+8)*8)≈128。那么：一个拥有3000w数据，且主键是BIGINT类型的表的主键索引树的高度就是(log2^25)/log128 ≈ 25/7 ≈ 3.57

由上面的计算可知：一个千万量级，且存储引擎是MyISAM或者InnoDB的表，其索引树的高度在3~5之间。

# b+树一般多高，能存储多少数据？
**一般3到4层**  能存储到2千万到25亿数据

Innodb 的所有数据文件（后缀为 ibd 的文件），他的大小始终都是 16384（16k）的整数倍。

我们假设主键 ID 为 bigint 类型，长度为 8 字节，而指针大小在 InnoDB 源码中设置为 6 字节，这样一共 14 字节，我们一个页中能存放多少这样的单元，其实就代表有多少指针，即 16384/14=1170

那么可以算出一棵高度为 2 的 B+ 树，能存放 1170*16=18720 （两万）条这样的数据记录。

根据同样的原理我们可以算出一个高度为 3 的 B+ 树可以存放： 1170*1170*16=21902400 （两千万）条这样的记录。

根据同样的原理我们可以算出一个高度为 4 的 B+ 树可以存放： 1170*1170*1170*16=25 625 808 000 （25亿）条这样的记录。








# 为什么要给表加上主键？
1. 一个没加主键的表,它的数据无序的放置在磁盘存储器上，一行一行的排列的很整齐.
2. 一个加了主键的表,并不能被称之为「表」。如果给表上了主键,那么表在磁盘上的存储结构就由整齐排列的结构转变成了树状结构,并且是「平衡树」结构,换句话说,就是整个表就变成了一个索引。没错,再说一遍,**整个表变成了一个索引,也就是所谓的「聚集索引」**。 这就是为什么一个表只能有一个主键,**一个表只能有一个「聚集索引」**,因为主键的作用就是把「表」的数据格式转换成「索引（平衡树）」的格式放置。


# 为何要使用自增int作为主键？
1. **int 相比varchar、char、text使用更少的存储空间**，而且数据类型简单，可以节约CPU的开销，更便于表结构的维护
2. 默认都会在主键上建立主键索引，**使用整形作为主键可以将更多的索引载入内存，提高查询性能**
3. 对于InnoDB存储引擎而言，**每个二级索引都会使用主键作为索引值的后缀，使用自增主键可以减少索引的长度（大小）**，方便更多的索引数据载入内存
4. 可以使索引数据更加紧凑，在数据插入、删除、更新时可以做到索引数据尽可能少的移动、分裂页，减少碎片的产生（可以通过optimize table 来重建表），减少维护开销
5. 在数据插入时，可以保证逻辑相邻的元素物理也相邻，便于范围查找

当然，使用自增int作为主键也不是百利无一害，在高并发的情况下也可能会造成锁的争用问题。

# MySQL中sql注入是什么，如何避免？
sql注入分为平台层注入和代码层注入，前者由不安全的数据库配置或数据库平台的漏洞所致，后者主要由于程序员对输入未进行细致地过滤。

如何避免
1. PreparedStatement
2. 使用正则表达式过滤传入的参数
3. JSP中调用该函数检查是否包函非法字符
4. JSP页面判断代码
5. 字符串过滤

# SQL中where、having、group by、order by执行和书写顺序？
当一个查询语句同时出现了where,group by,having,order by的时候，执行顺序和编写顺序是：
1. 执行where xx对全表数据做筛选，返回第1个结果集。
2. 针对第1个结果集使用group by分组，返回第2个结果集。
3. 针对第2个结果集中的每1组数据执行select xx，有几组就执行几次，返回第3个结果集。
4. 针对第3个结集执行having xx进行筛选，返回第4个结果集。
5. 针对第4个结果集排序。

from --> where --[result 1]--> group by --[result 2]--> select (x N) --[result 3]--> having --[result 4]--> order by --> OUTPUT

# 水平分库后查询如何排序
**跨分片的排序分页**
一般来讲，分页时需要按照指定字段进行排序。
- 当排序字段就是分片字段的时候，我们通过分片规则可以比较容易定位到指定的分片，
- 而当排序字段非分片字段的时候，情况就会变得比较复杂了。为了最终结果的准确性，我们需要在不同的分片节点中将数据进行排序并返回，并将不同分片返回的结果集进行汇总和再次排序，最后再返回给用户。
