create table orders
(
order_id int primary key,
customer_id int ,
amount decimal (10,2)
)

insert into orders (order_id, customer_id, amount)
values
(1, 101, 500),
(2, 102, 1200),
(3, 101, 800),
(4, 103, 2000),
(5, 104, 700);

select * from orders

select * from orders where amount > (select avg (amount) from orders)
