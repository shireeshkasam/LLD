package solid.isp.solution;

import java.util.List;

public interface CloudProvider {
    void addServer(String region, String serverId);
    List<String> getServers(String region);
}
