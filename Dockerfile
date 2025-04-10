# Usa una imagen oficial de Java como base
FROM openjdk:11-jdk

# Configura el directorio de trabajo
WORKDIR /app

# Copia el código del proyecto al contenedor
COPY . /app

# Compila el proyecto con Maven
RUN apt-get update && apt-get install -y maven
RUN mvn clean package

# Expone el puerto en el que correrá la app
EXPOSE 8080

# Ejecuta la aplicación
CMD ["java", "-jar", "target/miapp.jar"]
