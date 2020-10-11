# Changelog
## 0.1.0 - 2020-10-11
### Домашнее задание 2 Настраиваем окружение, пишем первый тест
Создать новый maven-проект для автоматизации тестирования и залить его на GitHub\
**Цель:** В результате выполнения дз вы создадите новый maven-проект для автоматизации тестирования и залить его на GitHub

**[Added]** 2 Создайте новый проект (maven)\
**[Added]** 3 Настройте для проекта файл .gitignore (https://www.gitignore.io/)\
**[Added]** 4 В файле pom.xml укажите зависимости для
- Selenium Java (https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) 
- WebDriverManager (https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
- jUnit (https://mvnrepository.com/artifact/junit/junit/4.12)

**[Added]** 5 создайте репозиторий на github и залейте в master код проекта

6 создайте новую ветку в репозитории и в рамках нее создайте тест, который:
-- с помощью WebDriverManager, настраивает ChromeDriver
-- открывает в браузере Chrome страницу https://otus.ru/
— проверяет title страницы
- логирует шаги теста с помощью log4j

7 сделайте push кода с тестом в новую ветку

8 сделайте pull request в мастер из новой ветки, убедитесь, что не возникло конфликтов и код можно мержить
