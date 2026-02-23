class User extends BaseEntity {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Visit extends BaseEntity {

    protected User user;

    protected WebSite site;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WebSite getSite() {
        return site;
    }

    public void setSite(WebSite site) {
        this.site = site;
    }
}

class WebSite extends BaseEntity {

    protected String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

abstract class BaseEntity {
    protected long id;
    protected long version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}

/*
Вы пишете приложение, которое собирает информацию о том, какие сайты посещали какие пользователи. Существует три класса:
Пользователь, веб-сайт и Посещение. Многие поля и методы этих классов одинаковы.

Напишите новый базовый абстрактный класс с именем BaseEntity .
Предоставленные классы должны расширять его. Переместите все повторяющиеся поля и методы в новый класс.

После внесенных вами изменений следующий код должен работать корректно:
 */