create table capital.permission
(
    id              bigint auto_increment
        primary key,
    permission_name varchar(100) not null,
    permission_url  varchar(100) null,
    parent_id       bigint       null,
    constraint permission_pk2
        unique (permission_name)
);

create index permission_permission_name_index
    on capital.permission (permission_name);

create table capital.role
(
    id        bigint auto_increment
        primary key,
    role_name varchar(100)  not null,
    role_desc varchar(1000) null,
    constraint role_pk2
        unique (role_name)
);

create index role_role_name_index
    on capital.role (role_name);

create table capital.role_permission
(
    role_id       bigint not null,
    permission_id bigint not null,
    primary key (role_id, permission_id)
);

create table capital.user
(
    id       bigint             not null
        primary key,
    username varchar(100)       not null,
    password varchar(100)       not null,
    status   smallint default 1 not null,
    constraint user_pk2
        unique (username)
);

create index user_username_index
    on capital.user (username);

create table capital.user_role
(
    user_id bigint not null,
    role_id bigint not null,
    primary key (user_id, role_id)
);

