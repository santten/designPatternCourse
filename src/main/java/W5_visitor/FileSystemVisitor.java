package W5_visitor;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
