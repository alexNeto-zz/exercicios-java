create table pessoa (
id_pessoa integer not null primary key autoincrement,
nome varchar(24) not null,
email varchar(255) not null unique,
telefone varchar(11) not null unique
);

create table aluno(
id_aluno integer not null primary key autoincrement,
matricula char(12) unique,
id_pessoa integer unique,
 foreign key (id_pessoa) REFERENCES pessoa (id_pessoa) 
  ON UPDATE SET default
);

create table professor(
id_professor integer not null primary key autoincrement,
registro char(12) unique,
aulahora varchar,
id_pessoa integer unique,
 foreign key (id_pessoa) references pessoa(id_pessoa)
on update set default
);

