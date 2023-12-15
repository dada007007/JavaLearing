use tlias;
create table if not exists clazz (
    id   int unsigned primary key auto_increment comment 'ID,主键',
    name  varchar(30) not null unique  comment '班级名称',
    room  varchar(20) comment '班级教室',
    begin_date date not null comment '开课时间',
    end_date date not null comment '结课时间',
    master_id int unsigned null comment '班主任ID, 关联员工表ID',
    subject tinyint unsigned not null comment '学科, 1:java, 2:前端, 3:大数据, 4:Python, 5:Go, 6: 嵌入式',
    create_time datetime  comment '创建时间',
    update_time datetime  comment '修改时间'
)comment '班级表';

INSERT INTO clazz VALUES (1,'JavaEE就业163期','212','2023-04-30','2023-06-29',10,1,'2023-06-01 17:08:23','2023-06-01 17:39:58');
