package lab3.var2;

import java.util.Date;

// Лабораторная работа 3
// Вариант 2
// Задание 1, 2
public class DataGenerator {
    private static final String[] names = {
            "Yaroslav", "Andrey", "George", "Savva", "Fedor", "Denis", "Artem", "Kirill", "Maxim", "Damir", "Dmitry",
            "Sergey", "Alexey", "Lev", "Demid", "Mark", "Victor", "Peter", "Marcel", "Oleg", "Alexander", "Mikhail",
            "Platon", "Egor", "Semyon", "Grigory", "Luka", "Pavel", "Arseny", "Boris", "Philip", "Ilya", "Stepan",
            "Timofey", "Yan", "Ivan", "Daniel", "Roman", "Vladimir", "Leonid", "Nikolai", "Danila", "Gleb", "Matvey",
            "Konstantin", "Tikhon", "Vyacheslav", "Miron", "Nikita", "Evgeny", "Yuri", "Kamil", "Makar", "Emil",
            "Robert", "Savely", "Jaromir", "Igor", "Timur", "Vitaly", "Rodion", "Artur", "Vladislav", "Vasily",
            "Svyatoslav", "Stanislav", "Herman", "David", "Ali", "Ruslan", "Bogdan", "Zakhar", "Daniel", "Miroslav",
            "Seraphim", "Elisha", "Artemiy", "Valery", "Arsen", "Tigran", "Anton", "Gordey", "Bilal", "Emin", "Adam",
            "Yakov", "Danil", "Vadim", "Emir", "Albert", "Ibrahim", "Demyan", "Vsevolod", "Daniyar", "Anatoly", "Leon",
            "Danis", "Danil", "Arkady", "Nazar"
    };

    private static final String[] surnames = {
            "Laptev", "Kazakov", "Smirnov", "Krylov", "Voloshin", "Shcherbakov", "Korotkov", "Demyanov", "Potapov",
            "Karpov", "Agafonov", "Chumakov", "Tsarev", "Anisimov", "Parfenov", "Bondarev", "Dyakonov", "Kuzmin",
            "Sharov", "Chistyakov", "Mikhailov", "Stepanov", "Merkulov", "Denisov", "Zinoviev", "Kiselyov", "Suvorov",
            "Maksimov", "Vorobyev", "Yudin", "Grigoriev", "Lebedev", "Sorokin", "Nosov", "Nikitin", "Anikin", "Eremin",
            "Zimin", "Biryukov", "Alexandrov", "Savitsky", "Pugachev", "Nikolaev", "Pavlov", "Smirnov", "Sokolov",
            "Ivanov", "Sobolev", "Maslov", "Tarasov", "Prokofiev", "Makarov", "Ivanov", "Filippov", "Panov", "Zimin",
            "Popov", "Krasnov", "Ermakov", "Larin", "Molchanov", "Medvedev", "Smirnov", "Ivanov", "Laptev", "Vorobyev",
            "Ivanov", "Danilov", "Novikov", "Vasiliev", "Dmitriev", "Sokolo"
    };

    private static final String[] patronymics = {
            "Davidovich", "Glebovich", "Artemievich", "Viktorovich", "Arkhipov", "Maksimovich", "Lvovich",
            "Robertovich", "Alexandrovich", "Ivanov", "Ibrahimovich", "Germanovich", "Antonovich", "Borisovich",
            "Timofeyevich", "Ivanovich", "Timurovich", "Kirillovich", "Artemovich", "Romanovich", "Vladimirovich",
            "Fedorovich", "Adamovich", "Platonovich", "Egorovich", "Danilovich", "Danielevich", "Denisovich",
            "Markovich", "Nikolaevich", "Matveyevich", "Andreevich", "Artemyevich", "Alekseevich", "Nikitich",
            "Vadimovich", "Mikhailovich", "Ilyich", "Stepanovich", "Bogdanovich", "Vasilyevich", "Igorevich",
            "Pavlovich", "Popov", "Mironovich", "Daniilovich", "Gordeevich", "Timofeevich", "Olegovich"
    };

