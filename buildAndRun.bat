@echo off
call mvn clean package
call docker build -t com.lehm/AlumnosHibernate .
call docker rm -f AlumnosHibernate
call docker run -d -p 9080:9080 -p 9443:9443 --name AlumnosHibernate com.lehm/AlumnosHibernate