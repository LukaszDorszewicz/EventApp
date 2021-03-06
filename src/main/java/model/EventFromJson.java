package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventFromJson {
    private String id;
    private String state;
    private Long timestamp;
    private String type;
    private String host;
}
