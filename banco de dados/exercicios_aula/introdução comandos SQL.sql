-- criando banco de dados
create database db_quitanda;

-- acessando o banco de dados 
use db_quitanda;

-- criando tabelas // bigint para numeros longos
-- auto increment insere sozinho
-- varchar = String do java (indica a qtd de carateres q podem ser inseridos)
create table tb_produtos(
id bigint auto_increment,
nome varchar (255) not null,
preco float not null,
primary key (id)
);

-- busca de dados
select * from tb_produtos;

-- inserir dados
insert into tb_produtos(nome , preco) values ("morango", 7);

-- atualizando dados 
update tb_produtos set preco = 9 where id = 4;

-- modificando a tabela 
alter table tb_produtos
add descricao varchar (255);

alter table tb_produtos change descricao descricao_prod  varchar (255);

alter table tb_produtos
drop column descricao_prod;

-- dorp database nome/ drop table nome