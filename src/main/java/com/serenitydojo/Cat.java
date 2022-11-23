package com.serenitydojo;

public class Cat extends Pet {
    private String name;
    private String favoriteFood;
    private String favoriteToy;
    private int age;

    public static final String CAT_NOISE = "Meow";

    public Cat(String name, int age) {
        super(name);
        this.age = age;

    }

    public Cat(String name, String favoriteFood, int age) {
        super(name);
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String makeNoise() {
        return CAT_NOISE;
    }

    @Override
    public String play() {
        return "plays with string";
    }
}
