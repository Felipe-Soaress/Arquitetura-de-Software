create database Atividade04;
use Atividade04;

create table Country(
	countryId int not null auto_increment,
	countryName varchar(15) not null,
    acronym varchar(3) not null,
    phoneDigits int not null,
    primary key (countryId)
    );
    
create table Customer(
	customerId int not null auto_increment,
    countryId int,
    customerName varchar(45) not null,
    phone varchar(15) not null,
    age int(3) not null,
    creditLimit numeric(6,2) not null,
    primary key(customerId),
    foreign key(countryId) references Country(countryId)
    );
