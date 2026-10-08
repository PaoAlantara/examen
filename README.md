Markdown
# Sistema de Control de Impuestos 📊

Este es un sistema CRUD completo desarrollado en Java con Spring Boot, diseñado para gestionar contribuyentes, catálogos de impuestos y el registro de sus declaraciones. Se construyó siguiendo la arquitectura MVC (Model-View-Controller) utilizando renderizado del lado del servidor.

## 🛠️ Stack Tecnológico
- **Backend:** Java (JDK 25) + Spring Boot (Spring Web, Spring Data JPA)
- **Frontend:** HTML5, Thymeleaf, Bootstrap 5
- **Base de Datos:** MySQL Server 8+
- **Gestor de Dependencias:** Maven

---

## 🗄️ Configuración de la Base de Datos

Para ejecutar este proyecto, primero debes preparar la base de datos. Abre **MySQL Workbench** (o la terminal de MySQL) y ejecuta el siguiente script completo. Esto creará la base de datos, las tablas con sus relaciones y añadirá datos de prueba.

```sql
CREATE DATABASE impuestos_db;
USE impuestos_db;

CREATE TABLE contribuyente (
    id_contribuyente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    ap_paterno VARCHAR(50) NOT NULL,
    ap_materno VARCHAR(50) NOT NULL,
    curp VARCHAR(18),
    telefono VARCHAR(15),
    correo VARCHAR(100)
);

CREATE TABLE impuesto (
    id_impuesto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    periodo VARCHAR(50),
    fecha_limite DATE
);

CREATE TABLE declaracion (
    id_declaracion INT AUTO_INCREMENT PRIMARY KEY,
    id_contribuyente INT NOT NULL,
    id_impuesto INT NOT NULL,
    importe DECIMAL(10,2) NOT NULL,
    fecha_registro DATE,
    observaciones TEXT,
    FOREIGN KEY (id_contribuyente) REFERENCES contribuyente(id_contribuyente),
    FOREIGN KEY (id_impuesto) REFERENCES impuesto(id_impuesto)
);

USE impuestos_db;
INSERT INTO impuesto (nombre, periodo, fecha_limite) VALUES ('ISR', 'Mensual', '2026-10-17');
INSERT INTO impuesto (nombre, periodo, fecha_limite) VALUES ('IVA', 'Mensual', '2026-10-17');



⚙️ Configuración del Proyecto
Clona este repositorio en tu máquina local:

Bash
git clone [https://github.com/PaoAlantara/examen.git](https://github.com/PaoAlantara/examen.git)
Abre el archivo src/main/resources/application.properties y ajusta las credenciales para que coincidan con tu servidor MySQL local:

Properties
spring.datasource.url=jdbc:mysql://localhost:3306/impuestos_db?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=TU_CONTRASEÑA_AQUI
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
🚀 Ejecución del Sistema
Abre una terminal en la raíz del proyecto y utiliza el Maven Wrapper incluido para levantar el servidor:

En Windows:

DOS
.\mvnw.cmd spring-boot:run
En Mac / Linux:

Bash
./mvnw spring-boot:run
Una vez que la consola muestre que el servidor ha iniciado correctamente (Tomcat started on port 8080), abre tu navegador web e ingresa a:
👉 http://localhost:8080/contribuyentes