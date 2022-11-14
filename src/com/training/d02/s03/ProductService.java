package com.training.d02.s03;

import com.training.model.Product;

// a 'service' class = a class that implements the business logic for a certain domain model
// in our case - for a Product
class ProductService {

    // says 'what' it is doing (saving a product), not 'how' and 'where'
    public void saveProduct(Product product) {

    }

    // the current 'saveProduct' method is not _overriding_ the method from above, it is _overloading_ it
    // --> two different methods, with the same name, but with the same behavior
    public void saveProduct(int productId) {

    }

    public void saveProductInDatabase(Product product) {

    }

    public Product buyProduct(int id) {
        return new Product(id, "Something");
    }
}
