CREATE TABLE bank_account (
    account_id INT PRIMARY KEY,
    account_holder VARCHAR(50),
    balance DECIMAL(10,2)
);

INSERT INTO bank_account (account_id, account_holder, balance)
VALUES
(101, 'Arun', 25000.00),
(102, 'Priya', 18000.00),
(103, 'Karthik', 42000.00),
(104, 'Meena', 31500.00);

begin;
savepoint bal;

update bank_account set balance = balance + 5000 where account_id = 101;


rollback to savepoint bal;

select * from bank_account


CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    department VARCHAR(30),
    marks INT
);	

INSERT INTO students (student_id, student_name, department, marks)
VALUES
(101, 'Ajay', 'CSE', 85),
(102, 'Rahul', 'ECE', 92),
(103, 'Karthik', 'BCom', 78),
(104, 'Mohan', 'MBA', 88);
select * from students

create or replace view studentinfo as
select student_id,student_name,marks from students
select * from studentinfo
update studentinfo set student_name = 'Ramesh' where student_id = 103
drop view if exists studentinfo

