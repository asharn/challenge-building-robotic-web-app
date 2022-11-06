-- Created by Ashish Karn
-- Last modification date: 2022-11-04 18:55:03.182
-- tables
-- Table: robot

insert into `robot` (name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Scrap', curdate(), curdate(), 20, 'Red', 0, 1, 0, 1, 0);
insert into `robot` (name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Sparkles', curdate()-1, curdate(), 23, 'Blue', 0, 0, 1, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Radion', curdate()-2, curdate()-1, 18, 'Pink', 0, 0, 1, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Bruno   ', curdate()-5, curdate()-3, 28, 'Yellow', 0, 0, 0, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Bolt Head', curdate()-4, curdate()-1, 25, 'Aqua', 0, 0, 1, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Sputnik', curdate()-1, curdate(), 29, 'Green', 0, 1, 0, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Ash', curdate()-4, curdate()-1, 30, 'Violet', 1, 0, 1, 0, 0);
insert into `robot` (name, build_at, updated_at, mass, color, is_light_sensing, is_sound_sensing, is_temperature_sensing, is_pressure_sensing, is_mobility_degree_of_freedom) values ('Ruin', curdate()-5, curdate()-2, 16, 'Purple', 1, 0, 0, 0, 1);
-- End of file.