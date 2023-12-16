create table if not exists score
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