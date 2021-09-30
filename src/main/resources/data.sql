insert into tb_curso
(
    id_curso,
    nivel,
    nm_curso,
    ds_curso,
    preco_original,
    preco_promocional,
    porc_desconto,
    url_imagem
)
values
(
    nextval('sq_tb_curso'),
    '0',
    'Orientação a Objetos com Java',
    'Aprenda a programar orientado a objetos com Java',
    '150.00',
    '120.00',
    '20',
    'https://img-c.udemycdn.com/course/240x135/969548_48c9_5.jpg'
);

insert into tb_curso
(
    id_curso,
    nivel,
    nm_curso,
    ds_curso,
    preco_original,
    preco_promocional,
    porc_desconto,
    url_imagem
)
values
(
    nextval('sq_tb_curso'),
    '0',
    'Algoritmos e Lógica de Programação do básico ao avançado',
    'Aprenda de uma vez por todas Algoritmos, Lógica de Programação, Constantes, Variáveis, Operadores e muito mais!',
    '140.00',
    '126.00',
    '10',
    'https://img-c.udemycdn.com/course/240x135/1693748_4c8f.jpg'
);

insert into tb_curso
(
    id_curso,
    nivel,
    nm_curso,
    ds_curso,
    preco_original,
    preco_promocional,
    porc_desconto,
    url_imagem
)
values
(
    nextval('sq_tb_curso'),
    '1',
    'Criando poderosas API''s RESTful com Django Rest Framework',
    'Desenvolva um projeto de Web API de pontos turísticos com Python + Django + Django Rest Framework e deploy no Heroku',
    '150.00',
    '120.00',
    '20',
    'https://img-c.udemycdn.com/course/240x135/1631400_e3d1_2.jpg'
);

insert into tb_curso
(
    id_curso,
    nivel,
    nm_curso,
    ds_curso,
    preco_original,
    preco_promocional,
    porc_desconto,
    url_imagem
)
values
(
    nextval('sq_tb_curso'),
    '1',
    'Desenvolvendo REST / RESTful APIs com Ruby on Rails',
    'Aprenda a criar uma aplicação completa com Ruby on Rails API-only',
    '140.00',
    '126.00',
    '10',
    'https://img-c.udemycdn.com/course/240x135/1082928_b432_3.jpg'
);

insert into tb_curso
(
    id_curso,
    nivel,
    nm_curso,
    ds_curso,
    preco_original,
    preco_promocional,
    porc_desconto,
    url_imagem
)
values
(
    nextval('sq_tb_curso'),
    '2',
    'Desenvolvimento avançado de aplicações corporativas c Django',
    'Aprenda os conceitos mais importantes que toda aplicação com foco corporativo precisa ter e dê um up na sua carreira',
    '140.00',
    '126.00',
    '10',
    'https://img-c.udemycdn.com/course/240x135/1927236_8fde.jpg'
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'História do Java e Conceitos Iniciais de OO',
    '1h 18m',
    1
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'Pacotes, Herança, Associações e Polimorfismo',
    '2h 37m',
    1
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'Constantes, Variáveis e Tipos de Dados',
    '28m',
    2
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'Estruturas de Decisão',
    '18m',
    2
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'Web Services - básico',
    '18m',
    3
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'API dos Carros',
    '42m',
    3
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'Desenvolvendo uma API de pontos Turísticos',
    '42m',
    4
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'Desenvolvendo recursos avancados na API',
    '42m',
    4
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'Views e templates das aplicacoes',
    '58m',
    5
);

insert into tb_modulo
(
    id_modulo,
    nm_modulo,
    carga_horaria,
    id_curso
)
values
(
    nextval('sq_tb_modulo'),
    'Deploy da aplicaçao na Amazon AWS',
    '48m',
    5
);

insert into tb_conteudo
(
    id_conteudo,
    ds_conteudo
)
values
(
    nextval('sq_tb_conteudo'),
    'Desenvolvendo Classes com o Eclipse'
);

insert into tb_conteudo
(
    id_conteudo,
    ds_conteudo
)
values
(
    nextval('sq_tb_conteudo'),
    'Pacotes'
);

insert into tb_conteudo
(
    id_conteudo,
    ds_conteudo
)
values
(
    nextval('sq_tb_conteudo'),
    'Arrays'
);

insert into tb_modulo_conteudos
(
    modulo_id_modulo,
    conteudos_id_conteudo
)
values
(
    2,
    1
);

insert into tb_modulo_conteudos
(
    modulo_id_modulo,
    conteudos_id_conteudo
)
values
(
    2,
    2
);

insert into tb_modulo_conteudos
(
    modulo_id_modulo,
    conteudos_id_conteudo
)
values
(
    2,
    3
);

insert into tb_conteudo
(
    id_conteudo,
    ds_conteudo
)
values
(
    nextval('sq_tb_conteudo'),
    'Constantes'
);

insert into tb_conteudo
(
    id_conteudo,
    ds_conteudo
)
values
(
    nextval('sq_tb_conteudo'),
    'Variáveis'
);

insert into tb_conteudo
(
    id_conteudo,
    ds_conteudo
)
values
(
    nextval('sq_tb_conteudo'),
    'Tipos de Dados'
);

insert into tb_modulo_conteudos
(
    modulo_id_modulo,
    conteudos_id_conteudo
)
values
(
    3,
    4
);

insert into tb_modulo_conteudos
(
    modulo_id_modulo,
    conteudos_id_conteudo
)
values
(
    3,
    5
);

insert into tb_modulo_conteudos
(
    modulo_id_modulo,
    conteudos_id_conteudo
)
values
(
    3,
    6
);