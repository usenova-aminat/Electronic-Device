package org.example.demo;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import java.util.ResourceBundle;
import org.example.demo.Device;
import javafx.fxml.FXML;
import java.awt.*;
import java.net.URL;





public class HelloController {
    @FXML
    private TextField smartphoneNameField;
    @FXML
    private TextField smartphonePriceField;
    @FXML
    private TextField smartphoneWeightField;
    @FXML
    private TextField smartphoneScreenSizeField;
    @FXML
    private TextField smartphoneCameraResolutionField;
    @FXML
    private Button smartphoneaddDevice;
    @FXML
    private Button smartphoneremoveDevice;
    @FXML
    private ListView<Device> smartphonelistView;

    @FXML
    private TextField laptopNameField;
    @FXML
    private TextField laptopPriceField;
    @FXML
    private TextField laptopWeightField;
    @FXML
    private TextField laptopRamSizeField;
    @FXML
    private TextField laptopProcessorTypeField;
    @FXML
    private Button laptopaddDevice;
    @FXML
    private Button laptopremoveDevice;
    @FXML
    private ListView<Device> laptopListView;

    @FXML
    private TextField tabletNameField;
    @FXML
    private TextField tabletPriceField;
    @FXML
    private TextField tabletWeightField;
    @FXML
    private TextField tabletBatteryLifeField;
    @FXML
    private TextField tabletHasStylusField;
    @FXML
    private Button tabletaddDevice;
    @FXML
    private Button tabletremoveDevice;
    @FXML
    private ListView<Device> tabletListView;

    private ObservableList<Device> devices = FXCollections.observableArrayList(); // Список устройств, который будет отображаться в listView

    @FXML
    public void initialize() {
        smartphonelistView.setItems(devices);
        laptopListView.setItems(devices);
        tabletListView.setItems(devices);
        
    }
    

    @FXML
    private void onListClicked(MouseEvent event) {
        // Логика обработки клика по элементу списка
        System.out.println("Item clicked!");
    }

    private String getDeviceDetails(Device device) {
        // Просто возвращаем строковое представление устройства
        return device.toString();
    }


}

