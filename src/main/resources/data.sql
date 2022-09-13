create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qtd_habitantes bigint
);

insert into tb_cidade (id_cidade, nome, qtd_habitantes) values
(1, 'São paulo', 10000000),
(2, 'Salvador', 5000),
(3, 'Petrolina', 1000),
(4, 'Recife', 30000),
(5, 'Fortaleza', 2000000)
;