##!/usr/bin/env bash
#
#
#mvn package
#docker build -t swagger_final .
#docker stop swagger_final
#docker rm swagger_final
#docker run -d -p 8080:8080 --name swagger_final postgres
#docker rmi $(docker images -f 'dangling=true' -q)
#docker logs -f swagger_final