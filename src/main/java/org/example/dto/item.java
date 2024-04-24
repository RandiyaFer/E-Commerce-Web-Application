package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class item {
    private Long id;
    private Double prize;
    private int qty;
    private String category;
    private String description;
    private String image_url;
}
