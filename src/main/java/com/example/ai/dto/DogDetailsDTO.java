package com.example.ai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DogDetailsDTO implements Serializable {




    @JsonProperty("image_link")
    private String image_link;
    @JsonProperty("good_with_children")
    private int good_with_children;
    @JsonProperty("good_with_other_dogs")
    private int good_with_other_dogs;
    @JsonProperty("shedding")
    private int shedding;
    @JsonProperty("grooming")
    private int grooming;
    @JsonProperty("drooling")
    private int drooling;
    @JsonProperty("coat_length")
    private int coat_length;
    @JsonProperty("good_with_strangers")
    private int good_with_strangers;
    @JsonProperty("playfulness")
    private int playfulness;
    @JsonProperty("protectiveness")
    private int protectiveness;
    @JsonProperty("trainability")
    private int trainability;
    @JsonProperty("energy")
    private int energy;
    @JsonProperty("barking")
    private int barking;
    @JsonProperty("min_life_expectancy")
    private int min_life_expectancy;
    @JsonProperty("max_life_expectancy")
    private int max_life_expectancy;
    @JsonProperty("max_height_male")
    private int max_height_male;
    @JsonProperty("max_height_female")
    private int max_height_female;
    @JsonProperty("max_weight_male")
    private int max_weight_male;
    @JsonProperty("max_weight_female")
    private int max_weight_female;
    @JsonProperty("min_height_male")
    private int min_height_male;
    @JsonProperty("min_height_female")
    private int min_height_female;
    @JsonProperty("min_weight_male")
    private int min_weight_male;
    @JsonProperty("min_weight_female")
    private int min_weight_female;
    @JsonProperty("name")
    private String name;

    public DogDetailsDTO(String image_link, int good_with_children, int good_with_other_dogs, int shedding, int grooming, int drooling, int coat_length, int good_with_strangers, int playfulness, int protectiveness, int trainability, int energy, int barking, int min_life_expectancy, int max_life_expectancy, int max_height_male, int max_height_female, int max_weight_male, int max_weight_female, int min_height_male, int min_height_female, int min_weight_male, int min_weight_female, String name) {
        this.image_link = image_link;
        this.good_with_children = good_with_children;
        this.good_with_other_dogs = good_with_other_dogs;
        this.shedding = shedding;
        this.grooming = grooming;
        this.drooling = drooling;
        this.coat_length = coat_length;
        this.good_with_strangers = good_with_strangers;
        this.playfulness = playfulness;
        this.protectiveness = protectiveness;
        this.trainability = trainability;
        this.energy = energy;
        this.barking = barking;
        this.min_life_expectancy = min_life_expectancy;
        this.max_life_expectancy = max_life_expectancy;
        this.max_height_male = max_height_male;
        this.max_height_female = max_height_female;
        this.max_weight_male = max_weight_male;
        this.max_weight_female = max_weight_female;
        this.min_height_male = min_height_male;
        this.min_height_female = min_height_female;
        this.min_weight_male = min_weight_male;
        this.min_weight_female = min_weight_female;
        this.name = name;
    }
}
