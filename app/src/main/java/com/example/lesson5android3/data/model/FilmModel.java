
package com.example.lesson5android3.data.model;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

@Entity
public class FilmModel implements Serializable {

    @PrimaryKey
    @SerializedName("id")
    @Expose
    @NonNull
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("director")
    @Expose
    private String director;
    @SerializedName("producer")
    @Expose
    @Ignore

    private String producer;
    @SerializedName("release_date")
    @Expose
    @Ignore

    private String releaseDate;
    @SerializedName("rt_score")
    @Expose
    @Ignore

    private String rtScore;
    @SerializedName("people")
    @Expose
    @Ignore

    private List<String> people ;
    @SerializedName("species")
    @Expose
    @Ignore

    private List<String> species ;
    @SerializedName("locations")
    @Expose
    @Ignore

    private List<String> locations ;
    @SerializedName("vehicles")
    @Expose
    @Ignore

    private List<String> vehicles ;
    @SerializedName("url")
    @Expose
    @Ignore

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FilmModel withId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FilmModel withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FilmModel withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public FilmModel withDirector(String director) {
        this.director = director;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public FilmModel withProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public FilmModel withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getRtScore() {
        return rtScore;
    }

    public void setRtScore(String rtScore) {
        this.rtScore = rtScore;
    }

    public FilmModel withRtScore(String rtScore) {
        this.rtScore = rtScore;
        return this;
    }

    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
    }

    public FilmModel withPeople(List<String> people) {
        this.people = people;
        return this;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public FilmModel withSpecies(List<String> species) {
        this.species = species;
        return this;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public FilmModel withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public FilmModel withVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FilmModel withUrl(String url) {
        this.url = url;
        return this;
    }

}
