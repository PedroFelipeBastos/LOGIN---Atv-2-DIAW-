# LOGIN---Atv-2-DIAW-

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patinho Andando</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background-color: #f0f0f0; /* Cor de fundo opcional */
            overflow-x: hidden; /* Evita barra de rolagem horizontal */
            height: 100vh;
            position: relative;
        }

        /* Configuração do patinho */
        .patinho {
            position: absolute;
            bottom: 20px; /* Distância do chão */
            width: 100px;  /* Tamanho do patinho */
            height: auto;
            
            /* Aplica a animação: nome, duração, ciclo infinito e velocidade constante */
            animation: andar 10s linear infinite;
        }

        /* Criando o movimento do patinho */
        @keyframes andar {
            0% {
                left: -120px; /* Começa antes de entrar na tela */
                transform: scaleX(1); /* Olhando para a direita */
            }
            49% {
                transform: scaleX(1); /* Continua olhando para a direita */
            }
            50% {
                left: calc(100% + 20px); /* Chega no final da tela e vira */
                transform: scaleX(-1); /* Inverte o patinho (olhando para a esquerda) */
            }
            99% {
                transform: scaleX(-1); /* Continua olhando para a esquerda */
            }
            100% {
                left: -120px; /* Volta para o início */
                transform: scaleX(1); /* Vira para a direita novamente */
            }
        }
    </style>
</head>
<body>

    <!-- Link de um GIF de patinho andando com fundo transparente -->
    <img class="patinho" src="https://giphy.com" alt="Patinho andando">

</body>
