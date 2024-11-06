# Nome del file Docker Compose
DOCKER_COMPOSE_FILE = docker-compose.yml

# Specifica che Docker Compose usa il file .env
export $(shell sed 's/=.*//' .env)

up:
	docker-compose -f $(DOCKER_COMPOSE_FILE) up -d