package Resources;

import java.util.ListResourceBundle;

public class Resources_ru extends ListResourceBundle{

    private static final Object[][] contents =
            {
                    {"Тип:", "Тип: "},
                    {"Дата инициализации:", "Дата инициализации: "},
                    {"Количество элементов:", "Количество элементов: "},

                    {"Содержимое коллекции: \n", "Содержимое коллекции: \n"},
                    {"Коллекция пустая!", "Коллекция пустая!"},
                    {"Объект добавлен в коллекцию!", "Объект добавлен в коллекцию!"},
                    {"Проблема с загрузкой объекта в базу данных!", "Проблема с загрузкой объекта в базу данных!"},
                    {"Проблема с загрузкой объекта в базу данных!", "Проблема с загрузкой объекта в базу данных!"},
                    {"Коллекция успешно сохранена!", "Коллекция успешно сохранена!"},
                    {"Эллемент удалён!", "Эллемент удалён!"},
                    {"Коллекция пустая!", "Коллекция пустая!"},
                    {"Общее число комнат слишком большое! Перполнен BigInteger!", "Общее число комнат слишком большое! Перполнен BigInteger!"},
                    {"Общее число комнат во всех квартирах: ", "Общее число комнат во всех квартирах: "},
                    {"В коллекции нет квартир!", "В коллекции нет квартир!"},
                    {"Добавляем элемент в коллекцию!", "Добавляем элемент в коллекцию!"},
                    {"Проблема с загрузкой новой квартиры в базу данных!", "Проблема с загрузкой новой квартиры в базу данных!"},
                    {"Привлекательность элемента слишком большая!", "Привлекательность элемента слишком большая!"},
                    {"Пустая коллекция!", "Пустая коллекция!"},
                    {"Неправильно введён ID!\nВведите ID занова:", "Неправильно введён ID!\nВведите ID занова:"},
                    {"Приступаем к обновлению параметров файла с ID: ", "Приступаем к обновлению параметров файла с ID: "},
                    {"Элемент успешно обновлён!", "Элемент успешно обновлён!"},
                    {"Проблема с загрузкой обновлённого элемента в базу данных!", "Проблема с загрузкой обновлённого элемента в базу данных!"},
                    {"Приступаем к обновлению параметров файла с ID: ", "Приступаем к обновлению параметров файла с ID: "},
                    {"Элемент обновлён!", "Элемент обновлён!"},
                    {"Квартиры с таким ID не существует!\nПопробуйте ввести ID занова.", "Квартиры с таким ID не существует!\nПопробуйте ввести ID занова."},
                    {"Элемент удалён.", "Элемент удалён."},
                    {"Нет подходящих для удаления элементов", "Нет подходящих для удаления элементов"},
                    {"Подходящие элементы были удалены.", "Подходящие элементы были удалены."},
                    {"Нет подходящих для удаления элементов", "Нет подходящих для удаления элементов"},
                    {"Коллекция пустая!", "Коллекция пустая!"},
                    {"Проблемма с загрузкой коллекции в массив в методе printFieldAscendingNumberOfRooms", "Проблемма с загрузкой коллекции в массив в методе printFieldAscendingNumberOfRooms"},
                    {"Выводим элементы в порядке возрастания количества комнат:\n", "Выводим элементы в порядке возрастания количества комнат:\n"},
                    {"В коллекции содержится всего один элемент: ID - ", "В коллекции содержится всего один элемент: ID - "},
                    {"Такого варианта транспора не существует!\nВведите другой.", "Такого варианта транспора не существует!\nВведите другой."},
                    {"Нет ни одного подходящего элемента в коллекции!", "Нет ни одного подходящего элемента в коллекции!"},
                    {"В коллекции нет элементов для сравнения!", "В коллекции нет элементов для сравнения!"},



            };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
