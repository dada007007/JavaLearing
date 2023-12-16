-- 班级人数表
create table if not exists tb_people
(
    id     int unsigned primary key auto_increment comment 'ID',
    name   varchar(10) not null comment '班级',
    gender tinyint unsigned comment '性别, 1: 男, 2: 女',
    pcount int unsigned comment '人数'
) comment '班级人数表';

insert into tb_people (id, name, gender, pcount)
values (null, '三年级一班', 1, 34),
       (null, '三年级一班', 2, 12),
       (null, '三年级二班', 1, 56),
       (null, '三年级二班', 2, 14),
       (null, '三年级三班', 1, 22),
       (null, '三年级三班', 2, 43),
       (null, '三年级四班', 1, 26),
       (null, '三年级四班', 2, 38),
       (null, '四年级一班', 1, 45),
       (null, '四年级一班', 2, 13),
       (null, '四年级二班', 1, 18),
       (null, '四年级二班', 2, 27),
       (null, '四年级三班', 1, 19),
       (null, '四年级三班', 2, 26);

-- 编写SQL语句，查询每个班级学生的男生人数、女生人数。
select t.name,
       case gender
           when 1 then (select pcount p from tb_people tb where gender = 1 && name = t.name)
           else (select pcount p from tb_people tb where gender = 2 && name = t.name) end
from tb_people t;

select name,
       sum(case
               when gender = 1 then (select pcount p from tb_people tb where gender = 1 && name = t.name)
               else 0 end) as '男生',
       sum(case
               when gender = 2 then (select pcount p from tb_people tb where gender = 2 && name = t.name)
               else 0 end) as '女生'
from tb_people t
group by name;


-- 优化后的结果
select
    name,
    sum(case when gender = 1 then pcount else 0 end) as '男生',
    sum(case when gender = 2 then pcount else 0 end) as '女生'
from
    tb_people
group by
    name;

select name, case when gender = 1 then pcount else 0 end from
    tb_people;

select
    name,
    AVG(case when gender = 1 then pcount end) as '男生',
    AVG(case when gender = 2 then pcount end) as '女生'
from
    tb_people
group by
    name;

select name,case when gender = 1 then pcount else 0 end from
    tb_people;

select w.name, m.pcount '男生', w.pcount '女生'
from (select name, pcount from tb_people where gender = 1) m,
     (select name, pcount from tb_people where gender = 2) w
where m.name = w.name;

select man.name, man.pcount 男, woman.pcount 女
from tb_people man
         left join (select name, pcount from tb_people where gender = 2) as woman
                   on man.name = woman.name
where man.gender = 1;