package java_mosh3;

public interface UIWidget extends Draggable, Resizable{ // inheritance between interfaces
    void render();
}

//In java, a class cannot have multiple parents, but an interface can have multiple parents