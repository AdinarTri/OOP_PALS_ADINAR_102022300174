package main.java;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> colAlbumName, colArtist;
    @FXML
    private TableColumn<Album, Integer> colTotal, colAvailable, colRented;
    @FXML
    private TextField txtAlbumName, txtArtist, txtTotal, txtAvailable, txtRented;
    @FXML
    private Button btnRent, btnAdd, btnDelete, btnUpdate;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colAlbumName.setCellValueFactory(cellData -> cellData.getValue().albumNameProperty());
        colArtist.setCellValueFactory(cellData -> cellData.getValue().artistProperty());
        colTotal.setCellValueFactory(cellData -> cellData.getValue().totalProperty().asObject());
        colAvailable.setCellValueFactory(cellData -> cellData.getValue().availableProperty().asObject());
        colRented.setCellValueFactory(cellData -> cellData.getValue().rentedProperty().asObject());
        tableView.setItems(albumList);
    }

    @FXML
    private void handleAdd(ActionEvent event) {
        try {
            String name = txtAlbumName.getText();
            String artist = txtArtist.getText();
            int total = Integer.parseInt(txtTotal.getText());
            int available = Integer.parseInt(txtAvailable.getText());
            int rented = Integer.parseInt(txtRented.getText());

            albumList.add(new Album(name, artist, total, available, rented));
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album added successfully!");
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Invalid input!");
        }
    }

    @FXML
    private void handleDelete(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album deleted successfully!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "No album selected!");
        }
    }

    @FXML
    private void handleUpdate(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                selectedAlbum.setAlbumName(txtAlbumName.getText());
                selectedAlbum.setArtist(txtArtist.getText());
                selectedAlbum.setTotal(Integer.parseInt(txtTotal.getText()));
                selectedAlbum.setAvailable(Integer.parseInt(txtAvailable.getText()));
                selectedAlbum.setRented(Integer.parseInt(txtRented.getText()));
                tableView.refresh();
                showAlert(Alert.AlertType.INFORMATION, "Success", "Album updated successfully!");
            } catch (Exception e) {
                showAlert(Alert.AlertType.ERROR, "Error", "Invalid input!");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "No album selected!");
        }
    }

    @FXML
    private void handleRent(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null && selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            selectedAlbum.setRented(selectedAlbum.getRented() + 1);
            tableView.refresh();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album rented successfully!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "No album available to rent!");
        }
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
