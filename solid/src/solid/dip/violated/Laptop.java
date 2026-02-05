package solid.dip.violated;

public class Laptop {
    WiredKeyboard wiredKeyboard;
    WiredMouse wiredMouse;

    Laptop(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse){
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}
