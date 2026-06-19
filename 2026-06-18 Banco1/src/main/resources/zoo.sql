CREATE TABLE Animal (
                        id INTEGER PRIMARY KEY,
                        nome VARCHAR(50) NOT NULL,
                        especie VARCHAR(50) NOT NULL,
                        sexo CHAR(1) NOT NULL,
                        idade INTEGER NOT NULL,
                        peso DECIMAL(6,2) NOT NULL,
                        pais_origem VARCHAR(50),
                        data_chegada DATE NOT NULL,
                        carnivoro BOOLEAN NOT NULL
);

INSERT INTO Animal
(id, nome, especie, sexo, idade, peso, pais_origem, data_chegada, carnivoro)
VALUES
    (1, 'Simba', 'Leão', 'M', 8, 190.5, 'Quênia', '2020-03-15', TRUE),
    (2, 'Mel', 'Girafa', 'F', 12, 820.0, 'África do Sul', '2018-07-10', FALSE),
    (3, 'Balu', 'Urso-pardo', 'M', 6, 340.8, 'Canadá', '2022-01-20', TRUE),
    (4, 'Luna', 'Lobo-cinzento', 'F', 5, 42.3, 'Estados Unidos', '2021-09-12', TRUE),
    (5, 'Tico', 'Macaco-prego', 'M', 4, 3.8, 'Brasil', '2023-02-28', FALSE),
    (6, 'Nina', 'Elefante-africano', 'F', 18, 4200.0, 'Botsuana', '2015-06-05', FALSE),
    (7, 'Rex', 'Tigre', 'M', 9, 230.7, 'Índia', '2019-11-17', TRUE),
    (8, 'Jade', 'Zebra', 'F', 7, 310.2, 'Namíbia', '2020-08-22', FALSE),
    (9, 'Thor', 'Hipopótamo', 'M', 14, 1500.0, 'Uganda', '2017-04-30', FALSE),
    (10, 'Kiara', 'Leoa', 'F', 7, 145.6, 'Tanzânia', '2021-01-15', TRUE),
    (11, 'Pingo', 'Pinguim-de-magalhães', 'M', 3, 5.4, 'Argentina', '2024-03-11', FALSE),
    (12, 'Lili', 'Flamingo', 'F', 6, 2.8, 'Chile', '2022-05-19', FALSE),
    (13, 'Bob', 'Suricato', 'M', 5, 1.1, 'Namíbia', '2021-12-03', FALSE),
    (14, 'Maya', 'Onça-pintada', 'F', 8, 92.4, 'Brasil', '2019-07-25', TRUE),
    (15, 'Kong', 'Gorila', 'M', 16, 180.0, 'República do Congo', '2016-10-14', FALSE),
    (16, 'Dora', 'Anta', 'F', 10, 240.5, 'Brasil', '2018-09-07', FALSE),
    (17, 'Zeus', 'Águia-real', 'M', 11, 6.7, 'México', '2017-06-21', TRUE),
    (18, 'Pérola', 'Arara-azul', 'F', 9, 1.3, 'Brasil', '2020-12-09', FALSE),
    (19, 'Max', 'Crocodilo-do-nilo', 'M', 20, 520.8, 'Egito', '2014-08-18', TRUE),
    (20, 'Bella', 'Coala', 'F', 4, 8.9, 'Austrália', '2023-06-27', FALSE);