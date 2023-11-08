docker build -t app .
docker run -it --rm -e DATASOURCE_HOST=172.26.128.1 app