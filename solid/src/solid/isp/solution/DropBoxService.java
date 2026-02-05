package solid.isp.solution;

import java.io.File;

public class DropBoxService implements StorageProvider {


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
