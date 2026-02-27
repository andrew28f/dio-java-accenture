# Exercícios de Programação

## 1

Escreva um código que cria uma calculadora para as operações de soma e subtração. O usuário deve informar todos os números que serão usados na conta de uma só vez, utilizando vírgulas para separá-los.

---

## 2

Escreva um código que receba entradas sem formatação e as retorne formatadas.  
Os tipos de entradas que o código deve retornar são os seguintes:

- **Telefone fixo**
    - 8 dígitos sem DDD: `xxxx-xxxx`
    - 10 dígitos com DDD: `(xx)xxxx-xxxx`

- **Celular**
    - 9 dígitos sem DDD: `xxxxx-xxxx`
    - 11 dígitos com DDD: `(xx)xxxxx-xxxx`

O código deve ser capaz de detectar as seguintes situações:

- Se receber somente números, detectar se corresponde com algum dos formatos aceitos e retornar formatado;
- Se receber uma entrada com quantidade de números diferente dos padrões descritos acima, informar que não se trata de um número válido;
- Se receber um número já formatado, retorná-lo do mesmo jeito e informar de qual tipo de dispositivo se trata;
- Se receber com máscara incorreta, corrigir e retornar;
- Se receber qualquer entrada que tenha números e outros caracteres, verificar se há números suficientes para compor um dos tipos aceitos e retornar do que se trata ou informar que foi uma entrada inválida.

---

## 3

Escreva um código que receba 3 valores separados por um caractere de sua escolha, **n** vezes (n é o número de vezes que o usuário desejar informar).

Exemplo: NOME_CAMPO;VALOR;TIPO;

Os tipos que devem ser aceitos são:

- texto
- datas
- data e hora
- números inteiros
- números com ponto flutuante
- booleanos
- array dos tipos anteriores

> Opcional: possibilitar definir arrays de objetos ou objetos internos.
