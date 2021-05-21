create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria
(
id bigint auto_increment,
medicacao_popular boolean,
medicacao_prateleira boolean,
medicacao_balcao boolean,
primary key (id)
);

select * from tb_categoria;

create table tb_produto
(
id bigint auto_increment,
valor float not null,
tarja varchar (30),
nome varchar (40) not null, 
quantidade int not null,
produto_id bigint not null,
primary key(id),
foreign key (produto_id) references tb_categoria (id)
);

select * from tb_produto;

insert into tb_categoria (medicacao_popular, medicacao_prateleira, medicacao_balcao)
values (true, false, false);
insert into tb_categoria (medicacao_popular, medicacao_prateleira, medicacao_balcao)
values (false, true, false);
insert into tb_categoria (medicacao_popular, medicacao_prateleira, medicacao_balcao)
values (false, false, true);
insert into tb_categoria (medicacao_popular, medicacao_prateleira, medicacao_balcao)
values (true, true, false);
insert into tb_categoria (medicacao_popular, medicacao_prateleira, medicacao_balcao)
values (true, true, true); 

insert into tb_produto (valor, tarja, nome, quantidade, produto_id)
values (13.00, "azul", "naridrin", 3, 2);
insert into tb_produto (valor, tarja, nome, quantidade, produto_id)
values (50.90, "vermelho", "paroxetina", 5,3);
insert into tb_produto (valor, tarja, nome, quantidade, produto_id)
values (5.50, "azul", "xarope", 1,4);
insert into tb_produto (valor, tarja, nome, quantidade, produto_id)
values (100, "preta", "remedio pressao alta", 15,5);
insert into tb_produto (valor, tarja, nome, quantidade, produto_id)
values (67.86, "vermelho", "remedio diabetes", 3,3);
insert into tb_produto (valor, tarja, nome, quantidade, produto_id)
values (2.50, "azul", "doril", 50,1);
insert into tb_produto (valor, tarja, nome, quantidade, produto_id)
values (3.20, "azul", "naldecon", 11,1);
insert into tb_produto (valor, tarja, nome, quantidade, produto_id)
values (34.90, "vermelho", "spray garganta", 9,2);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_produto where valor > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais
select * from tb_produto where valor between 3 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra B.
select * from tb_produto where nome like "%b%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
select * from tb_produto 
inner join tb_categoria
on tb_produto.produto_id = tb_categoria.id;

-- Faça um select onde traga todos os Produtos de uma 
-- categoria específica (exemplo todos os produtos que são cosméticos).
select * from tb_produto where produto_id = 1;