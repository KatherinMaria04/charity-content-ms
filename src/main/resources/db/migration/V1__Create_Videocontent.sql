
create table video_content
(id int primary key auto_increment,
title varchar(100) not null,
url varchar(100)  unique not null,
active boolean not null default 1,
created_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
modified_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE current_timestamp
);