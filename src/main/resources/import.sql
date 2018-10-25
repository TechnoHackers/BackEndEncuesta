
insert into alumnos(id,nombre,apellido) values (1,'Anderson','Taipe Reyes');
insert into alumnos(id,nombre,apellido) values (2,'Alexis','Arancibia Sanches');

insert into cuestionarios(id_cuest,id_tipo_test,tiempo,esfactor) values (1,1,5,'factor1');
insert into cuestionarios(id_cuest,id_tipo_test,tiempo,esfactor) values (2,1,3,'factor2');
insert into cuestionarios(id_cuest,id_tipo_test,tiempo,esfactor) values (3,1,5,'factor3');
insert into cuestionarios(id_cuest,id_tipo_test,tiempo,esfactor) values (4,1,2,'factor4');
insert into cuestionarios(id_cuest,id_tipo_test,tiempo,esfactor) values (5,1,4,'factor5');
insert into cuestionarios(id_cuest,id_tipo_test,tiempo,esfactor) values (6,2,0,'');

insert into tests (id_test,nom_test) values (1,'PMA');
insert into tests (id_test,nom_test) values (2,'PMB');
insert into tests (id_test,nom_test) values (3,'PMC');
insert into tests (id_test,nom_test) values (4,'PMD');
insert into tests (id_test,nom_test) values (5,'PME');

insert preguntas(id_preg,	a1,	a2,	a3,	a4,	a5,	a6,	id_cues,	nom_pre) values (1,  'alt1', 'alt2', 'alt3', 'alt4', 'alt5', 'alt6', 1,'Pregunta 1');
insert preguntas(id_preg,	a1,	a2,	a3,	a4,	a5,	a6,	id_cues,	nom_pre) values (2, 'alt1', 'alt2', 'alt3', 'alt4', 'alt5', 'alt6',  1,'Pregunta 2');
insert preguntas(id_preg,	a1,	a2,	a3,	a4,	a5,	a6,	id_cues,	nom_pre) values (3,  'alt1', 'alt2', 'alt3', 'alt4', 'alt5', 'alt6', 1,'Pregunta 3');
insert preguntas(id_preg,	a1,	a2,	a3,	a4,	a5,	a6,	id_cues,	nom_pre) values (4, 'alt1', 'alt2', 'alt3', 'alt4', 'alt5', 'alt6', 1,'Pregunta 4');
insert preguntas(id_preg,	a1,	a2,	a3,	a4,	a5,	a6,	id_cues,	nom_pre) values (5, 'alt1', 'alt2', 'alt3', 'alt4', 'alt5', 'alt6', 1,'Pregunta 5');
insert preguntas(id_preg,	a1,	a2,	a3,	a4,	a5,	a6,	id_cues,	nom_pre) values (6, 'alt1', 'alt2', 'alt3', 'alt4', 'alt5', 'alt6', 2,'Pregunta 6');
insert preguntas(id_preg,	a1,	a2,	a3,	a4,	a5,	a6,	id_cues,	nom_pre) values (7, 'alt1', 'alt2', 'alt3', 'alt4', 'alt5', 'alt6', 6,'Pregunta de cuestionario 6');