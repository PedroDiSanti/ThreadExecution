# GRC - 2020/2

Trabalho de execução utiliando thread e thread pools com a finalidade da criação do relatório marcando o tempo, em ms, da execução de cada thread, em 3 cenários diferentes, e a média total dos casos.

### Tech
Foram utilizado:

* Java - Linguagem de programação orientada a objetos
* IntelliJ IDEA Ultimate - IDE desenvolvida pela JetBrains JBuilde
* Github - é uma plataforma de hospedagem de código-fonte com controle de versão usando o Git

### Resultados

Os resultados obtidos foram variados baseados em cada caso específico, onde temos:

#### Execução de uma thread, dez vezes

| Thread | Tempo(ms) |
| ------ | ------ |
| 1 | 737 |
| 2 | 126 |
| 3 | 112 |
| 4 | 117 |
| 5 | 2645 |
| 6 | 776 |
| 7 | 81 |
| 8 | 78 |
| 9 | 60 |
| 10 | 72 |

| Média | Tempo(ms) |
| ------ | ------ |
| 1 | 481 |

#### Execução de dez threads uma vez cada

| Thread | Tempo(ms) |
| ------ | ------ |
| 1 | 473 |
| 2 | 170 |
| 3 | 289 |
| 4 | 7112 |
| 5 | 160 |
| 6 | 7347 |
| 7 | 7333 |
| 8 | 107 |
| 9 | 93 |
| 10 | 77 |

| Média | Tempo(ms) |
| ------ | ------ |
| 1 | 2316 |

#### Execução de três threads de uma thread pool dez vezes

| Thread | Tempo(ms) |
| ------ | ------ |
| 1 | 316 |
| 2 | 143 |
| 3 | 90 |
| 4 | 101 |
| 5 | 9 |
| 6 | 7 |
| 7 | 5 |
| 8 | 4 |
| 9 | 4 |
| 10 | 3 |

| Média | Tempo(ms) |
| ------ | ------ |
| 1 | 68 |
