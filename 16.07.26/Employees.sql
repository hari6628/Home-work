create table Employee
(
Department varchar(50) not null,
Temporary_Address varchar(100) not null	
)

select*from Employee
alter table Employee rename column Department to Department_Name
alter table Employee drop column Temporary_Address