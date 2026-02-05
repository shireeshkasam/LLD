package solid.isp.violation;

import java.io.File;
import java.util.List;

public interface CloudServiceProvider {
    void addServer(String region, String serverId);
    List<String> getServers(String region);
    String getCDNAddress();
    boolean addFile(String file);
    File getFile(String name);
}
