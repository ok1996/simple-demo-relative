CREATE TABLE IF NOT EXISTS  demo_article
(
    id          bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
    title       varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '标题',
    content     varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '内容',
    create_time timestamp NULL DEFAULT NULL COMMENT '创建时间',
    modify_time timestamp NULL DEFAULT NULL COMMENT '修改时间',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='测试示例文章';