# Calculadora de Dano de Arma de RPG

Este programa em Java calcula o dano total para uma arma em um jogo de interpretação de papéis (RPG) com base na entrada fornecida pelo usuário. A entrada consiste em uma string que representa o dano da arma, a qual pode incluir rolagens de dados (por exemplo, 2d6, 1d4) e valores de bônus (por exemplo, +6).

## Como Usar

1. Execute o programa.
2. Insira o dano da arma no formato especificado.
3. O programa calculará e exibirá o dano total da arma.

### Formato de Entrada

O programa aceita entradas no seguinte formato:

- Rolagens de dados: `NdM`, onde `N` é o número de dados a serem rolados e `M` é o número de faces de cada dado (por exemplo, 2d6, 1d4).
- Valores de bônus: Qualquer valor inteiro (por exemplo, +6).
- Diversas rolagens de dados e valores de bônus podem ser combinados usando o operador `+` (por exemplo, `2d6+1d4+6`).

## Explicação do Código

### Classe Principal

- O programa começa criando um objeto `Scanner` para ler a entrada do usuário.
- Ele solicita ao usuário que insira o dano da arma e armazena a entrada na variável `damageWeaponInput`.
- Um bloco `try-catch-finally` é usado para lidar com possíveis exceções, como `ArrayIndexOutOfBoundsException`, e garantir que o `Scanner` seja fechado.
- A string de entrada é dividida usando o operador `+`, separando as diferentes partes do cálculo de dano.
- O programa itera por cada parte do cálculo de dano:
  - Se uma parte contém a letra "d", ele chama o método `rollDiceDamage` para simular a rolagem de dados e adiciona o resultado ao `totalDamage`.
  - Se uma parte não contém "d", ela é tratada como um valor de bônus e é adicionada diretamente ao `totalDamage`.
- Se não houver operadores `+` na entrada, isso significa que há apenas um cálculo de dano, e o método `rollDiceDamage` é chamado com a string de entrada completa.
- Por fim, o programa exibe o dano total.

### Método `rollDiceDamage`

- Este método recebe como entrada uma string que representa uma rolagem de dados (por exemplo, "2d6").
- Ele divide a entrada para extrair o número de dados a serem rolados e o número de faces de cada dado.
- Em seguida, simula a rolagem do número especificado de dados com o número especificado de faces e calcula o total.
- As rolagens individuais de dados e seus resultados são exibidos.
- O método retorna o dano total calculado a partir das rolagens de dados.

Este programa oferece uma maneira conveniente de calcular o dano de armas de RPG com base em rolagens de dados e valores de bônus, tornando-o útil para jogadores e mestres de jogo em cenários de RPG.
