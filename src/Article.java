import java.util.Objects;

public class Article
{
    protected String nom;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return Objects.equals(nom, article.nom);
    }

    @Override
    public String toString() {
        return "Article{" +
                "nom='" + nom + '\'' +
                '}';
    }

}
