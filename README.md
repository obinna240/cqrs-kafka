## Create a docker network
```docker network create obinnanetwork```

or do

```docker network create obinnanetwork --attachable```

check networks

```
docker network ls
```

## Create and Run Kafka
```
docker-compose --version
``` 
and then run 
```
docker-compose up -d
``` 
to start kafka in docker.

## Create Mongo Docker container
`docker run -it -d --name mongo-container-7 -p 27018:27018 --network obinnanetwork --restart always -v mongodb_data_container:/data/db mongo:latest`

## Install mysql client tool - Docker
```docker run -it -d --name mysql-container -p 3306:3306 --network obinnanetwork -e MYSQL_ROOT_PASSWORD=pasword --restart always -v mysql_data_container:/var/lib/mysql mysql:latest```

### Mysql client - Adminer
```docker run -it -d -name adminer -p 8080:8080 --network obinnanetwork -e ADMINER_DEFAULT_SERVER=mysql-contaner --restart always adminer:latest```

## Some CQRS Notes from DDD
- Aggregates are a group of entities that are kept in a consistent state.
- The Aggregate root is an entity within the aggregate responsible for maintaining the consistent state.
- The Aggregate is the key building block for any CQRS application.
