package se.spline.api.repository.event;

import lombok.Data;
import se.spline.api.repository.RepositoryId;
import se.spline.api.repository.RepositoryMetaData;

@Data
public class RepositoryCreatedEvent {
    private final RepositoryId id;
    private final RepositoryMetaData metaData;
}
