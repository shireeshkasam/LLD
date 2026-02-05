package solid.isp.violation;

import java.io.File;
import java.util.List;


public class DropBoxService implements CloudServiceProvider{

    @Override
    public void addServer(String region, String serverId) {
        System.out.println("Invalid operation");
    }

    @Override
    public List<String> getServers(String region) {
        return List.of();
    }

    @Override
    public String getCDNAddress() {
        return "";
    }

    @Override
    public boolean addFile(String file) {
        System.out.println("Uploading file..."+ file);
        return true;
    }

    @Override
    public File getFile(String name) {
        return new File(name);
    }
}
