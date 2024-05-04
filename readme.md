# Contador DIO e Santander

Este é um programa simples em Java que solicita dois números ao usuário e, em seguida, imprime os números incrementados em uma sequência.

## Como usar

1. Compile o arquivo `Contador.java` utilizando o compilador Java. Você pode fazer isso executando o seguinte comando no terminal:

    ```
    javac Contador.java
    ```

2. Execute o programa compilado usando o seguinte comando:

    ```
    java Contador
    ```

3. Siga as instruções exibidas no terminal. Você será solicitado a digitar dois números.

4. Após inserir os números, o programa irá imprimir uma sequência de números, começando do primeiro número digitado até o segundo número digitado.

## Exceção de números inválidos

Se o segundo número digitado for menor ou igual ao primeiro número digitado, o programa lançará uma exceção `NumerosInvalidosException` com a mensagem "O segundo número deve ser maior que o primeiro!". Essa exceção será capturada e tratada no bloco `catch` do programa principal.

## Link do desafio:

https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo
