package W5_proxy;

public interface Document {
    long getId();
    long getCreationDate();
    String getContent(User user);
}