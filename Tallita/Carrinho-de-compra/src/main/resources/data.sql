INSERT INTO cliente (id, cep, complemento, nome) VALUES
(1l, '123456', 'Rua Cliente 1', 'Maria'),
(2l, '123457', 'Rua Cliente 2', 'Joao'),
(3l, '123458', 'Rua Cliente 3', 'Joaquim');


INSERT INTO restaurante (id, cep, complemento, nome) VALUES
(1l, '100001', 'Loja 01', 'Comida Japonesa'),
(2l, '100002', 'Loja 02', 'Sorvetes e Açai'),
(3l, '100003', 'Loja 03', 'Pasteis da Juju');


INSERT INTO produto (id, disponivel, nome, valor_unitario, restaurante_id) VALUES
(1l, 1, 'Carioca Sushi', 2.0, 1l),
(2l, 1, 'Joy Joy Sushi', 3.0, 1l),
(3l, 1, 'Cupuaçu na Tigela', 20.0, 2l),
(4l, 1, 'Acai na Tigela', 25.0, 2l),
(5l, 1, 'Pastel de Palmito', 2.0, 3l),
(6l, 1, 'Pastel de Queijo', 2.0, 3l);


INSERT INTO sacola (id, fechada, forma_pagamento, valor_total, cliente_id) VALUES
(1l, 'false', '1',  0.0, 2l);
