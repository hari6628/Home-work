create table employee
(
    emp_id int primary key,
    emp_name varchar(50) ,
    salary numeric(10,2)
);

create or replace function before_insert_employee()
returns trigger
language plpgsql
as
$$
begin

    if new.salary < 10000 then
        new.salary := 10000;
    end if;

    return new;

end;
$$;