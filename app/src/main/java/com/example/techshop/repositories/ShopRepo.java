package com.example.techshop.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.techshop.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts(){
            if (mutableProductList == null){
                mutableProductList = new MutableLiveData<>();
                loadProducts();
            }
            return mutableProductList;
    }

    private void loadProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iMac 21", 1299,
                true, "https://swipe.ua/content/images/13/85251190835322_small11.jpeg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iPad Pro", 956,
                true, "https://hotline.ua/img/tx/182/1821114155.jpg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "MacBook", 1099,
                true, "https://hotline.ua/img/tx/212/2127799955.jpg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iPhone 11", 754,
                false, "https://www.ixbt.com/img/x780x600/r30/00/02/23/46/AppleiPhone11ProColors091019.jpg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iMac 21", 1299,
                true, "https://swipe.ua/content/images/13/85251190835322_small11.jpeg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iMac 21", 547,
                true, "https://swipe.ua/content/images/13/85251190835322_small11.jpeg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iMac 21", 1299,
                true, "https://swipe.ua/content/images/13/85251190835322_small11.jpeg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iMac 21", 1299,
                true, "https://swipe.ua/content/images/13/85251190835322_small11.jpeg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iMac 21", 1299,
                true, "https://swipe.ua/content/images/13/85251190835322_small11.jpeg"));
        productList.add(new Product(UUID.randomUUID()
                .toString(), "iMac 21", 1299,
                true, "https://swipe.ua/content/images/13/85251190835322_small11.jpeg"));

        mutableProductList.setValue(productList);
    }
}
