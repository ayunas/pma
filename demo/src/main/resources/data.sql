-- -- INSERT PROJECTS
insert into project (id, name, stage, description) values (1000, 'Large Production Deploy', 'NOTSTARTED', 'This requires all hands on deck for the final deployment of the software into production');
insert into project (id, name, stage, description) values (1001, 'New Employee Budget',  'COMPLETED', 'Decide on a new employee bonus budget for the year and figureout who will be promoted');
insert into project (id, name, stage, description) values (1002, 'Office Reconstruction', 'INPROGRESS', 'The office building in Monroe has been damaged due to hurricane in the region. This needs to be reconstructed');
insert into project (id, name, stage, description) values (1003, 'Improve Intranet Security', 'INPROGRESS', 'With the recent data hack, the office security needs to be improved and proper security team needs to be hired for implementation');

--
-- -- -- INSERT EMPLOYEES
-- insert into employee (id, first_name, last_name, project_id) values (1, 'John', 'Warton', 1001);
-- insert into employee (id, first_name, last_name, project_id) values (2, 'Mike', 'Lanister', 1002);
-- insert into employee (id, first_name, last_name, project_id) values (3, 'Steve', 'Reeves', 1002);
-- insert into employee (id, first_name, last_name, project_id) values (4, 'Ronald', 'Connor', 1000);
-- insert into employee (id, first_name, last_name, project_id) values (5, 'Jim', 'Salvator', 1000);
-- insert into employee (id, first_name, last_name, project_id) values (6, 'Peter', 'Henley', 1000);
-- insert into employee (id, first_name, last_name, project_id) values (7, 'Richard', 'Carson', 1003);
-- insert into employee (id, first_name, last_name, project_id) values (8, 'Honor', 'Miles', 1003);
-- insert into employee (id, first_name, last_name, project_id) values (9, 'Tony', 'Roggers', 1003);
-- --
--
-- -- -- INSERT PROJECT_EMPLOYEE_RELATION (Removed duplicates from video)
-- -- -- insert into project_employee (employee_id, project_id) (1,1000);
-- -- -- insert into project_employee (employee_id, project_id) (1,1001);
-- -- -- insert into project_employee (employee_id, project_id) (1,1002);
-- -- -- insert into project_employee (employee_id, project_id) (3,1000);
-- -- -- insert into project_employee (employee_id, project_id) (6,1002);
-- -- -- insert into project_employee (employee_id, project_id) (6,1003);
-- -- --
--
-- INSERT INTO stakeholder(id, first_name, last_name, role)
-- VALUES  (101,'jimmy','piper','critiquer'),
--         (102,'AC','slater','bodyguard'),
--         (103,'Zach','Morris','preppy');
--
--
-- INSERT INTO project_stakeholder(project_id, stakeholder_id)
-- VALUES  (1000,101),
--         (1000,102),
--         (1000,103);