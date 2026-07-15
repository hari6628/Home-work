drop table studentdetails;

create table studentdetails
(id int primary key,
 name varchar(50)not null,
 age int not null,
 dob date not null)

 select*from studentdetails

 insert into studentdetails (id,name,age,dob)
 values
 (1,'Arun',20,'2005-06-10'),
 (2,'Priya',22,'2003-02-15');
 