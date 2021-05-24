create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria
(
	id bigint auto_increment,
    curso varchar(50) not null,
    duracao varchar(50) not null,
    ativo boolean not null,
    primary key(id)
);


create table tb_curso
(
	id bigint auto_increment,
    nome varchar(30) not null,
    valor int not null,
    certificado boolean not null,
    categoria_id bigint,
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert tb_categoria(curso, duracao, ativo) values ("Java", "1 mes" ,true);
insert tb_categoria(curso, duracao, ativo) values ("SQL", "2 meses" ,true);
insert tb_categoria(curso, duracao, ativo) values ("PL/SQL", "2 meses" ,true);
insert tb_categoria(curso, duracao, ativo) values ("Phyton", "1 mes" ,true);
insert tb_categoria(curso, duracao, ativo) values ("Ruby", "2 meses" ,true);

insert tb_curso (nome, valor, certificado, categoria_id) values ("laços de repetição", 250.00, false, 1);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Introdução ao SQL", 300.00, false, 2);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Aprendendo a manipular em SQl", 300.00, false, 2);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Introdução Phyton", 200.00, true, 4);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Intermediario Phyton", 89.90, true, 4);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Introdução JAVA", 60.00, false, 1);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Java Avançado", 50.00, false, 1);
insert tb_curso (nome, valor, certificado, categoria_id) values ("RUBY", 150.00, false, 5);
insert tb_curso (nome, valor, certificado, categoria_id) values ("RUBY avançado", 150.00, true, 5);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_curso where valor > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais
select * from tb_curso where valor between 3 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra J.
select * from tb_curso where nome like "%j%";

select * from tb_curso 
inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;

select * from tb_curso where nome like "%java%";