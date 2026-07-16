create table schoolrecords
(
 Students varchar(50) not null

)

alter table schoolrecords add column email varchar(100) unique;
alter table  schoolrecords add column  Phone_Number varchar (10);

select*from schoolrecords