create table requestor_video
(id int primary key auto_increment,
requested_id int not null,
video_id int not null,
active boolean not null default 1,
created_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
modified_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE current_timestamp,
foreign key (video_id) references video_content(id));
