package org.textanalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    @Override
    public abstract Label processText(String text);

    public abstract String[] getKeyWord();

    public abstract Label getLabel();
}
