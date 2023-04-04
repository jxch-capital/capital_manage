insert into capital.role (id, role_name, role_desc)
values  (1, 'admin', '管理员');

insert into capital.permission (id, permission_name, permission_url, parent_id)
values  (1, '全部', 'all', null);

insert into capital.role_permission (role_id, permission_id)
values  (1, 1);

insert into capital.user (id, username, password, status)
values  (1, 'admin', '$2a$10$5htW2zeFNwk7l2yjlAqO6ue4n/BnLdrZEeM8Cx/.UEJRGHsQJG7NW', 1);

insert into capital.user_role (user_id, role_id)
values  (1, 1);