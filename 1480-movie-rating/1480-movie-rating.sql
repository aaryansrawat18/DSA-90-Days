# Write your MySQL query statement below
# Write your MySQL query statement below
with n1 as (
    select name,count(*) from movierating mr
    join users u
    on u.user_id = mr.user_id
    group by mr.user_id
    order by 2 desc, 1
    limit 1
), 
n2 as (
    select title, avg(mr.rating) from movierating mr
    join movies m
    on m.movie_id = mr.movie_id
    where month(created_at) = '02' and year(created_at) = '2020'
    group by mr.movie_id
    order by 2 desc, 1
    limit 1)
select name as results from n1
union all
select title as results from n2