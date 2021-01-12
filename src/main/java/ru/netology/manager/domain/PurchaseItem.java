package ru.netology.manager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PurchaseItem {
    private int id;
    private int ProductId;
    private String productName;
    private int getProductPrice;
    private int count;
}
