-- criando o banco de dados
create database db_estoque;
use db_estoque;

-- drop database nome (deletar)

-- criando tabelas 
-- not null, não aceita dados nulos
create table tb_marcas
(
id bigint (5) auto_increment,
nome varchar (20) not null,
ativo boolean,
primary key (id)
);

-- consulta de dados
select * from tb_marcas;

-- inserirndo dados
insert into tb_marcas (nome, ativo) values ("Adidas", true);

-- atualizando dados
update tb_marcas set nome = "NIKE" where id = 1;

-- todas as colunas
select * from tb_marcas where id = 2;

-- apresentando apenas os nomes das marcas cadastradas
select nome from tb_marcas;

-- delete
-- delete from tb_marcas where id = 1;

-- populando a tabela (base de dados)
insert into tb_marcas (nome, ativo) values ("GUCCI", 1);
insert into tb_marcas (nome, ativo) values ("APPLE", 1);
insert into tb_marcas (nome, ativo) values ("ROLEX", 1);
insert into tb_marcas (nome, ativo) values ("DELL", 1);
insert into tb_marcas (nome, ativo) values ("POSITIVO", 1);
insert into tb_marcas (nome, ativo) values ("SAMSUNG", 1);
insert into tb_marcas (nome, ativo) values ("LG", 1);
insert into tb_marcas (nome, ativo) values ("MOTOROLA", 1);
insert into tb_marcas (nome, ativo) values ("BRASTEMP", 1);

-- consulta personalizada
select * from tb_marcas where nome like "%ad%";

-- decimal (10 carcteres com 2 numeros após a ,virgula)
create table tb_produtos
(
id bigint auto_increment,
nome varchar (30) not null,
preco decimal (10,2),
marca_id bigint not null,
primary key (id),
foreign key (marca_id) references tb_marcas(id)
);

select * from tb_produtos;
select * from tb_marcas;

-- populando a tabela 
insert into tb_produtos (nome, preco, marca_id)
values ("Tenis", 100, 5);
insert into tb_produtos (nome, preco, marca_id)
values ("Celular", 1000.99, 4);
insert into tb_produtos (nome, preco, marca_id)
values ("Cinto", 900, 11);
insert into tb_produtos (nome, preco, marca_id)
values ("Monitor", 180.70, 8);
insert into tb_produtos (nome, preco, marca_id)
values ("Relogio", 1800, 10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","60.53",11);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","58.18",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","83.50",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","92.81",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","76.95",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","96.56",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","61.16",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","73.08",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","53.45",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","56.92",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","81.02",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","90.09",11);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","55.73",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","09.46",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","60.61",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","71.91",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","54.90",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","13.16",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","80.22",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","84.27",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","87.11",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","35.96",4);

-- chave queimada (quando uma dado de uma tabela é deletado 
-- a chave fica queimada, n podendo ser usada novamente)
