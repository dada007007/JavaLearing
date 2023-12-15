-- concat
select concat('Hello', 'MySQL');

-- lower
select lower('Hello');

-- upper
select upper('Hello');

-- lpad
select lpad('01', 5, '-');

-- rpad
select rpad('01', 5, '-');

-- trim
select trim('  Hello    World     ');

-- substring
select substring('Hello World', 1, 5);

-- 1、给员工工号前补0，不足五位的前都补满0
update emp
set workno=lpad(workno, 5, '0');

-- 数值函数
-- ceil
select ceil(1.5);

-- floor
select floor(1.5);

-- mod
select mod(6, 4);

-- rand
select rand();

-- round   四舍五入，保留几位小数
select round(2.34, 2);
select round(2.345, 2);
select round(2.344, 2);

-- 案例：通过数据库的函数，生成一个六位数的随机验证码
select lpad(round(rand(), 6) * 1000000, 6, 0);
select lpad(round(rand() * 1000000, 0), 6, 0);


-- 日期函数
-- curdate()
select curdate();
select current_date;
-- curtime()
select curtime();
select current_time;
-- now()
select now();
select sysdate();

-- YEAR, MONTH, DAY
select year(now()), month(now()), day(now());

select date_sub('2021-12-20', INTERVAL 70 day);


-- datediff
select datediff('2023-10-2 23:20:12', '2023-12-15 12:23:01');
select datediff('2023-12-15 12:23:01', '2023-10-2 23:20:12');
select datediff('2023-12-15', '1998-06-11');

-- 查询所有员工的入职天数，并按照入职天数倒序排序
select name, datediff(curdate(), entry_date) entrydays
from emp
order by entrydays desc;


-- 流程控制函数
-- if
select if(true, 'Ok', 'Error');
select if(false, 'Ok', 'Error');

-- ifnull
select ifnull('OK', 'Default');

select ifnull('', 'Default');

select ifnull(null, 'Default');

-- case when then else end
-- 需求：查询emp表的员工姓名和工作地址(北京/上海--->一线城市， 其他)
select e.name,
       (case e.address
            when '北京' then '一线城市'
            when '上海' then '一线城市'
            else '其他' end) address
from emp e;

-- 案例：统计班级各个学员的成绩，展示规则如下：
-- >=85，展示优秀
-- >=60，展示及格
-- 否则，展示不及格
select id,
       name,
       (case
            when math >= 85 then '优秀'
            when math >= 60 then '及格'
            else '不及格' end) '数学',
       (case
            when chinese >= 85 then '优秀'
            when chinese >= 60 then '及格'
            else '不及格' end) '语文',
       (case
            when english >= 85 then '优秀'
            when english >= 60 then '及格'
            else '不及格' end) '英语'
from score;

create table score
(
    id      int comment 'ID',
    name    varchar(20) comment '姓名',
    math    int comment '数学',
    english int comment '英语',
    chinese int comment '语文'
) comment '学员成绩表';
insert into score(id, name, math, english, chinese)
VALUES (1, 'Tom', 67, 88, 95),
       (2, 'Rose', 23, 66, 90),
       (3, 'Jack', 56, 98, 76);

select DATEDIFF(NOW(), entry_date)
FROM emp;

create table if not exists user
(
    id   int unsigned auto_increment primary key comment 'id，主键',
    name varchar(10) not null unique comment '姓名',
    age  int check ( age < 120 && age > 0 ) comment '年龄',
    status char(1)  default '1' comment '状态',
    gender char(1) comment '性别'
)comment '用户表';
-- 插入数据
insert into user(name, age, status, gender) values('Tom1',19,'1','男'), ('Tom2',25,'0','男');


