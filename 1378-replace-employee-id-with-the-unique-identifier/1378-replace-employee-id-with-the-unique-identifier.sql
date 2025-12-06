# Write your MySQL query statement below

select i.unique_id ,e.name from Employees e
left join EmployeeUNI i 
on e.id=i.id;