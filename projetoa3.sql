reate database if not exists projetoa3;
use projetoa3;

create table if not exists usuario (
  id_usuario int auto_increment primary key,
  nome varchar(225) not null,
  Email varchar(225) not null,
  senha varchar(15) not null,
  d_nascimento date not null
);

create table if not exists formulario ( 
  id_formulario int auto_increment primary key,
  q1 int not null,
  q2 int not null,
  q3 int not null,
  q4 int not null,
  q5 int not null,
  q6 int not null,
  q7 int not null,
  q8 int not null,
  id_usuario int not null,
  foreign key(id_usuario) references usuario(id_usuario)
  ); 


select * from usuario;
