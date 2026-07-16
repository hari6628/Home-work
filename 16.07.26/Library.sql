create table librarymanagement	
(
BOOK_ID serial Primary Key,
Title varchar(50) not null,
Author varchar(50) not null,
Published_year int  not null
)

select*from librarymanagement 