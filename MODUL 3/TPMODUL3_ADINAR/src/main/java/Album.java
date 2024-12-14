package main.java;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Album {
    private SimpleStringProperty albumName;
    private SimpleStringProperty artist;
    private SimpleIntegerProperty total;
    private SimpleIntegerProperty available;
    private SimpleIntegerProperty rented;

    public Album(String albumName, String artist, int total, int available, int rented) {
        this.albumName = new SimpleStringProperty(albumName);
        this.artist = new SimpleStringProperty(artist);
        this.total = new SimpleIntegerProperty(total);
        this.available = new SimpleIntegerProperty(available);
        this.rented = new SimpleIntegerProperty(rented);
    }

    // Getters
    public String getAlbumName() { return albumName.get(); }
    public String getArtist() { return artist.get(); }
    public int getTotal() { return total.get(); }
    public int getAvailable() { return available.get(); }
    public int getRented() { return rented.get(); }

    // Setters
    public void setAlbumName(String albumName) { this.albumName.set(albumName); }
    public void setArtist(String artist) { this.artist.set(artist); }
    public void setTotal(int total) { this.total.set(total); }
    public void setAvailable(int available) { this.available.set(available); }
    public void setRented(int rented) { this.rented.set(rented); }

    // Properties
    public SimpleStringProperty albumNameProperty() { return albumName; }
    public SimpleStringProperty artistProperty() { return artist; }
    public SimpleIntegerProperty totalProperty() { return total; }
    public SimpleIntegerProperty availableProperty() { return available; }
    public SimpleIntegerProperty rentedProperty() { return rented; }
}
