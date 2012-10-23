create SEQUENCE users_id_seq; 
create table users (
  id INT DEFAULT nextval('users_id_seq') PRIMARY KEY,
  name VARCHAR(255),
  age INT
);

create SEQUENCE books_id_seq; 
create table books (
  id INT DEFAULT nextval('books_id_seq') PRIMARY KEY,
  name VARCHAR(255)
);
