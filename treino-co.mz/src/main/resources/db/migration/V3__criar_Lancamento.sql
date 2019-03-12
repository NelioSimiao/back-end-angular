create table treino.lancamento(
codigo bigint(20) primary key auto_increment,
descricao varchar(50) not null,
data_vencimento date not null,
data_pagamento date,
valor decimal(10,2)not null,
observacao varchar(100),
tipo varchar(20) not null,
codigo_categoria bigint(20) not null,
codigo_pessoa bigint(20) not null,
foreign key(codigo_categoria)references categoria (codigo),
foreign key(codigo_pessoa)references pessoa (codigo)
)
ENGINE = InnoDB DEFAULT CHARSET=utf8;

insert into treino.lancamento(descricao,data_vencimento,data_pagamento,valor,observacao,tipo,codigo_categoria,codigo_pessoa)
values ('Salariomensal','2018-02-09',null,6500.00,'Distribuicao do lucro','DESPESA',5,1);

insert into treino.lancamento(descricao,data_vencimento,data_pagamento,valor,observacao,tipo,codigo_categoria,codigo_pessoa)
values ('Materil','2018-02-09','2018-10-09',650.00,'Teste','DESPESA',3,5);
