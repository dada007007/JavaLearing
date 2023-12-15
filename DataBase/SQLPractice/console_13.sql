use tlias;
start transaction ;
-- 新增员工
-- 1. 插入员工基本信息
insert into emp(id, username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time) values
               (50, 'tom1','汤姆',1,'13509380921',1,5900,'1.jpg','2020-01-01',1,now(),now());
-- 2. 插入员工工作经历信息
insert into emp_expr(emp_id, begin, end, company, job) values(50, '2018-01-01', '2020-05-01', '百度', 'java');

commit ;

rollback ;
-- 创建员工日志表
create table emp_log(
    id int unsigned primary key auto_increment comment 'ID, 主键',
    operate_time datetime comment '操作时间',
    info varchar(2000) comment '日志信息'
) comment '员工日志表';
