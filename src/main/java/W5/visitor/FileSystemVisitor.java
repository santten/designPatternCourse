package W5.visitor;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
