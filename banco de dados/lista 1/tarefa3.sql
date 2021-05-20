create database db_tarefa3;
use db_tarefa3;

create table tb_alunes
(
id bigint auto_increment,
nome varchar (50) not null,
idade int not null,
serie varchar (30),
nome_mae varchar (10),
nota decimal (10,2),
primary key (id)
);

select * from tb_alunes;

insert into tb_alunes (nome, idade, serie, nome_mae, nota)
values ("Gabriel", 5, "Primário", "Ana", 9);

insert into tb_alunes (nome, idade, serie, nome_mae, nota)
values ("Eduarda", 10, "Ensino Fundamental", "Antonia", 6);

insert into tb_alunes (nome, idade, serie, nome_mae, nota)
values ("Alice", 15, "Ensino Médio", "Janaina", 10);

insert into tb_alunes (nome, idade, serie, nome_mae, nota)
values ("Gabriela", 3, "Ensino infantil", "Barbara", 9);

insert into tb_alunes (nome, idade, serie, nome_mae, nota)
values ("Giovanna", 17, "Ensino Médio", "Marta", 9.9);

insert into tb_alunes (nome, idade, serie, nome_mae, nota)
values ("Bernardo", 2, "Ensino infantil", "Geisa", 9);

insert into tb_alunes (nome, idade, serie, nome_mae, nota)
values ("Bento", 5, "Ensino infantil", "Talita", 4);

insert into tb_alunes (nome, idade, serie, nome_mae, nota)
values ("Maju", 10, "Ensino Fundamental", "Juliana", 10);

select * from tb_alunes where nota > 7;
select * from tb_alunes where nota < 7;

update tb_alunes set serie = "Ensino Infantil" 
where id = 1;