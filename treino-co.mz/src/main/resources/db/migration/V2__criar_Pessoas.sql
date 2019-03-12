create table pessoa(
codigo bigint(20) primary key auto_increment,
nome varchar(50) not null,
activo boolean not null,

lagradouro varchar(50),
numero varchar(50),
complemento varchar(50) ,
bairro varchar(50),
cidade varchar(50),
estado varchar(50) 
)
ENGINE = InnoDB DEFAULT CHARSET=utf8;

insert into pessoa (nome,activo,lagradouro,numero,complemento,bairro,cidade,estado) value ('Nelio Simiao',true,'logradouro','numero','complemeto','bairro','cidade','estado');
insert into pessoa (nome,activo,lagradouro,numero,complemento,bairro,cidade,estado) value ('Ofelia Dombo',false,'logradouro','','complemeto','bairro','cidade','estado');
insert into pessoa (nome,activo,lagradouro,numero,complemento,bairro,cidade,estado) value ('Rosa Antonio',true,'logradouro','numero','complemeto','','cidade','estado');
