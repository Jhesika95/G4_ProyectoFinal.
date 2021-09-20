CREATE TABLE IF NOT EXISTS usuario (
correo_U varchar(50) NOT NULL,
contraseñaU varchar(50) NOT NULL DEFAULT '',
direccion varchar(50) NOT NULL DEFAULT '',
barrio varchar(50) NOT NULL DEFAULT '',
telefono int(11) NOT NULL DEFAULT '0',
PRIMARY KEY (correo_U)
);
CREATE TABLE IF NOT EXISTS productos (
nombre_P varchar(50)NOT NULL,
codigo int(11) NOT NULL DEFAULT '0',
precio int(11) NOT NULL DEFAULT '0',
peso int(11) NOT NULL DEFAULT '0',
cantidad int(11) NOT NULL DEFAULT '0',
PRIMARY KEY (nombre_P)
KEY FK_productos_vendedor (nombre_P),
CONSTRAINT FK_productos_vendedor FOREIGN KEY (nombre_P) REFERENCES vendedor (correo_adm)
);
CREATE TABLE IF NOT EXISTS vendedor (
correo_adm varchar(50) NOT NULL,
calificacion int(11) NOT NULL DEFAULT '0',
contraseñaA varchar(50) NOT NULL DEFAULT '',
PRIMARY KEY (correo_adm),
KEY FK_vendedor_usuario (correo_adm),
CONSTRAINT FK_vendedor_usuario FOREIGN KEY (correo_adm) REFERENCES usuario (correo_U)
);