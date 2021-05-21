create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria
(
id bigint auto_increment,
sabor varchar (20) not null, 
broto varchar (3),
grande varchar (3),
borda varchar (30),
primary key (id)
);

select * from tb_categoria;

create table tb_pizza
(
id bigint auto_increment,
valor int not null,
doce_salgada varchar(30),
massa varchar (30),
valor_nutricional varchar (30),
pizza_id bigint not null,
primary key (id),
foreign key (pizza_id) references tb_categoria(id)
);

select * from tb_pizza;

insert into tb_categoria (sabor, broto, grande, borda)
values ("Calabresa", "4p", "8p", "chedar");
insert into tb_categoria (sabor, broto, grande, borda)
values ("Frango", "4p", "8p", "catupiry");
insert into tb_categoria (sabor, broto, grande, borda)
values ("Brocolis", "4p", "8p", "sem borda");
insert into tb_categoria (sabor, broto, grande, borda)
values ("Brigadeiro", "4p", "8p", "chocolate");
insert into tb_categoria (sabor, broto, grande, borda)
values ("Choconana", "4p", "8p", "banana");

insert into tb_pizza (valor,doce_salgada, massa, valor_nutricional, pizza_id)
values (40, "doce", "fina", "300cal", 4);
insert into tb_pizza (valor,doce_salgada, massa, valor_nutricional, pizza_id)
values (40, "doce com fruta", "fina", "100cal", 5);
insert into tb_pizza (valor,doce_salgada, massa, valor_nutricional, pizza_id)
values (70, "salgada", "grossa", "1000cal", 1);
insert into tb_pizza (valor,doce_salgada, massa, valor_nutricional, pizza_id)
values (75, "salgada e fitness", "grossa", "200cal", 3);
insert into tb_pizza (valor,doce_salgada, massa, valor_nutricional, pizza_id)
values (70, "salgada com borda", "grossa", "1005cal", 2);
insert into tb_pizza (valor,doce_salgada, massa, valor_nutricional, pizza_id)
values (40, "doce com borda", "fina", "300cal", 4);
insert into tb_pizza (valor,doce_salgada, massa, valor_nutricional, pizza_id)
values (75, "salgada sem borda", "fina", "200cal", 3);
insert into tb_pizza (valor,doce_salgada, massa, valor_nutricional, pizza_id)
values (40, "doce com borda de banana", "fina", "100cal", 5);

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
select * from tb_pizza where valor > 45;

-- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais
select * from tb_pizza where valor between 29 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
select * from tb_categoria where sabor like "%c%";

-- Faça um um select com Inner join entre  tabela categoria e pizza.
select * from tb_categoria 
inner join tb_pizza
on tb_categoria.id = tb_pizza.pizza_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são pizza doce).
select * from tb_pizza where doce_salgada like "%doce%";
