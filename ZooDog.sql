CREATE TABLE IF NOT EXISTS RAZA (
  ID_Raza serial,
  imagen varchar(500) DEFAULT NULL,
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

INSERT INTO "public"."raza" ("imagen", "nombre", "energia", "descripcion") VALUES (E'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfw2LdY0aJR7ZaNDu9t99YSjcBuit-cigquPRQnTb-zt1Rx0FJ', E'Labrador retriever', E'5', E'El labrador retriever es una raza canina originaria de Terranova');
INSERT INTO "public"."raza" ("imagen", "nombre", "energia", "descripcion") VALUES (E'http://www.traichobentre.com/upload/product/chorottweilerthuanchungdepnhat11-9094.jpg', E'Rottweiler', E'5', E'El rottweiler es una raza canina de tipo molosoide originaria de Alemania. ');
INSERT INTO "public"."raza" ("imagen", "nombre", "energia", "descripcion") VALUES (E'https://http2.mlstatic.com/cachorros-golden-retriever-maxima-pureza-kit-de-bienvenida-D_NQ_NP_702622-MLA25627077107_052017-F.jpg', E'Golden retriever', E'5', E'El perro, ​​​ llamado perro doméstico o can, ​ y coloquialmente chucho​ o tuso');
INSERT INTO "public"."raza" ("imagen", "nombre", "energia", "descripcion") VALUES (E'https://steemit-production-imageproxy-upload.s3.amazonaws.com/DQmSLnN2g4ZJP7p7FcgkiV2HTwkv6izbYsd6WeMW2iLJiN9', E'Husky siberiano', E'5', E'El husky siberiano es una raza de perro de trabajo originaria del noreste de Siberia');

INSERT INTO "public"."comentarios" ("nombre", "fecha", "contenido") VALUES (E'Luisa', E'date', E'Los Lobos siberianos son geniales');
INSERT INTO "public"."comentarios" ("nombre", "fecha", "contenido") VALUES (E'Camilo', E'date', E'Los Lobos siberianos son geniales');