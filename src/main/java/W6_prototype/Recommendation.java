package W6_prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Recommendation implements Cloneable {
    String targetAudience;
    ArrayList<Book> recommended;

    private static final ArrayList<Recommendation> allRecommendations = new ArrayList<>();

    public Recommendation(String targetAudience, ArrayList<Book> recommendations) {
        this.targetAudience = targetAudience;
        this.recommended = recommendations;

        allRecommendations.add(this);
    }

    public void addBook(Book book) {
        this.targetAudience = targetAudience;
        recommended.add(book.clone());
    }

    public void removeBook(Book book) {
        this.targetAudience = targetAudience;
        recommended.remove(book);
    }

    public List<Book> getRecommended() {
        return recommended;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public static ArrayList<Recommendation> getAllRecommendations() {
        return allRecommendations;
    }

    @Override
    public Recommendation clone(){
        try {
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            clonedRecommendation.recommended = new ArrayList<>();

            for (Book book : this.recommended) {
                clonedRecommendation.recommended.add(book.clone());
            }
            return clonedRecommendation;
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString(){
        System.out.println("Recommendations for " + this.targetAudience);
        return recommended.toString();
    }
}
