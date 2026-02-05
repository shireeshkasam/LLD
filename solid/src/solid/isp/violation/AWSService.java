package solid.isp.violation;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AWSService implements CloudServiceProvider{
    HashMap<String, List<String>> serverMap = new HashMap<>();

    @Override
    public void addServer(String region, String serverId) {
        serverMap.computeIfAbsent(region, k -> new ArrayList<>()).add(serverId);
    }

    @Override
    public List<String> getServers(String region) {
        return serverMap.get(region);
    }

    @Override
    public String getCDNAddress() {
        return "xx.xx.xxxx";
    }

    @Override
    public boolean addFile(String file) {
        System.out.println("Uploading new file..."+ file);
        return true;
    }

    @Override
    public File getFile(String name) {
        return new File(name);
    }
}

