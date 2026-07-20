create table customer
(
customer_id int  primary key, 
customer_name varchar(50) ,
city varchar(50)
)
select * from customer

insert into customer
(customer_id,
customer_name,
city)
values(1,'Ajay','Madurai'),(2,'Ram','Chennai'),(3,'Hari','Virudhunagar')
create table orders
(
order_id int  primary key,
customer_id int, constraint or_cus foreign key (customer_id) references customer(customer_id),
amount int not null
)

insert into orders
(
order_id, customer_id, amount
)
values(101,1,5500),(102,2,3200),(103,3,5100)

select * from orders
select o.order_id,c.customer_name,c.city,o.amount from orders o inner join customer c on o.customer_id=c.customer_id where o.amount>5000

create  table departments
(
dept_id int primary key,
dept_name varchar(50) 
)

INSERT INTO departments
(
    dept_id,
    dept_name
)
VALUES
(101, 'HR'),
(102, 'IT'),
(103, 'Finance')
create table employees
(
emp_id int primary key ,
emp_name varchar(50),
dept_id int , constraint e_dep foreign key (dept_id)  references departments(dept_id),
salary int not null

)

insert into employees
(
    emp_id,
    emp_name,
    dept_id,
    salary
)
values
(1, 'Ajay', 101, 35000),
(2, 'Ram', 102, 28000),
(3, 'Hari', 101, 40000),
(4, 'Kumar', 103, 50000),
(5, 'Priya', 102, 32000)

select o.order_id,c.customer_name,c.city,o.amount from orders o inner join customer c on o.customer_id=c.customer_id where o.amount>5000
select e.emp_name,d.dept_name,e.salary from employees e inner join departments d on e.dept_id = d.dept_id where e.salary>30000 and d.dept_name = 'HR'

