INSERT INTO motos (marca, modelo, cilindraje, precio) VALUES ('Yamaha', 'XTZ', '149', '15000000');
INSERT INTO motos (marca, modelo, cilindraje, precio) VALUES ('Suzuki', 'DR-Z4S', '400', '19000000');
INSERT INTO motos (marca, modelo, cilindraje, precio) VALUES ('Kawasaky', 'KLX', '150', '14000000');

-- 1. INSERTAR LAS CIUDADES (PADRES)
INSERT INTO ciudades (nombre) VALUES ('Bogotá D.C.');
INSERT INTO ciudades (nombre) VALUES ('Antioquia');
INSERT INTO ciudades (nombre) VALUES ('Valle del Cauca');

-- 2. INSERTAR LOS MUNICIPIOS (HIJOS)
-- Nota: Usamos el ID generado de las ciudades anteriores (1, 2 y 3 respectivamente)

-- Municipios para Bogotá D.C. (id: 1)
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Suba', 1);
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Usaquén', 1);
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Chapinero', 1);

-- Municipios para Antioquia (id: 2)
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Medellín', 2);
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Envigado', 2);
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Rionegro', 2);

-- Municipios para Valle del Cauca (id: 3)
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Cali', 3);
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Palmira', 3);
INSERT INTO municipios (nombre, ciudad_id) VALUES ('Buenaventura', 3);

