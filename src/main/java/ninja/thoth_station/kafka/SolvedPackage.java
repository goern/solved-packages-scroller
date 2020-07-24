package ninja.thoth_station.kafka;

import org.apache.zookeeper.server.WorkerService.WorkRequest;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 */
@RegisterForReflection
public class SolvedPackage {
    public String package_name;
    public String package_version;
    public String index_url;
    public String solver;
    public String __faust;

    public SolvedPackage() {
    }

    public SolvedPackage(final String package_name, final String package_version, final String index_url,
            final String solver, final String __faust) {
        this.package_name = package_name;
        this.package_version = package_version;
        this.index_url = index_url;
        this.solver = solver;
        this.__faust = __faust;
    }
}