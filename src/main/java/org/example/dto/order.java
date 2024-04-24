package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class order {
    private Long id;
    private Double total_fee;
    private int qty;
    private String date;
    private String time;
}
