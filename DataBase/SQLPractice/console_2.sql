use itheima02;
drop table dept;
create table if not exists dept
(
    id          int unsigned primary key auto_increment comment 'id，主键',
    name        varchar(10) not null unique comment '部门名字',
    create_time datetime comment '创建时间',
    update_time datetime comment '最后操作时间'
) comment '部门表';

drop table clazz;
create table if not exists clazz
(
    id          int unsigned primary key auto_increment comment 'id，主键',
    name        varchar(30) unique not null comment '班级名称',
    classroom   varchar(20) comment '班级教室',
    start_time  date               not null comment '开课时间',
    end_time    date               not null comment '结课时间',
    subject     tinyint            not null comment '学科',
    create_time datetime comment '创建时间',
    update_time datetime comment '最后操作时间'
) comment '班级表';