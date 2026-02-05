package solid.isp.solution;

import java.io.File;

public interface StorageProvider {

    boolean addFile(String file);
    File getFile(String name);
}
