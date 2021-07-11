#!/bin/sh
mvn clean package && docker build -t com.lehm/AlumnosHibernate .
docker rm -f AlumnosHibernate || true && docker run -d -p 9080:9080 -p 9443:9443 --name AlumnosHibernate com.lehm/AlumnosHibernate