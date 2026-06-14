package dev.pongy.lakbot.protocol;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TemplateStepResponse {
    private UUID id;
    private int stepOrder;
    private int minimumRecruitmentCount;
    private List<BuildingTargetDto> buildingTargets;
    private List<KnowledgeTargetDto> knowledgeTargets;
    private List<UnitTargetDto> unitTargets;
}
