package repository;

import model.Category;
import model.Product;
import model.ProductStatus;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Nikolai Degtiarev
 * created : 04.02.26
 *
 *
 **/
public class ProductRepositoryMap implements ProductRepository {

    // Хранилище товаров в памяти.
    private Map<Long, Product> storageProduct = new HashMap<>();

    // Текущий идентификатор для нового товара
    private long currentId;

    // Конструктор по умолчанию, инициализирующий хранилище.
    public ProductRepositoryMap() {
        initStorage();
    }

    private void initStorage() {
        save(new Product("A", "d", BigDecimal.valueOf(500), 5, ProductStatus.ACTIVE, new Category(Long.valueOf(1), ""), ""));
        save(new Product("B", "p", BigDecimal.valueOf(500), 5, ProductStatus.DEPRECATED, null, ""));
        save(new Product("C", "o", BigDecimal.valueOf(500), 5, ProductStatus.ACTIVE, null, ""));
        save(new Product("D", "n", BigDecimal.valueOf(500), 5, ProductStatus.OUT_OF_STOCK, null, ""));
    }


    @Override
    public List<Product> getAll() {
        return storageProduct.values().stream().toList();
    }

    @Override
    public Product save(Product product) {
        product.setId(++currentId);
        storageProduct.put(product.getId(), product);
        return product;
    }

    @Override
    public Product update(Product product) {
        if (product == null || product.getId() == null) {
            return null;
        }
        Long id = product.getId();
        if (!storageProduct.containsKey(id)) {
            return null;
        }
        storageProduct.put(id, product);

        return product;
    }

    @Override
    public Product delete(long id) {
        return storageProduct.remove(id);
    }

    @Override
    public Product getById(long id) {
        return storageProduct.get(id);
    }

    @Override
    public List<Product> getByTitle(String title) {
        return storageProduct.values().stream().filter(product -> product.getTitle().equals(title)).toList();
    }

    @Override
    public List<Product> getByDescription(String description) {
        return storageProduct.values().stream().filter(product -> product.getDescription().equals(description)).toList();
    }

    @Override
    public List<Product> getByPrice(BigDecimal price) {
        return storageProduct.values().stream().filter(product -> product.getPrice().equals(price)).toList();
    }

    @Override
    public List<Product> getByQuantity(Integer stockQuantity) {
        return storageProduct.values().stream().filter(product -> product.getStockQuantity().equals(stockQuantity)).toList();
    }

    @Override
    public List<Product> getByStatus(ProductStatus status) {
        return storageProduct.values().stream().filter(product -> product.getStatus().equals(status)).toList();
    }

    @Override
    public List<Product> getByCategory(Category category) {
        return storageProduct.values().stream().filter(product -> product.getCategory().equals(category)).toList();
    }
}
