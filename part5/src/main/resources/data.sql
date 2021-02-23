INSERT INTO users(id, name, email, password) VALUES
(1, 'Tung', 'tung@gmail.com', '123456'),
(2, 'Nam', 'nam@gmail.com', '123456');

INSERT INTO courses(id, name, location, opened, user_id) VALUES
(1, 'Java', 'Hoang Quoc Viet', '13/08/2020', 1),
(2, 'Python', 'Pham Van Dong', '18/01/2021', 2),
(3, 'C#', 'Tran Cung', '20/01/2018', null),
(4, 'Ruby', 'Nghia Tan', '23/05/2019', 2),
(5, 'Oracle', 'Hoang Hoa Tham', '01/01/2021', 1),
(6, 'MySql', 'Lac Long Quan', '07/02/2020', 2),
(7, 'SqlServer', 'Tay Ho', '08/03/2021', 2);