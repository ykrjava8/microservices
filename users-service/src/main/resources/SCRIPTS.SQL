CREATE USER user12@localhost IDENTIFIED BY 's$cret';
GRANT ALL ON testdb.* TO user12@localhost;
create table testdb.user_details (user_name varchar(255) not null, email_id varchar(255), passowrd varchar(255), primary key (user_name));