    private static final String[] addresses = {
            "Nizhny Novgorod, Rodnikovaya str., 49", "Kazan, Komsomolskaya str., 46", "Moscow, Marta 8 str., 33",
            "Saratov, Klubnaya str., 39", "Krasnoyarsk, Gorky str., 50", "Samara, ul. 8 Marta, 15",
            "Chelyabinsk, ul. Lermontov, 43", "Krasnoyarsk, ul. Rabochaya, 17", "Voronezh, ul. Pervomayskaya, 22",
            "Rostov-on-Don, Krasnoarmeyskaya str., 10", "St. Petersburg, Kalinina str., 33",
            "Kazan, Kolkhoznaya str., 44", "Nizhny Novgorod, Kolkhoznaya str., 12", "Volgograd, Mayakovsky str., 10",
            "Togliatti, Dzerzhinsky str., 34", "Ufa, Frunze str., 20", "Ufa, Mayskaya str., 17",
            "Ufa, Parkovaya str., 50", "Moscow, Shosseynaya str., 10", "Nizhny Novgorod, Krasnaya str., 47",
            "Volgograd, Kommunisticheskaya str., 13", "Yekaterinburg, Pionerskaya str., 11",
            "Samara, Stepnaya str., 12", "Voronezh, Pervomayskaya str., 8", "Krasnoyarsk, Svetly str., 33",
            "Volgograd, Pervomayskaya str., 1", "Krasnodar, Internatsionalnaya str., 14",
            "Izhevsk, Beregovaya str., 46", "Yekaterinburg, Zapadnaya str., 30", "Chelyabinsk, Lenin str., 6",
            "Kazan, Druzhby str., 28", "Chelyabinsk, Kirov str., 19", "Ufa, Severnaya str., 41",
            "Perm, 1 May str., 21", "Chelyabinsk, Lenin str., 32", "Ufa, Kolkhoznaya str., 42",
            "Nizhny Novgorod, Severnaya str., 47", "St. Petersburg, Sadovaya str., 30", "Krasnodar, Polevaya str., 5",
            "Krasnodar, Klubnaya str., 50", "Volgograd, Chkalov str., 22", "Rostov-on-Don, ul. Postal, 36",
            "Chelyabinsk, Traktovaya str., 29", "Yekaterinburg, Berezovaya str., 24", "Izhevsk, Zelenaya str., 39",
            "Omsk, Severnaya str., 32", "St. Petersburg, 24, Truda str.", "Rostov-on-Don, 27 Lugovaya str.",
            "Voronezh, 30 Krasnoarmeyskaya str.", "Novosibirsk, Pobedy str., 42", "Chelyabinsk, 31 Postal str.",
            "Krasnodar, Zavodskaya str., 5", "Samara, Severnaya str., 19", "Rostov-on-Don, Rodnikovaya str., 20",
            "Krasnoyarsk, Gornaya str., 39", "Krasnoyarsk, Kommunisticheskaya str., 3",
            "Tyumen, Krasnoarmeyskaya str., 27", "Saint Petersburg, Lesnaya str., 5",
            "Nizhny Novgorod, Berezovaya str., 45", "Saratov, Solnechnaya str., 37", "Voronezh, Sportivnaya str., 50",
            "Omsk, Gogol str., 14", "St. Petersburg, Kolkhoznaya str., 7", "Krasnoyarsk, Pervomayskaya str., 34",
            "Izhevsk, Severnaya str., 4", "Izhevsk, Ozernaya str., 40, 83", "Yekaterinburg, Flower street, 12, 41",
            "Volgograd, Truda street, 43", "Rostov-on-Don, Rabochaya str., 27", "Kazan, Sportivnaya str., 16",
            "Rostov-on-Don, 38 Trudovaya str.", "Volgograd, 50 Rabochaya str.",
            "Krasnoyarsk, 36 Internatsionalnaya str.", "Samara, Pervomaiskaya str., 34", "Omsk, Hospital str., 22",
            "Voronezh, Karl Marx str., 23", "Kazan, Kalinina str., 42", "Ufa, Hospital str., 31",
            "Ufa, Nekrasova str., 27", "Krasnodar, Svobody str., 1", "Chelyabinsk, Gagarin str., 34",
            "Perm, Ozernaya str., 4", "Tyumen, Gagarin str., 48", "Saratov, Pochtovaya str., 3",
            "Saratov, Embankment str., 10", "Moscow, Dorozhnaya str., 9", "Voronezh, Mayakovsky str., 12",
            "Voronezh, Klubnaya str., 20", "Tyumen, Krasnoarmeyskaya str., 40", "Krasnoyarsk, Michurina str., 49",
            "Nizhny Novgorod, Vokzalnaya str., 16", "Yekaterinburg, Kolkhoznaya str., 45",
            "St. Petersburg, Zarechnaya str., 13", "Krasnodar, Zarechnaya str., 16", "Moscow, Zelenaya str., 37",
            "Omsk, Severnaya str., 14", "Togliatti, Shosseynaya str., 12", "Omsk, Podgornaya str., 14",
            "Omsk, Kommunisticheskaya str., 11"
    };

