package ninja.thoth_station.kafka;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class SolvedPackageDeserializer extends JsonbDeserializer<SolvedPackage> {
    public SolvedPackageDeserializer() {
        super(SolvedPackage.class);
    }
}