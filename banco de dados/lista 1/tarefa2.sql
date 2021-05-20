create database db_tarefa2;
use db_tarefa2;

create table tb_produtos 
(
id bigint auto_increment,
nome varchar (50) not null,
marca varchar (30) not null, 
preco decimal (10,2) not null,
cor varchar (30) not null, 
publico varchar (50) not null, 
primary key (id)
);

select * from tb_produtos;

insert into tb_produtos (nome, marca, preco, cor, publico)
values ("Camiseta", "POOL", 40.99, "Azul", "infantil");
insert into tb_produtos (nome, marca, preco, cor, publico)
values ("Calça", "Sal e Pimenta", 89.99, "Preto", "Feminino");
insert into tb_produtos (nome, marca, preco, cor, publico)
values ("Tenis", "VANS", 400, "Preto", "Masculino");
insert into tb_produtos (nome, marca, preco, cor, publico)
values ("Tenis", "VANS", 340, "Preto", "Infantil");
insert into tb_produtos (nome, marca, preco, cor, publico)
values ("Meia", "Polo", 13, "Branca", "Unissex");
insert into tb_produtos (nome, marca, preco, cor, publico)
values ("Biquini", "Liquida", 100.87, "Arco iris", "Feminino");
insert into tb_produtos (nome, marca, preco, cor, publico)
values ("Meia", "Polo", 13, "Branca", "Unissex");
insert into tb_produtos (nome, marca, preco, cor, publico)
values ("Casaco", "ADIDAS", 138.90, "Azul e Marrom", "Unissex");

select * from tb_produtos where preco > 500;
select * from tb_produtos where preco < 500;


update tb_produtos set preco = 20 where id = 6;