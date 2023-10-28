FROM maven:3.8.5-openjdk-17

COPY . .
RUN chmod +x app-startup.sh
EXPOSE 8080
ENTRYPOINT ["/app-startup.sh"]
