# Filmes API

API REST para gerenciamento de filmes desenvolvida com Spring Boot e MySQL.

## Tecnologias

- Java 21
- Spring Boot 3.2
- Spring Data JPA
- MySQL 8
- Docker

## Endpoints

| Metodo | Endpoint | Descricao |
|--------|----------|-----------|
| GET | /api/filmes | Lista todos os filmes |
| GET | /api/filmes/{id} | Busca filme por ID |
| POST | /api/filmes | Cadastra novo filme |
| PUT | /api/filmes/{id} | Atualiza filme |
| DELETE | /api/filmes/{id} | Remove filme |

## Como rodar

### Com Docker

```bash
docker build -t filmes-api .
docker run -d --name filmes-api-container --network host filmes-api
```

## Infraestrutura

- VM Oracle Cloud Infrastructure (OCI)
- Endpoint publico: http://163.176.251.212:8080/api/filmes
