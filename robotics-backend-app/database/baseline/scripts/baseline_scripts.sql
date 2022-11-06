-- Created by Ashish Karn
-- Creation date: 2022-11-04 18:55:03.182
-- Baseline tables

DROP TABLE IF EXISTS `robot`;

CREATE TABLE `robot` (
   id integer NOT NULL,
   name varchar(50)  NOT NULL,
   build_at date NOT NULL,
   updated_at date NOT NULL,
   mass integer NOT NULL,
   color varchar(50) NOT NULL,
   is_light_sensing tinyint DEFAULT 0,
   is_sound_sensing tinyint DEFAULT 0,
   is_temperature_sensing tinyint DEFAULT 0,
   is_pressure_sensing tinyint DEFAULT 0,
   is_mobility_degree_of_freedom tinyint DEFAULT 0,
   CONSTRAINT robot_pk PRIMARY KEY (id)
) ;

insert into `robot` (id, name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values (1, 'Scrap', curdate(), curdate(), 20, 'Red', 0, 1, 0, 1, 0);
insert into `robot` (id, name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values (2, 'Sparkles', curdate()-1, curdate(), 23, 'Blue', 0, 0, 1, 0, 0);
insert into `robot` (id, name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values (3, 'Radion', curdate()-2, curdate()-1, 18, 'Pink', 0, 0, 1, 0, 0);
insert into `robot` (id, name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values (4, 'Bruno   ', curdate()-5, curdate()-3, 28, 'Yellow', 0, 0, 0, 0, 0);
insert into `robot` (id, name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values (5, 'Bolt Head', curdate()-4, curdate()-1, 25, 'Aqua', 0, 0, 1, 0, 0);
insert into `robot` (id, name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values (6, 'Sputnik', curdate()-1, curdate(), 29, 'Green', 0, 1, 0, 0, 0);
insert into `robot` (id, name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values (7, 'Ash', curdate()-4, curdate()-1, 30, 'Violet', 1, 0, 1, 0, 0);
insert into `robot` (id, name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values (8, 'Ruin', curdate()-5, curdate()-2, 16, 'Purple', 1, 0, 0, 0, 1);

-- End of file.