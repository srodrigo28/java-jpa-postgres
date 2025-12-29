## Modelo para conexão
spring.application.name=dev

spring.datasource.url=jdbc:mysql://localhost:3306/dev_db
spring.datasource.username=dev_user
spring.datasource.password=dev_password
spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

## Neon Tech

> * Original
spring.datasource.url=jdbc:ep-flat-scene-ac1854yd-pooler.sa-east-1.aws.neon.tech/neondb
spring.datasource.username=neondb_owner
spring.datasource.password=npg_BXMyDutZ70Kz
spring.jpa.hibernate.ddl-auto=update

> * Usado
spring.datasource.url=jdbc:postgresql://ep-flat-scene-ac1854yd-pooler.sa-east-1.aws.neon.tech/neondb
spring.datasource.username=neondb_owner
spring.datasource.password=npg_BXMyDutZ70Kz