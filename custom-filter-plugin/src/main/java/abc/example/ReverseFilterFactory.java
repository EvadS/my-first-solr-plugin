package abc.example;

import java.util.Map;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.util.TokenFilterFactory;

public class ReverseFilterFactory extends TokenFilterFactory {
    public ReverseFilterFactory(Map<String, String> args) {
        super(args);

    }
    @Override
    public TokenStream create(TokenStream input) {
        return new ReverseCustomFilter(input);
    }
    @Override
    public TokenStream normalize(TokenStream input) {
        return super.normalize(input);
    }
}
