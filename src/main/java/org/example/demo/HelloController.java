package org.example.demo;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import java.util.ResourceBundle;
import org.example.demo.Device;
import javafx.fxml.FXML;
import java.awt.*;
import java.net.URL;





public class HelloController {
    @FXML
    private TextField smartphoneNameField,smartphonePriceField,smartphoneWeightField, smartphoneScreenSizeField, smartphoneCameraResolutionField;
    @FXML
    private Button smartphoneaddDevice;

    @FXML
    private TextField laptopNameField,laptopPriceField, laptopWeightField, laptopRamSizeField, laptopProcessorTypeField;
    @FXML
    private Button laptopaddDevice;

    @FXML
    private TextField tabletNameField, tabletPriceField, tabletWeightField, tabletBatteryLifeField,tabletHasStylusField;
    @FXML
    private Button tabletaddDevice;

    @FXML
    private ListView<Device> listView;
    @FXML
    private Label selectedText;
    ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        listView.setItems(devices);
        System.out.println("ListView initialized");

    }
    @FXML
    public void addSmartphone() {
        try {
            String name = smartphoneNameField.getText();
            double price = Double.parseDouble(smartphonePriceField.getText());
            double weight = Double.parseDouble(smartphoneWeightField.getText());
            double screenSize = Double.parseDouble(smartphoneScreenSizeField.getText());
            double cameraResolution = Double.parseDouble(smartphoneCameraResolutionField.getText());

            Smartphone smartphone = new Smartphone(name, price, weight, screenSize, cameraResolution);
            devices.add(smartphone);
            System.out.println("Added smartphone: " + smartphone);  // Проверка добавленного устройства
            System.out.println("Devices size: " + devices.size());

            clearSmartphoneFields();
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
        }

}
    @FXML
    public void clearSmartphoneFields() {
        smartphoneNameField.clear();
        smartphonePriceField.clear();
        smartphoneWeightField.clear();
        smartphoneScreenSizeField.clear();
        smartphoneCameraResolutionField.clear();
    }
    @FXML
    public void addLaptop() {
        try {
            String name = laptopNameField.getText();
            double price = Double.parseDouble(laptopPriceField.getText());
            double weight = Double.parseDouble(laptopWeightField.getText());
            int ram = Integer.parseInt(laptopRamSizeField.getText());
            double processorSpeed = Double.parseDouble(laptopProcessorTypeField.getText());

            Laptop laptop = new Laptop(name, price, weight, ram, processorSpeed);
            devices.add(laptop); // Добавляем ноутбук в список
            clearLaptopFields();
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
        }
    }

    private void clearLaptopFields() {
        laptopNameField.clear();
        laptopPriceField.clear();
        laptopWeightField.clear();
        laptopRamSizeField.clear();
        laptopProcessorTypeField.clear();
    }
    @FXML
    public void addTablet() {
        try {
            String name = tabletNameField.getText();
            double price = Double.parseDouble(tabletPriceField.getText());
            double weight = Double.parseDouble(tabletWeightField.getText());
            int batteryLife = Integer.parseInt(tabletBatteryLifeField.getText());
            boolean hasStylus = Boolean.parseBoolean(tabletHasStylusField.getText());

            // Создаем объект Tablet с правильными параметрами
            Tablet tablet = new Tablet(name, price, weight, batteryLife, hasStylus);

            // Добавляем планшет в список
            devices.add(tablet);

            // Очищаем поля
            clearTabletFields();
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
        }
    }

    private void clearTabletFields() {
        tabletNameField.clear();
        tabletPriceField.clear();
        tabletWeightField.clear();
        tabletBatteryLifeField.clear();
        tabletHasStylusField.clear();
    }

    @FXML
    protected void onListClicked() {
        // Получаем выбранный объект из ListView
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();

    }
    @FXML
    public void removeDevice() {
        // Получаем выбранное устройство из ListView
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();

        // Проверяем, выбрано ли устройство
        if (selectedDevice != null) {
            // Удаляем устройство из ObservableList
            devices.remove(selectedDevice);
            System.out.println("Device removed: " + selectedDevice);
        } else {
            System.out.println("No device selected for removal");
        }
    }
}

