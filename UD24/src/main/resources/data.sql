
DROP table IF EXISTS empleados;

create table empleados(
	id int auto_increment,
	nombre varchar(250),
	puesto ENUM ('admin', 'currito', 'jefe'),
	salario integer,
    PRIMARY KEY (`id`)
);

insert into empleados (nombre, puesto)values('Sofia', 'jefe');
insert into empleados (nombre, puesto)values('Raul', 'admin');
insert into empleados (nombre, puesto)values('Adrian', 'currito');
