create database Exercicio_6;
use Exercicio_6;

create table CLIENTE(
	idCliente int(6) not null primary key auto_increment,
	Email varchar(255),
    Telefone varchar(9),
    idEndereco int(6) not null
)engine=InnoDB;

create table ENDERECO(
	idEndereco int(6) not null primary key auto_increment,
    cep varchar(8),
    complemento varchar(255)
)engine=InnoDB;

create table GASTOS(
	idGastos int(6) not null primary key auto_increment,
    idCliente int(6) not null,
    GParcial decimal(15,2),
    GTotal decimal(15,2),
    GJaneiro decimal(15,2),
    GFevereiro decimal(15,2),
    GMarco decimal(15,2),
	GAbril decimal(15,2),
	GMaio decimal(15,2),
	GJunho decimal(15,2),
	GJulho decimal(15,2),
	GAgosto decimal(15,2),
	GSetembro decimal(15,2),
	GOutubro decimal(15,2),
	GNovembro decimal(15,2),
	GDezembro decimal(15,2),
    idMesAtual int(6) not null
)engine=InnoDB;

create table MES_ATUAL(
	idMesAtual int(6) not null primary key auto_increment,
    Mes varchar(9)
)engine=InnoDB;

/**********Adicionando integridade referencial************/
  
alter table GASTOS
	add constraint fk_idCliente foreign key (idCliente)
	references CLIENTE(idCliente);
    
alter table GASTOS
	add constraint fk_idMesAtual foreign key (idMesAtual)
    references MES_ATUAL(idMesAtual);
    
alter table CLIENTE
	add constraint fk_idEndereco foreign key (idEndereco)
    references ENDERECO(idEndereco);
    
/****************Populando base de dados****************/

insert into MES_ATUAL(Mes) values
	('JANEIRO'),
	('FEVEREIRO'),
    ('MARCO'),
	('ABRIL'),
	('MAIO'),
    ('JUNHO'),
    ('JULHO'),
    ('AGOSTO'),
    ('SETEMBRO'),
    ('OUTUBRO'),
    ('NOVERMBRO'),
    ('DEZEMBRO');