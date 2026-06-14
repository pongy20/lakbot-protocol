package dev.pongy.lakbot.protocol;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KnowledgeTargetDto {

    @Min(1)
    private int knowledgeId;

    @Min(0)
    private int targetLevel;
}
