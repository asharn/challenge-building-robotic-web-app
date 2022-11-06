-- Created by Ashish Karn
-- Last modification date: 2022-11-04 18:55:03.182
-- tables
-- Table: robot
DROP TABLE IF EXISTS `robot`;

CREATE TABLE `robot` (
   id integer AUTO_INCREMENT PRIMARY KEY,
   name varchar(50)  NOT NULL,
   build_at date NOT NULL,
   updated_at date NOT NULL,
   mass integer NOT NULL,
   color varchar(50) NOT NULL,
   is_light_sensing tinyint DEFAULT 0,
   is_sound_sensing tinyint DEFAULT 0,
   is_temperature_sensing tinyint DEFAULT 0,
   is_pressure_sensing tinyint DEFAULT 0,
   is_mobility_degree_of_freedom tinyint DEFAULT 0
) ;

-- End of file.