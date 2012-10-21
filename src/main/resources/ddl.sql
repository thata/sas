create SEQUENCE users_id_seq; 
create table users (
  id INT DEFAULT nextval('users_id_seq') PRIMARY KEY,
  name VARCHAR(255), age INT
);
