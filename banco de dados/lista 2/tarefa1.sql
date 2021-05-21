create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe
(
id bigint auto_increment,
habilidade varchar (50) not null, 
comportamento varchar(50),
tipo varchar (50),
primary key (id)
);

select * from tb_classe;

create table tb_personagem 
(
id bigint auto_increment,
poder_defesa int not null,
poder_ataque int not null,
nome varchar(30),
idade int,
classe_id bigint not null, 
primary key (id),
foreign key (classe_id) references tb_classe (id)
);

insert into tb_classe (habilidade, comportamento, tipo) 
values ("Arqueiro", "Criativo", "Aventura");
insert into tb_classe (habilidade, comportamento, tipo) 
values ("Atirador", "Adaptabilidade", "Ação");
insert into tb_classe (habilidade, comportamento, tipo) 
values ("Cura", "Passivo", "Guerra");
insert into tb_classe (habilidade, comportamento, tipo) 
values ("Vidente", "Lider", "Guerra");
insert into tb_classe (habilidade, comportamento, tipo) 
values ("Controlador", "Estrategista", "Suspense");

select * from tb_personagem;

insert into tb_personagem (poder_defesa, poder_ataque, nome, idade, classe_id)
values (1000, 500, "Akura", 29, 3);

insert into tb_personagem (poder_defesa, poder_ataque, nome, idade, classe_id)
values (300, 5100, "Sonem", 45, 4);

insert into tb_personagem (poder_defesa, poder_ataque, nome, idade, classe_id)
values (459, 900, "Demio", 17, 1);

insert into tb_personagem (poder_defesa, poder_ataque, nome, idade, classe_id)
values (90000, 9000, "Sotehan", 50, 2);

insert into tb_personagem (poder_defesa, poder_ataque, nome, idade, classe_id)
values (400, 10, "Abena", 7, 3);

insert into tb_personagem (poder_defesa, poder_ataque, nome, idade, classe_id)
values (40, 5, "Solito", 79, 5);

insert into tb_personagem (poder_defesa, poder_ataque, nome, idade, classe_id)
values (6, 6, "Samira", 1, 4);

insert into tb_personagem (poder_defesa, poder_ataque, nome, idade, classe_id)
values (6000, 700, "Xoxa", 12, 2);

-- Faça um select que retorne os personagens com o poder de ataque maior do que 2000
select * from tb_personagem where poder_ataque > 2000;

-- Faça um select trazendo  os personagens com poder de defesa entre 1000 e 2000
select * from tb_personagem where poder_ataque between 1000 and 2000;

-- Faça um select  utilizando LIKE buscando os personagens com a letra C.
select * from tb_personagem where nome like "%c%";

-- Faça um um select com Inner join entre  tabela classe e personagem.
select * from tb_personagem
inner join tb_classe
on tb_personagem.classe_id = tb_classe.id;

-- Faça um select onde traga todos os personagem de uma classe específica 
-- (exemplo todos os personagens que são arqueiros).
select * from tb_personagem
inner join tb_classe
on tb_personagem.classe_id = tb_classe.id
where tb_classe.habilidade = "Controlador";
