create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria
(
id bigint auto_increment,
comodo varchar (50) not null,
metros float not null,
janela boolean, 
primary key (id)
);

select * from tb_categoria;

create table tb_produtos
(
id bigint auto_increment,
nome varchar(50) not null,
cor varchar (30),
tamanho float not null,
valor float not null,
produto_id bigint not null,
primary key (id),
foreign key (produto_id) references tb_categoria (id)
);

select * from tb_produtos;

insert into tb_categoria (comodo, metros, janela)
values ("quarto", 4.5, true);
insert into tb_categoria (comodo, metros, janela)
values ("sala", 10, true);
insert into tb_categoria (comodo, metros, janela)
values ("sala", 10, true);
insert into tb_categoria (comodo, metros, janela)
values ("cozinha", 15, true);
insert into tb_categoria (comodo, metros, janela)
values ("cozinha", 8, false);

insert into tb_produtos (nome, cor, tamanho, valor, produto_id)
values ("cama", "branco", 2.00, 1900.90, 1);
insert into tb_produtos (nome, cor, tamanho, valor, produto_id)
values ("comoda", "branco", 1.40, 500, 1);
insert into tb_produtos (nome, cor, tamanho, valor, produto_id)
values ("rack", "marrom", 4.00, 3000, 2);
insert into tb_produtos (nome, cor, tamanho, valor, produto_id)
values ("coifa", "inox", 1.00, 200, 4);
insert into tb_produtos (nome, cor, tamanho, valor, produto_id)
values ("conjunto copos", "vidro", 200, 30, 4);
insert into tb_produtos (nome, cor, tamanho, valor, produto_id)
values ("quadro", "madeira", 60, 42.90, 3);
insert into tb_produtos (nome, cor, tamanho, valor, produto_id)
values ("conjunto xicara", "porcelana", 20, 15.00, 5);
insert into tb_produtos (nome, cor, tamanho, valor, produto_id)
values ("guarda roupa", "madeira", 5000, 9.0, 1);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais
select * from tb_produtos where valor > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
select * from tb_produtos where valor between 3 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
select* from tb_produtos where nome like "%c%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
select * from tb_categoria 
inner join tb_produtos 
on tb_produtos.produto_id = tb_categoria.id;

-- Faça um select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são da categoria hidráulica).
select * from tb_produtos where produto_id = 5;