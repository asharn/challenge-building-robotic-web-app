-- Created by Ashish Karn
-- Creation date: 2022-11-04 18:55:03.182
-- Baseline tables

DROP TABLE IF EXISTS `robot`;

CREATE TABLE `robot` (
   id integer AUTO_INCREMENT PRIMARY KEY,
   name varchar(50)  NOT NULL,
   build_at date NOT NULL,
   updated_at date NOT NULL,
   mass integer NOT NULL,
   color varchar(50) NOT NULL,
   state varchar(10)  NOT NULL,
   is_light_sensing tinyint DEFAULT 0,
   is_sound_sensing tinyint DEFAULT 0,
   is_temperature_sensing tinyint DEFAULT 0,
   is_pressure_sensing tinyint DEFAULT 0,
   is_mobility_degree_of_freedom tinyint DEFAULT 0
) ;


insert into `robot` (name, build_at, updated_at, mass, color, state, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Scrap', curdate(), curdate(), 20, 'Red', 'DESIGNED', 0, 1, 0, 1, 0);
insert into `robot` (name, build_at, updated_at, mass, color, state, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Sparkles', curdate()-1, curdate(), 23, 'Blue', 'DEPLOYED', 0, 0, 1, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, state, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Radion', curdate()-2, curdate()-1, 18, 'Pink', 'DESIGNED', 0, 0, 1, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, state, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Bruno   ', curdate()-5, curdate()-3, 28, 'Yellow', 'DESIGNED', 0, 0, 0, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, state, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Bolt Head', curdate()-4, curdate()-1, 25, 'Aqua', 'DEPLOYED', 0, 0, 1, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, state, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Sputnik', curdate()-1, curdate(), 29, 'Green', 'TESTED', 0, 1, 0, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, state, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Ash', curdate()-4, curdate()-1, 30, 'Violet', 'TESTED', 1, 0, 1, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, state, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Ruin', curdate()-5, curdate()-2, 16, 'Purple', 'DESIGNED', 1, 0, 0, 0, 1);

-- End of file.