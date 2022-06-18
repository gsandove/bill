package com.ventas.bill.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EdibleRequest {

    private String name;

    private String category;

    private Double unitPrice;
}
