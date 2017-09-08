create table if not exists usuario(
	id_usuario integer not null primary key autoincrement,
	primeiro_nome varchar(45) not null,
	ultimo_nome varchar(45) not null,
	senha varchar(45) not null,
	nome_usuario varchar(45) not null unique,
	email varchar(255) not null unique
);

create table if not exists mes(
	id_mes integer not null primary key autoincrement,
	mes varchar(15) not null
);

create table if not exists ano(
	id_ano integer not null primary key autoincrement,
	ano integer not null unique
);

create table if not exists data(
	id_data integer not null primary key autoincrement,
	dia integer not null,
	id_mes integer not null,
	id_ano integer not null
	foreign key (id_mes) references mes(id_mes) on update set default,
	foreign key (id_ano) references mes(id_mes) on update set default
);

create table if not exists vendas(
	id_vendas integer not null primary key autoincrement,
	id_data integer not null,
	montante decimal(15, 2) not null,
	descricao text,
	foreign key (id_data) references data(id_data) on update set default
);

create table if not exists despesas(
	id_despesas integer not null primary key autoincrement,
	id_data integer not null,
	montante decimal(15, 2) not null,
	descricao text,
	foreign key (id_data) references data(i_data) on updata set default
);

create table if not exists pagamentos(
	id_pagamentos integer not null primary key autoincrement,
	id_data integer not null,
	montante decimal(15,2) not null,
	descricao text,
	foreign key (id_data) references data(i_data) on updata set default
);

create table if not exists despesas(
	id_despesas integer not null primary key autoincrement,
	id_data integer not null,
	montante decimal(15, 2) not null,
	descricao text,
	foreign key (id_data) references data(i_data) on updata set default
);
