package com.example.recyclerview;

public class StudentBase {
    private String name;
    private String lasName;
    private int imageResId;

    public static final StudentBase[] students = {
            new StudentBase("Масловский",  "Святослав", R.drawable.d1),
            new StudentBase("Веселов",  "Феликс", R.drawable.d2),
            new StudentBase("Шубин ",  "Харитон", R.drawable.d3),
            new StudentBase("Пономаренко ",  "Платон", R.drawable.d4),
            new StudentBase("Мамонтов ",  "Вениамин", R.drawable.d5),
            new StudentBase("Сыпченко ",  "Арсений", R.drawable.d6),
            new StudentBase("Масловский",  "Негода ", R.drawable.d7),
            new StudentBase("Киселёв ",  "Пётр", R.drawable.d8),
            new StudentBase("Дмитриев ",  "Цезарь", R.drawable.d9),
            new StudentBase("Громов ",  "Ярослав", R.drawable.d10),
            new StudentBase("Ярослав",  "Святослав", R.drawable.d11),
            new StudentBase("Темченко ",  "Денис", R.drawable.d12),
            new StudentBase("Just ",  "Cat", R.drawable.d13),
            new StudentBase("Cooler ",  "Cat", R.drawable.d14),
            new StudentBase("Савельев",  "Яков", R.drawable.d15),
            new StudentBase("Куликов",  "Трофим", R.drawable.d16),
            new StudentBase("Shibru",  "David", R.drawable.d17),
            new StudentBase("Зварыч ",  "Виталий", R.drawable.d18),
            new StudentBase("Пасичник ",  "Гарри", R.drawable.d19),
            new StudentBase("Суханов ",  "Эрик", R.drawable.d20),
    };

    public StudentBase(String name, String lasName, int imageResId) {
        this.name = name;
        this.lasName = lasName;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getLasName() {
        return lasName;
    }

    public int getImageResId() {
        return imageResId;
    }
}
