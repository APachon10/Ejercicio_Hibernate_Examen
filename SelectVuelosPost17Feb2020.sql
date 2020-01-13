DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `SelectVuelospost17feb`()
    NO SQL
BEGIN
	Select * from vuelo where fecha_vuelo > '2020-02-17';
END$$
DELIMITER ;