    private static  final String[] phones = {
            "+7(824)463-94-11", "+7(66)675-33-87", "+7(985)298-88-03", "+7(5934)467-12-27", "+7(81)686-67-21",
            "+7(2980)205-23-06", "+7(6308)784-81-17", "+7(7419)383-48-54", "+7(884)608-68-54", "+7(9381)795-88-92",
            "+7(3659)079-42-65", "+7(34)716-10-71", "+7(6774)910-67-97", "+7(6629)706-26-33", "+7(54)626-49-01",
            "+7(1158)267-98-62", "+7(688)226-76-54", "+7(2892)841-43-27", "+7(9686)437-36-05", "+7(71)210-00-30",
            "+7(7121)913-69-95", "+7(237)322-14-03", "+7(145)442-67-39", "+7(4234)994-36-46", "+7(6837)887-43-28",
            "+7(869)340-79-26", "+7(6941)375-64-85", "+7(596)825-42-37", "+7(3465)421-83-82", "+7(39)149-74-64",
            "+7(90)144-87-94", "+7(086)700-02-49", "+7(6483)581-48-86", "+7(24)294-28-14", "+7(256)962-50-19",
            "+7(6711)979-22-04", "+7(57)725-97-23", "+7(8639)293-01-57", "+7(27)488-63-66", "+7(82)643-33-07",
            "+7(70)103-67-49", "+7(843)063-67-19", "+7(8412)191-99-40", "+7(87)263-10-68", "+7(31)137-92-21",
            "+7(934)235-34-31", "+7(67)782-60-57", "+7(7166)878-80-29", "+7(646)883-46-91", "+7(174)534-79-11",
            "+7(8959)539-00-98", "+7(3242)932-31-77", "+7(566)456-05-95", "+7(8588)616-13-00", "+7(2480)357-02-25",
            "+7(2187)638-47-55", "+7(69)666-05-61", "+7(2995)544-62-26", "+7(5432)955-99-25", "+7(211)043-99-55",
            "+7(926)867-39-03", "+7(5885)404-52-85", "+7(2567)073-69-12", "+7(4277)360-88-59", "+7(01)682-24-03",
            "+7(861)744-27-20", "+7(5703)527-54-82", "+7(14)171-93-27", "+7(72)444-49-24", "+7(796)504-72-52",
            "+7(6916)444-16-96", "+7(30)543-34-09", "+7(0373)935-94-23", "+7(7803)640-65-61", "+7(0590)032-32-26",
            "+7(1114)830-20-67", "+7(32)418-91-94", "+7(36)681-40-36", "+7(358)780-49-37", "+7(7967)511-98-65",
            "+7(806)615-10-89", "+7(9482)600-38-19", "+7(2879)483-10-03", "+7(134)235-06-67", "+7(7048)418-20-26",
            "+7(6796)584-09-63", "+7(601)784-17-56", "+7(3896)823-88-44", "+7(846)802-82-65", "+7(17)646-03-56",
            "+7(4823)773-62-91", "+7(03)295-41-32", "+7(7971)400-23-39", "+7(03)328-33-13", "+7(190)220-02-81",
            "+7(2275)055-18-25", "+7(08)229-41-08", "+7(284)762-08-06", "+7(119)918-02-74", "+7(940)485-77-92"
    };

    private static final String[] faculties = {
            "FN", "IU", "SM", "IBM", "MT", "RL"
    };

    public DataGenerator() {
        System.out.println(names.length);
        System.out.println(surnames.length);
        System.out.println(patronymics.length);
    }

    public static String randomName() {
        int index = (int)(Math.random() * names.length);
        return names[index];
    }

    public static String randomSurname() {
        int index = (int)(Math.random() * surnames.length);
        return surnames[index];
    }

    public static String randomPatronymic() {
        int index = (int)(Math.random() * patronymics.length);
        return patronymics[index];
    }

    public static Date randomDate() {
        long end = 1262206800000L; // 2010.01.01
        long start = 631054800000L; // 1190.01.01
        long milliseconds = (long)(Math.random() * (end - start)) + start;
        return new Date(milliseconds);
    }

    public static String randomAddress() {
        int index = (int)(Math.random() * addresses.length);
        return addresses[index];
    }

    public static String randomPhoneNumber() {
        int index = (int)(Math.random() * phones.length);
        return phones[index];
    }

    public static String randomFaculty() {
        int index = (int)(Math.random() * faculties.length);
        return faculties[index];
    }

    public static int randomCourse() {
        return (int)(Math.random() * 4) + 1;
    }

    public static int randomGroup() {
        return (int)(Math.random() * 6) + 1;
    }

    public static String randomCardNumber() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            res.append((int) (Math.random() * 10));
        }
        return res.toString();
    }

    public static String randomAccountNumber() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            res.append((int) (Math.random() * 10));
        }
        return res.toString();
    }
}
