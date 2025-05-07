CREATE DATABASE cine_AdrianRodriguez;
USE cine_AdrianRodriguez;

CREATE TABLE generos (
    id_genero CHAR(5) PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE peliculas (
    id_pelicula CHAR(10) PRIMARY KEY, 
    titulo VARCHAR(100) NOT NULL,
    director VARCHAR(100),
    duracion INT, -- en minutos
    fecha_estreno DATE,
    id_genero CHAR(5),
    FOREIGN KEY (id_genero) REFERENCES generos(id_genero)
);

INSERT INTO generos (id_genero, nombre) VALUES
('ACC', 'Acción'),
('COM', 'Comedia'),
('DRA', 'Drama'),
('TER', 'Terror'),
('FAN', 'Fantasía'),
('ANI', 'Animación'),
('ROM', 'Romance'),
('SCI', 'Ciencia Ficción');

INSERT INTO peliculas (id_pelicula, titulo, director, duracion, fecha_estreno, id_genero) VALUES
('P001', 'Mad Max: Fury Road', 'George Miller', 120, '2015-05-15', 'ACC'),
('P002', 'The Hangover', 'Todd Phillips', 100, '2009-06-05', 'COM'),
('P003', 'The Godfather', 'Francis Ford Coppola', 175, '1972-03-24', 'DRA'),
('P004', 'El Conjuro 3', 'Michael Chaves', 112, '2021-06-04', 'TER'),
('P005', 'Harry Potter y la Piedra Filosofal', 'Chris Columbus', 152, '2001-11-16', 'FAN'),
('P006', 'Coco', 'Lee Unkrich', 105, '2017-10-27', 'ANI'),
('P007', 'Titanic', 'James Cameron', 195, '1997-12-19', 'ROM'),
('P008', 'Interestelar', 'Christopher Nolan', 169, '2014-11-07', 'SCI'),
('P009', 'Inception', 'Christopher Nolan', 148, '2010-07-16', 'SCI'),
('P010', 'Up', 'Pete Docter', 96, '2009-05-29', 'ANI');

