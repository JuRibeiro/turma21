create database db_cidade_das_carnes;
use db_cidade_das_carnes;

-- criar primeiro a tabela que não possui chave estrangeira
create table tb_categoria 
(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

select * from tb_categoria;

insert into tb_categoria (descricao, ativo) values ("bovino", true);
insert into tb_categoria (descricao, ativo) values ("suino", true);
insert into tb_categoria (descricao, ativo) values ("ave", true);
insert into tb_categoria (descricao, ativo) values ("imbutidos", true);
insert into tb_categoria (descricao, ativo) values ("outros", true);
insert into tb_categoria (descricao, ativo) values ("outros1", true);

create table tb_produtos
(
id bigint auto_increment,
nome varchar (255) not null,
preco float not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

select * from tb_produtos;

insert into tb_produtos (nome, preco, categoria_id) values ("asa", 40, 3);
insert into tb_produtos (nome, preco, categoria_id) values ("linguiça", 15, 2);
insert into tb_produtos (nome, preco, categoria_id) values ("salsicha", 5, 4);
insert into tb_produtos (nome, preco, categoria_id) values ("coxão duro", 55, 1);
insert into tb_produtos (nome, preco, categoria_id) values ("chuleta", 60, 5);
insert into tb_produtos (nome, preco, categoria_id) values ("picanha", 100, 1);
insert into tb_produtos (nome, preco) values ("acendedor de churrasqueira", 5);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais
select * from tb_produtos where preco > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
select * from tb_produtos where preco between 3 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
select * from tb_produtos where nome like "%c%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
select * from tb_produtos 
inner join tb_categoria
on tb_categoria.id = tb_produtos.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são aves ou legumes).
select * from tb_produtos where categoria_id = 3;






