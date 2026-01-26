package com.upb.agripos.view;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import com.upb.agripos.controller.ProductController;

public class ProductFormView extends VBox {

    public ProductFormView(ProductController controller) {
        TextField txtCode = new TextField();
        txtCode.setPromptText("Kode Produk");

        TextField txtName = new TextField();
        txtName.setPromptText("Nama Produk");

        TextField txtPrice = new TextField();
        txtPrice.setPromptText("Harga");

        TextField txtStock = new TextField();
        txtStock.setPromptText("Stok");

        Button btnAdd = new Button("Tambah Produk");
        ListView<String> listView = new ListView<>();

        btnAdd.setOnAction(e -> {
            Product p = controller.add(
                txtCode.getText(),
                txtName.getText(),
                Double.parseDouble(txtPrice.getText()),
                Integer.parseInt(txtStock.getText())
            );
            listView.getItems().add(p.getCode() + " - " + p.getName());
        });

        getChildren().addAll(txtCode, txtName, txtPrice, txtStock, btnAdd, listView);
    }
}