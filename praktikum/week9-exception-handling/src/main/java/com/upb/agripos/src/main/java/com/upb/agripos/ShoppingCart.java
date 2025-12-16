package com.upb.agripos;

import com.upb.agripos.exception.*;
import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Product> items = new ArrayList<>();

    public void tambahProduk(Product p, int qty) throws InvalidQuantityException {
        if (qty <= 0) {
            throw new InvalidQuantityException("Quantity harus lebih dari 0!");
        }
        for (int i = 0; i < qty; i++) {
            items.add(p);
        }
        System.out.println("Produk ditambahkan: " + p.getName() + " x" + qty);
    }

    public void hapusProduk(Product p) throws ProductNotFoundException {
        if (!items.remove(p)) {
            throw new ProductNotFoundException("Produk tidak ditemukan di keranjang!");
        }
        System.out.println("Produk dihapus: " + p.getName());
    }

    public double hitungTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }

    public void checkout() throws EmptyCartException {
        if (items.isEmpty()) {
            throw new EmptyCartException("Checkout gagal: keranjang masih kosong!");
        }
        System.out.println("Checkout berhasil!");
        System.out.println("Total belanja: Rp " + hitungTotal());
        items.clear();
    }
}
