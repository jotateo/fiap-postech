# Tech Challenge - Pós-Tech SOAT - FIAP

<b><i>Este é o projeto desenvolvido durante a fase I do curso de pós-graduação em Arquitetura de Software da FIAP - Grupo 58.</i></b>

### Repositório:
https://github.com/jotateo/fiap-postech.git

## Membros do grupo:
* Luciano Cordeiro Lessa - RM352003
* Guilherme Luiz da Cunha - RM351119 
* Jeronimo Teodoro - RM351760 

## Infraestrutura
* Java 17+
* Docker

### Prerequisites

### Setup

## Entregavéis
### Entregável 1 – DDD
A modelagem dos fluxos de pedido e pagamento, e preparo e entrega foram realizadas utilizando Event Storming. Disponibilizado no Miro:

### Entregável 2 – Aplicação utilizando arquitetura hexagonal
A aplicação foi desenvolvida utilizando Spring Boot e MySQL seguindo a modularização da arquitetura hexagonal. Nela, estão implementados os endpoints para *cadastro de cliente*; *busca de cliente por CPF*; *criação*, *edição* e *remoção de produto*; *busca de produto por categoria*; *fake checkout* e *listagem de pedidos*.
O projeto utiliza *Flyway* para as Migrations e já popula o database com alguns produtos, categorias, clientes e pedidos, na inicialização. Dessa forma, já há dados disponíveis nos endpoints. 
A documentação mais detalhada de cada endpoint e seus parâmetros pode ser consultada em *http://localhost:8080/swagger-ui/index.html*

### Entregável 3 – Docker
O docker compose é responsável por orquestrar a inicialização do serviço da aplicação e do MySQL.
Para inicializar a aplicação basta utilizar *docker compose up -d* e ela estará disponível em *localhost:8080*. Para desativar a aplicação basta utilizar *docker compose down*
O *Dockerfile* e o *docker-compose* estão disponíveis no repositório da aplicação.


