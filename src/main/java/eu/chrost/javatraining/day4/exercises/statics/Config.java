package eu.chrost.javatraining.day4.exercises.statics;

/*

Zadanie 5: Zarządzanie konfiguracją
1.	Utwórz klasę Config zgodnie ze wzorcem singleton:
o	Prywatne statyczne pole Config instance.
o	Prywatny konstruktor.
o	Publiczną metodę static Config getInstance().
o	Stałe static final String APP_NAME = "MyApp", static final String VERSION = "1.0.0".
o	Publiczne metody:
	String getAppName() – zwraca nazwę aplikacji.
	String getVersion() – zwraca wersję aplikacji.
2.	W metodzie main():
o	Pobierz instancję konfiguracji i wyświetl nazwę oraz wersję aplikacji


 */

public class Config {
    private static final String APP_NAME = "MyApp";
    private static final String VERSION = "1.0.0";

    private static Config instance;

    public String getAppName() {
        return APP_NAME;
    }

    public String getVersion() {
        return VERSION;
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private Config() {
    }

    public static void main(String[] args) {
        Config config1 = Config.getInstance();
        System.out.println(config1.getAppName());
        System.out.println(config1.getVersion());

        Config config2 = Config.getInstance();
        System.out.println(config2.getAppName());
        System.out.println(config2.getVersion());

        System.out.println(config1 == config2);
    }
}
