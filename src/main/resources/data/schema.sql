CREATE TABLE USER(
	id int not null  AUTO_INCREMENT,
	ip varchar(20),
	browser varchar(100),
	lang varchar(20)	
)

CREATE TABLE CUSTOMER(
	id int not null  AUTO_INCREMENT,
	firstname varchar(50),
	lastname varchar(50),
)