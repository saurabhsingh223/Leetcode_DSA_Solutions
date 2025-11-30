# Write your MySQL query statement below
SELECT name as Customers
FROM Customers c
WHERE Id NOT IN(
    SELECT customerId FROM Orders
)
