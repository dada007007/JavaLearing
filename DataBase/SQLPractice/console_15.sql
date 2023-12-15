delete
from emp
where id in (1, 2, 3);

delete
from emp_expr
where emp_id in (1, 2, 3);

select e.*,
       ee.id     ee_id,
       ee.emp_id ee_emp_id,
       ee.begin ee_begin,
       ee.end ee_end,
       ee.company ee_company,
       ee.job ee_job
from emp e
         left join emp_expr ee on e.id = ee.emp_id
where e.id = 20;