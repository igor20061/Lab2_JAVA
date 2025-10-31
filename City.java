
public class City {
    private String name;
    private City[] connectedCities; // массив связанных городов
    private int[] costs;             // массив стоимостей поездок

    // Конструктор 1 — только название
    public City(String name) {
        this.name = name;
        this.connectedCities = new City[0];
        this.costs = new int[0];
    }

    // Конструктор 2 — название + связанные города и их стоимости
    public City(String name, City[] connectedCities, int[] costs) {
        this.name = name;
        // если передано null — создаём пустые массивы, чтобы не было ошибок
        if (connectedCities == null || costs == null) {
            this.connectedCities = new City[0];
            this.costs = new int[0];
        } else {
            this.connectedCities = connectedCities;
            this.costs = costs;
        }
    }

    // Метод для добавления пути к новому городу
    public void addPath(City city, int cost) {
        int newSize = connectedCities.length + 1;

        City[] newCities = new City[newSize];
        int[] newCosts = new int[newSize];

        // копируем старые данные
        for (int i = 0; i < connectedCities.length; i++) {
            newCities[i] = connectedCities[i];
            newCosts[i] = costs[i];
        }

        // добавляем новый путь
        newCities[newSize - 1] = city;
        newCosts[newSize - 1] = cost;

        connectedCities = newCities;
        costs = newCosts;
    }

    @Override
    public String toString() {
        String result = "Город " + name + " связан с: ";
        if (connectedCities.length == 0) {
            result += "нет путей";
        } else {
            for (int i = 0; i < connectedCities.length; i++) {
                result += connectedCities[i].name + ":" + costs[i] + " ";
            }
        }
        return result;
    }
}
