Используемые технологии:

- Java
- Spring Boot
- MyBatis
- LiquiBase
- PostgreSQL
- Swagger


База данных инициализируется при запуске приложения через LiquiBase, скрипты лежат в папке resources/db.changelog

Все операции выполняются по пути **/products** и могут принимать на вход как список, так и одиночный запрос. Доступны:
 
    1. /save с RequestBody для добавления записи
    2. /update с RequestBody для обновления описания
    3. /delete с RequestParam для удаления записи по id - /delete?id=?  
    4. /get с RequestParam для получения записи по name - /get?name=?

Использовал Swagger для отображения, он доступен по пути: **<localhost:8080/swagger-ui/>**