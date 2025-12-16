package com.upb.agripos;

import com.upb.agripos.exception.*;

public class MainExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Hello, I am Rayendra Apta Nayottama - 240202880 (Week9)");

        ShoppingCart cart = new ShoppingCart();
        Product p1 = new Product("P01", "Beras Organik", 50000);

        try {
            cart.tambahProduk(p1, -2);
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cart.hapusProduk(p1);
        } catch (ProductNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cart.checkout();
        } catch (EmptyCartException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cart.tambahProduk(p1, 2);
            cart.checkout();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
