package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements StorageComponent{
    private final String name;
    public List<StorageComponent> storageComponents;
    public Folder(String name){
        this.name = name;
        storageComponents = new ArrayList<>();
    }

    public void add(StorageComponent storageComponent){
        storageComponents.add(storageComponent);
    }

    @Override
    public void ls() {
        storageComponents.forEach(StorageComponent::ls);
    }
}
