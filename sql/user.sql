truncate table sys_group;
truncate table sys_permissions;
truncate table sys_role;
truncate table sys_role_permissions;
truncate table sys_user;
truncate table sys_user_group_role;

# user
insert into sys_user (name, password, email, gender, phone, birthday, icon_url, create_time, update_time)
    value ('test1', '$2a$10$2jJWu0foNSzddPDiYH9NQe8jVH9Ce8UwQvsNH09D63l8xFM2yb5pm', 'cheerfuls@outlook.com', 0,
           17865552699, str_to_date('1995-08-27', '%Y-%m-%d'), null, now(), now());
insert into sys_user (name, password, email, gender, phone, birthday, icon_url, create_time, update_time)
    value ('test2', '$2a$10$c0LUsCopNgLuOR4nZ6paROPlDnNT1iu0Hjn3LHT84DgH6zVD08xfi', 'test2@outlook.com', 0,
           17865552699, str_to_date('1995-08-28', '%Y-%m-%d'), null, now(), now());
insert into sys_user (name, password, email, gender, phone, birthday, icon_url, create_time, update_time)
    value ('test3', '$2a$10$TWRmZ7.YDZ7sAp3lJSHdy.SPHVdsQ7jW3l5MiIOraUfjuaxrLGgJe', 'test3@outlook.com', 0,
           17865552699, str_to_date('1995-08-28', '%Y-%m-%d'), null, now(), now());

# group
insert into sys_group (name, description, create_time, update_time) value
    ('测试组1', '测试组1的描述', now(), now());
insert into sys_group (name, description, create_time, update_time) value
    ('测试组2', '测试组2的描述', now(), now());
insert into sys_group (name, description, create_time, update_time) value
    ('测试组3', '测试组3的描述', now(), now());

# role
insert into sys_role (name, description, create_time, update_time) value
    ('creator', '创建者', now(), now());
insert into sys_role (name, description, create_time, update_time) value
    ('manager', '管理员', now(), now());
insert into sys_role (name, description, create_time, update_time) value
    ('member', '成员', now(), now());

# user_group_role
insert into sys_user_group_role (user_id, group_id, role_id, create_time, update_time) value
    (1, 1, 1, now(), now());
insert into sys_user_group_role (user_id, group_id, role_id, create_time, update_time) value
    (2, 1, 2, now(), now());
insert into sys_user_group_role (user_id, group_id, role_id, create_time, update_time) value
    (3, 1, 3, now(), now());

# permissions
insert into sys_permissions (name, type, url, permission, method, sort, parent_id, create_time, update_time) value
    ('邀请', 1, '/invitation', 'btn:login', 'POST', 1, 0, now(), now());
insert into sys_permissions (name, type, url, permission, method, sort, parent_id, create_time, update_time) value
    ('移除', 1, '/remove', 'btn:remove', 'POST', 1, 0, now(), now());

# role_permissions
insert into sys_role_permissions (role_id, permissions_id, create_time, update_time) value
    (1, 1, now(), now());
insert into sys_role_permissions (role_id, permissions_id, create_time, update_time) value
    (1, 2, now(), now());
