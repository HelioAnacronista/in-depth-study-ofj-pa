create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qtd_habitantes bigint
);

insert into tb_cidade (id_cidade, nome, qtd_habitantes) values
(1, 'São paulo', 1000000),
(2, 'São joão', 5999),
(3, 'Sãolo', 66000),
(4, 'São', 30000),
(5, 'lolo', 2000)
;