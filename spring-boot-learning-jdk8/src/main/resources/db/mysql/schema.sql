DROP TABLE IF EXISTS bbg_user;
create table bbg_user (
  id int(11) unsigned PRIMARY KEY AUTO_INCREMENT,
  dxy_username varchar(50) NOT NULL DEFAULT '' COMMENT 'SSO 唯一用户名',
  simuid BIGINT NOT NULL DEFAULT '0' COMMENT 'sim 系统中的关联人id',
  unionid varchar(32) NOT NULL DEFAULT '' COMMENT '微信 unionId',
  wx_nickname VARCHAR(50) NOT NULL DEFAULT '' COMMENT '微信昵称',
  mark int(32) unsigned NOT NULL DEFAULT '0'  COMMENT '用户身份',
  source int unsigned NOT NULL DEFAULT '0'  COMMENT '用户来源',
  avatar varchar(150) NOT NULL DEFAULT '' COMMENT '用户头像',
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  modifier_id INT NOT NULL DEFAULT 0 COMMENT '修改人',
  modify_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='基本用户信息';

alter table bbg_user add unique index uniq_simuid(simuid);
alter table bbg_user add index idx_wx_nickname(wx_nickname);