INSERT INTO administradores(usuario, contra) VALUES('admin', 'admin123');

-- Coordinador 3
INSERT INTO coordinadores (cedula, nombre, apellido, contra, telefono) VALUES (0003, 'Laura', 'Garcia', '3344', '3158765432');

-- Coordinador 4
INSERT INTO coordinadores (cedula, nombre, apellido, contra, telefono) VALUES (0004, 'Pedro', 'Martinez', '4455', '3206547890');

-- Director 2
INSERT INTO directores (cedula, nombre, apellido, contra, telefono) VALUES (0006, 'Ana', 'Lopez', 'jkl123', '3109876543');

-- Evaluador 2
INSERT INTO evaluadores (cedula, nombre, apellido, contra, telefono) VALUES (0007, 'Luis', 'Ramirez', 'l567', '123456789');

-- Estudiante 2
INSERT INTO estudiantes (cedula, nombre, apellido, contra, telefono, carrera_estudiando) VALUES (0008, 'Camila', 'Gomez', '789012', '987654321', 'Ingeniería Civil');

INSERT INTO proyectos (anteproyecto, descripcion, estado_director, radicado_anteproyecto, estado_evaluador, estado_final, radicado_comite, calificacion, director_id, evaluador_id, estudiante_id) VALUES ('Programación de aplicaciones para dispositivos electrónicos', 'Las aplicaciones para dispositivos electrónicos son utilizadas por muchas personas en el mundo, por eso es un tema de investigación que se relaciona con el contexto actual.', 'Sin Asignar', 'URL', 'Sin Asignar', 'Sin Asignar', 'URL', '0.0', null, null, null);


INSERT INTO proyectos (anteproyecto, descripcion, estado_director, radicado_anteproyecto, estado_evaluador, estado_final, radicado_comite, calificacion, director_id, evaluador_id, estudiante_id) VALUES ('Desarrollo de una plataforma educativa online', 'La educación en línea está en auge y esta plataforma busca ofrecer una experiencia de aprendizaje interactiva y accesible para estudiantes de todas las edades.', 'Sin Asignar', 'URL', 'Sin Asignar', 'Sin Asignar', 'URL', '0.0', null, null, null);


INSERT INTO proyectos (anteproyecto, descripcion, estado_director, radicado_anteproyecto, estado_evaluador, estado_final, radicado_comite, calificacion, director_id, evaluador_id, estudiante_id) VALUES ('Investigación sobre energías renovables', 'El proyecto tiene como objetivo analizar el impacto de las energías renovables en el medio ambiente y su viabilidad como alternativa sostenible.', 'Sin Asignar', 'URL', 'Sin Asignar', 'Sin Asignar', 'URL', '0.0', null, null, null);


INSERT INTO proyectos (anteproyecto, descripcion, estado_director, radicado_anteproyecto, estado_evaluador, estado_final, radicado_comite, calificacion, director_id, evaluador_id, estudiante_id) VALUES ('Desarrollo de un sistema de gestión de inventario para pequeñas empresas', 'El sistema permitirá a las pequeñas empresas llevar un control eficiente de su inventario, optimizando sus procesos y reduciendo costos.', 'Sin Asignar', 'URL', 'Sin Asignar', 'Sin Asignar', 'URL', '0.0', null, null, null);


INSERT INTO proyectos (anteproyecto, descripcion, estado_director, radicado_anteproyecto, estado_evaluador, estado_final, radicado_comite, calificacion, director_id, evaluador_id, estudiante_id) VALUES ('Estudio de mercado para la apertura de un restaurante vegano', 'El estudio analizará la viabilidad y la demanda de un restaurante vegano en la zona, identificando oportunidades y riesgos para el negocio.', 'Sin Asignar', 'URL', 'Sin Asignar', 'Sin Asignar', 'URL', '0.0', null, null, null);
