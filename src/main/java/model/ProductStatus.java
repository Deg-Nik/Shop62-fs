package model;

/**
 * Перечисление, представляющее статус товара.
 */
public enum ProductStatus {
    /**
     * Доступен к покупке.
     */
    ACTIVE,
    /**
     * Нет в наличии.
     */
    OUT_OF_STOCK,
    /**
     * Снят с производства.
     */
    DEPRECATED
}
