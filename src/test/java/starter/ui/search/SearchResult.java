package starter.ui.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

public class SearchResult {
    public static Question<List<String>> titles() {
        return actor -> TextContent.of(SearchResultList.RESULT_TITLES).asListOf(String.class).answeredBy(actor);    
                //viewedBy(actor).asList();.
    }
}
