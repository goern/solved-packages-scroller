package ninja.thoth_station.kafka;

/**
 */
public class SolvedPackage{
    public String package_name;
    public String package_version;
    public String index_url;
    public String solver;

    public SolvedPackage() {
    }

    public SolvedPackage(String package_name, String package_version, String index_url, String solver) {
        this.package_name = package_name;
        this.package_version= package_version;
        this.index_url = index_url;
        this.solver=solver;
    }
}