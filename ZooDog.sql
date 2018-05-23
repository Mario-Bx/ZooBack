CREATE TABLE IF NOT EXISTS RAZA (
  ID_Raza serial,
  imagen varchar(300) DEFAULT NULL,
  nombre varchar(150) DEFAULT NULL,
  energia int ,
  descripcion varchar(150) DEFAULT NULL,
  PRIMARY KEY (ID_Raza)
) ;

CREATE TABLE IF NOT EXISTS COMENTARIOS (
  ID_Comentario serial,
  nombre varchar(150) DEFAULT NULL,
  fecha varchar(150) DEFAULT NULL,
  contenido varchar DEFAULT NULL,
  PRIMARY KEY (ID_Comentario)
) ;
