create table vehicle_details 
(
vehicle_id int primary key,
vehicle_name varchar(100),
vehicle_number varchar(50),
capacity int
)

INSERT INTO vehicle_details
(vehicle_id, vehicle_name, vehicle_number, capacity)
VALUES
(101, 'Ashok Leyland Truck', 'TN59AB1234', 12000),
(102, 'Tata Ace', 'TN58CD5678', 1500),
(103, 'Mahindra Bolero Pickup', 'TN60EF9012', 2000),
(104, 'Eicher Truck', 'TN61GH3456', 10000);

create table delivery_details
(
delivery_id int primary key,
product_name varchar(100),
shop_name varchar(100),
delivery_area varchar(100),
status VARCHAR(30)
)

INSERT INTO delivery_details
(delivery_id, product_name, shop_name, delivery_area, status)
VALUES
(201, 'Rice Bags', 'Sri Murugan Stores', 'Madurai', 'Delivered'),
(202, 'Cooking Oil', 'Anand Super Market', 'Virudhunagar', 'Pending'),
(203, 'Cement Bags', 'Kumar Hardware', 'Sivakasi', 'In Transit'),
(204, 'Soft Drinks', 'Fresh Mart', 'Aruppukottai', 'Delivered');

create or replace view completeddelievery as
select product_name,shop_name from delivery_details where status = 'Delivered'

select * from completeddelievery
----
begin;
savepoint bal;

update bank_account set balance = balance + 5000 where account_id = 101;


rollback to savepoint bal;

select * from bank_account

create index searcharea1 on delivery_details (delivery_area);
explain analyse
select * from delivery_details where delivery_area = 'Sivakasi';

begin;
savepoint inserted;
insert into delivery_details
(delivery_id, product_name, shop_name, delivery_area, status)
values
(205, 'Sugar', 'Lakshmi Stores', 'Madurai', 'Pending'),
(206, 'Biscuits', 'Anbu Super Market', 'Virudhunagar', 'In Transit'),
(207, 'Wheat Flour', 'Selvam Traders', 'Sivakasi', 'Delivered');

commit;

select * from delivery_details

begin;
delete from  delivery_details where delivery_id = 207;
rollback;

grant select on  delivery_details to Mohan
select * from delivery_details