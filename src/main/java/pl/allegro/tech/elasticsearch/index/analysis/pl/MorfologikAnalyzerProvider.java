package pl.allegro.tech.elasticsearch.index.analysis.pl;

import org.apache.lucene.analysis.morfologik.MorfologikAnalyzer;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.analysis.AbstractIndexAnalyzerProvider;

/**
 * MorfologikAnalyzer provider with the default Morfologik's Polish dictionary.
 */
public class MorfologikAnalyzerProvider extends AbstractIndexAnalyzerProvider<MorfologikAnalyzer> {

    private final MorfologikAnalyzer analyzer;

    /**
     * Constructs a new MorfologikAnalyzerProvider.
     *
     * @param indexSettings - index level settings
     * @param name          - component name
     * @param settings      - component settings
     */
    public MorfologikAnalyzerProvider(IndexSettings indexSettings, String name, Settings settings) {
        super(indexSettings, name, settings);
        analyzer = new MorfologikAnalyzer();
    }

    @Override
    public MorfologikAnalyzer get() {
        return analyzer;
    }
}
