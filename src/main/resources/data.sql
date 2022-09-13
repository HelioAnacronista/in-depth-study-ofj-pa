create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qtd_habitantes bigint
);

insert into tb_cidade (id_cidade, nome, qtd_habitantes) values
(1, 'São paulo', 1000000),
(2, 'ão', 1000000),
(3, 'Sãolo', 1000000),
(4, 'São', 1000000),
(5, 'Saulo', 1000000)
;