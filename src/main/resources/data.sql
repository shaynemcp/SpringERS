insert into ers_user_role (user_role)
values
('manager'),
('employee');

insert into users (firstname, lastname, password, username, role_id)
values
('shaynemcp', 'password','shayne', 'mcpherson', 1),
('jadegre', 'password', 'jade', 'green', 2),
('jordangre', 'password', 'jordan', 'green', 2);

insert into reimb_status (status)
values
('pending'),
('approved'),
('denied');

insert into reimb_type (type)
values
('lodging'),
('travel'),
('food'),
('other');

insert into reimbursements (amount, description, submitted, resolved, receipt, author_id, resolver_id, status_reimb_status_id, type_reimb_type_id)
values
(100, 'Stay at the Royal Hotel for conference', current_timestamp, null, 'https://templatelab.com/wp-content/uploads/2019/06/hotel-receipt-24.jpg', 2, null, 1, 1 ),
(100, 'Stay at the Royal Hotel for conference', current_timestamp, null, 'https://templatelab.com/wp-content/uploads/2019/06/hotel-receipt-24.jpg', 2, null, 1, 1 ),
(100, 'Stay at the Royal Hotel for conference', current_timestamp, null, 'https://templatelab.com/wp-content/uploads/2019/06/hotel-receipt-24.jpg', 2, null, 1, 1 ),
(100, 'Stay at the Royal Hotel for conference', current_timestamp, null, 'https://templatelab.com/wp-content/uploads/2019/06/hotel-receipt-24.jpg', 2, null, 1, 1 );