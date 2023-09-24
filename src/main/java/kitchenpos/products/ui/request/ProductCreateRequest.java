package kitchenpos.products.ui.request;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductCreateRequest {
    private String name;
    private BigDecimal price;

    private ProductCreateRequest() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}