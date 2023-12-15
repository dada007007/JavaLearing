use tlias;
-- 部门管理
create table dept(
    id int unsigned primary key auto_increment comment '主键ID',
    name varchar(10) not null unique comment '部门名称',
    create_time datetime not null comment '创建时间',
    update_time datetime not null comment '修改时间'
) comment '部门表';

INSERT INTO `dept` VALUES (1,'学工部','2023-09-25 09:47:40','2023-09-25 09:47:40'),
						(2,'教研部','2023-09-25 09:47:40','2023-09-25 09:47:40'),
						(3,'咨询部','2023-09-25 09:47:40','2023-09-25 09:47:40'),
						(4,'就业部','2023-09-25 09:47:40','2023-09-25 09:47:40'),
						(5,'人事部','2023-09-25 09:47:40','2023-09-25 09:47:40'),
						(6,'行政部','2023-09-27 14:00:00','2023-09-27 14:00:00'),
						(7,'综合部','2023-09-25 14:44:19','2023-09-25 14:44:19');
