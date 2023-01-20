## Telegram Bot on Spring Boot, MySQL and JPA

**Telegram Bot massage counter on Java and Spring Boot for one or ane chats with bottoms `/start` and `/help`**

**Tools:**
* IntelliJ IDE (Maven)
* Java 11
* Lombok
* Springframework.boot
* mySQL
* TelegramBot

## How to use

* Clone the repo and build it yourself.
* Add file `config.properties` included: 


  ```
  bot.name = _name_
  bot.token = _token_your_bot_
  bot.chatId = _chats_id_
```
and db related settings

```
spring.jpa.database = MySQL
spring.jpa.show-sql = false

# for automation create/edit tables in the bd
spring.jpa.hibernate.ddl-auto = update

spring.datasource.driverClassName = com.mysql.cj.jdbc.Driver

# port and name bd
spring.datasource.url = jdbc:mysql://localhost:3306/...
spring.datasource.username = root
spring.datasource.password = root
```

* Run your MySQL server on local host
* Build Artifacts for create jar file (menu Build)
* Add your Bot for your Telegram chat and make it an admin

**Run the `.jar` file:**
```
java -jar SpringTGBot.jar
```





