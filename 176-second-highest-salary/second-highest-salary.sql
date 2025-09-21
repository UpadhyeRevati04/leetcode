# Write your MySQL query statement below
Select(
    select DISTINCT salary
    From employee
    ORDER BY salary DESC LIMIT 1 OFFSET 1
)as SecondHighestSalary