


create table products (
    product_id int primary key,
    product_name varchar(100),
    category varchar(50),
    price decimal(10,2),
    stock int
);

insert into products values
(101, 'Laptop', 'Electronics', 55000.00, 10),
(102, 'Mouse', 'Electronics', 800.00, 50),
(103, 'Keyboard', 'Electronics', 1200.00, 30),
(104, 'Headphones', 'Accessories', 2500.00, 20),
(105, 'Smart Watch', 'Wearables', 6500.00, 15);

begin;
savepoint prostock;
update products set stock = stock - 5 where product_id = 101;
commit;

rollback to savepoint prostock;

select * from products

create user Customer

rollback
SELECT rolname
FROM pg_roles
WHERE rolname = 'customer';

grant select on products to customer
select * from products




