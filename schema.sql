CREATE TABLE IF NOT EXISTS student_kudu(
  s_id string comment '学号' primary key,
  s_name string comment '学号',
  s_age int comment '年龄',
  s_sex int comment '性别 男1 女2 0未知'
)PARTITION BY HASH PARTITIONS 16 STORED AS KUDU
  TBLPROPERTIES (
  'kudu.num_tablet_replicas' = '1'
);
