package W5_visitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}