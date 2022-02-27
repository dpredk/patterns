SELECT u.id, u.name, d.name AS d_name
FROM users u
JOIN departments d ON u.d_id = d.id

SELECT u.id, u.name, d.name AS d_name
FROM users u
LEFT JOIN departments d ON u.d_id = d.id

table_1.id
1
2
3

table_2.id
3
4

select *
from table_1
         cross join table_2;

