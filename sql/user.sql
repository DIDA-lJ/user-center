create table user
(
    id           bigint auto_increment
        primary key,
    userAccount  varchar(256)                       null comment '用户账户',
    avatarUrl    varchar(1024)                      null comment '用户头像
',
    gender       tinyint                            null comment '性别
',
    userPassword varchar(512)                       null comment '密码
',
    phone        varchar(128)                       null comment '电话
',
    email        varchar(512)                       null comment '邮箱',
    userStatus   int      default 0                 null comment '0-表示状态正常，没有封号，1表示状态异常',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint  default 0                 null comment '逻辑删除，表示是否删除',
    username     varchar(256)                       null comment '用户名',
    userRole     int      default 0                 null comment '0 默认用户 1 管理员 ',
    planetCode   varchar(512)                       null
)
    comment '用户表';


# 添加一个管理员账号
INSERT INTO user (id,userAccount,avatarUrl,gender,userPassword,phone,email,userStatus,username,userRole,planetCode)VALUES(null,'12345678','',1,'12345678','','',1,'测试用户',1,'1005');