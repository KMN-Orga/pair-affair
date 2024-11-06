# Nome del file Docker Compose
DOCKER_COMPOSE_FILE = docker-compose.yml

up:
	docker-compose -f $(DOCKER_COMPOSE_FILE) up -d