create database db_tarefa1;

use db_tarefa1;

create table tb_funcionarios
(
id bigint auto_increment,
nome varchar (50) not null,
idade int not null,
setor varchar (50) not null,
cargo varchar (50) not null,
salario decimal (10,2) not null,
primary key (id)
);

select * from tb_funcionarios;

insert into tb_funcionarios (nome, idade, setor, cargo, salario)
values ("Antonio", 40, "Logistica", "Gerente", 12000);
insert into tb_funcionarios (nome, idade, setor, cargo, salario)
values ("Maria", 32, "Logistica", "Analista Comercial", 5000);
insert into tb_funcionarios (nome, idade, setor, cargo, salario)
values ("Ana", 40, "RH", "Tech Recruiter", 8000);
insert into tb_funcionarios (nome, idade, setor, cargo, salario)
values ("Nonato", 45, "Limpeza", "Faxineiro", 3000);
insert into tb_funcionarios (nome, idade, setor, cargo, salario)
values ("Josefina", 29, "Marketing", "Analista Digital", 3500.56);

-- Faça um select que retorne os funcionaries com 
-- o salário maior do que 2000.

select * from tb_funcionarios where salario > 2000;

-- Faça um select que retorne os funcionaries com o 
-- salário menor do que 2000.

select * from tb_funcionarios where salario < 2000;

-- Ao término atualize um dado desta tabela através de uma query de atualização.
update tb_funcionarios set salario = 2000 
where id = 5;