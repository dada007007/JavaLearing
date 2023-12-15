-- 1. 查询员工的姓名 , 及所属的部门名称 (隐式内连接实现)
select e.name, d.name from tb_dept d, tb_emp e where d.id = e.dept_id;

-- 2. 查询员工的姓名 , 及所属的部门名称 (显式内连接实现)
select e.name, d.name from tb_dept d join tb_emp e on d.id = e.dept_id;

-- 3. 查询员工的 姓名、性别、职位、部门名称 （隐式内连接）
select e.name, e.gender, e.job,d.name from tb_dept d, tb_emp e where d.id = e.dept_id;

-- 4. 查询 薪资 高于 10000 的员工的姓名、性别、职位、部门名称（显式内连接）
select e.name, e.gender, e.job,d.name from tb_dept d join tb_emp e on d.id = e.dept_id where e.salary>10000;

-- 5. 查询员工表 所有 员工的姓名, 和对应的部门名称 (左外连接)
select e.name,d.name from tb_emp e left join tb_dept d on e.dept_id = d.id ;

-- 6. 查询员工表 所有 员工的姓名, 和对应的部门名称 (右外连接)
select e.name,d.name from tb_dept d right join tb_emp e on e.dept_id = d.id ;

-- 7. 查询部门表 所有 部门的名称, 和对应的员工名称 (右外连接)
select e.name,d.name from tb_emp e right join tb_dept d on e.dept_id = d.id ;

-- 8. 查询 "教研部" 的所有员工信息 （标量子查询）
select * from tb_emp where dept_id=(select tb_dept.id from tb_dept where tb_dept.name='教研部');

-- 9. 查询在 "方东白" 入职之后的员工信息 （标量子查询）
select * from tb_emp e where e.entrydate>(select tb_emp.entrydate from tb_emp where name='方东白');

-- 10. 查询 "教研部" 和 "咨询部" 的所有员工信息 （列子查询）
select * from tb_emp where tb_emp.dept_id in (select tb_dept.id from tb_dept where tb_dept.name in ('教研部','咨询部'));

-- 11. 查询与 "韦一笑" 的入职日期 及 职位都相同的员工信息 （行子查询）
select * from tb_emp where (entrydate,job)=(select entrydate,job from tb_emp where name='韦一笑');

-- 12. 查询入职日期是 "2006-01-01" 之后的员工信息 , 及其部门信息 （表子查询）
select e.*,d.name from (select * from tb_emp where entrydate>'2006-01-01' ) e,tb_dept d where e.dept_id=d.id;

-- 13. 查询 拥有员工的 部门ID、部门名称 (没有员工的部门无需展示)
select count(*) from tb_emp group by dept_id;
select d.id,d.name from tb_dept d,tb_emp e where e.dept_id=d.id  group by dept_id;

-- 14. 查询所有 在 2010-01-01 之后入职的员工, 及其归属的部门名称; 如果员工没有分配部门, 也需要展示出来
select e.*,d.name from tb_emp e left join tb_dept d on e.dept_id = d.id where e.entrydate>'2010-01-01';

-- 15. 查询 "教研部" 员工的平均工资
select d.name,avg(salary) '平均工资' from tb_emp e,tb_dept d where d.name='教研部';

-- 16. 查询工资比 "俞莲舟" 高的员工信息。
select * from tb_emp e where e.salary>(select salary from tb_emp where name='俞莲舟' );

-- 17. 查询 工资 比该企业员工的平均薪资 还要高的员工信息
select * from tb_emp e where e.salary>(select avg(salary) from tb_emp ) ;

-- 18. 查询所有的部门信息, 并统计部门的员工人数
select d.*,count(e.id) '统计人数' from tb_dept d left join tb_emp e on d.id = e.dept_id group by d.id;

-- 19. 查询所有员工的 姓名, 工资 , 及 工资等级 (有难度的哦)
select e.name,e.salary,s.grade from tb_emp e left join tb_salgrade s on e.salary between losal and hisal;

-- 20. 查询 "教研部" 所有员工的信息 及 工资等级 (有难度的哦)
select e.*,s.grade from tb_emp e left join tb_salgrade s on e.salary between losal and hisal
    left join tb_dept d on e.dept_id = d.id where d.name='教研部';

-- 21. 查询 工资 低于 本部门平均工资的员工信息 (有难度的哦)
select e.* from tb_emp e where e.salary<(select avg(salary) from tb_emp where dept_id= e.dept_id);

-- 22. 列出所有部门的详细信息(包括部门ID, 部门名称)和人数
select d.id,d.name,count(e.id) '人数' from tb_dept d left join tb_emp e on d.id = e.dept_id group by d.id order by d.id;

-- 23、取得每个薪资等级有多少员工  (有难度的哦)
select s.grade,count(*) '人数' from tb_emp e left join tb_salgrade s on e.salary between losal and hisal group by s.grade;

-- 24. 取得每个部门最高薪水的人员名称
-- select e.name,max(salary) from tb_emp e left join tb_dept d on e.dept_id=d.id group by e.dept_id; -- 部门有null值的，不合题意
select e.name, salary from tb_emp e where e.salary=(select max(salary) from tb_emp where dept_id= e.dept_id);

select * from tb_emp where (dept_id,salary) in (select dept_id, max(salary) from tb_emp group by dept_id);