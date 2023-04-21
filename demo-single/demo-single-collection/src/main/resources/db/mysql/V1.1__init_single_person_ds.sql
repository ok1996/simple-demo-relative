CREATE TABLE IF NOT EXISTS demo_single_person
(
    id     bigint NOT NULL,
    name   varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '姓名',
    sex    int                                     DEFAULT NULL COMMENT '性别',
    remark varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='人员列表';