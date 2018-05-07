#!/bin/sh
while ! nc -z 127.18.10.10 8761 ; do
    echo "Waiting for the Eureka Server"
    sleep 3
done
java -jar /opt/lib/nwt_tim14_gateway-1.0-SNAPSHOT.jar
