use db_homework2;
-- 部门管理
create table tb_dept(
    id int unsigned primary key auto_increment comment '主键ID',
    name varchar(10) not null unique comment '部门名称',
    create_time datetime not null comment '创建时间',
    update_time datetime not null comment '修改时间'
) comment '部门表';

insert into tb_dept (id, name, create_time, update_time)
        values(1,'学工部',now(),now()),
        (2,'教研部',now(),now()),
        (3,'咨询部',now(),now()),
        (4,'就业部',now(),now()),
        (5,'人事部',now(),now());



-- 员工管理
create table tb_emp (
    id int unsigned primary key auto_increment comment 'ID',
    username varchar(20) not null unique comment '用户名',
    password varchar(32) default '123456' comment '密码',
    name varchar(10) not null comment '姓名',
    gender tinyint unsigned not null comment '性别, 说明: 1 男, 2 女',
    image varchar(300) comment '图像',
    job tinyint unsigned comment '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师',
    entrydate date comment '入职时间',
    dept_id int unsigned comment '部门ID',
    salary int unsigned comment '工资',
    create_time datetime not null comment '创建时间',
    update_time datetime not null comment '修改时间'
) comment '员工表';

INSERT INTO tb_emp
    (id, username, password, name, gender, image, job, entrydate,dept_id,salary, create_time, update_time) VALUES
    (1,'jinyong','123456','金庸',1,'1.jpg',4,'2000-01-01',2,20000,now(),now()),
    (2,'zhangwuji','123456','张无忌',1,'2.jpg',2,'2015-01-01',2,18000,now(),now()),
    (3,'yangxiao','123456','杨逍',1,'3.jpg',2,'2008-05-01',2,16800,now(),now()),
    (4,'weiyixiao','123456','韦一笑',1,'4.jpg',2,'2007-01-01',2,12000,now(),now()),
    (5,'changyuchun','123456','常遇春',1,'5.jpg',2,'2012-12-05',2,9000,now(),now()),
    (6,'xiaozhao','123456','小昭',2,'6.jpg',3,'2013-09-05',1,6000,now(),now()),
    (7,'jixiaofu','123456','纪晓芙',2,'7.jpg',1,'2005-08-01',1,6500,now(),now()),
    (8,'zhouzhiruo','123456','周芷若',2,'8.jpg',1,'2014-11-09',1,7200,now(),now()),
    (9,'dingminjun','123456','丁敏君',2,'9.jpg',1,'2011-03-11',1,5300,now(),now()),
    (10,'zhaomin','123456','赵敏',2,'10.jpg',1,'2013-09-05',1,12000,now(),now()),
    (11,'luzhangke','123456','鹿杖客',1,'11.jpg',5,'2007-02-01',3,8900,now(),now()),
    (12,'hebiweng','123456','鹤笔翁',1,'12.jpg',5,'2008-08-18',3,7800,now(),now()),
    (13,'fangdongbai','123456','方东白',1,'13.jpg',5,'2012-11-01',3,6800,now(),now()),
    (14,'zhangsanfeng','123456','张三丰',1,'14.jpg',2,'2002-08-01',2,15800,now(),now()),
    (15,'yulianzhou','123456','俞莲舟',1,'15.jpg',2,'2011-05-01',2,11500,now(),now()),
    (16,'songyuanqiao','123456','宋远桥',1,'16.jpg',2,'2007-01-01',2,8300,now(),now()),
    (17,'chenyouliang','123456','陈友谅',1,'17.jpg',NULL,'2015-03-21',NULL,4500,now(),now());



-- 薪资等级表
create table tb_salgrade(
    grade int comment '等级',
    losal int comment '该等级最低薪资',
    hisal int comment '该等级最高薪资'
) comment '薪资等级表';

insert into tb_salgrade values (1,0,3000);
insert into tb_salgrade values (2,3001,5000);
insert into tb_salgrade values (3,5001,8000);
insert into tb_salgrade values (4,8001,10000);
insert into tb_salgrade values (5,10001,15000);
insert into tb_salgrade values (6,15001,20000);
insert into tb_salgrade values (7,20001,25000);
insert into tb_salgrade values (8,25001,30000);