SELECT d.name AS 'Department', e1.Name AS 'Employee', e1.salary AS 'Salary' FROM Employee e1 JOIN Department d ON e1.DepartmentId = d.Id
WHERE 3 > (
    SELECT count(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e2.Salary > e1.Salary
    AND e1.DepartmentId = e2.DepartmentId
)